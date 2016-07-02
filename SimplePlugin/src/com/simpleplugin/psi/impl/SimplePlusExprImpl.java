// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.simpleplugin.psi.SimpleTypes.*;
import com.simpleplugin.psi.*;

public class SimplePlusExprImpl extends SimpleExprImpl implements SimplePlusExpr {

  public SimplePlusExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitPlusExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SimpleExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleExpr.class);
  }

}
