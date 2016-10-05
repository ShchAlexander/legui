package org.liquidengine.legui.component;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.liquidengine.legui.component.border.Border;
import org.liquidengine.legui.component.border.SimpleLineBorder;
import org.liquidengine.legui.component.intersector.LeguiIntersector;
import org.liquidengine.legui.component.intersector.RectangleIntersector;
import org.liquidengine.legui.context.LeguiContext;
import org.liquidengine.legui.listener.component.LeguiListenerList;
import org.liquidengine.legui.processor.system.component.LeguiEventProcessorList;
import org.liquidengine.legui.render.LeguiComponentRenderer;
import org.liquidengine.legui.render.LeguiRendererProvider;
import org.liquidengine.legui.util.ColorConstants;

/**
 * Component is an object that have graphical representation in legui system
 * <p>
 * Created by Shcherbin Alexander on 9/14/2016.
 */
public abstract class Component {
    private final LeguiEventProcessorList processors = new LeguiEventProcessorList(this);
    protected Vector2f position;
    protected Vector2f size;
    protected Vector4f backgroundColor = ColorConstants.lightGray();

    protected Border border = new SimpleLineBorder(this, ColorConstants.transparent(), 0);

    protected boolean enabled = true;
    protected boolean visible = true;
    protected boolean focused = false;

    protected boolean pressed = false;
    protected boolean hovered = false;

    protected float cornerRadius = 0;

    protected Component parent;
    protected LeguiIntersector intersector = new RectangleIntersector();
    protected LeguiComponentRenderer renderer = LeguiRendererProvider.getProvider().getRenderer(this);

    protected LeguiListenerList listenerList = new LeguiListenerList();

    public Component() {
        this(10, 10, 10, 10);
    }

    public Component(float x, float y, float width, float height) {
        this(new Vector2f(x, y), new Vector2f(width, height));
    }

    public Component(Vector2f position, Vector2f size) {
        this.position = position;
        this.size = size;
    }

    public void render(LeguiContext context) {
        renderer.render(this, context);
    }

    public Component getParent() {
        return parent;
    }

    public LeguiEventProcessorList getProcessors() {
        return processors;
    }

    public Vector2f getPosition() {
        return position;
    }

    public void setPosition(Vector2f position) {
        this.position = position;
    }

    public void setPosition(float x, float y) {
        this.position.set(x, y);
    }

    public Vector2f getSize() {
        return size;
    }

    public void setSize(Vector2f size) {
        this.size = size;
    }

    public void setSize(float width, float height) {
        this.size.set(width, height);
    }

    public LeguiListenerList getListenerList() {
        return listenerList;
    }

    public Vector4f getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Vector4f backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isFocused() {
        return focused;
    }

    public void setFocused(boolean focused) {
        this.focused = focused;
    }

    public LeguiIntersector getIntersector() {
        return intersector;
    }

    public void setIntersector(LeguiIntersector intersector) {
        this.intersector = intersector;
    }

    public float getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public boolean isPressed() {
        return pressed;
    }

    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }

    public boolean isHovered() {
        return hovered;
    }

    public void setHovered(boolean hovered) {
        this.hovered = hovered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Component component = (Component) o;

        return new EqualsBuilder()
                .append(enabled, component.enabled)
                .append(visible, component.visible)
                .append(focused, component.focused)
                .append(pressed, component.pressed)
                .append(hovered, component.hovered)
                .append(cornerRadius, component.cornerRadius)
                .append(processors, component.processors)
                .append(position, component.position)
                .append(size, component.size)
                .append(backgroundColor, component.backgroundColor)
                .append(border, component.border)
                .append(intersector, component.intersector)
                .append(renderer, component.renderer)
                .append(listenerList, component.listenerList)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(processors)
                .append(position)
                .append(size)
                .append(backgroundColor)
                .append(border)
                .append(enabled)
                .append(visible)
                .append(focused)
                .append(pressed)
                .append(hovered)
                .append(cornerRadius)
                .append(intersector)
                .append(renderer)
                .append(listenerList)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("processors", processors)
                .append("position", position)
                .append("size", size)
                .append("backgroundColor", backgroundColor)
                .append("border", border)
                .append("enabled", enabled)
                .append("visible", visible)
                .append("focused", focused)
                .append("pressed", pressed)
                .append("hovered", hovered)
                .append("cornerRadius", cornerRadius)
                .append("intersector", intersector)
                .append("renderer", renderer)
                .append("listenerList", listenerList)
                .toString();
    }
}
