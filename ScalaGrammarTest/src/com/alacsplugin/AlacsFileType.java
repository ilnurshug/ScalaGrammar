package com.alacsplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class AlacsFileType extends LanguageFileType {
    public static final AlacsFileType INSTANCE = new AlacsFileType();

    private AlacsFileType() {
        super(AlacsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "alacs file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "alacs language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "alacs";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AlacsIcons.FILE;
    }
}