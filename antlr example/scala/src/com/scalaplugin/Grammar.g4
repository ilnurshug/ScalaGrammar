	
/*
 [The "BSD licence"]
 Copyright (c) 2014 Leonardo Lucena
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/*
   Derived from http://www.scala-lang.org/files/archive/spec/2.11/13-syntax-summary.html
 */

grammar Grammar;

program           : blockExpr
                  | compilationUnit ;

literal           : WhiteSpace* OP_2? WhiteSpace* IntegerLiteral WhiteSpace*
                  | WhiteSpace*  OP_2? WhiteSpace*  FloatingPointLiteral WhiteSpace*
                  | WhiteSpace*  BooleanLiteral WhiteSpace*
                  | WhiteSpace*  CharacterLiteral WhiteSpace*
                  | WhiteSpace*  StringLiteral WhiteSpace*
                  | WhiteSpace*  SymbolLiteral WhiteSpace*
                  | WhiteSpace* NULL WhiteSpace* ;
                  
qualId            : id (DOT id)* ;

ids               : id (  COMMA  id)* ;

path              :  stableId
                  |  (id DOT)? THIS ;

stableId          :  id stableId1
                  |	 id DOT THIS DOT id stableId1
                  |	 THIS DOT id stableId1
                  |	 id DOT SUPER classQualifier DOT id stableId1
                  |	 SUPER classQualifier DOT id stableId1
                  |	 id DOT SUPER DOT id stableId1
                  |	 SUPER DOT id stableId1
                  |	 id DOT THIS DOT id
                  |	 THIS DOT id
                  |	 id DOT SUPER classQualifier DOT id
                  |	 SUPER classQualifier DOT id
                  |	 id DOT SUPER DOT id
                  |	 SUPER DOT id
                  |  id ;

stableId1         :  DOT id stableId1
                  |  DOT id ;

classQualifier    : LEFT_BRACKET id RIGHT_BRACKET ;

type              : functionArgTypes  TO  type
                  | infixType  existentialClause
                  | infixType ;

functionArgTypes  : infixType
                  | LEFT_PAREN  ( paramType ( COMMA  paramType )* )?  RIGHT_PAREN ;

existentialClause : FORSOME  LEFT_BRACE  existentialDcl ( Semi  existentialDcl)*  RIGHT_BRACE;

existentialDcl    : TYPE  typeDcl
                  | VAL  valDcl;

infixType         : compoundType (  id  Nl?  compoundType)*;

compoundType      : annotType ( WITH  annotType)*  refinement?
                  | refinement;

annotType         : simpleType  annotation*;

simpleType        : simpleType  typeArgs
                  | simpleType SHARP id
                  | stableId
                  | (stableId | (id DOT)? THIS) DOT TYPE
                  | LEFT_PAREN  types  RIGHT_PAREN;

typeArgs          : LEFT_BRACKET  types  RIGHT_BRACKET;

types             : type ( COMMA  type)*;

refinement        : Nl? LEFT_BRACE  refineStat ( Semi  refineStat)*  RIGHT_BRACE;

refineStat        : dcl
                  | TYPE  typeDef
                  | ;

typePat           : type;

ascription        : COLON  infixType
                  | COLON  annotation+
                  | COLON UNDERSCORE OP_3;

expr              : (bindings | (IMPLICIT |) id | UNDERSCORE)  TO  expr
                  | expr1 ;

expr1             : IF  LEFT_PAREN  expr  RIGHT_PAREN  Nl*  expr ( Semi?  ELSE  expr)?
                  | WHILE  LEFT_PAREN  expr  RIGHT_PAREN  Nl*  expr
                  | TRY ( LEFT_BRACE  block  RIGHT_BRACE  |  expr) ( CATCH  LEFT_BRACE  caseClauses  RIGHT_BRACE)? ( FINALLY  expr)?
                  | DO  expr  Semi?  WHILE  LEFT_PAREN  expr  RIGHT_PAREN
                  | FOR  (LEFT_PAREN  enumerators  RIGHT_PAREN | LEFT_BRACE  enumerators  RIGHT_BRACE)  Nl*  YIELD?  expr
                  | THROW  expr
                  | RETURN  expr?
                  | ((NEW  (classTemplate | templateBody)| blockExpr | simpleExpr1  UNDERSCORE?) DOT)  id  EQ  expr
                  | simpleExpr1  argumentExprs  EQ  expr
                  | postfixExpr
                  | postfixExpr  ascription
                  | postfixExpr  MATCH  LEFT_BRACE  caseClauses  RIGHT_BRACE ;

postfixExpr       : infixExpr ( id  Nl?)? ;

infixExpr         : prefixExpr
                  | infixExpr  id  Nl?  infixExpr ;

prefixExpr        : (OP_2 | OP_1 | TLD | EPT)?
                    (NEW  (classTemplate | templateBody)| blockExpr | simpleExpr1 UNDERSCORE?) ;

simpleExpr1       :	literal  simpleExpr2
                  |	literal
                  |	path  simpleExpr2
                  |	path
                  |	UNDERSCORE  simpleExpr2
                  |	UNDERSCORE
                  |	LEFT_PAREN  RIGHT_PAREN  simpleExpr2
                  |	LEFT_PAREN  RIGHT_PAREN
                  |	LEFT_PAREN  exprs  RIGHT_PAREN  simpleExpr2
                  |	LEFT_PAREN  exprs  RIGHT_PAREN
                  |	NEW ( classTemplate  DOT  id |  NEW ( classTemplate  DOT  id  simpleExpr2 |  templateBody)  DOT  id  |  templateBody)  DOT  id  simpleExpr2
                  |	blockExpr  DOT  id  simpleExpr2
                  |	blockExpr  DOT  id
                  |	NEW ( classTemplate  typeArgs  |	 NEW ( classTemplate  typeArgs  simpleExpr2  |  templateBody)  typeArgs |  templateBody)  typeArgs  simpleExpr2
                  |	blockExpr  typeArgs  simpleExpr2
                  |	blockExpr  typeArgs ;

simpleExpr2       :  DOT id   simpleExpr2
                  |	DOT id
                  |	UNDERSCORE DOT id   simpleExpr2
                  |	UNDERSCORE DOT id
                  |	typeArgs   simpleExpr2
                  |	typeArgs
                  |	UNDERSCORE   typeArgs   simpleExpr2
                  |	UNDERSCORE   typeArgs
                  |	argumentExprs   simpleExpr2
                  |	argumentExprs ;
                  
exprs             : expr (  COMMA  expr)* ;

argumentExprs     : LEFT_PAREN  exprs?  RIGHT_PAREN 
                  | LEFT_PAREN  (exprs  COMMA )? postfixExpr  COLON UNDERSCORE OP_3 RIGHT_PAREN
                  | Nl?  blockExpr ;
                  
blockExpr         : LEFT_BRACE  caseClauses  RIGHT_BRACE
                  | LEFT_BRACE  block  RIGHT_BRACE ;
block             : blockStat ( Semi  blockStat)*  resultExpr? ;

blockStat         : import_
                  | annotation*  (IMPLICIT | LAZY)?  def
                  | annotation*  (localModifier )*  tmplDef
                  | expr1
                  | ;

resultExpr        : expr1
                  | (bindings | (IMPLICIT?  id | UNDERSCORE)  COLON  compoundType)  TO  block ;

enumerators       : generator  ( Semi  generator)* ;

generator         : pattern1  LARROW  expr ( Semi?  guard |  Semi  pattern1  EQ  expr)* ;

caseClauses       : caseClause+ ;

caseClause        : CASE  pattern  guard?  TO  block ;
  
guard             : IF  postfixExpr ;

pattern           : pattern1 ( VDASH  pattern1 )* ;

pattern1          : Varid  COLON  typePat
                  | UNDERSCORE  COLON  typePat
                  | pattern2 ;

pattern2          : Varid  (AT pattern3)?
                  | pattern3 ;

pattern3          : simplePattern
                  | simplePattern ( id  Nl?  simplePattern)* ;
                  
simplePattern     : UNDERSCORE
                  | Varid
                  | literal 
                  | stableId ( LEFT_PAREN  patterns  RIGHT_PAREN)?
                  | stableId  LEFT_PAREN  (patterns  COMMA )? (Varid  AT)?  UNDERSCORE  OP_3  RIGHT_PAREN
                  | LEFT_PAREN  patterns?  RIGHT_PAREN ;

patterns          : pattern ( COMMA  patterns)*
                  | (UNDERSCORE ) * ;

typeParamClause   : LEFT_BRACKET  variantTypeParam ( COMMA  variantTypeParam)*  RIGHT_BRACKET ;

funTypeParamClause: LEFT_BRACKET  typeParam ( COMMA  typeParam)*  RIGHT_BRACKET ;

variantTypeParam  : annotation?  (OP_1 | OP_2)?  typeParam ;

typeParam         : (id | UNDERSCORE)  typeParamClause? ( RR  type)? ( LL  type)?
                    (LLL  type)* ( COLON  type)* ;
                         
paramClauses      : paramClause* ( Nl?  LEFT_PAREN  IMPLICIT  params  RIGHT_PAREN)? ;

paramClause       : Nl?  LEFT_PAREN  params? RIGHT_PAREN  ;

params            : param ( COMMA  param)* ;

param             : annotation*  id  ( COLON  paramType)? ( EQ  expr)? ;

paramType         : type 
                  | TO  type
                  | type  OP_3;

classParamClauses : classParamClause* 
                    ( Nl?  LEFT_PAREN  IMPLICIT  classParams  RIGHT_PAREN)? ;
                         
classParamClause  : Nl?  LEFT_PAREN  classParams?  RIGHT_PAREN  ;

classParams       : classParam ( COMMA  classParam)* ;

classParam        : annotation*  (modifier )*  ( VAL |  VAR)? 
                    id  COLON  paramType ( EQ  expr)? ;
                    
bindings          : LEFT_PAREN  binding ( COMMA  binding )*  RIGHT_PAREN ;

binding           : (id | UNDERSCORE) ( COLON  type)? ;

modifier          : localModifier 
                  | accessModifier
                  | OVERRIDE ;
                  
localModifier     : ABSTRACT
                  | FINAL
                  | SEALED
                  | IMPLICIT
                  | LAZY ;
                  
accessModifier    : (PRIVATE  | PROTECTED )  accessQualifier? ;

accessQualifier   : LEFT_BRACKET  (id | THIS)  RIGHT_BRACKET ;

annotation        : AT simpleType  argumentExprs* ;

constrAnnotation  : AT simpleType  argumentExprs ;

templateBody      : Nl?  LEFT_BRACE  selfType?  templateStat ( Semi  templateStat)*  RIGHT_BRACE ;

templateStat      : import_
                  | (annotation Nl?)* ((modifier )+ | ) def
                  | (annotation Nl?)* ((modifier )+ | ) dcl
                  |  expr
                  | ;
                  
selfType          : id ( COLON  type)?  TO
                  | THIS  COLON  type  TO ;

import_           : IMPORT  importExpr ( COMMA  importExpr)* ;

importExpr        : stableId DOT (id | UNDERSCORE | importSelectors) ;

importSelectors   : LEFT_BRACE  ( importSelector  COMMA)* ( importSelector |  UNDERSCORE)  RIGHT_BRACE ;

importSelector    : id ( TO  id |  TO  UNDERSCORE)? ;
 
dcl               : VAL  valDcl
                  | VAR  varDcl
                  | DEF  funDcl
                  | TYPE  Nl*  typeDcl ;

valDcl            : ids  COLON  type ;

varDcl            : ids  COLON  type ;

funDcl            : funSig ( COLON  type)? ;

funSig            : id  funTypeParamClause?  paramClauses ;

typeDcl           : id  typeParamClause?  (RR  type)? ( LL  type)? ;

patVarDef         : VAL  patDef
                  | VAR  varDef ;

def               : patVarDef
                  | DEF  funDef
                  | TYPE  Nl*  typeDef
                  | tmplDef ;
                  
patDef            : pattern2 ( COMMA  pattern2)* ( COLON  type)*  EQ  expr ;

varDef            : patDef
                  | ids  COLON  type  EQ  UNDERSCORE ;
                  
funDef            : funSig ( COLON  type)?  EQ  expr
                  | funSig  Nl?  LEFT_BRACE  block  RIGHT_BRACE
                  | THIS  paramClause  paramClauses
                    (EQ  constrExpr |  Nl  constrBlock) ;

typeDef           :  id  typeParamClause?  EQ  type ;

tmplDef           : CASE?  CLASS  classDef
                  | CASE?  OBJECT  objectDef
                  | TRAIT  traitDef ;

classDef          : id  typeParamClause?  (constrAnnotation )*  accessModifier?
                    classParamClauses  classTemplateOpt ;
                      
traitDef          : id  typeParamClause?  traitTemplateOpt ;

objectDef         : id  classTemplateOpt ;

classTemplateOpt  : EXTENDS  classTemplate | (EXTENDS?  templateBody)? ;

traitTemplateOpt  : (EXTENDS  traitTemplate)
                  | (EXTENDS?  templateBody)? ;

classTemplate     : earlyDefs?  classParents  templateBody? ;

traitTemplate     : earlyDefs?  traitParents  templateBody? ;

classParents      : constr ( WITH  annotType)* ;

traitParents      : annotType ( WITH  annotType)* ;

constr            : annotType  argumentExprs* ;

earlyDefs         : LEFT_BRACE  (earlyDef ( Semi  earlyDef)*)?  RIGHT_BRACE  WITH ;

earlyDef          : (annotation  Nl?)*  (modifier )*  patVarDef ;

constrExpr        : selfInvocation 
                  | constrBlock ;
                  
constrBlock       : LEFT_BRACE  selfInvocation ( Semi  blockStat)*  RIGHT_BRACE ;
selfInvocation    : THIS  argumentExprs+ ;

topStatSeq        : topStat ( Semi  topStat)* ;

topStat           : (annotation  Nl?)*  (modifier )*  tmplDef
                  | import_
                  | packaging
                  | packageObject
                  | ;
                    
packaging         : PACKAGE  qualId  Nl?  LEFT_BRACE  topStatSeq  RIGHT_BRACE ;

packageObject     : PACKAGE  OBJECT  objectDef ;

compilationUnit   : (PACKAGE  qualId  Semi)*  topStatSeq ;

id                : Id
                  | OP_1
                  | OP_2
                  | OP_3
                  | EPT
                  | TLD
                  | EQ
                  | UNDERSCORE
                  | TO;


// Lexer


LEFT_BRACE		:  WhiteSpace*'{' WhiteSpace*;
RIGHT_BRACE		:  WhiteSpace*'}' WhiteSpace*;
LEFT_BRACKET	:  WhiteSpace*'[' WhiteSpace*;
RIGHT_BRACKET	:  WhiteSpace*']' WhiteSpace*;
LEFT_PAREN		:  WhiteSpace*'(' WhiteSpace*;
RIGHT_PAREN		:  WhiteSpace*')' WhiteSpace*;
DOT				:  WhiteSpace*'.' WhiteSpace*;
COMMA			:  WhiteSpace*',' WhiteSpace*;

Q_MARK			:  WhiteSpace*'\'' WhiteSpace*;
Q_MARK_2		:  WhiteSpace*'"' WhiteSpace*;

COLON			:  WhiteSpace*':' WhiteSpace*;
UNDERSCORE		:  WhiteSpace*'_' WhiteSpace*;
EQ				:  WhiteSpace*'=' WhiteSpace*;
TO				:  WhiteSpace*'=>' WhiteSpace*;
LARROW			:  WhiteSpace*'<-' WhiteSpace*;
LL			    :  WhiteSpace*'<:' WhiteSpace*;
RR			    :  WhiteSpace*'>:' WhiteSpace*;
SHARP			:  WhiteSpace*'#' WhiteSpace*;
AT		  	    :  WhiteSpace*'@' WhiteSpace*;
LLL				:  WhiteSpace*'<%' WhiteSpace*;

SLASH			:  WhiteSpace*'\\' WhiteSpace*;

ABSTRACT		:  WhiteSpace*'abstract' WhiteSpace*;
CASE			:  WhiteSpace*'case' WhiteSpace*;
CATCH			:  WhiteSpace*'catch' WhiteSpace*;
CLASS			:  WhiteSpace*'class' WhiteSpace*;
DEF				:  WhiteSpace*'def' WhiteSpace*;
DO				:  WhiteSpace*'do' WhiteSpace*;
ELSE			:  WhiteSpace*'else' WhiteSpace*;
EXTENDS			:  WhiteSpace*'extends' WhiteSpace*;
FINAL			:  WhiteSpace*'final' WhiteSpace*;
FINALLY			:  WhiteSpace*'finally' WhiteSpace*;
FOR				:  WhiteSpace*'for' WhiteSpace*;
FORSOME			:  WhiteSpace*'forSome' WhiteSpace*;
IF				:  WhiteSpace*'if' WhiteSpace*;
IMPLICIT		:  WhiteSpace*'implicit' WhiteSpace*;
IMPORT			:  WhiteSpace*'import' WhiteSpace*;
LAZY			:  WhiteSpace*'lazy' WhiteSpace*;
MACRO			:  WhiteSpace*'macro' WhiteSpace*;
MATCH			:  WhiteSpace*'match' WhiteSpace*;
NEW				:  WhiteSpace*'new' WhiteSpace*;
NULL			:  WhiteSpace*'null' WhiteSpace*;
OBJECT			:  WhiteSpace*'object' WhiteSpace*;
OVERRIDE		:  WhiteSpace*'override' WhiteSpace*;
PACKAGE			:  WhiteSpace*'package' WhiteSpace*;
PRIVATE			:  WhiteSpace*'private' WhiteSpace*;
PROTECTED		:  WhiteSpace*'protected' WhiteSpace*;
RETURN			:  WhiteSpace*'return' WhiteSpace*;
SEALED			:  WhiteSpace*'sealed' WhiteSpace*;
SUPER			:  WhiteSpace*'super' WhiteSpace*;
THIS			:  WhiteSpace*'this' WhiteSpace*;
THROW			:  WhiteSpace*'throw' WhiteSpace*;
TRAIT			:  WhiteSpace*'trait' WhiteSpace*;
TRY				:  WhiteSpace*'try' WhiteSpace*;
TYPE			:  WhiteSpace*'type' WhiteSpace*;
VAL				:  WhiteSpace*'val' WhiteSpace*;
VAR				:  WhiteSpace*'var' WhiteSpace*;
WHILE			:  WhiteSpace*'while' WhiteSpace*;
WITH			:  WhiteSpace*'with' WhiteSpace*;
YIELD			:  WhiteSpace*'yield' WhiteSpace*;

OP_1		    :  WhiteSpace*'+' WhiteSpace*;
OP_2			:  WhiteSpace*'-' WhiteSpace*;
OP_3			:  WhiteSpace*'*' WhiteSpace*;
EPT				:  WhiteSpace*'!' WhiteSpace*;
TLD				:  WhiteSpace*'~' WhiteSpace*;
VDASH			:  WhiteSpace*'|' WhiteSpace*;


BooleanLiteral   : 'true'
                 | 'false';
CharacterLiteral :  '\'' (PrintableChar | CharEscapeSeq) '\'';
StringLiteral    :  '"' StringElement* '"'
                 |  '"""' MultiLineChars '"""';
SymbolLiteral    :  '\'' Plainid;
IntegerLiteral   :  (DecimalNumeral | HexNumeral) ('L' | 'l')?;
FloatingPointLiteral
                 :  Digit+ '.' Digit+ ExponentPart? FloatType?
                 |  '.' Digit+ ExponentPart? FloatType?
                 |  Digit ExponentPart FloatType?
                 |  Digit+ ExponentPart? FloatType;
Id               :  WhiteSpace* Plainid WhiteSpace*
                 |  WhiteSpace* '\'' StringLiteral '\'' WhiteSpace*;
Varid            :  Lower Idrest;
Nl               :  '\r'? '\n';
Semi             :  WhiteSpace*';' WhiteSpace* |  WhiteSpace* Nl+ WhiteSpace*;


LINE_COMMENT : '//' [^\n\r]*        -> channel(HIDDEN) ;
COMMENT      : '/*' .*? '*/'    	-> channel(HIDDEN) ;

WhiteSpace       :  [ \t]+ ;



// fragments
fragment UnicodeEscape    :	'\\' 'u' 'u'? HexDigit HexDigit HexDigit HexDigit ;

fragment Plainid          :  Op
                          |  Upper Idrest
                          |  Varid ;

fragment Op               :  Opchar+;
fragment Opchar           :  ~[a-zA-Z0-9()[\]{}.;, \r\t\n'"$_] ;

fragment Idrest           :  (Letter | Digit)* ('_' Op)?;

fragment StringElement    :  '\u0020'| '\u0021'|'\u0023' .. '\u007F'
                          |  CharEscapeSeq;
fragment MultiLineChars   :  ('"'? '"'? .*?)* '"'*;

fragment HexDigit         :  '0' .. '9'  |  'A' .. 'F'  |  'a' .. 'f' ;
fragment FloatType        :  'F' | 'f' | 'D' | 'd';
fragment Upper            :  'A'  ..  'Z' | '$' | '_';  // and Unicode category Lu
fragment Lower            :  'a' .. 'z'; // and Unicode category Ll
fragment Letter           :  Upper | Lower; // and Unicode categories Lo, Lt, Nl
fragment ExponentPart     :  ('E' | 'e') ('+' | '-')? Digit+;
fragment PrintableChar    : '\u0020' .. '\u007F' ;
fragment CharEscapeSeq    : '\\' ('b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\');
fragment DecimalNumeral   :  '0' | NonZeroDigit Digit*;
fragment HexNumeral       :  '0' 'x' HexDigit HexDigit+;
fragment Digit            :  '0' | NonZeroDigit;
fragment NonZeroDigit     :  '1' .. '9';
