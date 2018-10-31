grammar MiniJava;

program
  : mainClass ( classDeclaration )*
  ;

classDeclaration
  : CLASS className=IDENT ( EXTENDS superClassName=IDENT )? 
    CURLYOPEN 
        ( varDeclaration )* 
        ( methodDeclaration )*
    CURLYCLOSE
  ;

mainClass
  : CLASS className=IDENT 
    CURLYOPEN 
      method=methodDeclaration 
    CURLYCLOSE
  ;
  
block  : CURLYOPEN ( varDeclaration )* ( statement )* CURLYCLOSE;

varDeclaration
  : var=variable  SEMICOLON
  ;

variable : type variableName=IDENT
  ;

type 
   : typeBasic
   | typeArray
   ;

typeBasic
  : typeBoolean
  | typeInt
  | typeClass
  ;

typeArray  
    : typeBasic SQUAREOPEN SQUARECLOSE 
    ;

typeBoolean : TYPEBOOLEAN ;
typeInt     : TYPEINT ;
typeClass   : className=IDENT;
                
methodDeclaration
  : ( isPublic=PUBLIC  )?
    ( isStatic=STATIC  )? 
    procType methodName=IDENT 
    ROUNDOPEN 
      ( variable ( COMMA variable )* )? 
    ROUNDCLOSE 
    CURLYOPEN 
        ( varDeclaration )* 
        ( statement )*
        statementReturn
    CURLYCLOSE
  ;
  
procType
  : typeVoid  
  | type 
  ;

typeVoid: TYPEVOID ;
  
statement
  : block
  | statementIf
  | statementWhile
  | statementAssign
  | statementAssignArray
  | statementPrintln
  | statementPrint
  | statementMethod
  | statementReturn
  ;
    
statementIf          : IF ROUNDOPEN condition=expression ROUNDCLOSE ifBlock=block (ELSE elseBlock=block )? ;
statementWhile       : WHILE ROUNDOPEN condition=expression ROUNDCLOSE whileBlock=statement ;
statementAssign      : lhs=identifier EQUAL rhs=expression SEMICOLON ;
statementAssignArray : array=identifier SQUAREOPEN element=expression SQUARECLOSE EQUAL value=expression SEMICOLON;
statementPrint       : PRINT ROUNDOPEN argument=expression ROUNDCLOSE SEMICOLON ;
statementPrintln     : PRINTLN ROUNDOPEN argument=expression ROUNDCLOSE SEMICOLON ;
statementMethod      : expressionMethodCall SEMICOLON;

statementReturn  : RETURN ( argument=expression )? SEMICOLON ;

expression
  : head=level1 ( AND tail+=level1 )*
  ;

level1
  : head=level2 ( EQUALS tail+=level2 )*
  ;
  
level2
  : head=level3 ( LESSTHAN tail+=level3 )*
  ;
    
level3
  : head=level4 ( operator+=(PLUS | MINUS) tail+=level4 )*
  ;

level4
  : head=level5 ( TIMES tail+=level5 )*
  ;
  
level5
    : expressionUnaryMinus
    | expressionNegation
    | expressionNewObject
    | expressionNewArray
    | expressionIdentifier
    | expressionArrayAccess
    | expressionMethodCall
    | expressionParentheses
    | expressionConstantTrue
    | expressionConstantFalse
    | expressionConstantInteger
    | expressionConstantString
    ; 
  
expressionUnaryMinus      : MINUS argument=level5 ;
expressionNegation        : EXCLAMATION argument=level5 ;
expressionNewObject       : NEW classname=IDENT ROUNDOPEN ROUNDCLOSE ;
expressionNewArray        : NEW TYPEINT SQUAREOPEN size=expression SQUARECLOSE ;        
expressionIdentifier      : ident=identifier ;
expressionArrayAccess     : ident=identifier SQUAREOPEN element=expression SQUARECLOSE ;
expressionParentheses     : ROUNDOPEN argument=expression ROUNDCLOSE ;
expressionConstantTrue    : TRUE ;
expressionConstantFalse   : FALSE ;
expressionConstantInteger : value=INT ;
expressionConstantString  : value=STRING ;
expressionMethodCall      : (object=identifier DOT)? method=IDENT ROUNDOPEN (arguments+=expression (COMMA arguments+=expression)* )? ROUNDCLOSE ;

identifier
  : identifierId ( DOT selectors+=IDENT )*
  ;

identifierId
  : idThis
  | idIDENT
  ;

idThis  : THIS ;
idIDENT : name=IDENT ;

MINUS : '-' ;
AND : '&&' ;
EQUALS : '==' ;
LESSTHAN : '<' ;
PLUS : '+' ;
TIMES : '*' ;
EXCLAMATION : '!' ;
SEMICOLON : ';' ;
COMMA : ',' ;
EQUAL : '=' ;
DOT : '.' ;

ROUNDOPEN : '(' ;
ROUNDCLOSE : ')' ;
SQUAREOPEN : '[' ;
SQUARECLOSE : ']' ;
CURLYOPEN : '{' ;
CURLYCLOSE : '}' ;

TRUE : 'true' ;
FALSE : 'false' ;
CLASS : 'class' ;
EXTENDS : 'extends' ;
TYPEBOOLEAN : 'boolean' ;
TYPEVOID : 'void'  ;
TYPEINT : 'int' ;
PUBLIC : 'public' ;
STATIC : 'static' ;
THIS : 'this' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
PRINT : 'System.out.print' ;
PRINTLN : 'System.out.println' ;
RETURN : 'return' ;
NEW : 'new' ;

fragment LOWER : ('a'..'z');
fragment UPPER : ('A'..'Z');
fragment NONNULL : ('1'..'9');
fragment NUMBER : ('0' | NONNULL);
IDENT : ( LOWER | UPPER ) ( LOWER | UPPER | NUMBER | '_' )*;
INT : '0' | ( NONNULL NUMBER* );
fragment CHAR : ' ' | '!' | ('\u0023'..'\u005B') | ('\u005D'..'\u007E') | '\\"' | '\\\\' | '\\t' | '\\n';
STRING : '"' CHAR*? '"' ;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;
WHITESPACE  :   [ \t\n\r]+ -> skip;
