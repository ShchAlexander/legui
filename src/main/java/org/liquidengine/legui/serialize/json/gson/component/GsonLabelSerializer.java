package org.liquidengine.legui.serialize.json.gson.component;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.liquidengine.legui.component.Label;
import org.liquidengine.legui.component.optional.TextState;
import org.liquidengine.legui.serialize.json.gson.GsonSerializeContext;
import org.liquidengine.legui.serialize.json.gson.GsonSerializeUtil;

import static org.liquidengine.legui.serialize.json.JsonConstants.TEXT_STATE;
import static org.liquidengine.legui.serialize.json.gson.GsonUtil.isNotNull;

/**
 * Created by Alexander on 26.11.2016.
 */
public class GsonLabelSerializer extends GsonComponentSerializer<Label> {

    @Override
    protected void jsonSerialize(Label object, JsonObject json, GsonSerializeContext context) {
        super.jsonSerialize(object, json, context);

        JsonObject textState = GsonSerializeUtil.serializeToJson(object.getTextState(), context);
        json.add(TEXT_STATE, textState);
    }

    @Override
    protected void deserialize(JsonObject json, Label object, GsonSerializeContext context) {
        super.deserialize(json, object, context);

        JsonElement textState = json.get(TEXT_STATE);
        if (isNotNull(textState)) {
            JsonObject asJsonObject = textState.getAsJsonObject();
            TextState  state        = GsonSerializeUtil.deserializeFromJson(asJsonObject, context);
            object.getTextState().copy(state);
        }
    }
}
