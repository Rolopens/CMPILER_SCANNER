parser grammar SHJavaParser;

options { tokenVocab=SHJava; }

compilationUnit
    :  typeDeclaration* EOF
    ;

typeDeclaration
    : classOrInterfaceModifier* (classDeclaration | enumDeclaration | interfaceDeclaration)
    | ';'
    ;


modifier
    : classOrInterfaceModifier
    ;

classOrInterfaceModifier
    : PUBLIC
    | PROTECTED
    | PRIVATE
    | STATIC
    | ABSTRACT
    | FINAL
    ;

variableModifier
    : FINAL
    ;
classDeclaration
    : CLASS IDENTIFIER typeParameters? (EXTENDS typeType)? (IMPLEMENTS typeList)?     classBody
    ;

typeParameters
    : '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    : IDENTIFIER (EXTENDS typeBound)?
    ;

typeBound
    : typeType ('&' typeType)*
    ;

enumDeclaration
    : ENUM IDENTIFIER (IMPLEMENTS typeList)? '{' enumConstants? ','? enumBodyDeclarations? '}'
    ;

enumConstants
    : enumConstant (',' enumConstant)*
    ;

enumConstant
    : IDENTIFIER arguments? classBody?
    ;

enumBodyDeclarations
    : ';' classBodyDeclaration*
    ;

interfaceDeclaration
    : INTERFACE IDENTIFIER typeParameters? (EXTENDS typeList)? interfaceBody
    ;

classBody
    : '{' classBodyDeclaration* '}'
    ;

interfaceBody
    : '{' interfaceBodyDeclaration* '}'
    ;

classBodyDeclaration
    : ';'
    | STATIC? block
    | modifier* memberDeclaration
    ;

memberDeclaration
    : methodDeclaration
    | genericMethodDeclaration
    | fieldDeclaration
    | constructorDeclaration
    | genericConstructorDeclaration
    | interfaceDeclaration
    | classDeclaration
    | enumDeclaration
    ;

methodDeclaration
    : typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')* methodBody
    ;

methodBody
    : block
    | ';'
    ;

typeTypeOrVoid
    : typeType
    | VOID
    ;

genericMethodDeclaration
    : typeParameters methodDeclaration
    ;

genericConstructorDeclaration
    : typeParameters constructorDeclaration
    ;

constructorDeclaration
    : IDENTIFIER formalParameters block
    ;

fieldDeclaration
    : typeType variableDeclarators ';'
    ;
interfaceBodyDeclaration
    : modifier* interfaceMemberDeclaration
    | ';'
    ;

interfaceMemberDeclaration
    : constDeclaration
    | interfaceMethodDeclaration
    | genericInterfaceMethodDeclaration
    | interfaceDeclaration
    | classDeclaration
    | enumDeclaration
    ;

constDeclaration
    : typeType constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    : IDENTIFIER ('[' ']')* '=' variableInitializer
    ;

interfaceMethodDeclaration
    : interfaceMethodModifier* (typeTypeOrVoid | typeParameters typeTypeOrVoid)
      IDENTIFIER formalParameters ('[' ']')* methodBody
    ;

interfaceMethodModifier
    : PUBLIC
    | ABSTRACT
    | DEFAULT
    | STATIC
    ;

genericInterfaceMethodDeclaration
    : typeParameters interfaceMethodDeclaration
    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER ('[' ']')*
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* )? '}'
    ;

classOrInterfaceType
    : IDENTIFIER typeArguments? ('.' IDENTIFIER typeArguments?)*
    ;

typeArgument
    : typeType
    | '?' ((EXTENDS | SUPER) typeType)?
    ;


qualifiedNameList
    : qualifiedName (',' qualifiedName)*
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)*
    ;

formalParameter
    : variableModifier* typeType variableDeclaratorId
    ;

qualifiedName
    : IDENTIFIER ('.' IDENTIFIER)*
    ;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    ;


block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | variableAssignment';'
    | statement
    | localTypeDeclaration
    ;

variableAssignment
    : IDENTIFIER '=' IDENTIFIER
    | IDENTIFIER '=' DECIMAL_LITERAL
    | IDENTIFIER '=' CHAR_LITERAL
    | IDENTIFIER '=' STRING_LITERAL
    | IDENTIFIER '=' FLOAT_LITERAL
    | IDENTIFIER '=' expression
    ;

localVariableDeclaration
    : variableModifier* typeType variableDeclarators
    ;

localTypeDeclaration
    : classOrInterfaceModifier*
      (classDeclaration | interfaceDeclaration)
    | ';'
    ;

statement
    : blockLabel=block
    | ASSERT expression (':' expression)? ';'
    | IF parExpression statement (ELSE statement)?
    | FOR '(' forControl ')' statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression ';'
    | SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    | RETURN expression? ';'
    | BREAK IDENTIFIER? ';'
    | SEMI
    | statementExpression=expression ';'
    | identifierLabel=IDENTIFIER ':' statement
    | printStatement
    | scanStatement
    ;

switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) ':'
    | DEFAULT ':'
    ;

forControl
    : enhancedForControl
    | forInit? ';' expression? ';' forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

enhancedForControl
    : variableModifier* typeType variableDeclaratorId ':' expression
    ;

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

methodCall
    : IDENTIFIER '(' expressionList? ')'
    | THIS '(' expressionList? ')'
    | SUPER '(' expressionList? ')'
    ;

expression
    : primary
    | expression bop='.'
      ( IDENTIFIER
      | methodCall
      | THIS
      | NEW nonWildcardTypeArguments? innerCreator
      | SUPER superSuffix
      )
    | expression '[' expression ']'
    | methodCall
    | NEW creator
    | '(' typeType ')' expression
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('~'|'!') expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=INSTANCEOF typeType
    | expression bop=('==' | '!=') expression
    | expression bop='&' expression
    | expression bop='^' expression
    | expression bop='|' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    ;

primary
    : '(' expression ')'
    | THIS
    | SUPER
    | literal
    | IDENTIFIER
    | typeTypeOrVoid '.' CLASS
    | nonWildcardTypeArguments (THIS arguments)
    ;

classType
    : (classOrInterfaceType '.')? IDENTIFIER typeArguments?
    ;

creator
    : nonWildcardTypeArguments createdName classCreatorRest
    | createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    : IDENTIFIER typeArgumentsOrDiamond? ('.' IDENTIFIER typeArgumentsOrDiamond?)*
    | primitiveType
    ;

innerCreator
    : IDENTIFIER nonWildcardTypeArgumentsOrDiamond? classCreatorRest
    ;

arrayCreatorRest
    : '[' (']' ('[' ']')* arrayInitializer | expression ']' ('[' expression ']')* ('[' ']')*)
    ;

classCreatorRest
    : arguments classBody?
    ;


typeArgumentsOrDiamond
    : '<' '>'
    | typeArguments
    ;

nonWildcardTypeArgumentsOrDiamond
    : '<' '>'
    | nonWildcardTypeArguments
    ;

nonWildcardTypeArguments
    : '<' typeList '>'
    ;

typeList
    : typeType (',' typeType)*
    ;

typeType
    : (classOrInterfaceType | primitiveType) ('[' ']')*
    ;

primitiveType
    : BOOLEAN
    | CHAR
    | INT
    | FLOAT
    | STRING
    ;

typeArguments
    : '<' typeArgument (',' typeArgument)* '>'
    ;

superSuffix
    : arguments
    | '.' IDENTIFIER arguments?
    ;

arguments
    : '(' expressionList? ')'
    ;

scanStatement
    : SCAN '(' ')'
    ;

//printStatement
//    : PRINT '(' DECIMAL_LITERAL | CHAR_LITERAL | FLOAT_LITERAL | STRING_LITERAL | expression (('+') (DECIMAL_LITERAL | CHAR_LITERAL | FLOAT_LITERAL | STRING_LITERAL | expression))* ')'
//    ;

printStatement
    : PRINT '(' DECIMAL_LITERAL ')'
    | PRINT '(' CHAR_LITERAL ')'
    | PRINT '(' FLOAT_LITERAL ')'
    | PRINT '(' STRING_LITERAL ')'
    | PRINT '(' expression ')'
    | PRINT '(' expression (('+') (DECIMAL_LITERAL))* (('+') (CHAR_LITERAL))*(('+') (FLOAT_LITERAL))*(('+') (STRING_LITERAL))* (('+') (expression))* ')'
    | PRINT '(' DECIMAL_LITERAL (('+') (DECIMAL_LITERAL))* (('+') (CHAR_LITERAL))*(('+') (FLOAT_LITERAL))*(('+') (STRING_LITERAL))* (('+') (expression))* ')'
    | PRINT '(' CHAR_LITERAL (('+') (DECIMAL_LITERAL))* (('+') (CHAR_LITERAL))*(('+') (FLOAT_LITERAL))*(('+') (STRING_LITERAL))* (('+') (expression))* ')'
    | PRINT '(' FLOAT_LITERAL (('+') (DECIMAL_LITERAL))* (('+') (CHAR_LITERAL))*(('+') (FLOAT_LITERAL))*(('+') (STRING_LITERAL))* (('+') (expression))* ')'
    | PRINT '(' STRING_LITERAL (('+') (DECIMAL_LITERAL))* (('+') (CHAR_LITERAL))*(('+') (FLOAT_LITERAL))*(('+') (STRING_LITERAL))* (('+') (expression))* ')'
    ;
