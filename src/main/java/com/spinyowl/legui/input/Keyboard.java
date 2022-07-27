package com.spinyowl.legui.input;

import static org.lwjgl.glfw.GLFW.GLFW_KEY_0;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_1;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_2;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_3;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_4;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_5;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_6;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_7;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_8;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_9;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_A;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_APOSTROPHE;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_B;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_BACKSLASH;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_BACKSPACE;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_C;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_CAPS_LOCK;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_COMMA;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_D;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_DELETE;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_DOWN;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_E;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_END;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_ENTER;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_EQUAL;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_ESCAPE;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F1;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F10;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F11;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F12;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F13;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F14;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F15;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F16;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F17;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F18;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F19;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F2;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F20;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F21;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F22;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F23;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F24;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F25;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F3;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F4;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F5;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F6;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F7;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F8;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_F9;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_G;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_GRAVE_ACCENT;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_H;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_HOME;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_I;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_INSERT;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_J;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_K;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_0;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_1;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_2;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_3;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_4;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_5;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_6;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_7;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_8;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_9;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_ADD;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_DECIMAL;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_DIVIDE;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_ENTER;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_EQUAL;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_MULTIPLY;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_KP_SUBTRACT;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_L;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_ALT;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_BRACKET;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_CONTROL;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_SHIFT;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_SUPER;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_M;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_MENU;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_MINUS;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_N;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_NUM_LOCK;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_O;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_P;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_PAGE_DOWN;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_PAGE_UP;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_PAUSE;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_PERIOD;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_PRINT_SCREEN;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_Q;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_R;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_ALT;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_BRACKET;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_CONTROL;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_SHIFT;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_SUPER;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_S;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_SCROLL_LOCK;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_SEMICOLON;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_SLASH;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_SPACE;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_T;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_TAB;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_U;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_UNKNOWN;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_UP;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_V;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_W;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_WORLD_1;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_WORLD_2;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_X;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_Y;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_Z;

import com.google.common.collect.EnumHashBiMap;
import java.util.Map;
import java.util.Objects;

/**
 * This class used to store key mapping to native keys. Key state updated only for keyboard that
 * correspond to current keyboard layout.
 */
public final class Keyboard {

  private static final EnumHashBiMap<KeyCode, Integer> keys = EnumHashBiMap.create(KeyCode.class);
  private static Shortcut copyShortcut = new Shortcut(KeyCode.KEY_C, KeyMod.CONTROL);
  private static Shortcut pasteShortcut = new Shortcut(KeyCode.KEY_V, KeyMod.CONTROL);
  private static Shortcut selectAllShortcut = new Shortcut(KeyCode.KEY_A, KeyMod.CONTROL);
  private static Shortcut cutShortcut = new Shortcut(KeyCode.KEY_X, KeyMod.CONTROL);

  static {
    keys.put(KeyCode.UNKNOWN, GLFW_KEY_UNKNOWN);
    keys.put(KeyCode.SPACE, GLFW_KEY_SPACE);
    keys.put(KeyCode.APOSTROPHE, GLFW_KEY_APOSTROPHE);
    keys.put(KeyCode.COMMA, GLFW_KEY_COMMA);
    keys.put(KeyCode.MINUS, GLFW_KEY_MINUS);
    keys.put(KeyCode.PERIOD, GLFW_KEY_PERIOD);
    keys.put(KeyCode.SLASH, GLFW_KEY_SLASH);
    keys.put(KeyCode.KEY_0, GLFW_KEY_0);
    keys.put(KeyCode.KEY_1, GLFW_KEY_1);
    keys.put(KeyCode.KEY_2, GLFW_KEY_2);
    keys.put(KeyCode.KEY_3, GLFW_KEY_3);
    keys.put(KeyCode.KEY_4, GLFW_KEY_4);
    keys.put(KeyCode.KEY_5, GLFW_KEY_5);
    keys.put(KeyCode.KEY_6, GLFW_KEY_6);
    keys.put(KeyCode.KEY_7, GLFW_KEY_7);
    keys.put(KeyCode.KEY_8, GLFW_KEY_8);
    keys.put(KeyCode.KEY_9, GLFW_KEY_9);
    keys.put(KeyCode.SEMICOLON, GLFW_KEY_SEMICOLON);
    keys.put(KeyCode.EQUAL, GLFW_KEY_EQUAL);
    keys.put(KeyCode.KEY_A, GLFW_KEY_A);
    keys.put(KeyCode.KEY_B, GLFW_KEY_B);
    keys.put(KeyCode.KEY_C, GLFW_KEY_C);
    keys.put(KeyCode.KEY_D, GLFW_KEY_D);
    keys.put(KeyCode.KEY_E, GLFW_KEY_E);
    keys.put(KeyCode.KEY_F, GLFW_KEY_F);
    keys.put(KeyCode.KEY_G, GLFW_KEY_G);
    keys.put(KeyCode.KEY_H, GLFW_KEY_H);
    keys.put(KeyCode.KEY_I, GLFW_KEY_I);
    keys.put(KeyCode.KEY_J, GLFW_KEY_J);
    keys.put(KeyCode.KEY_K, GLFW_KEY_K);
    keys.put(KeyCode.KEY_L, GLFW_KEY_L);
    keys.put(KeyCode.KEY_M, GLFW_KEY_M);
    keys.put(KeyCode.KEY_N, GLFW_KEY_N);
    keys.put(KeyCode.KEY_O, GLFW_KEY_O);
    keys.put(KeyCode.KEY_P, GLFW_KEY_P);
    keys.put(KeyCode.KEY_Q, GLFW_KEY_Q);
    keys.put(KeyCode.KEY_R, GLFW_KEY_R);
    keys.put(KeyCode.KEY_S, GLFW_KEY_S);
    keys.put(KeyCode.KEY_T, GLFW_KEY_T);
    keys.put(KeyCode.KEY_U, GLFW_KEY_U);
    keys.put(KeyCode.KEY_V, GLFW_KEY_V);
    keys.put(KeyCode.KEY_W, GLFW_KEY_W);
    keys.put(KeyCode.KEY_X, GLFW_KEY_X);
    keys.put(KeyCode.KEY_Y, GLFW_KEY_Y);
    keys.put(KeyCode.KEY_Z, GLFW_KEY_Z);
    keys.put(KeyCode.LEFT_BRACKET, GLFW_KEY_LEFT_BRACKET);
    keys.put(KeyCode.BACKSLASH, GLFW_KEY_BACKSLASH);
    keys.put(KeyCode.RIGHT_BRACKET, GLFW_KEY_RIGHT_BRACKET);
    keys.put(KeyCode.GRAVE_ACCENT, GLFW_KEY_GRAVE_ACCENT);
    keys.put(KeyCode.WORLD_1, GLFW_KEY_WORLD_1);
    keys.put(KeyCode.WORLD_2, GLFW_KEY_WORLD_2);
    keys.put(KeyCode.ESCAPE, GLFW_KEY_ESCAPE);
    keys.put(KeyCode.ENTER, GLFW_KEY_ENTER);
    keys.put(KeyCode.TAB, GLFW_KEY_TAB);
    keys.put(KeyCode.BACKSPACE, GLFW_KEY_BACKSPACE);
    keys.put(KeyCode.INSERT, GLFW_KEY_INSERT);
    keys.put(KeyCode.DELETE, GLFW_KEY_DELETE);
    keys.put(KeyCode.RIGHT, GLFW_KEY_RIGHT);
    keys.put(KeyCode.LEFT, GLFW_KEY_LEFT);
    keys.put(KeyCode.DOWN, GLFW_KEY_DOWN);
    keys.put(KeyCode.UP, GLFW_KEY_UP);
    keys.put(KeyCode.PAGE_UP, GLFW_KEY_PAGE_UP);
    keys.put(KeyCode.PAGE_DOWN, GLFW_KEY_PAGE_DOWN);
    keys.put(KeyCode.HOME, GLFW_KEY_HOME);
    keys.put(KeyCode.END, GLFW_KEY_END);
    keys.put(KeyCode.CAPS_LOCK, GLFW_KEY_CAPS_LOCK);
    keys.put(KeyCode.SCROLL_LOCK, GLFW_KEY_SCROLL_LOCK);
    keys.put(KeyCode.NUM_LOCK, GLFW_KEY_NUM_LOCK);
    keys.put(KeyCode.PRINT_SCREEN, GLFW_KEY_PRINT_SCREEN);
    keys.put(KeyCode.PAUSE, GLFW_KEY_PAUSE);
    keys.put(KeyCode.KEY_F1, GLFW_KEY_F1);
    keys.put(KeyCode.KEY_F2, GLFW_KEY_F2);
    keys.put(KeyCode.KEY_F3, GLFW_KEY_F3);
    keys.put(KeyCode.KEY_F4, GLFW_KEY_F4);
    keys.put(KeyCode.KEY_F5, GLFW_KEY_F5);
    keys.put(KeyCode.KEY_F6, GLFW_KEY_F6);
    keys.put(KeyCode.KEY_F7, GLFW_KEY_F7);
    keys.put(KeyCode.KEY_F8, GLFW_KEY_F8);
    keys.put(KeyCode.KEY_F9, GLFW_KEY_F9);
    keys.put(KeyCode.KEY_F10, GLFW_KEY_F10);
    keys.put(KeyCode.KEY_F11, GLFW_KEY_F11);
    keys.put(KeyCode.KEY_F12, GLFW_KEY_F12);
    keys.put(KeyCode.KEY_F13, GLFW_KEY_F13);
    keys.put(KeyCode.KEY_F14, GLFW_KEY_F14);
    keys.put(KeyCode.KEY_F15, GLFW_KEY_F15);
    keys.put(KeyCode.KEY_F16, GLFW_KEY_F16);
    keys.put(KeyCode.KEY_F17, GLFW_KEY_F17);
    keys.put(KeyCode.KEY_F18, GLFW_KEY_F18);
    keys.put(KeyCode.KEY_F19, GLFW_KEY_F19);
    keys.put(KeyCode.KEY_F20, GLFW_KEY_F20);
    keys.put(KeyCode.KEY_F21, GLFW_KEY_F21);
    keys.put(KeyCode.KEY_F22, GLFW_KEY_F22);
    keys.put(KeyCode.KEY_F23, GLFW_KEY_F23);
    keys.put(KeyCode.KEY_F24, GLFW_KEY_F24);
    keys.put(KeyCode.KEY_F25, GLFW_KEY_F25);
    keys.put(KeyCode.NUMPAD_0, GLFW_KEY_KP_0);
    keys.put(KeyCode.NUMPAD_1, GLFW_KEY_KP_1);
    keys.put(KeyCode.NUMPAD_2, GLFW_KEY_KP_2);
    keys.put(KeyCode.NUMPAD_3, GLFW_KEY_KP_3);
    keys.put(KeyCode.NUMPAD_4, GLFW_KEY_KP_4);
    keys.put(KeyCode.NUMPAD_5, GLFW_KEY_KP_5);
    keys.put(KeyCode.NUMPAD_6, GLFW_KEY_KP_6);
    keys.put(KeyCode.NUMPAD_7, GLFW_KEY_KP_7);
    keys.put(KeyCode.NUMPAD_8, GLFW_KEY_KP_8);
    keys.put(KeyCode.NUMPAD_9, GLFW_KEY_KP_9);
    keys.put(KeyCode.NUMPAD_DECIMAL, GLFW_KEY_KP_DECIMAL);
    keys.put(KeyCode.NUMPAD_DIVIDE, GLFW_KEY_KP_DIVIDE);
    keys.put(KeyCode.NUMPAD_MULTIPLY, GLFW_KEY_KP_MULTIPLY);
    keys.put(KeyCode.NUMPAD_SUBTRACT, GLFW_KEY_KP_SUBTRACT);
    keys.put(KeyCode.NUMPAD_ADD, GLFW_KEY_KP_ADD);
    keys.put(KeyCode.NUMPAD_ENTER, GLFW_KEY_KP_ENTER);
    keys.put(KeyCode.NUMPAD_EQUAL, GLFW_KEY_KP_EQUAL);
    keys.put(KeyCode.LEFT_SHIFT, GLFW_KEY_LEFT_SHIFT);
    keys.put(KeyCode.LEFT_CONTROL, GLFW_KEY_LEFT_CONTROL);
    keys.put(KeyCode.LEFT_ALT, GLFW_KEY_LEFT_ALT);
    keys.put(KeyCode.LEFT_SUPER, GLFW_KEY_LEFT_SUPER);
    keys.put(KeyCode.RIGHT_SHIFT, GLFW_KEY_RIGHT_SHIFT);
    keys.put(KeyCode.RIGHT_CONTROL, GLFW_KEY_RIGHT_CONTROL);
    keys.put(KeyCode.RIGHT_ALT, GLFW_KEY_RIGHT_ALT);
    keys.put(KeyCode.RIGHT_SUPER, GLFW_KEY_RIGHT_SUPER);
    keys.put(KeyCode.KEY_MENU, GLFW_KEY_MENU);
  }

  private Keyboard() {
  }

  public static void updateMapping(Map<KeyCode, Integer> keyMapping) {
    keys.putAll(keyMapping);
  }

  public static KeyCode getKeyCode(int nativeCode) {
    return keys.inverse().get(nativeCode);
  }

  public static int getNativeCode(KeyCode keyCode) {
    return keys.get(keyCode);
  }

  public static Shortcut getCopyShortcut() {
    return copyShortcut;
  }

  public static void setCopyShortcut(Shortcut copyShortcut) {
    Keyboard.copyShortcut = Objects.requireNonNull(copyShortcut);
  }

  public static Shortcut getPasteShortcut() {
    return pasteShortcut;
  }

  public static void setPasteShortcut(Shortcut pasteShortcut) {
    Keyboard.pasteShortcut = Objects.requireNonNull(pasteShortcut);
  }

  public static Shortcut getSelectAllShortcut() {
    return selectAllShortcut;
  }

  public static void setSelectAllShortcut(Shortcut selectAllShortcut) {
    Keyboard.selectAllShortcut = Objects.requireNonNull(selectAllShortcut);
  }

  public static Shortcut getCutShortcut() {
    return cutShortcut;
  }

  public static void setCutShortcut(Shortcut cutShortcut) {
    Keyboard.cutShortcut = Objects.requireNonNull(cutShortcut);
  }
}
