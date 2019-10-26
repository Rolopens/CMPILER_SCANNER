// Generated from C:/Users/Rolo/Documents/GitHub/CMPILER_SCANNER/grammar\SHJavaParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SHJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, CASE=5, CHAR=6, CLASS=7, CONST=8, 
		DEFAULT=9, DO=10, ELSE=11, ENUM=12, EXTENDS=13, FINAL=14, FLOAT=15, FOR=16, 
		IF=17, IMPLEMENTS=18, INSTANCEOF=19, INT=20, INTERFACE=21, NEW=22, NULL=23, 
		PRIVATE=24, PRINT=25, PROTECTED=26, PUBLIC=27, RETURN=28, SCAN=29, STATIC=30, 
		STRING=31, SUPER=32, SWITCH=33, THIS=34, VOID=35, WHILE=36, DECIMAL_LITERAL=37, 
		FLOAT_LITERAL=38, BOOL_LITERAL=39, CHAR_LITERAL=40, STRING_LITERAL=41, 
		NULL_LITERAL=42, PRINTABLE_LITERALS=43, SEPARATOR=44, LPAREN=45, RPAREN=46, 
		LBRACE=47, RBRACE=48, LBRACK=49, RBRACK=50, SEMI=51, COMMA=52, DOT=53, 
		OPERATORS=54, ASSIGN=55, GT=56, LT=57, BANG=58, TILDE=59, QUESTION=60, 
		COLON=61, EQUAL=62, LE=63, GE=64, NOTEQUAL=65, AND=66, OR=67, INC=68, 
		DEC=69, ADD=70, SUB=71, MUL=72, DIV=73, MOD=74, ADD_ASSIGN=75, SUB_ASSIGN=76, 
		MUL_ASSIGN=77, DIV_ASSIGN=78, TOKEN=79, AT=80, AMP=81, CARET=82, VBAR=83, 
		WS=84, COMMENT=85, LINE_COMMENT=86, IDENTIFIER=87, INVALIDCHAR_LITERAL=88, 
		INVALIDIDENTIFIER=89, UnknownToken=90;
	public static final int
		RULE_compilationUnit = 0, RULE_typeDeclaration = 1, RULE_modifier = 2, 
		RULE_classOrInterfaceModifier = 3, RULE_variableModifier = 4, RULE_classDeclaration = 5, 
		RULE_typeParameters = 6, RULE_typeParameter = 7, RULE_typeBound = 8, RULE_enumDeclaration = 9, 
		RULE_enumConstants = 10, RULE_enumConstant = 11, RULE_enumBodyDeclarations = 12, 
		RULE_interfaceDeclaration = 13, RULE_classBody = 14, RULE_interfaceBody = 15, 
		RULE_classBodyDeclaration = 16, RULE_memberDeclaration = 17, RULE_methodDeclaration = 18, 
		RULE_methodBody = 19, RULE_typeTypeOrVoid = 20, RULE_genericMethodDeclaration = 21, 
		RULE_genericConstructorDeclaration = 22, RULE_constructorDeclaration = 23, 
		RULE_fieldDeclaration = 24, RULE_interfaceBodyDeclaration = 25, RULE_interfaceMemberDeclaration = 26, 
		RULE_constDeclaration = 27, RULE_constantDeclarator = 28, RULE_interfaceMethodDeclaration = 29, 
		RULE_interfaceMethodModifier = 30, RULE_genericInterfaceMethodDeclaration = 31, 
		RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, 
		RULE_variableInitializer = 35, RULE_arrayInitializer = 36, RULE_classOrInterfaceType = 37, 
		RULE_typeArgument = 38, RULE_qualifiedNameList = 39, RULE_formalParameters = 40, 
		RULE_formalParameterList = 41, RULE_formalParameter = 42, RULE_qualifiedName = 43, 
		RULE_literal = 44, RULE_integerLiteral = 45, RULE_floatLiteral = 46, RULE_block = 47, 
		RULE_blockStatement = 48, RULE_localVariableDeclaration = 49, RULE_localTypeDeclaration = 50, 
		RULE_statement = 51, RULE_switchBlockStatementGroup = 52, RULE_switchLabel = 53, 
		RULE_forControl = 54, RULE_forInit = 55, RULE_enhancedForControl = 56, 
		RULE_parExpression = 57, RULE_expressionList = 58, RULE_methodCall = 59, 
		RULE_expression = 60, RULE_primary = 61, RULE_classType = 62, RULE_creator = 63, 
		RULE_createdName = 64, RULE_innerCreator = 65, RULE_arrayCreatorRest = 66, 
		RULE_classCreatorRest = 67, RULE_typeArgumentsOrDiamond = 68, RULE_nonWildcardTypeArgumentsOrDiamond = 69, 
		RULE_nonWildcardTypeArguments = 70, RULE_typeList = 71, RULE_typeType = 72, 
		RULE_primitiveType = 73, RULE_typeArguments = 74, RULE_superSuffix = 75, 
		RULE_arguments = 76, RULE_scanStatement = 77, RULE_printStatement = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "typeDeclaration", "modifier", "classOrInterfaceModifier", 
			"variableModifier", "classDeclaration", "typeParameters", "typeParameter", 
			"typeBound", "enumDeclaration", "enumConstants", "enumConstant", "enumBodyDeclarations", 
			"interfaceDeclaration", "classBody", "interfaceBody", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodBody", "typeTypeOrVoid", 
			"genericMethodDeclaration", "genericConstructorDeclaration", "constructorDeclaration", 
			"fieldDeclaration", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
			"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "genericInterfaceMethodDeclaration", "variableDeclarators", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "classOrInterfaceType", "typeArgument", "qualifiedNameList", 
			"formalParameters", "formalParameterList", "formalParameter", "qualifiedName", 
			"literal", "integerLiteral", "floatLiteral", "block", "blockStatement", 
			"localVariableDeclaration", "localTypeDeclaration", "statement", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "expression", "primary", "classType", 
			"creator", "createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"arguments", "scanStatement", "printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abs'", "'ass'", "'boo'", "'brk'", "'cas'", "'cha'", "'cla'", 
			"'con'", "'def'", "'ddo'", "'els'", "'enu'", "'ext'", "'fin'", "'flo'", 
			"'dur'", "'iif'", "'imp'", "'iof'", "'dec'", "'ifa'", "'cre'", "'nul'", 
			"'pri'", "'out'", "'pro'", "'pub'", "'ret'", "'inp'", "'sta'", "'str'", 
			"'sup'", "'swi'", "'thi'", "'voi'", "'whi'", null, null, null, null, 
			null, "'null'", null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", null, "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", null, 
			"'@'", "'&'", "'^'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "CASE", "CHAR", "CLASS", 
			"CONST", "DEFAULT", "DO", "ELSE", "ENUM", "EXTENDS", "FINAL", "FLOAT", 
			"FOR", "IF", "IMPLEMENTS", "INSTANCEOF", "INT", "INTERFACE", "NEW", "NULL", 
			"PRIVATE", "PRINT", "PROTECTED", "PUBLIC", "RETURN", "SCAN", "STATIC", 
			"STRING", "SUPER", "SWITCH", "THIS", "VOID", "WHILE", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
			"PRINTABLE_LITERALS", "SEPARATOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "OPERATORS", "ASSIGN", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "TOKEN", "AT", "AMP", "CARET", 
			"VBAR", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", "INVALIDCHAR_LITERAL", 
			"INVALIDIDENTIFIER", "UnknownToken"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SHJavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SHJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SHJavaParser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SEMI))) != 0)) {
				{
				{
				setState(158);
				typeDeclaration();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(SHJavaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDeclaration);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
					{
					{
					setState(166);
					classOrInterfaceModifier();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(172);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(173);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(174);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			classOrInterfaceModifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(SHJavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(SHJavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(SHJavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(SHJavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(SHJavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(SHJavaParser.FINAL, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classOrInterfaceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(SHJavaParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SHJavaParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(SHJavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(SHJavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(CLASS);
			setState(187);
			match(IDENTIFIER);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(188);
				typeParameters();
				}
			}

			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(191);
				match(EXTENDS);
				setState(192);
				typeType();
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(195);
				match(IMPLEMENTS);
				setState(196);
				typeList();
				}
			}

			setState(199);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SHJavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(SHJavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SHJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHJavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LT);
			setState(202);
			typeParameter();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(203);
				match(COMMA);
				setState(204);
				typeParameter();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public TerminalNode EXTENDS() { return getToken(SHJavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(IDENTIFIER);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(213);
				match(EXTENDS);
				setState(214);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(SHJavaParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(SHJavaParser.AMP, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			typeType();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(218);
				match(AMP);
				setState(219);
				typeType();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(SHJavaParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(SHJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SHJavaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(SHJavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SHJavaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ENUM);
			setState(226);
			match(IDENTIFIER);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(227);
				match(IMPLEMENTS);
				setState(228);
				typeList();
				}
			}

			setState(231);
			match(LBRACE);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(232);
				enumConstants();
				}
			}

			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(235);
				match(COMMA);
				}
			}

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(238);
				enumBodyDeclarations();
				}
			}

			setState(241);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SHJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHJavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			enumConstant();
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					match(COMMA);
					setState(245);
					enumConstant();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IDENTIFIER);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(252);
				arguments();
				}
			}

			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(255);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SHJavaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(SEMI);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << VOID) | (1L << LBRACE) | (1L << SEMI) | (1L << LT))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(259);
				classBodyDeclaration();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(SHJavaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(SHJavaParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(INTERFACE);
			setState(266);
			match(IDENTIFIER);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(267);
				typeParameters();
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(270);
				match(EXTENDS);
				setState(271);
				typeList();
				}
			}

			setState(274);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SHJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SHJavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(LBRACE);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << VOID) | (1L << LBRACE) | (1L << SEMI) | (1L << LT))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(277);
				classBodyDeclaration();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SHJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SHJavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LBRACE);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << VOID) | (1L << SEMI) | (1L << LT))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(286);
				interfaceBodyDeclaration();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SHJavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(SHJavaParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(295);
					match(STATIC);
					}
				}

				setState(298);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
					{
					{
					setState(299);
					modifier();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_memberDeclaration);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(313);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(314);
				classDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(315);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SHJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SHJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SHJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SHJavaParser.RBRACK, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			typeTypeOrVoid();
			setState(319);
			match(IDENTIFIER);
			setState(320);
			formalParameters();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(321);
				match(LBRACK);
				setState(322);
				match(RBRACK);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SHJavaParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodBody);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SHJavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeTypeOrVoid);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			typeParameters();
			setState(339);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			typeParameters();
			setState(342);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(IDENTIFIER);
			setState(345);
			formalParameters();
			setState(346);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SHJavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			typeType();
			setState(349);
			variableDeclarators();
			setState(350);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(SHJavaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case VOID:
			case LT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(352);
						modifier();
						}
						} 
					}
					setState(357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(358);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceMemberDeclaration);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(SHJavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SHJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHJavaParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			typeType();
			setState(371);
			constantDeclarator();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372);
				match(COMMA);
				setState(373);
				constantDeclarator();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SHJavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SHJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SHJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SHJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SHJavaParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(IDENTIFIER);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(382);
				match(LBRACK);
				setState(383);
				match(RBRACK);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(ASSIGN);
			setState(390);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SHJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SHJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SHJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SHJavaParser.RBRACK, i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				{
				setState(392);
				interfaceMethodModifier();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case VOID:
			case IDENTIFIER:
				{
				setState(398);
				typeTypeOrVoid();
				}
				break;
			case LT:
				{
				setState(399);
				typeParameters();
				setState(400);
				typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(404);
			match(IDENTIFIER);
			setState(405);
			formalParameters();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(406);
				match(LBRACK);
				setState(407);
				match(RBRACK);
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(SHJavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(SHJavaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(SHJavaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(SHJavaParser.STATIC, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			typeParameters();
			setState(418);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SHJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHJavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			variableDeclarator();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(421);
				match(COMMA);
				setState(422);
				variableDeclarator();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SHJavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			variableDeclaratorId();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(429);
				match(ASSIGN);
				setState(430);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(SHJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SHJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SHJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SHJavaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(IDENTIFIER);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(434);
				match(LBRACK);
				setState(435);
				match(RBRACK);
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableInitializer);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SHJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SHJavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SHJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHJavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(LBRACE);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(446);
				variableInitializer();
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(447);
					match(COMMA);
					setState(448);
					variableInitializer();
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(456);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SHJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SHJavaParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SHJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SHJavaParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(IDENTIFIER);
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(459);
				typeArguments();
				}
				break;
			}
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					match(DOT);
					setState(463);
					match(IDENTIFIER);
					setState(465);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(464);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(SHJavaParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(SHJavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(SHJavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeArgument);
		int _la;
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(QUESTION);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(474);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(475);
					typeType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SHJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHJavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			qualifiedName();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(481);
				match(COMMA);
				setState(482);
				qualifiedName();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SHJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SHJavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(LPAREN);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FINAL) | (1L << FLOAT) | (1L << INT))) != 0) || _la==IDENTIFIER) {
				{
				setState(489);
				formalParameterList();
				}
			}

			setState(492);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SHJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHJavaParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			formalParameter();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(495);
				match(COMMA);
				setState(496);
				formalParameter();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(502);
				variableModifier();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			typeType();
			setState(509);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SHJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SHJavaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SHJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SHJavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(IDENTIFIER);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(512);
				match(DOT);
				setState(513);
				match(IDENTIFIER);
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(SHJavaParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SHJavaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(SHJavaParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(SHJavaParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literal);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(522);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(523);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(524);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(SHJavaParser.DECIMAL_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SHJavaParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(FLOAT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SHJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SHJavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(LBRACE);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << DO) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << NEW) | (1L << PRIVATE) | (1L << PRINT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SCAN) | (1L << STATIC) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				{
				setState(532);
				blockStatement();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SHJavaParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_blockStatement);
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				localVariableDeclaration();
				setState(541);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				localTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(547);
				variableModifier();
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553);
			typeType();
			setState(554);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(SHJavaParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitLocalTypeDeclaration(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
					{
					{
					setState(556);
					classOrInterfaceModifier();
					}
					}
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(564);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(562);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(563);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(SHJavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(SHJavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(SHJavaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(SHJavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SHJavaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(SHJavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(SHJavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SHJavaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(SHJavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(SHJavaParser.DO, 0); }
		public TerminalNode SWITCH() { return getToken(SHJavaParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(SHJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SHJavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(SHJavaParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(SHJavaParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ScanStatementContext scanStatement() {
			return getRuleContext(ScanStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(ASSERT);
				setState(571);
				expression(0);
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(572);
					match(COLON);
					setState(573);
					expression(0);
					}
				}

				setState(576);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(IF);
				setState(579);
				parExpression();
				setState(580);
				statement();
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(581);
					match(ELSE);
					setState(582);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				match(FOR);
				setState(586);
				match(LPAREN);
				setState(587);
				forControl();
				setState(588);
				match(RPAREN);
				setState(589);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(591);
				match(WHILE);
				setState(592);
				parExpression();
				setState(593);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(595);
				match(DO);
				setState(596);
				statement();
				setState(597);
				match(WHILE);
				setState(598);
				parExpression();
				setState(599);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(601);
				match(SWITCH);
				setState(602);
				parExpression();
				setState(603);
				match(LBRACE);
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(604);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(609);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(610);
					switchLabel();
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(616);
				match(RBRACE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(618);
				match(RETURN);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(619);
					expression(0);
					}
				}

				setState(622);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(623);
				match(BREAK);
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(624);
					match(IDENTIFIER);
					}
				}

				setState(627);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(628);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(629);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(630);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(632);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(633);
				match(COLON);
				setState(634);
				statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(635);
				printStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(636);
				scanStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(639);
				switchLabel();
				}
				}
				setState(642); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(645); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(644);
				blockStatement();
				}
				}
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << DO) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << NEW) | (1L << PRIVATE) | (1L << PRINT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SCAN) | (1L << STATIC) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(SHJavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(SHJavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(SHJavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_switchLabel);
		try {
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(CASE);
				setState(652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(650);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(651);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(654);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				match(DEFAULT);
				setState(656);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(SHJavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SHJavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_forControl);
		int _la;
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(660);
					forInit();
					}
				}

				setState(663);
				match(SEMI);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(664);
					expression(0);
					}
				}

				setState(667);
				match(SEMI);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(668);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forInit);
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SHJavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(677);
				variableModifier();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(683);
			typeType();
			setState(684);
			variableDeclaratorId();
			setState(685);
			match(COLON);
			setState(686);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SHJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SHJavaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(LPAREN);
			setState(689);
			expression(0);
			setState(690);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SHJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHJavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			expression(0);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(693);
				match(COMMA);
				setState(694);
				expression(0);
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(SHJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SHJavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(SHJavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(SHJavaParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_methodCall);
		int _la;
		try {
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				match(IDENTIFIER);
				setState(701);
				match(LPAREN);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(702);
					expressionList();
					}
				}

				setState(705);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				match(THIS);
				setState(707);
				match(LPAREN);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(708);
					expressionList();
					}
				}

				setState(711);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				match(SUPER);
				setState(713);
				match(LPAREN);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
					{
					setState(714);
					expressionList();
					}
				}

				setState(717);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(SHJavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SHJavaParser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SHJavaParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SHJavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SHJavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(SHJavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(SHJavaParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(SHJavaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(SHJavaParser.BANG, 0); }
		public TerminalNode MUL() { return getToken(SHJavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SHJavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SHJavaParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(SHJavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(SHJavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(SHJavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(SHJavaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(SHJavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(SHJavaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(SHJavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(SHJavaParser.NOTEQUAL, 0); }
		public TerminalNode AMP() { return getToken(SHJavaParser.AMP, 0); }
		public TerminalNode CARET() { return getToken(SHJavaParser.CARET, 0); }
		public TerminalNode VBAR() { return getToken(SHJavaParser.VBAR, 0); }
		public TerminalNode AND() { return getToken(SHJavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(SHJavaParser.OR, 0); }
		public TerminalNode DOT() { return getToken(SHJavaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public TerminalNode THIS() { return getToken(SHJavaParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(SHJavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SHJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SHJavaParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(SHJavaParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(721);
				primary();
				}
				break;
			case 2:
				{
				setState(722);
				methodCall();
				}
				break;
			case 3:
				{
				setState(723);
				match(NEW);
				setState(724);
				creator();
				}
				break;
			case 4:
				{
				setState(725);
				match(LPAREN);
				setState(726);
				typeType();
				setState(727);
				match(RPAREN);
				setState(728);
				expression(15);
				}
				break;
			case 5:
				{
				setState(730);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(731);
				expression(13);
				}
				break;
			case 6:
				{
				setState(732);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(733);
				expression(12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(800);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(798);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(736);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(737);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (MUL - 72)) | (1L << (DIV - 72)) | (1L << (MOD - 72)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(738);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(739);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(740);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(741);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(742);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(750);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
						case 1:
							{
							setState(743);
							match(LT);
							setState(744);
							match(LT);
							}
							break;
						case 2:
							{
							setState(745);
							match(GT);
							setState(746);
							match(GT);
							setState(747);
							match(GT);
							}
							break;
						case 3:
							{
							setState(748);
							match(GT);
							setState(749);
							match(GT);
							}
							break;
						}
						setState(752);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(753);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(754);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (GT - 56)) | (1L << (LT - 56)) | (1L << (LE - 56)) | (1L << (GE - 56)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(755);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(756);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(757);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(758);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(759);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(760);
						((ExpressionContext)_localctx).bop = match(AMP);
						setState(761);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(762);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(763);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(764);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(765);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(766);
						((ExpressionContext)_localctx).bop = match(VBAR);
						setState(767);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(768);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(769);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(770);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(771);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(772);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(773);
						expression(2);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(774);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(775);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(786);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
						case 1:
							{
							setState(776);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(777);
							methodCall();
							}
							break;
						case 3:
							{
							setState(778);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(779);
							match(NEW);
							setState(781);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(780);
								nonWildcardTypeArguments();
								}
							}

							setState(783);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(784);
							match(SUPER);
							setState(785);
							superSuffix();
							}
							break;
						}
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(788);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(789);
						match(LBRACK);
						setState(790);
						expression(0);
						setState(791);
						match(RBRACK);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(793);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(794);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(795);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(796);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(797);
						typeType();
						}
						break;
					}
					} 
				}
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SHJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SHJavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(SHJavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(SHJavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SHJavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(SHJavaParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_primary);
		try {
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				match(LPAREN);
				setState(804);
				expression(0);
				setState(805);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(809);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(810);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(811);
				typeTypeOrVoid();
				setState(812);
				match(DOT);
				setState(813);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(815);
				nonWildcardTypeArguments();
				{
				setState(816);
				match(THIS);
				setState(817);
				arguments();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SHJavaParser.DOT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(821);
				classOrInterfaceType();
				setState(822);
				match(DOT);
				}
				break;
			}
			setState(826);
			match(IDENTIFIER);
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(827);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_creator);
		try {
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				nonWildcardTypeArguments();
				setState(831);
				createdName();
				setState(832);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				createdName();
				setState(837);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(835);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(836);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SHJavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SHJavaParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SHJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SHJavaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_createdName);
		int _la;
		try {
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				match(IDENTIFIER);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(842);
					typeArgumentsOrDiamond();
					}
				}

				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(845);
					match(DOT);
					setState(846);
					match(IDENTIFIER);
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(847);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(854);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(IDENTIFIER);
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(859);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(862);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(SHJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SHJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SHJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SHJavaParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(LBRACK);
			setState(892);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(865);
				match(RBRACK);
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(866);
					match(LBRACK);
					setState(867);
					match(RBRACK);
					}
					}
					setState(872);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(873);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				{
				setState(874);
				expression(0);
				setState(875);
				match(RBRACK);
				setState(882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(876);
						match(LBRACK);
						setState(877);
						expression(0);
						setState(878);
						match(RBRACK);
						}
						} 
					}
					setState(884);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				setState(889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(885);
						match(LBRACK);
						setState(886);
						match(RBRACK);
						}
						} 
					}
					setState(891);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			arguments();
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(895);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SHJavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(SHJavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typeArgumentsOrDiamond);
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				match(LT);
				setState(899);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SHJavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(SHJavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				match(LT);
				setState(904);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SHJavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(SHJavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(LT);
			setState(909);
			typeList();
			setState(910);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SHJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHJavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			typeType();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(913);
				match(COMMA);
				setState(914);
				typeType();
				}
				}
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SHJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SHJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SHJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SHJavaParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typeType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(920);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
				{
				setState(921);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(928);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(924);
					match(LBRACK);
					setState(925);
					match(RBRACK);
					}
					} 
				}
				setState(930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(SHJavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(SHJavaParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(SHJavaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SHJavaParser.FLOAT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SHJavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(SHJavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SHJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SHJavaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(LT);
			setState(934);
			typeArgument();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(935);
				match(COMMA);
				setState(936);
				typeArgument();
				}
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(942);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SHJavaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SHJavaParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_superSuffix);
		try {
			setState(950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				match(DOT);
				setState(946);
				match(IDENTIFIER);
				setState(948);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(947);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SHJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SHJavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(LPAREN);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LT) | (1L << BANG) | (1L << TILDE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(953);
				expressionList();
				}
			}

			setState(956);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanStatementContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(SHJavaParser.SCAN, 0); }
		public TerminalNode LPAREN() { return getToken(SHJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SHJavaParser.RPAREN, 0); }
		public ScanStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterScanStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitScanStatement(this);
		}
	}

	public final ScanStatementContext scanStatement() throws RecognitionException {
		ScanStatementContext _localctx = new ScanStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_scanStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(SCAN);
			setState(959);
			match(LPAREN);
			setState(960);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SHJavaParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(SHJavaParser.LPAREN, 0); }
		public List<TerminalNode> PRINTABLE_LITERALS() { return getTokens(SHJavaParser.PRINTABLE_LITERALS); }
		public TerminalNode PRINTABLE_LITERALS(int i) {
			return getToken(SHJavaParser.PRINTABLE_LITERALS, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SHJavaParser.RPAREN, 0); }
		public List<TerminalNode> ADD() { return getTokens(SHJavaParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(SHJavaParser.ADD, i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SHJavaParserListener ) ((SHJavaParserListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_printStatement);
		int _la;
		try {
			setState(978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				match(PRINT);
				setState(963);
				match(LPAREN);
				setState(964);
				match(PRINTABLE_LITERALS);
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				expression(0);
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					{
					setState(966);
					match(ADD);
					}
					setState(969);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PRINTABLE_LITERALS:
						{
						setState(967);
						match(PRINTABLE_LITERALS);
						}
						break;
					case BOOLEAN:
					case CHAR:
					case FLOAT:
					case INT:
					case NEW:
					case SUPER:
					case THIS:
					case VOID:
					case DECIMAL_LITERAL:
					case FLOAT_LITERAL:
					case BOOL_LITERAL:
					case CHAR_LITERAL:
					case STRING_LITERAL:
					case NULL_LITERAL:
					case LPAREN:
					case LT:
					case BANG:
					case TILDE:
					case INC:
					case DEC:
					case ADD:
					case SUB:
					case IDENTIFIER:
						{
						setState(968);
						expression(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(975);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(976);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 60:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		case 10:
			return precpred(_ctx, 19);
		case 11:
			return precpred(_ctx, 18);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\\\u03d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\7\2\u00a2\n\2\f\2\16"+
		"\2\u00a5\13\2\3\2\3\2\3\3\7\3\u00aa\n\3\f\3\16\3\u00ad\13\3\3\3\3\3\3"+
		"\3\5\3\u00b2\n\3\3\3\5\3\u00b5\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\5\7\u00c0\n\7\3\7\3\7\5\7\u00c4\n\7\3\7\3\7\5\7\u00c8\n\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\7\b\u00d0\n\b\f\b\16\b\u00d3\13\b\3\b\3\b\3\t\3\t\3\t\5\t"+
		"\u00da\n\t\3\n\3\n\3\n\7\n\u00df\n\n\f\n\16\n\u00e2\13\n\3\13\3\13\3\13"+
		"\3\13\5\13\u00e8\n\13\3\13\3\13\5\13\u00ec\n\13\3\13\5\13\u00ef\n\13\3"+
		"\13\5\13\u00f2\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u00f9\n\f\f\f\16\f\u00fc"+
		"\13\f\3\r\3\r\5\r\u0100\n\r\3\r\5\r\u0103\n\r\3\16\3\16\7\16\u0107\n\16"+
		"\f\16\16\16\u010a\13\16\3\17\3\17\3\17\5\17\u010f\n\17\3\17\3\17\5\17"+
		"\u0113\n\17\3\17\3\17\3\20\3\20\7\20\u0119\n\20\f\20\16\20\u011c\13\20"+
		"\3\20\3\20\3\21\3\21\7\21\u0122\n\21\f\21\16\21\u0125\13\21\3\21\3\21"+
		"\3\22\3\22\5\22\u012b\n\22\3\22\3\22\7\22\u012f\n\22\f\22\16\22\u0132"+
		"\13\22\3\22\5\22\u0135\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u013f\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u0146\n\24\f\24\16\24\u0149"+
		"\13\24\3\24\3\24\3\25\3\25\5\25\u014f\n\25\3\26\3\26\5\26\u0153\n\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\7\33\u0164\n\33\f\33\16\33\u0167\13\33\3\33\3\33\5\33\u016b\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u0173\n\34\3\35\3\35\3\35\3\35\7\35"+
		"\u0179\n\35\f\35\16\35\u017c\13\35\3\35\3\35\3\36\3\36\3\36\7\36\u0183"+
		"\n\36\f\36\16\36\u0186\13\36\3\36\3\36\3\36\3\37\7\37\u018c\n\37\f\37"+
		"\16\37\u018f\13\37\3\37\3\37\3\37\3\37\5\37\u0195\n\37\3\37\3\37\3\37"+
		"\3\37\7\37\u019b\n\37\f\37\16\37\u019e\13\37\3\37\3\37\3 \3 \3!\3!\3!"+
		"\3\"\3\"\3\"\7\"\u01aa\n\"\f\"\16\"\u01ad\13\"\3#\3#\3#\5#\u01b2\n#\3"+
		"$\3$\3$\7$\u01b7\n$\f$\16$\u01ba\13$\3%\3%\5%\u01be\n%\3&\3&\3&\3&\7&"+
		"\u01c4\n&\f&\16&\u01c7\13&\5&\u01c9\n&\3&\3&\3\'\3\'\5\'\u01cf\n\'\3\'"+
		"\3\'\3\'\5\'\u01d4\n\'\7\'\u01d6\n\'\f\'\16\'\u01d9\13\'\3(\3(\3(\3(\5"+
		"(\u01df\n(\5(\u01e1\n(\3)\3)\3)\7)\u01e6\n)\f)\16)\u01e9\13)\3*\3*\5*"+
		"\u01ed\n*\3*\3*\3+\3+\3+\7+\u01f4\n+\f+\16+\u01f7\13+\3,\7,\u01fa\n,\f"+
		",\16,\u01fd\13,\3,\3,\3,\3-\3-\3-\7-\u0205\n-\f-\16-\u0208\13-\3.\3.\3"+
		".\3.\3.\3.\5.\u0210\n.\3/\3/\3\60\3\60\3\61\3\61\7\61\u0218\n\61\f\61"+
		"\16\61\u021b\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\5\62\u0224\n\62"+
		"\3\63\7\63\u0227\n\63\f\63\16\63\u022a\13\63\3\63\3\63\3\63\3\64\7\64"+
		"\u0230\n\64\f\64\16\64\u0233\13\64\3\64\3\64\5\64\u0237\n\64\3\64\5\64"+
		"\u023a\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u0241\n\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\5\65\u024a\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65"+
		"\u0260\n\65\f\65\16\65\u0263\13\65\3\65\7\65\u0266\n\65\f\65\16\65\u0269"+
		"\13\65\3\65\3\65\3\65\3\65\5\65\u026f\n\65\3\65\3\65\3\65\5\65\u0274\n"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0280\n\65"+
		"\3\66\6\66\u0283\n\66\r\66\16\66\u0284\3\66\6\66\u0288\n\66\r\66\16\66"+
		"\u0289\3\67\3\67\3\67\5\67\u028f\n\67\3\67\3\67\3\67\5\67\u0294\n\67\3"+
		"8\38\58\u0298\n8\38\38\58\u029c\n8\38\38\58\u02a0\n8\58\u02a2\n8\39\3"+
		"9\59\u02a6\n9\3:\7:\u02a9\n:\f:\16:\u02ac\13:\3:\3:\3:\3:\3:\3;\3;\3;"+
		"\3;\3<\3<\3<\7<\u02ba\n<\f<\16<\u02bd\13<\3=\3=\3=\5=\u02c2\n=\3=\3=\3"+
		"=\3=\5=\u02c8\n=\3=\3=\3=\3=\5=\u02ce\n=\3=\5=\u02d1\n=\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u02e1\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\5>\u02f1\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0310\n>\3>\3>\3>\5>\u0315"+
		"\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\7>\u0321\n>\f>\16>\u0324\13>\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0336\n?\3@\3@\3@\5@\u033b"+
		"\n@\3@\3@\5@\u033f\n@\3A\3A\3A\3A\3A\3A\3A\5A\u0348\nA\5A\u034a\nA\3B"+
		"\3B\5B\u034e\nB\3B\3B\3B\5B\u0353\nB\7B\u0355\nB\fB\16B\u0358\13B\3B\5"+
		"B\u035b\nB\3C\3C\5C\u035f\nC\3C\3C\3D\3D\3D\3D\7D\u0367\nD\fD\16D\u036a"+
		"\13D\3D\3D\3D\3D\3D\3D\3D\7D\u0373\nD\fD\16D\u0376\13D\3D\3D\7D\u037a"+
		"\nD\fD\16D\u037d\13D\5D\u037f\nD\3E\3E\5E\u0383\nE\3F\3F\3F\5F\u0388\n"+
		"F\3G\3G\3G\5G\u038d\nG\3H\3H\3H\3H\3I\3I\3I\7I\u0396\nI\fI\16I\u0399\13"+
		"I\3J\3J\5J\u039d\nJ\3J\3J\7J\u03a1\nJ\fJ\16J\u03a4\13J\3K\3K\3L\3L\3L"+
		"\3L\7L\u03ac\nL\fL\16L\u03af\13L\3L\3L\3M\3M\3M\3M\5M\u03b7\nM\5M\u03b9"+
		"\nM\3N\3N\5N\u03bd\nN\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\5P\u03cc"+
		"\nP\7P\u03ce\nP\fP\16P\u03d1\13P\3P\3P\5P\u03d5\nP\3P\2\3zQ\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\2\r\7\2\3\3\20\20\32\32\34"+
		"\35  \6\2\3\3\13\13\35\35  \4\2\17\17\"\"\3\2FI\3\2<=\3\2JL\3\2HI\4\2"+
		":;AB\4\2@@CC\3\2FG\6\2\5\5\b\b\21\21\26\26\2\u0431\2\u00a3\3\2\2\2\4\u00b4"+
		"\3\2\2\2\6\u00b6\3\2\2\2\b\u00b8\3\2\2\2\n\u00ba\3\2\2\2\f\u00bc\3\2\2"+
		"\2\16\u00cb\3\2\2\2\20\u00d6\3\2\2\2\22\u00db\3\2\2\2\24\u00e3\3\2\2\2"+
		"\26\u00f5\3\2\2\2\30\u00fd\3\2\2\2\32\u0104\3\2\2\2\34\u010b\3\2\2\2\36"+
		"\u0116\3\2\2\2 \u011f\3\2\2\2\"\u0134\3\2\2\2$\u013e\3\2\2\2&\u0140\3"+
		"\2\2\2(\u014e\3\2\2\2*\u0152\3\2\2\2,\u0154\3\2\2\2.\u0157\3\2\2\2\60"+
		"\u015a\3\2\2\2\62\u015e\3\2\2\2\64\u016a\3\2\2\2\66\u0172\3\2\2\28\u0174"+
		"\3\2\2\2:\u017f\3\2\2\2<\u018d\3\2\2\2>\u01a1\3\2\2\2@\u01a3\3\2\2\2B"+
		"\u01a6\3\2\2\2D\u01ae\3\2\2\2F\u01b3\3\2\2\2H\u01bd\3\2\2\2J\u01bf\3\2"+
		"\2\2L\u01cc\3\2\2\2N\u01e0\3\2\2\2P\u01e2\3\2\2\2R\u01ea\3\2\2\2T\u01f0"+
		"\3\2\2\2V\u01fb\3\2\2\2X\u0201\3\2\2\2Z\u020f\3\2\2\2\\\u0211\3\2\2\2"+
		"^\u0213\3\2\2\2`\u0215\3\2\2\2b\u0223\3\2\2\2d\u0228\3\2\2\2f\u0239\3"+
		"\2\2\2h\u027f\3\2\2\2j\u0282\3\2\2\2l\u0293\3\2\2\2n\u02a1\3\2\2\2p\u02a5"+
		"\3\2\2\2r\u02aa\3\2\2\2t\u02b2\3\2\2\2v\u02b6\3\2\2\2x\u02d0\3\2\2\2z"+
		"\u02e0\3\2\2\2|\u0335\3\2\2\2~\u033a\3\2\2\2\u0080\u0349\3\2\2\2\u0082"+
		"\u035a\3\2\2\2\u0084\u035c\3\2\2\2\u0086\u0362\3\2\2\2\u0088\u0380\3\2"+
		"\2\2\u008a\u0387\3\2\2\2\u008c\u038c\3\2\2\2\u008e\u038e\3\2\2\2\u0090"+
		"\u0392\3\2\2\2\u0092\u039c\3\2\2\2\u0094\u03a5\3\2\2\2\u0096\u03a7\3\2"+
		"\2\2\u0098\u03b8\3\2\2\2\u009a\u03ba\3\2\2\2\u009c\u03c0\3\2\2\2\u009e"+
		"\u03d4\3\2\2\2\u00a0\u00a2\5\4\3\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7\2\2\3\u00a7\3\3\2\2\2\u00a8\u00aa\5\b\5\2"+
		"\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00b1\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\5\f\7\2\u00af"+
		"\u00b2\5\24\13\2\u00b0\u00b2\5\34\17\2\u00b1\u00ae\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5\7\65\2\2"+
		"\u00b4\u00ab\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\5\3\2\2\2\u00b6\u00b7\5"+
		"\b\5\2\u00b7\7\3\2\2\2\u00b8\u00b9\t\2\2\2\u00b9\t\3\2\2\2\u00ba\u00bb"+
		"\7\20\2\2\u00bb\13\3\2\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00bf\7Y\2\2\u00be"+
		"\u00c0\5\16\b\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3"+
		"\2\2\2\u00c1\u00c2\7\17\2\2\u00c2\u00c4\5\u0092J\2\u00c3\u00c1\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6\7\24\2\2\u00c6\u00c8"+
		"\5\u0090I\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2"+
		"\2\u00c9\u00ca\5\36\20\2\u00ca\r\3\2\2\2\u00cb\u00cc\7;\2\2\u00cc\u00d1"+
		"\5\20\t\2\u00cd\u00ce\7\66\2\2\u00ce\u00d0\5\20\t\2\u00cf\u00cd\3\2\2"+
		"\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7:\2\2\u00d5\17\3\2\2\2\u00d6"+
		"\u00d9\7Y\2\2\u00d7\u00d8\7\17\2\2\u00d8\u00da\5\22\n\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\21\3\2\2\2\u00db\u00e0\5\u0092J\2\u00dc"+
		"\u00dd\7S\2\2\u00dd\u00df\5\u0092J\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\23\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e4\7\16\2\2\u00e4\u00e7\7Y\2\2\u00e5\u00e6\7\24"+
		"\2\2\u00e6\u00e8\5\u0090I\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\7\61\2\2\u00ea\u00ec\5\26\f\2\u00eb\u00ea\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\7\66\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\5\32"+
		"\16\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\7\62\2\2\u00f4\25\3\2\2\2\u00f5\u00fa\5\30\r\2\u00f6\u00f7\7\66"+
		"\2\2\u00f7\u00f9\5\30\r\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\27\3\2\2\2\u00fc\u00fa\3\2\2"+
		"\2\u00fd\u00ff\7Y\2\2\u00fe\u0100\5\u009aN\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u0103\5\36\20\2\u0102\u0101\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\31\3\2\2\2\u0104\u0108\7\65\2\2\u0105"+
		"\u0107\5\"\22\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109\33\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\7\27\2\2\u010c\u010e\7Y\2\2\u010d\u010f\5\16\b\2\u010e\u010d\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u0111\7\17\2\2\u0111"+
		"\u0113\5\u0090I\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\5 \21\2\u0115\35\3\2\2\2\u0116\u011a\7\61\2\2\u0117"+
		"\u0119\5\"\22\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\7\62\2\2\u011e\37\3\2\2\2\u011f\u0123\7\61\2\2\u0120\u0122\5\64"+
		"\33\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\62"+
		"\2\2\u0127!\3\2\2\2\u0128\u0135\7\65\2\2\u0129\u012b\7 \2\2\u012a\u0129"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0135\5`\61\2\u012d"+
		"\u012f\5\6\4\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0135\5$\23\2\u0134\u0128\3\2\2\2\u0134\u012a\3\2\2\2\u0134\u0130\3\2"+
		"\2\2\u0135#\3\2\2\2\u0136\u013f\5&\24\2\u0137\u013f\5,\27\2\u0138\u013f"+
		"\5\62\32\2\u0139\u013f\5\60\31\2\u013a\u013f\5.\30\2\u013b\u013f\5\34"+
		"\17\2\u013c\u013f\5\f\7\2\u013d\u013f\5\24\13\2\u013e\u0136\3\2\2\2\u013e"+
		"\u0137\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013a\3\2"+
		"\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"%\3\2\2\2\u0140\u0141\5*\26\2\u0141\u0142\7Y\2\2\u0142\u0147\5R*\2\u0143"+
		"\u0144\7\63\2\2\u0144\u0146\7\64\2\2\u0145\u0143\3\2\2\2\u0146\u0149\3"+
		"\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014b\5(\25\2\u014b\'\3\2\2\2\u014c\u014f\5`\61\2"+
		"\u014d\u014f\7\65\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f)\3"+
		"\2\2\2\u0150\u0153\5\u0092J\2\u0151\u0153\7%\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0151\3\2\2\2\u0153+\3\2\2\2\u0154\u0155\5\16\b\2\u0155\u0156\5&\24\2"+
		"\u0156-\3\2\2\2\u0157\u0158\5\16\b\2\u0158\u0159\5\60\31\2\u0159/\3\2"+
		"\2\2\u015a\u015b\7Y\2\2\u015b\u015c\5R*\2\u015c\u015d\5`\61\2\u015d\61"+
		"\3\2\2\2\u015e\u015f\5\u0092J\2\u015f\u0160\5B\"\2\u0160\u0161\7\65\2"+
		"\2\u0161\63\3\2\2\2\u0162\u0164\5\6\4\2\u0163\u0162\3\2\2\2\u0164\u0167"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016b\5\66\34\2\u0169\u016b\7\65\2\2\u016a\u0165"+
		"\3\2\2\2\u016a\u0169\3\2\2\2\u016b\65\3\2\2\2\u016c\u0173\58\35\2\u016d"+
		"\u0173\5<\37\2\u016e\u0173\5@!\2\u016f\u0173\5\34\17\2\u0170\u0173\5\f"+
		"\7\2\u0171\u0173\5\24\13\2\u0172\u016c\3\2\2\2\u0172\u016d\3\2\2\2\u0172"+
		"\u016e\3\2\2\2\u0172\u016f\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2"+
		"\2\2\u0173\67\3\2\2\2\u0174\u0175\5\u0092J\2\u0175\u017a\5:\36\2\u0176"+
		"\u0177\7\66\2\2\u0177\u0179\5:\36\2\u0178\u0176\3\2\2\2\u0179\u017c\3"+
		"\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017e\7\65\2\2\u017e9\3\2\2\2\u017f\u0184\7Y\2\2"+
		"\u0180\u0181\7\63\2\2\u0181\u0183\7\64\2\2\u0182\u0180\3\2\2\2\u0183\u0186"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u0188\79\2\2\u0188\u0189\5H%\2\u0189;\3\2\2\2\u018a"+
		"\u018c\5> \2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2"+
		"\2\u018d\u018e\3\2\2\2\u018e\u0194\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0195"+
		"\5*\26\2\u0191\u0192\5\16\b\2\u0192\u0193\5*\26\2\u0193\u0195\3\2\2\2"+
		"\u0194\u0190\3\2\2\2\u0194\u0191\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197"+
		"\7Y\2\2\u0197\u019c\5R*\2\u0198\u0199\7\63\2\2\u0199\u019b\7\64\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\5(\25\2\u01a0"+
		"=\3\2\2\2\u01a1\u01a2\t\3\2\2\u01a2?\3\2\2\2\u01a3\u01a4\5\16\b\2\u01a4"+
		"\u01a5\5<\37\2\u01a5A\3\2\2\2\u01a6\u01ab\5D#\2\u01a7\u01a8\7\66\2\2\u01a8"+
		"\u01aa\5D#\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2"+
		"\2\u01ab\u01ac\3\2\2\2\u01acC\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1"+
		"\5F$\2\u01af\u01b0\79\2\2\u01b0\u01b2\5H%\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2E\3\2\2\2\u01b3\u01b8\7Y\2\2\u01b4\u01b5\7\63\2\2"+
		"\u01b5\u01b7\7\64\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9G\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01be\5J&\2\u01bc\u01be\5z>\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2"+
		"\u01beI\3\2\2\2\u01bf\u01c8\7\61\2\2\u01c0\u01c5\5H%\2\u01c1\u01c2\7\66"+
		"\2\2\u01c2\u01c4\5H%\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01c0\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\7\62"+
		"\2\2\u01cbK\3\2\2\2\u01cc\u01ce\7Y\2\2\u01cd\u01cf\5\u0096L\2\u01ce\u01cd"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d7\3\2\2\2\u01d0\u01d1\7\67\2\2"+
		"\u01d1\u01d3\7Y\2\2\u01d2\u01d4\5\u0096L\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8M\3\2\2\2\u01d9\u01d7\3\2\2\2"+
		"\u01da\u01e1\5\u0092J\2\u01db\u01de\7>\2\2\u01dc\u01dd\t\4\2\2\u01dd\u01df"+
		"\5\u0092J\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2"+
		"\2\u01e0\u01da\3\2\2\2\u01e0\u01db\3\2\2\2\u01e1O\3\2\2\2\u01e2\u01e7"+
		"\5X-\2\u01e3\u01e4\7\66\2\2\u01e4\u01e6\5X-\2\u01e5\u01e3\3\2\2\2\u01e6"+
		"\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8Q\3\2\2\2"+
		"\u01e9\u01e7\3\2\2\2\u01ea\u01ec\7/\2\2\u01eb\u01ed\5T+\2\u01ec\u01eb"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7\60\2\2"+
		"\u01efS\3\2\2\2\u01f0\u01f5\5V,\2\u01f1\u01f2\7\66\2\2\u01f2\u01f4\5V"+
		",\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6U\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fa\5\n\6\2"+
		"\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\5\u0092J"+
		"\2\u01ff\u0200\5F$\2\u0200W\3\2\2\2\u0201\u0206\7Y\2\2\u0202\u0203\7\67"+
		"\2\2\u0203\u0205\7Y\2\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207Y\3\2\2\2\u0208\u0206\3\2\2\2"+
		"\u0209\u0210\5\\/\2\u020a\u0210\5^\60\2\u020b\u0210\7*\2\2\u020c\u0210"+
		"\7+\2\2\u020d\u0210\7)\2\2\u020e\u0210\7,\2\2\u020f\u0209\3\2\2\2\u020f"+
		"\u020a\3\2\2\2\u020f\u020b\3\2\2\2\u020f\u020c\3\2\2\2\u020f\u020d\3\2"+
		"\2\2\u020f\u020e\3\2\2\2\u0210[\3\2\2\2\u0211\u0212\7\'\2\2\u0212]\3\2"+
		"\2\2\u0213\u0214\7(\2\2\u0214_\3\2\2\2\u0215\u0219\7\61\2\2\u0216\u0218"+
		"\5b\62\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\7\62"+
		"\2\2\u021da\3\2\2\2\u021e\u021f\5d\63\2\u021f\u0220\7\65\2\2\u0220\u0224"+
		"\3\2\2\2\u0221\u0224\5h\65\2\u0222\u0224\5f\64\2\u0223\u021e\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224c\3\2\2\2\u0225\u0227\5\n\6\2"+
		"\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\5\u0092J"+
		"\2\u022c\u022d\5B\"\2\u022de\3\2\2\2\u022e\u0230\5\b\5\2\u022f\u022e\3"+
		"\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0236\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0237\5\f\7\2\u0235\u0237\5\34"+
		"\17\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238"+
		"\u023a\7\65\2\2\u0239\u0231\3\2\2\2\u0239\u0238\3\2\2\2\u023ag\3\2\2\2"+
		"\u023b\u0280\5`\61\2\u023c\u023d\7\4\2\2\u023d\u0240\5z>\2\u023e\u023f"+
		"\7?\2\2\u023f\u0241\5z>\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\7\65\2\2\u0243\u0280\3\2\2\2\u0244\u0245\7"+
		"\23\2\2\u0245\u0246\5t;\2\u0246\u0249\5h\65\2\u0247\u0248\7\r\2\2\u0248"+
		"\u024a\5h\65\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u0280\3\2"+
		"\2\2\u024b\u024c\7\22\2\2\u024c\u024d\7/\2\2\u024d\u024e\5n8\2\u024e\u024f"+
		"\7\60\2\2\u024f\u0250\5h\65\2\u0250\u0280\3\2\2\2\u0251\u0252\7&\2\2\u0252"+
		"\u0253\5t;\2\u0253\u0254\5h\65\2\u0254\u0280\3\2\2\2\u0255\u0256\7\f\2"+
		"\2\u0256\u0257\5h\65\2\u0257\u0258\7&\2\2\u0258\u0259\5t;\2\u0259\u025a"+
		"\7\65\2\2\u025a\u0280\3\2\2\2\u025b\u025c\7#\2\2\u025c\u025d\5t;\2\u025d"+
		"\u0261\7\61\2\2\u025e\u0260\5j\66\2\u025f\u025e\3\2\2\2\u0260\u0263\3"+
		"\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0267\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0264\u0266\5l\67\2\u0265\u0264\3\2\2\2\u0266\u0269\3\2"+
		"\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u026a\u026b\7\62\2\2\u026b\u0280\3\2\2\2\u026c\u026e\7"+
		"\36\2\2\u026d\u026f\5z>\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0280\7\65\2\2\u0271\u0273\7\6\2\2\u0272\u0274\7"+
		"Y\2\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0280\7\65\2\2\u0276\u0280\7\65\2\2\u0277\u0278\5z>\2\u0278\u0279\7\65"+
		"\2\2\u0279\u0280\3\2\2\2\u027a\u027b\7Y\2\2\u027b\u027c\7?\2\2\u027c\u0280"+
		"\5h\65\2\u027d\u0280\5\u009eP\2\u027e\u0280\5\u009cO\2\u027f\u023b\3\2"+
		"\2\2\u027f\u023c\3\2\2\2\u027f\u0244\3\2\2\2\u027f\u024b\3\2\2\2\u027f"+
		"\u0251\3\2\2\2\u027f\u0255\3\2\2\2\u027f\u025b\3\2\2\2\u027f\u026c\3\2"+
		"\2\2\u027f\u0271\3\2\2\2\u027f\u0276\3\2\2\2\u027f\u0277\3\2\2\2\u027f"+
		"\u027a\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u027e\3\2\2\2\u0280i\3\2\2\2"+
		"\u0281\u0283\5l\67\2\u0282\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0282"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0288\5b\62\2\u0287"+
		"\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028ak\3\2\2\2\u028b\u028e\7\7\2\2\u028c\u028f\5z>\2\u028d\u028f"+
		"\7Y\2\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0294\7?\2\2\u0291\u0292\7\13\2\2\u0292\u0294\7?\2\2\u0293\u028b\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0294m\3\2\2\2\u0295\u02a2\5r:\2\u0296\u0298"+
		"\5p9\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029b\7\65\2\2\u029a\u029c\5z>\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u029f\7\65\2\2\u029e\u02a0\5v<\2\u029f"+
		"\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u0295\3\2"+
		"\2\2\u02a1\u0297\3\2\2\2\u02a2o\3\2\2\2\u02a3\u02a6\5d\63\2\u02a4\u02a6"+
		"\5v<\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6q\3\2\2\2\u02a7\u02a9"+
		"\5\n\6\2\u02a8\u02a7\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\5\u0092"+
		"J\2\u02ae\u02af\5F$\2\u02af\u02b0\7?\2\2\u02b0\u02b1\5z>\2\u02b1s\3\2"+
		"\2\2\u02b2\u02b3\7/\2\2\u02b3\u02b4\5z>\2\u02b4\u02b5\7\60\2\2\u02b5u"+
		"\3\2\2\2\u02b6\u02bb\5z>\2\u02b7\u02b8\7\66\2\2\u02b8\u02ba\5z>\2\u02b9"+
		"\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2"+
		"\2\2\u02bcw\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\7Y\2\2\u02bf\u02c1"+
		"\7/\2\2\u02c0\u02c2\5v<\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02d1\7\60\2\2\u02c4\u02c5\7$\2\2\u02c5\u02c7\7/"+
		"\2\2\u02c6\u02c8\5v<\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02d1\7\60\2\2\u02ca\u02cb\7\"\2\2\u02cb\u02cd\7/\2\2\u02cc"+
		"\u02ce\5v<\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2"+
		"\2\u02cf\u02d1\7\60\2\2\u02d0\u02be\3\2\2\2\u02d0\u02c4\3\2\2\2\u02d0"+
		"\u02ca\3\2\2\2\u02d1y\3\2\2\2\u02d2\u02d3\b>\1\2\u02d3\u02e1\5|?\2\u02d4"+
		"\u02e1\5x=\2\u02d5\u02d6\7\30\2\2\u02d6\u02e1\5\u0080A\2\u02d7\u02d8\7"+
		"/\2\2\u02d8\u02d9\5\u0092J\2\u02d9\u02da\7\60\2\2\u02da\u02db\5z>\21\u02db"+
		"\u02e1\3\2\2\2\u02dc\u02dd\t\5\2\2\u02dd\u02e1\5z>\17\u02de\u02df\t\6"+
		"\2\2\u02df\u02e1\5z>\16\u02e0\u02d2\3\2\2\2\u02e0\u02d4\3\2\2\2\u02e0"+
		"\u02d5\3\2\2\2\u02e0\u02d7\3\2\2\2\u02e0\u02dc\3\2\2\2\u02e0\u02de\3\2"+
		"\2\2\u02e1\u0322\3\2\2\2\u02e2\u02e3\f\r\2\2\u02e3\u02e4\t\7\2\2\u02e4"+
		"\u0321\5z>\16\u02e5\u02e6\f\f\2\2\u02e6\u02e7\t\b\2\2\u02e7\u0321\5z>"+
		"\r\u02e8\u02f0\f\13\2\2\u02e9\u02ea\7;\2\2\u02ea\u02f1\7;\2\2\u02eb\u02ec"+
		"\7:\2\2\u02ec\u02ed\7:\2\2\u02ed\u02f1\7:\2\2\u02ee\u02ef\7:\2\2\u02ef"+
		"\u02f1\7:\2\2\u02f0\u02e9\3\2\2\2\u02f0\u02eb\3\2\2\2\u02f0\u02ee\3\2"+
		"\2\2\u02f1\u02f2\3\2\2\2\u02f2\u0321\5z>\f\u02f3\u02f4\f\n\2\2\u02f4\u02f5"+
		"\t\t\2\2\u02f5\u0321\5z>\13\u02f6\u02f7\f\b\2\2\u02f7\u02f8\t\n\2\2\u02f8"+
		"\u0321\5z>\t\u02f9\u02fa\f\7\2\2\u02fa\u02fb\7S\2\2\u02fb\u0321\5z>\b"+
		"\u02fc\u02fd\f\6\2\2\u02fd\u02fe\7T\2\2\u02fe\u0321\5z>\7\u02ff\u0300"+
		"\f\5\2\2\u0300\u0301\7U\2\2\u0301\u0321\5z>\6\u0302\u0303\f\4\2\2\u0303"+
		"\u0304\7D\2\2\u0304\u0321\5z>\5\u0305\u0306\f\3\2\2\u0306\u0307\7E\2\2"+
		"\u0307\u0321\5z>\4\u0308\u0309\f\25\2\2\u0309\u0314\7\67\2\2\u030a\u0315"+
		"\7Y\2\2\u030b\u0315\5x=\2\u030c\u0315\7$\2\2\u030d\u030f\7\30\2\2\u030e"+
		"\u0310\5\u008eH\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311"+
		"\3\2\2\2\u0311\u0315\5\u0084C\2\u0312\u0313\7\"\2\2\u0313\u0315\5\u0098"+
		"M\2\u0314\u030a\3\2\2\2\u0314\u030b\3\2\2\2\u0314\u030c\3\2\2\2\u0314"+
		"\u030d\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u0321\3\2\2\2\u0316\u0317\f\24"+
		"\2\2\u0317\u0318\7\63\2\2\u0318\u0319\5z>\2\u0319\u031a\7\64\2\2\u031a"+
		"\u0321\3\2\2\2\u031b\u031c\f\20\2\2\u031c\u0321\t\13\2\2\u031d\u031e\f"+
		"\t\2\2\u031e\u031f\7\25\2\2\u031f\u0321\5\u0092J\2\u0320\u02e2\3\2\2\2"+
		"\u0320\u02e5\3\2\2\2\u0320\u02e8\3\2\2\2\u0320\u02f3\3\2\2\2\u0320\u02f6"+
		"\3\2\2\2\u0320\u02f9\3\2\2\2\u0320\u02fc\3\2\2\2\u0320\u02ff\3\2\2\2\u0320"+
		"\u0302\3\2\2\2\u0320\u0305\3\2\2\2\u0320\u0308\3\2\2\2\u0320\u0316\3\2"+
		"\2\2\u0320\u031b\3\2\2\2\u0320\u031d\3\2\2\2\u0321\u0324\3\2\2\2\u0322"+
		"\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323{\3\2\2\2\u0324\u0322\3\2\2\2"+
		"\u0325\u0326\7/\2\2\u0326\u0327\5z>\2\u0327\u0328\7\60\2\2\u0328\u0336"+
		"\3\2\2\2\u0329\u0336\7$\2\2\u032a\u0336\7\"\2\2\u032b\u0336\5Z.\2\u032c"+
		"\u0336\7Y\2\2\u032d\u032e\5*\26\2\u032e\u032f\7\67\2\2\u032f\u0330\7\t"+
		"\2\2\u0330\u0336\3\2\2\2\u0331\u0332\5\u008eH\2\u0332\u0333\7$\2\2\u0333"+
		"\u0334\5\u009aN\2\u0334\u0336\3\2\2\2\u0335\u0325\3\2\2\2\u0335\u0329"+
		"\3\2\2\2\u0335\u032a\3\2\2\2\u0335\u032b\3\2\2\2\u0335\u032c\3\2\2\2\u0335"+
		"\u032d\3\2\2\2\u0335\u0331\3\2\2\2\u0336}\3\2\2\2\u0337\u0338\5L\'\2\u0338"+
		"\u0339\7\67\2\2\u0339\u033b\3\2\2\2\u033a\u0337\3\2\2\2\u033a\u033b\3"+
		"\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e\7Y\2\2\u033d\u033f\5\u0096L\2\u033e"+
		"\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\177\3\2\2\2\u0340\u0341\5\u008e"+
		"H\2\u0341\u0342\5\u0082B\2\u0342\u0343\5\u0088E\2\u0343\u034a\3\2\2\2"+
		"\u0344\u0347\5\u0082B\2\u0345\u0348\5\u0086D\2\u0346\u0348\5\u0088E\2"+
		"\u0347\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348\u034a\3\2\2\2\u0349\u0340"+
		"\3\2\2\2\u0349\u0344\3\2\2\2\u034a\u0081\3\2\2\2\u034b\u034d\7Y\2\2\u034c"+
		"\u034e\5\u008aF\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0356"+
		"\3\2\2\2\u034f\u0350\7\67\2\2\u0350\u0352\7Y\2\2\u0351\u0353\5\u008aF"+
		"\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u034f"+
		"\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u035b\3\2\2\2\u0358\u0356\3\2\2\2\u0359\u035b\5\u0094K\2\u035a\u034b"+
		"\3\2\2\2\u035a\u0359\3\2\2\2\u035b\u0083\3\2\2\2\u035c\u035e\7Y\2\2\u035d"+
		"\u035f\5\u008cG\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360"+
		"\3\2\2\2\u0360\u0361\5\u0088E\2\u0361\u0085\3\2\2\2\u0362\u037e\7\63\2"+
		"\2\u0363\u0368\7\64\2\2\u0364\u0365\7\63\2\2\u0365\u0367\7\64\2\2\u0366"+
		"\u0364\3\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2"+
		"\2\2\u0369\u036b\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u037f\5J&\2\u036c\u036d"+
		"\5z>\2\u036d\u0374\7\64\2\2\u036e\u036f\7\63\2\2\u036f\u0370\5z>\2\u0370"+
		"\u0371\7\64\2\2\u0371\u0373\3\2\2\2\u0372\u036e\3\2\2\2\u0373\u0376\3"+
		"\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u037b\3\2\2\2\u0376"+
		"\u0374\3\2\2\2\u0377\u0378\7\63\2\2\u0378\u037a\7\64\2\2\u0379\u0377\3"+
		"\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c"+
		"\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u0363\3\2\2\2\u037e\u036c\3\2"+
		"\2\2\u037f\u0087\3\2\2\2\u0380\u0382\5\u009aN\2\u0381\u0383\5\36\20\2"+
		"\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0089\3\2\2\2\u0384\u0385"+
		"\7;\2\2\u0385\u0388\7:\2\2\u0386\u0388\5\u0096L\2\u0387\u0384\3\2\2\2"+
		"\u0387\u0386\3\2\2\2\u0388\u008b\3\2\2\2\u0389\u038a\7;\2\2\u038a\u038d"+
		"\7:\2\2\u038b\u038d\5\u008eH\2\u038c\u0389\3\2\2\2\u038c\u038b\3\2\2\2"+
		"\u038d\u008d\3\2\2\2\u038e\u038f\7;\2\2\u038f\u0390\5\u0090I\2\u0390\u0391"+
		"\7:\2\2\u0391\u008f\3\2\2\2\u0392\u0397\5\u0092J\2\u0393\u0394\7\66\2"+
		"\2\u0394\u0396\5\u0092J\2\u0395\u0393\3\2\2\2\u0396\u0399\3\2\2\2\u0397"+
		"\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0091\3\2\2\2\u0399\u0397\3\2"+
		"\2\2\u039a\u039d\5L\'\2\u039b\u039d\5\u0094K\2\u039c\u039a\3\2\2\2\u039c"+
		"\u039b\3\2\2\2\u039d\u03a2\3\2\2\2\u039e\u039f\7\63\2\2\u039f\u03a1\7"+
		"\64\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u0093\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\t\f"+
		"\2\2\u03a6\u0095\3\2\2\2\u03a7\u03a8\7;\2\2\u03a8\u03ad\5N(\2\u03a9\u03aa"+
		"\7\66\2\2\u03aa\u03ac\5N(\2\u03ab\u03a9\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad"+
		"\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0\3\2\2\2\u03af\u03ad\3\2"+
		"\2\2\u03b0\u03b1\7:\2\2\u03b1\u0097\3\2\2\2\u03b2\u03b9\5\u009aN\2\u03b3"+
		"\u03b4\7\67\2\2\u03b4\u03b6\7Y\2\2\u03b5\u03b7\5\u009aN\2\u03b6\u03b5"+
		"\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03b2\3\2\2\2\u03b8"+
		"\u03b3\3\2\2\2\u03b9\u0099\3\2\2\2\u03ba\u03bc\7/\2\2\u03bb\u03bd\5v<"+
		"\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf"+
		"\7\60\2\2\u03bf\u009b\3\2\2\2\u03c0\u03c1\7\37\2\2\u03c1\u03c2\7/\2\2"+
		"\u03c2\u03c3\7\60\2\2\u03c3\u009d\3\2\2\2\u03c4\u03c5\7\33\2\2\u03c5\u03c6"+
		"\7/\2\2\u03c6\u03d5\7-\2\2\u03c7\u03cf\5z>\2\u03c8\u03cb\7H\2\2\u03c9"+
		"\u03cc\7-\2\2\u03ca\u03cc\5z>\2\u03cb\u03c9\3\2\2\2\u03cb\u03ca\3\2\2"+
		"\2\u03cc\u03ce\3\2\2\2\u03cd\u03c8\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd"+
		"\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2"+
		"\u03d3\7\60\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03c4\3\2\2\2\u03d4\u03c7\3"+
		"\2\2\2\u03d5\u009f\3\2\2\2u\u00a3\u00ab\u00b1\u00b4\u00bf\u00c3\u00c7"+
		"\u00d1\u00d9\u00e0\u00e7\u00eb\u00ee\u00f1\u00fa\u00ff\u0102\u0108\u010e"+
		"\u0112\u011a\u0123\u012a\u0130\u0134\u013e\u0147\u014e\u0152\u0165\u016a"+
		"\u0172\u017a\u0184\u018d\u0194\u019c\u01ab\u01b1\u01b8\u01bd\u01c5\u01c8"+
		"\u01ce\u01d3\u01d7\u01de\u01e0\u01e7\u01ec\u01f5\u01fb\u0206\u020f\u0219"+
		"\u0223\u0228\u0231\u0236\u0239\u0240\u0249\u0261\u0267\u026e\u0273\u027f"+
		"\u0284\u0289\u028e\u0293\u0297\u029b\u029f\u02a1\u02a5\u02aa\u02bb\u02c1"+
		"\u02c7\u02cd\u02d0\u02e0\u02f0\u030f\u0314\u0320\u0322\u0335\u033a\u033e"+
		"\u0347\u0349\u034d\u0352\u0356\u035a\u035e\u0368\u0374\u037b\u037e\u0382"+
		"\u0387\u038c\u0397\u039c\u03a2\u03ad\u03b6\u03b8\u03bc\u03cb\u03cf\u03d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}