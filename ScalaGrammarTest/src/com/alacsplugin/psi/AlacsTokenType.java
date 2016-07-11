package com.alacsplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.alacsplugin.AlacsLanguage;
import org.jetbrains.annotations.*;

public class AlacsTokenType extends IElementType {
  public AlacsTokenType(@NotNull @NonNls String debugName) {
    super(debugName, AlacsLanguage.INSTANCE);
  }

  @Override
  public String toString() {
    return "AlacsTokenType." + super.toString();
  }
}
