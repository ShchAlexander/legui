package org.liquidengine.legui.system.renderer.nvg.component;

import org.joml.Vector2f;
import org.joml.Vector4f;
import org.liquidengine.legui.component.CheckBox;
import org.liquidengine.legui.component.ImageView;
import org.liquidengine.legui.component.optional.TextState;
import org.liquidengine.legui.component.optional.align.HorizontalAlign;
import org.liquidengine.legui.component.optional.align.VerticalAlign;
import org.liquidengine.legui.system.context.Context;
import org.liquidengine.legui.system.renderer.nvg.NvgComponentRenderer;
import org.lwjgl.nanovg.NVGColor;

import static org.liquidengine.legui.system.renderer.nvg.util.NVGUtils.rgba;
import static org.liquidengine.legui.system.renderer.nvg.util.NvgRenderUtils.*;
import static org.liquidengine.legui.util.TextUtil.cpToStr;
import static org.lwjgl.nanovg.NanoVG.*;

/**
 * Created by ShchAlexander on 11.02.2017.
 */
public class NvgCheckBoxRenderer extends NvgComponentRenderer<CheckBox> {
    private NVGColor colorA = NVGColor.create();


    @Override
    public void renderComponent(CheckBox checkBox, Context context, long nanovg) {
        createScissor(nanovg, checkBox);
        {
            Vector2f pos  = checkBox.getScreenPosition();
            Vector2f size = checkBox.getSize();

            float px = pos.x;
            float py = pos.y;
            float sw = size.x;
            float sh = size.y;
            /*Draw background rectangle*/
            {
                nvgBeginPath(nanovg);
                nvgRoundedRect(nanovg, px, py, sw, sh, 0);
                nvgFillColor(nanovg, rgba(checkBox.getBackgroundColor(), colorA));
                nvgFill(nanovg);
            }

            TextState textState = checkBox.getTextState();
            float     fontSize  = textState.getFontSize();
            float     iconWid   = fontSize + 5;

            Vector4f pad = textState.getPadding();

            float h = sh - (pad.y + pad.w);
            float y = py + pad.y;
            float x = px + iconWid;
            float w = sw - iconWid - pad.z;
            renderTextStateLineToBounds(nanovg, new Vector2f(x, y), new Vector2f(w, h), checkBox.getTextState());

            // TODO: NEED TO MOVE ICONS TO CHECKBOX as that was done for radio buttons
            Vector4f textColor = textState.getTextColor();
            String   icon      = cpToStr(checkBox.isChecked() ? checkBox.getIconChecked() : checkBox.getIconUnchecked());
            renderIcon(checkBox, nanovg, fontSize, iconWid, h, y, px, textColor, icon);
            renderBorder(checkBox, context);
        }
        resetScissor(nanovg);
    }

    private void renderIcon(CheckBox component, long nvgContext, float fontSize, float iconWid, float h, float y, float x1, Vector4f textColor, String icon) {

        ImageView image = component.isChecked() ? component.getIconImageChecked() : component.getIconImageUnchecked();
        if (image == null) {
            if (component.isFocused()) {
                renderTextLineToBounds(nvgContext, x1 - 1, y + 1, iconWid, h, fontSize, component.getIconFont(),
                        component.getFocusedStrokeColor(), colorA, icon, HorizontalAlign.CENTER, VerticalAlign.MIDDLE, false);
            }
            renderTextLineToBounds(nvgContext, x1, y, iconWid, h, fontSize, component.getIconFont(),
                    textColor, colorA, icon, HorizontalAlign.CENTER, VerticalAlign.MIDDLE, false);
        } else {

        }
    }
}
