grammar Grammar;

expr             : 'a' '=>' 'b';

id               : Id | TO;

// Lexer

TO               :  '=>' ;

Id               :  Plainid;

// fragments

fragment Plainid          :  Op ;

fragment Op               :  Opchar+;
fragment Opchar           :  ~[a-zA-Z0-9()[\]{}.;, \r\t\n'"$_] ;


