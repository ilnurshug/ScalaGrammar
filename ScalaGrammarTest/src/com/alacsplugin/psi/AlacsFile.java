package com.alacsplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.alacsplugin.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class AlacsFile extends PsiFileBase {
    public AlacsFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, AlacsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return AlacsFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Alacs File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}