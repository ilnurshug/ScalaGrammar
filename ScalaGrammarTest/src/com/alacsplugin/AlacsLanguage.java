package com.alacsplugin;

import com.intellij.lang.Language;

public class AlacsLanguage extends Language {
    public static final AlacsLanguage INSTANCE = new AlacsLanguage();

    private AlacsLanguage() {
        super("Alacs");
    }
}