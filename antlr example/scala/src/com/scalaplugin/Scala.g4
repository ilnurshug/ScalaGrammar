	
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

grammar Scala;

program           : blockExpr
                  | compilationUnit ;

literal           : '-'? IntegerLiteral
                  | '-'? FloatingPointLiteral
                  | BooleanLiteral
                  | CharacterLiteral
                  | StringLiteral
                  | SymbolLiteral
                  | 'null' ; 
                  
qualId            : id ('.' id)* ;

ids               : id (WhiteSpace*  ',' WhiteSpace* id)* ;

path              :  stableId
                  |  (id '.')? 'this' ;

stableId          :  id stableId1
                  |	 id '.' 'this' '.' id stableId1
                  |	 'this' '.' id stableId1
                  |	 id '.' 'super' classQualifier '.' id stableId1
                  |	 'super' classQualifier '.' id stableId1
                  |	 id '.' 'super' '.' id stableId1
                  |	 'super' '.' id stableId1
                  |	 id '.' 'this' '.' id
                  |	 'this' '.' id
                  |	 id '.' 'super' classQualifier '.' id
                  |	 'super' classQualifier '.' id
                  |	 id '.' 'super' '.' id
                  |	 'super' '.' id
                  |  id ;

stableId1         :  '.' id stableId1
                  |  '.' id ;

classQualifier    : '[' id ']' ;

type              : functionArgTypes WhiteSpace* '=>' WhiteSpace* type
                  | infixType WhiteSpace* existentialClause
                  | infixType WhiteSpace*;

functionArgTypes  : infixType
                  | '(' WhiteSpace* ( paramType (WhiteSpace* ',' WhiteSpace* paramType )* )? WhiteSpace* ')' ;

existentialClause : 'forSome' WhiteSpace* '{' WhiteSpace* existentialDcl (WhiteSpace* Semi WhiteSpace* existentialDcl)* WhiteSpace* '}';

existentialDcl    : 'type' WhiteSpace+ typeDcl
                  | 'val' WhiteSpace+ valDcl;

infixType         : compoundType ( WhiteSpace* id WhiteSpace* Nl? WhiteSpace* compoundType)*;

compoundType      : annotType (WhiteSpace+ 'with' WhiteSpace+ annotType)* WhiteSpace* refinement?
                  | refinement;

annotType         : simpleType WhiteSpace* annotation*;

simpleType        : simpleType WhiteSpace* typeArgs
                  | simpleType '#' id
                  | stableId
                  | (stableId | (id '.')? 'this') '.' 'type'
                  | '(' WhiteSpace* types WhiteSpace* ')';

typeArgs          : '[' WhiteSpace* types WhiteSpace* ']';

types             : type (WhiteSpace* ',' WhiteSpace* type)*;

refinement        : Nl? '{' WhiteSpace* refineStat (WhiteSpace* Semi WhiteSpace* refineStat)* WhiteSpace* '}';

refineStat        : dcl
                  | 'type' WhiteSpace+ typeDef
                  | ;

typePat           : type;

ascription        : ':' WhiteSpace* infixType
                  | ':' WhiteSpace* annotation+
                  | ':' '_' '*';

expr              : (bindings | ('implicit' WhiteSpace+|WhiteSpace*) id | '_') WhiteSpace* '=>' WhiteSpace* expr
                  | expr1 ;

expr1             : 'if' WhiteSpace* '(' WhiteSpace* expr WhiteSpace* ')' WhiteSpace* Nl* WhiteSpace* expr (WhiteSpace* Semi? WhiteSpace* 'else' WhiteSpace* expr)?
                  | 'while' WhiteSpace* '(' WhiteSpace* expr WhiteSpace* ')' WhiteSpace* Nl* WhiteSpace* expr
                  | 'try' (WhiteSpace* '{' WhiteSpace* block WhiteSpace* '}' WhiteSpace* | WhiteSpace* expr) ( WhiteSpace*'catch' WhiteSpace* '{' WhiteSpace* caseClauses WhiteSpace* '}')? (WhiteSpace* 'finally' WhiteSpace* expr)?
                  | 'do' WhiteSpace* expr WhiteSpace* Semi? WhiteSpace* 'while' WhiteSpace* '(' WhiteSpace* expr WhiteSpace* ')'
                  | 'for' WhiteSpace* ('(' WhiteSpace* enumerators WhiteSpace* ')' | '{' WhiteSpace* enumerators WhiteSpace* '}') WhiteSpace* Nl* WhiteSpace* 'yield'? WhiteSpace* expr
                  | 'throw' WhiteSpace* expr
                  | 'return' WhiteSpace* expr?
                  | (('new' WhiteSpace* (classTemplate | templateBody)| blockExpr | simpleExpr1  '_'?) '.')  id WhiteSpace* '=' WhiteSpace* expr
                  | simpleExpr1 WhiteSpace* argumentExprs WhiteSpace* '=' WhiteSpace* expr
                  | postfixExpr
                  | postfixExpr WhiteSpace* ascription
                  | postfixExpr WhiteSpace* 'match' WhiteSpace* '{' WhiteSpace* caseClauses WhiteSpace* '}' ;

postfixExpr       : infixExpr (WhiteSpace* id WhiteSpace* Nl?)? ;

infixExpr         : prefixExpr
                  | infixExpr WhiteSpace* id WhiteSpace* Nl? WhiteSpace* infixExpr ;

prefixExpr        : ('-' | '+' | '~' | '!')? WhiteSpace*
                    ('new' WhiteSpace+ (classTemplate | templateBody)| blockExpr | simpleExpr1 '_'?) ;

simpleExpr1       :	literal WhiteSpace* simpleExpr2
                  |	literal
                  |	path WhiteSpace* simpleExpr2
                  |	path
                  |	'_' WhiteSpace* simpleExpr2
                  |	'_'
                  |	'(' WhiteSpace* ')' WhiteSpace* simpleExpr2
                  |	'(' WhiteSpace* ')'
                  |	'(' WhiteSpace* exprs WhiteSpace* ')' WhiteSpace* simpleExpr2
                  |	'(' WhiteSpace* exprs WhiteSpace* ')'
                  |	'new' (WhiteSpace* classTemplate WhiteSpace* '.' WhiteSpace* id | WhiteSpace* 'new' (WhiteSpace* classTemplate WhiteSpace* '.' WhiteSpace* id WhiteSpace* simpleExpr2 | WhiteSpace* templateBody) WhiteSpace* '.' WhiteSpace* id WhiteSpace* | WhiteSpace* templateBody) WhiteSpace* '.' WhiteSpace* id WhiteSpace* simpleExpr2
                  |	blockExpr WhiteSpace* '.' WhiteSpace* id WhiteSpace* simpleExpr2
                  |	blockExpr WhiteSpace* '.' WhiteSpace* id
                  |	'new' (WhiteSpace* classTemplate WhiteSpace* typeArgs WhiteSpace* |	WhiteSpace* 'new' (WhiteSpace* classTemplate WhiteSpace* typeArgs WhiteSpace* simpleExpr2 WhiteSpace* | WhiteSpace* templateBody) WhiteSpace* typeArgs | WhiteSpace* templateBody) WhiteSpace* typeArgs WhiteSpace* simpleExpr2
                  |	blockExpr WhiteSpace* typeArgs WhiteSpace* simpleExpr2
                  |	blockExpr WhiteSpace* typeArgs ;

simpleExpr2       :  '.' id  WhiteSpace* simpleExpr2
                  |	'.' id
                  |	'_' '.' id  WhiteSpace* simpleExpr2
                  |	'_' '.' id
                  |	typeArgs  WhiteSpace* simpleExpr2
                  |	typeArgs
                  |	'_'  WhiteSpace* typeArgs WhiteSpace*  simpleExpr2
                  |	'_' WhiteSpace*  typeArgs
                  |	argumentExprs  WhiteSpace* simpleExpr2
                  |	argumentExprs ;
                  
exprs             : expr ( WhiteSpace* ',' WhiteSpace* expr)* ;

argumentExprs     : '(' WhiteSpace* exprs? WhiteSpace* ')' WhiteSpace*
                  | '(' WhiteSpace* (exprs WhiteSpace* ',' WhiteSpace*)? postfixExpr WhiteSpace* ':' '_' '*' ')' WhiteSpace*
                  | Nl? WhiteSpace* blockExpr WhiteSpace*;
                  
blockExpr         : '{' WhiteSpace* caseClauses WhiteSpace* '}'
                  | '{' WhiteSpace* block WhiteSpace* '}' ;
block             : blockStat (WhiteSpace* Semi WhiteSpace* blockStat)* WhiteSpace* resultExpr? ;

blockStat         : import_
                  | annotation* WhiteSpace* ('implicit' | 'lazy')? WhiteSpace* def
                  | annotation* WhiteSpace* (localModifier WhiteSpace*)* WhiteSpace* tmplDef
                  | expr1
                  | ;

resultExpr        : expr1
                  | (bindings | ('implicit'? WhiteSpace* id | '_') WhiteSpace* ':' WhiteSpace* compoundType) WhiteSpace* '=>' WhiteSpace* block ;

enumerators       : generator WhiteSpace* (WhiteSpace* Semi WhiteSpace* generator)* ;

generator         : pattern1 WhiteSpace* '<-' WhiteSpace* expr (WhiteSpace* Semi? WhiteSpace* guard | WhiteSpace* Semi WhiteSpace* pattern1 WhiteSpace* '=' WhiteSpace* expr)* ;

caseClauses       : caseClause+ ;

caseClause        : 'case' WhiteSpace* pattern WhiteSpace* guard? WhiteSpace* '=>' WhiteSpace* block ;
  
guard             : 'if' WhiteSpace* postfixExpr ;

pattern           : pattern1 (WhiteSpace* '|' WhiteSpace* pattern1 )* ;

pattern1          : Varid WhiteSpace* ':' WhiteSpace* typePat
                  | '_' WhiteSpace* ':' WhiteSpace* typePat
                  | pattern2 ;

pattern2          : Varid WhiteSpace* ('@' pattern3)?
                  | pattern3 ;

pattern3          : simplePattern
                  | simplePattern (WhiteSpace* id WhiteSpace* Nl? WhiteSpace* simplePattern)* ;
                  
simplePattern     : '_'
                  | Varid
                  | literal 
                  | stableId (WhiteSpace* '(' WhiteSpace* patterns WhiteSpace* ')')?
                  | stableId WhiteSpace* '(' WhiteSpace* (patterns WhiteSpace* ',' WhiteSpace*)? (Varid WhiteSpace* '@')? WhiteSpace* '_' WhiteSpace* '*' WhiteSpace* ')'
                  | '(' WhiteSpace* patterns? WhiteSpace* ')' ;

patterns          : pattern (WhiteSpace* ',' WhiteSpace* patterns)*
                  | ('_' WhiteSpace*) * ;

typeParamClause   : '[' WhiteSpace* variantTypeParam (WhiteSpace* ',' WhiteSpace* variantTypeParam)* WhiteSpace* ']' ;

funTypeParamClause: '[' WhiteSpace* typeParam (WhiteSpace* ',' WhiteSpace* typeParam)* WhiteSpace* ']' ;

variantTypeParam  : annotation? WhiteSpace* ('+' | '-')? WhiteSpace* typeParam ;

typeParam         : (id | '_') WhiteSpace* typeParamClause? (WhiteSpace* '>:' WhiteSpace* type)? (WhiteSpace* '<:' WhiteSpace* type)?
                    ('<%' WhiteSpace* type)* (WhiteSpace* ':' WhiteSpace* type)* ;
                         
paramClauses      : paramClause* (WhiteSpace* Nl? WhiteSpace* '(' WhiteSpace* 'implicit' WhiteSpace* params WhiteSpace* ')')? ;

paramClause       : Nl? WhiteSpace* '(' WhiteSpace* params? WhiteSpace*')' WhiteSpace* ;

params            : param (WhiteSpace* ',' WhiteSpace* param)* ;

param             : annotation* WhiteSpace* id  (WhiteSpace* ':' WhiteSpace* paramType)? (WhiteSpace* '=' WhiteSpace* expr)? ;

paramType         : type 
                  | '=>' WhiteSpace* type
                  | type WhiteSpace* '*';

classParamClauses : classParamClause* 
                    (WhiteSpace* Nl? WhiteSpace* '(' WhiteSpace* 'implicit' WhiteSpace* classParams WhiteSpace* ')')? ;
                         
classParamClause  : Nl? WhiteSpace* '(' WhiteSpace* classParams? WhiteSpace* ')' WhiteSpace* ;

classParams       : classParam (WhiteSpace* ',' WhiteSpace* classParam)* ;

classParam        : annotation* WhiteSpace* (modifier WhiteSpace*)*  (WhiteSpace* 'val' | WhiteSpace* 'var')? WhiteSpace*
                    id WhiteSpace* ':' WhiteSpace* paramType (WhiteSpace* '=' WhiteSpace* expr)? ;
                    
bindings          : '(' WhiteSpace* binding (WhiteSpace* ',' WhiteSpace* binding )* WhiteSpace* ')' ;

binding           : (id | '_') (WhiteSpace* ':' WhiteSpace* type)? ;

modifier          : localModifier 
                  | accessModifier
                  | 'override' ;
                  
localModifier     : 'abstract'
                  | 'final'
                  | 'sealed'
                  | 'implicit'
                  | 'lazy' ;
                  
accessModifier    : ('private' WhiteSpace* | 'protected' WhiteSpace*)  accessQualifier? ;

accessQualifier   : '[' WhiteSpace* (id | 'this') WhiteSpace* ']' ;

annotation        : '@' simpleType WhiteSpace* argumentExprs* WhiteSpace*;

constrAnnotation  : '@' simpleType WhiteSpace* argumentExprs ;

templateBody      : Nl? WhiteSpace* '{' WhiteSpace* selfType? WhiteSpace* templateStat (WhiteSpace* Semi WhiteSpace* templateStat)* WhiteSpace* '}' ;

templateStat      : import_
                  | (annotation Nl?)* ((modifier WhiteSpace*)+ | WhiteSpace*) def
                  | (annotation Nl?)* ((modifier WhiteSpace*)+ | WhiteSpace*) dcl
                  |  expr
                  | ;
                  
selfType          : id (WhiteSpace* ':' WhiteSpace* type)? WhiteSpace* '=>' WhiteSpace*
                  | 'this' WhiteSpace* ':' WhiteSpace* type WhiteSpace* '=>' ;

import_           : 'import' WhiteSpace+ importExpr (WhiteSpace* ',' WhiteSpace* importExpr)* ;

importExpr        : stableId '.' (id | '_' | importSelectors) ;

importSelectors   : '{' WhiteSpace* (WhiteSpace* importSelector WhiteSpace* ',')* (WhiteSpace* importSelector | WhiteSpace* '_') WhiteSpace* '}' ;

importSelector    : id (WhiteSpace* '=>' WhiteSpace* id | WhiteSpace* '=>' WhiteSpace* '_')? ;
 
dcl               : 'val' WhiteSpace+ valDcl
                  | 'var' WhiteSpace+ varDcl
                  | 'def' WhiteSpace+ funDcl
                  | 'type' WhiteSpace* Nl* WhiteSpace* typeDcl ;

valDcl            : ids WhiteSpace* ':' WhiteSpace* type ;

varDcl            : ids WhiteSpace* ':' WhiteSpace* type ;

funDcl            : funSig (WhiteSpace* ':' WhiteSpace* type)? ;

funSig            : id WhiteSpace* funTypeParamClause? WhiteSpace* paramClauses ;

typeDcl           : id WhiteSpace* typeParamClause? WhiteSpace* ('>:' WhiteSpace* type)? (WhiteSpace* '<:' WhiteSpace* type)? ;

patVarDef         : 'val' WhiteSpace+ patDef
                  | 'var' WhiteSpace+ varDef ;

def               : patVarDef
                  | 'def' WhiteSpace+ funDef
                  | 'type' WhiteSpace* Nl* WhiteSpace* typeDef
                  | tmplDef ;
                  
patDef            : pattern2 (WhiteSpace* ',' WhiteSpace* pattern2)* (WhiteSpace* ':' WhiteSpace* type)* WhiteSpace* '=' WhiteSpace* expr ;

varDef            : patDef
                  | ids WhiteSpace* ':' WhiteSpace* type WhiteSpace* '=' WhiteSpace* '_' ;
                  
funDef            : funSig (WhiteSpace* ':' WhiteSpace* type)? WhiteSpace* '=' WhiteSpace* expr
                  | funSig WhiteSpace* Nl? WhiteSpace* '{' WhiteSpace* block WhiteSpace* '}'
                  | 'this' WhiteSpace* paramClause WhiteSpace* paramClauses
                    ('=' WhiteSpace* constrExpr | WhiteSpace* Nl WhiteSpace* constrBlock) ;

typeDef           :  id WhiteSpace* typeParamClause? WhiteSpace* '=' WhiteSpace* type ;

tmplDef           : 'case'? WhiteSpace* 'class' WhiteSpace+ classDef
                  | 'case'? WhiteSpace* 'object' WhiteSpace+ objectDef
                  | 'trait' WhiteSpace+ traitDef ;

classDef          : id WhiteSpace* typeParamClause? WhiteSpace* (constrAnnotation WhiteSpace*)* WhiteSpace* accessModifier?
                    classParamClauses WhiteSpace* classTemplateOpt ;
                      
traitDef          : id WhiteSpace* typeParamClause? WhiteSpace* traitTemplateOpt ;

objectDef         : id WhiteSpace* classTemplateOpt ;

classTemplateOpt  : 'extends' WhiteSpace+ classTemplate | ('extends'? WhiteSpace* templateBody)? ;

traitTemplateOpt  : ('extends' WhiteSpace+ traitTemplate)
                  | ('extends'? WhiteSpace* templateBody)? ;

classTemplate     : earlyDefs? WhiteSpace* classParents WhiteSpace* templateBody? ;

traitTemplate     : earlyDefs? WhiteSpace* traitParents WhiteSpace* templateBody? ;

classParents      : constr (WhiteSpace+ 'with' WhiteSpace+ annotType)* ;

traitParents      : annotType (WhiteSpace+ 'with' WhiteSpace+ annotType)* ;

constr            : annotType WhiteSpace* argumentExprs* ;

earlyDefs         : '{' WhiteSpace* (earlyDef (WhiteSpace* Semi WhiteSpace* earlyDef)*)? WhiteSpace* '}' WhiteSpace* 'with' ;

earlyDef          : (annotation WhiteSpace* Nl?)* WhiteSpace* (modifier WhiteSpace*)* WhiteSpace* patVarDef ;

constrExpr        : selfInvocation 
                  | constrBlock ;
                  
constrBlock       : '{' WhiteSpace* selfInvocation (WhiteSpace* Semi WhiteSpace* blockStat)* WhiteSpace* '}' ;
selfInvocation    : 'this' WhiteSpace* argumentExprs+ ;

topStatSeq        : topStat (WhiteSpace* Semi WhiteSpace* topStat)* ;

topStat           : (annotation WhiteSpace* Nl?)* WhiteSpace* (modifier WhiteSpace*)* WhiteSpace* tmplDef
                  | import_
                  | packaging
                  | packageObject
                  | ;
                    
packaging         : 'package' WhiteSpace+ qualId WhiteSpace* Nl? WhiteSpace* '{' WhiteSpace* topStatSeq WhiteSpace* '}' ;

packageObject     : 'package' WhiteSpace+ 'object' WhiteSpace+ objectDef ;

compilationUnit   : ('package' WhiteSpace+ qualId WhiteSpace* Semi)* WhiteSpace* topStatSeq ;

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

LEFT_BRACE		:  '{';
RIGHT_BRACE		:  '}';
LEFT_BRACKET	:  '[';
RIGHT_BRACKET	:  ']';
LEFT_PAREN		:  '(';
RIGHT_PAREN		:  ')';
DOT				:  '.';
COMMA			:  ',';
Q_MARK			:  '\'';
Q_MARK_2		:  '"';
COLON			:  ':';
UNDERSCORE		:  '_';
EQ				:  '=';
TO				:  '=>';
LARROW			:  '<-';
LL			    :  '<:';
RR			    :  '>:';
SHARP			:  '#';
AT		  	    :  '@';
LLL				:  '<%';
SLASH			:  '\\';
ABSTRACT		:  'abstract';
CASE			:  'case';
CATCH			:  'catch';
CLASS			:  'class';
DEF				:  'def';
DO				:  'do';
ELSE			:  'else';
EXTENDS			:  'extends';
FINAL			:  'final';
FINALLY			:  'finally';
FOR				:  'for';
FORSOME			:  'forSome';
IF				:  'if';
IMPLICIT		:  'implicit';
IMPORT			:  'import';
LAZY			:  'lazy';
MACRO			:  'macro';
MATCH			:  'match';
NEW				:  'new';
NULL			:  'null';
OBJECT			:  'object';
OVERRIDE		:  'override';
PACKAGE			:  'package';
PRIVATE			:  'private';
PROTECTED		:  'protected';
RETURN			:  'return';
SEALED			:  'sealed';
SUPER			:  'super';
THIS			:  'this';
THROW			:  'throw';
TRAIT			:  'trait';
TRY				:  'try';
TYPE			:  'type';
VAL				:  'val';
VAR				:  'var';
WHILE			:  'while';
WITH			:  'with';
YIELD			:  'yield';

OP_1		    :  '+';
OP_2			:  '-';
OP_3			:  '*';
EPT				:  '!';
TLD				:  '~';


BooleanLiteral   :  'true' | 'false';
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
Id               :  Plainid
                 |  '\'' StringLiteral '\'';
Varid            :  Lower Idrest;
Semi             :  ';' |  Nl+;


LINE_COMMENT : '//' [^\n\r]*        -> channel(HIDDEN) ;
COMMENT      : '/*' .*? '*/'    	-> channel(HIDDEN) ;

WhiteSpace       :  [ \t]+ ;



// fragments
fragment Nl               :  '\r'? '\n';
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

