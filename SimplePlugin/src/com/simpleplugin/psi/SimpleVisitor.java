// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class SimpleVisitor extends PsiElementVisitor {

  public void visitExpr(@NotNull SimpleExpr o) {
    visitPsiElement(o);
  }

  public void visitLiteralExpr(@NotNull SimpleLiteralExpr o) {
    visitExpr(o);
  }

  public void visitMulExpr(@NotNull SimpleMulExpr o) {
    visitExpr(o);
  }

  public void visitParenExpr(@NotNull SimpleParenExpr o) {
    visitExpr(o);
  }

  public void visitPlusExpr(@NotNull SimplePlusExpr o) {
    visitExpr(o);
  }

  public void visitQuery(@NotNull SimpleQuery o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
