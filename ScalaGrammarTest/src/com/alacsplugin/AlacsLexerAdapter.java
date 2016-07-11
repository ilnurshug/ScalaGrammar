package com.alacsplugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class AlacsLexerAdapter extends FlexAdapter {
    public AlacsLexerAdapter() {
        super(new AlacsLexer((Reader) null));
    }
}