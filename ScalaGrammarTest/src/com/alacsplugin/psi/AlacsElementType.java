package com.alacsplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.alacsplugin.AlacsLanguage;
import org.jetbrains.annotations.*;

public class AlacsElementType extends IElementType {
  public AlacsElementType(@NotNull @NonNls String debugName) {
    super(debugName, AlacsLanguage.INSTANCE);
  }
}
