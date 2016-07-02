// This is a generated file. Not intended for manual editing.
package com.simpleplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.simpleplugin.psi.SimpleTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SimpleParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == EXPR) {
      r = expr(b, 0);
    }
    else if (t == LITERAL_EXPR) {
      r = literal_expr(b, 0);
    }
    else if (t == MUL_EXPR) {
      r = mul_expr(b, 0);
    }
    else if (t == PAREN_EXPR) {
      r = paren_expr(b, 0);
    }
    else if (t == PLUS_EXPR) {
      r = plus_expr(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return simpleFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(EXPR, LITERAL_EXPR, MUL_EXPR, PAREN_EXPR,
      PLUS_EXPR),
  };

  /* ********************************************************** */
  // factor plus_expr *
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    if (!nextTokenIs(b, "<expression>", LP, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR, "<expression>");
    r = factor(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // plus_expr *
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!plus_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // primary mul_expr *
  static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    if (!nextTokenIs(b, "", LP, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary(b, l + 1);
    r = r && factor_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // mul_expr *
  private static boolean factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!mul_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "factor_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // expr|comment|crlf
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // number
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<expression>");
    r = consumeToken(b, NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // mul_op primary
  public static boolean mul_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_expr")) return false;
    if (!nextTokenIs(b, "<expression>", OP_3, OP_4)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, MUL_EXPR, "<expression>");
    r = mul_op(b, l + 1);
    r = r && primary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '*'|'/'
  static boolean mul_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_op")) return false;
    if (!nextTokenIs(b, "", OP_3, OP_4)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_3);
    if (!r) r = consumeToken(b, OP_4);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' expr ')'
  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAREN_EXPR, "<expression>");
    r = consumeToken(b, LP);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // plus_op factor
  public static boolean plus_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_expr")) return false;
    if (!nextTokenIs(b, "<expression>", OP_1, OP_2)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, PLUS_EXPR, "<expression>");
    r = plus_op(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '+'|'-'
  static boolean plus_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_op")) return false;
    if (!nextTokenIs(b, "", OP_1, OP_2)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_1);
    if (!r) r = consumeToken(b, OP_2);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary_inner
  static boolean primary(PsiBuilder b, int l) {
    return primary_inner(b, l + 1);
  }

  /* ********************************************************** */
  // literal_expr | paren_expr
  static boolean primary_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_inner")) return false;
    if (!nextTokenIs(b, "", LP, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal_expr(b, l + 1);
    if (!r) r = paren_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean simpleFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

}
