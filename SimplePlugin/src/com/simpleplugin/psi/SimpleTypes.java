// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.simpleplugin.psi.impl.*;

public interface SimpleTypes {

  IElementType EXPR = new SimpleElementType("EXPR");
  IElementType LITERAL_EXPR = new SimpleElementType("LITERAL_EXPR");
  IElementType MUL_EXPR = new SimpleElementType("MUL_EXPR");
  IElementType PAREN_EXPR = new SimpleElementType("PAREN_EXPR");
  IElementType PLUS_EXPR = new SimpleElementType("PLUS_EXPR");

  IElementType COMMENT = new SimpleTokenType("comment");
  IElementType CRLF = new SimpleTokenType("crlf");
  IElementType LP = new SimpleTokenType("(");
  IElementType NUMBER = new SimpleTokenType("number");
  IElementType OP_1 = new SimpleTokenType("+");
  IElementType OP_2 = new SimpleTokenType("-");
  IElementType OP_3 = new SimpleTokenType("*");
  IElementType OP_4 = new SimpleTokenType("/");
  IElementType OP_5 = new SimpleTokenType("!");
  IElementType RP = new SimpleTokenType(")");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == EXPR) {
        return new SimpleExprImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new SimpleLiteralExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new SimpleMulExprImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new SimpleParenExprImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new SimplePlusExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
