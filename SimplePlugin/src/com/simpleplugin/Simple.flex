package com.simpleplugin;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.simpleplugin.psi.SimpleTypes.*;

%%

%{
  public SimpleLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class SimpleLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

NUMBER=[0-9]+(\.[0-9]*)?
COMMENT="//".*
CRLF=\n|\r|\r\n

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "("                { return LP; }
  ")"                { return RP; }
  "+"                { return OP_1; }
  "-"                { return OP_2; }
  "*"                { return OP_3; }
  "/"                { return OP_4; }
  "!"                { return OP_5; }

  {NUMBER}           { return NUMBER; }
  {COMMENT}          { return COMMENT; }
  {CRLF}             { return CRLF; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
