// Generated from C:/Users/Rolo/Documents/GitHub/CMPILER_SCANNER/grammar\SHJava.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SHJava extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "CASE", "CHAR", "CLASS", "CONST", 
			"DEFAULT", "DO", "ELSE", "ENUM", "EXTENDS", "FINAL", "FLOAT", "FOR", 
			"IF", "IMPLEMENTS", "INSTANCEOF", "INT", "INTERFACE", "NEW", "NULL", 
			"PRIVATE", "PRINT", "PROTECTED", "PUBLIC", "RETURN", "SCAN", "STATIC", 
			"STRING", "SUPER", "SWITCH", "THIS", "VOID", "WHILE", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
			"PRINTABLE_LITERALS", "SEPARATOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "OPERATORS", "ASSIGN", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "TOKEN", "AT", "AMP", "CARET", 
			"VBAR", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", "ExponentPart", 
			"EscapeSequence", "Digits", "LetterOrDigit", "Letter", "INVALIDCHAR_LITERAL", 
			"INVALIDIDENTIFIER", "UnknownToken"
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


	public SHJava(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SHJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\\\u0273\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3&\3&\3&\5&\u0155\n&\3&\6&\u0158\n&\r&\16&\u0159\3&\5&\u015d\n"+
		"&\5&\u015f\n&\3&\5&\u0162\n&\3\'\3\'\3\'\5\'\u0167\n\'\3\'\3\'\5\'\u016b"+
		"\n\'\3\'\5\'\u016e\n\'\3\'\5\'\u0171\n\'\3\'\3\'\3\'\5\'\u0176\n\'\3\'"+
		"\5\'\u0179\n\'\5\'\u017b\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0186\n(\3"+
		")\3)\3)\5)\u018b\n)\3)\3)\3*\3*\3*\7*\u0192\n*\f*\16*\u0195\13*\3*\3*"+
		"\3+\3+\3+\3+\3+\3,\3,\3,\3,\5,\u01a2\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-"+
		"\u01ad\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u01d9\n\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3"+
		"@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3"+
		"H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3Q\3"+
		"Q\3R\3R\3S\3S\3T\3T\3U\6U\u0222\nU\rU\16U\u0223\3U\3U\3V\3V\3V\3V\7V\u022c"+
		"\nV\fV\16V\u022f\13V\3V\3V\3V\3V\3V\3W\3W\3W\3W\7W\u023a\nW\fW\16W\u023d"+
		"\13W\3W\3W\3X\3X\7X\u0243\nX\fX\16X\u0246\13X\3Y\3Y\5Y\u024a\nY\3Y\3Y"+
		"\3Z\3Z\3Z\3[\3[\7[\u0253\n[\f[\16[\u0256\13[\3[\5[\u0259\n[\3\\\3\\\5"+
		"\\\u025d\n\\\3]\3]\3^\3^\3^\7^\u0264\n^\f^\16^\u0267\13^\3^\3^\3_\3_\7"+
		"_\u026d\n_\f_\16_\u0270\13_\3`\3`\3\u022d\2a\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\u00abW\u00adX\u00afY\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bbZ"+
		"\u00bd[\u00bf\\\3\2\17\3\2\63;\4\2KKNN\4\2HHhh\6\2\f\f\17\17))^^\6\2\f"+
		"\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\4\2--//\n\2$$))"+
		"^^ddhhppttvv\3\2\62;\4\2\62;aa\6\2&&C\\aac|\2\u02aa\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\3\u00c1\3\2\2\2\5\u00c5\3\2\2\2\7\u00c9\3\2\2\2\t\u00cd"+
		"\3\2\2\2\13\u00d1\3\2\2\2\r\u00d5\3\2\2\2\17\u00d9\3\2\2\2\21\u00dd\3"+
		"\2\2\2\23\u00e1\3\2\2\2\25\u00e5\3\2\2\2\27\u00e9\3\2\2\2\31\u00ed\3\2"+
		"\2\2\33\u00f1\3\2\2\2\35\u00f5\3\2\2\2\37\u00f9\3\2\2\2!\u00fd\3\2\2\2"+
		"#\u0101\3\2\2\2%\u0105\3\2\2\2\'\u0109\3\2\2\2)\u010d\3\2\2\2+\u0111\3"+
		"\2\2\2-\u0115\3\2\2\2/\u0119\3\2\2\2\61\u011d\3\2\2\2\63\u0121\3\2\2\2"+
		"\65\u0125\3\2\2\2\67\u0129\3\2\2\29\u012d\3\2\2\2;\u0131\3\2\2\2=\u0135"+
		"\3\2\2\2?\u0139\3\2\2\2A\u013d\3\2\2\2C\u0141\3\2\2\2E\u0145\3\2\2\2G"+
		"\u0149\3\2\2\2I\u014d\3\2\2\2K\u015e\3\2\2\2M\u017a\3\2\2\2O\u0185\3\2"+
		"\2\2Q\u0187\3\2\2\2S\u018e\3\2\2\2U\u0198\3\2\2\2W\u01a1\3\2\2\2Y\u01ac"+
		"\3\2\2\2[\u01ae\3\2\2\2]\u01b0\3\2\2\2_\u01b2\3\2\2\2a\u01b4\3\2\2\2c"+
		"\u01b6\3\2\2\2e\u01b8\3\2\2\2g\u01ba\3\2\2\2i\u01bc\3\2\2\2k\u01be\3\2"+
		"\2\2m\u01d8\3\2\2\2o\u01da\3\2\2\2q\u01dc\3\2\2\2s\u01de\3\2\2\2u\u01e0"+
		"\3\2\2\2w\u01e2\3\2\2\2y\u01e4\3\2\2\2{\u01e6\3\2\2\2}\u01e8\3\2\2\2\177"+
		"\u01eb\3\2\2\2\u0081\u01ee\3\2\2\2\u0083\u01f1\3\2\2\2\u0085\u01f4\3\2"+
		"\2\2\u0087\u01f7\3\2\2\2\u0089\u01fa\3\2\2\2\u008b\u01fd\3\2\2\2\u008d"+
		"\u0200\3\2\2\2\u008f\u0202\3\2\2\2\u0091\u0204\3\2\2\2\u0093\u0206\3\2"+
		"\2\2\u0095\u0208\3\2\2\2\u0097\u020a\3\2\2\2\u0099\u020d\3\2\2\2\u009b"+
		"\u0210\3\2\2\2\u009d\u0213\3\2\2\2\u009f\u0216\3\2\2\2\u00a1\u0218\3\2"+
		"\2\2\u00a3\u021a\3\2\2\2\u00a5\u021c\3\2\2\2\u00a7\u021e\3\2\2\2\u00a9"+
		"\u0221\3\2\2\2\u00ab\u0227\3\2\2\2\u00ad\u0235\3\2\2\2\u00af\u0240\3\2"+
		"\2\2\u00b1\u0247\3\2\2\2\u00b3\u024d\3\2\2\2\u00b5\u0250\3\2\2\2\u00b7"+
		"\u025c\3\2\2\2\u00b9\u025e\3\2\2\2\u00bb\u0260\3\2\2\2\u00bd\u026a\3\2"+
		"\2\2\u00bf\u0271\3\2\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4"+
		"\7u\2\2\u00c4\4\3\2\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8"+
		"\7u\2\2\u00c8\6\3\2\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc"+
		"\7q\2\2\u00cc\b\3\2\2\2\u00cd\u00ce\7d\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0"+
		"\7m\2\2\u00d0\n\3\2\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4"+
		"\7u\2\2\u00d4\f\3\2\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8"+
		"\7c\2\2\u00d8\16\3\2\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7n\2\2\u00db\u00dc"+
		"\7c\2\2\u00dc\20\3\2\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7q\2\2\u00df\u00e0"+
		"\7p\2\2\u00e0\22\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7h\2\2\u00e4\24\3\2\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7f\2\2\u00e7\u00e8"+
		"\7q\2\2\u00e8\26\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec"+
		"\7u\2\2\u00ec\30\3\2\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0"+
		"\7w\2\2\u00f0\32\3\2\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7z\2\2\u00f3\u00f4"+
		"\7v\2\2\u00f4\34\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7p\2\2\u00f8\36\3\2\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc \3\2\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100"+
		"\7t\2\2\u0100\"\3\2\2\2\u0101\u0102\7k\2\2\u0102\u0103\7k\2\2\u0103\u0104"+
		"\7h\2\2\u0104$\3\2\2\2\u0105\u0106\7k\2\2\u0106\u0107\7o\2\2\u0107\u0108"+
		"\7r\2\2\u0108&\3\2\2\2\u0109\u010a\7k\2\2\u010a\u010b\7q\2\2\u010b\u010c"+
		"\7h\2\2\u010c(\3\2\2\2\u010d\u010e\7f\2\2\u010e\u010f\7g\2\2\u010f\u0110"+
		"\7e\2\2\u0110*\3\2\2\2\u0111\u0112\7k\2\2\u0112\u0113\7h\2\2\u0113\u0114"+
		"\7c\2\2\u0114,\3\2\2\2\u0115\u0116\7e\2\2\u0116\u0117\7t\2\2\u0117\u0118"+
		"\7g\2\2\u0118.\3\2\2\2\u0119\u011a\7p\2\2\u011a\u011b\7w\2\2\u011b\u011c"+
		"\7n\2\2\u011c\60\3\2\2\2\u011d\u011e\7r\2\2\u011e\u011f\7t\2\2\u011f\u0120"+
		"\7k\2\2\u0120\62\3\2\2\2\u0121\u0122\7q\2\2\u0122\u0123\7w\2\2\u0123\u0124"+
		"\7v\2\2\u0124\64\3\2\2\2\u0125\u0126\7r\2\2\u0126\u0127\7t\2\2\u0127\u0128"+
		"\7q\2\2\u0128\66\3\2\2\2\u0129\u012a\7r\2\2\u012a\u012b\7w\2\2\u012b\u012c"+
		"\7d\2\2\u012c8\3\2\2\2\u012d\u012e\7t\2\2\u012e\u012f\7g\2\2\u012f\u0130"+
		"\7v\2\2\u0130:\3\2\2\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2\2\u0133\u0134"+
		"\7r\2\2\u0134<\3\2\2\2\u0135\u0136\7u\2\2\u0136\u0137\7v\2\2\u0137\u0138"+
		"\7c\2\2\u0138>\3\2\2\2\u0139\u013a\7u\2\2\u013a\u013b\7v\2\2\u013b\u013c"+
		"\7t\2\2\u013c@\3\2\2\2\u013d\u013e\7u\2\2\u013e\u013f\7w\2\2\u013f\u0140"+
		"\7r\2\2\u0140B\3\2\2\2\u0141\u0142\7u\2\2\u0142\u0143\7y\2\2\u0143\u0144"+
		"\7k\2\2\u0144D\3\2\2\2\u0145\u0146\7v\2\2\u0146\u0147\7j\2\2\u0147\u0148"+
		"\7k\2\2\u0148F\3\2\2\2\u0149\u014a\7x\2\2\u014a\u014b\7q\2\2\u014b\u014c"+
		"\7k\2\2\u014cH\3\2\2\2\u014d\u014e\7y\2\2\u014e\u014f\7j\2\2\u014f\u0150"+
		"\7k\2\2\u0150J\3\2\2\2\u0151\u015f\7\62\2\2\u0152\u015c\t\2\2\2\u0153"+
		"\u0155\5\u00b5[\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u015d"+
		"\3\2\2\2\u0156\u0158\7a\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\5\u00b5"+
		"[\2\u015c\u0154\3\2\2\2\u015c\u0157\3\2\2\2\u015d\u015f\3\2\2\2\u015e"+
		"\u0151\3\2\2\2\u015e\u0152\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u0162\t\3"+
		"\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162L\3\2\2\2\u0163\u0164"+
		"\5\u00b5[\2\u0164\u0166\7\60\2\2\u0165\u0167\5\u00b5[\2\u0166\u0165\3"+
		"\2\2\2\u0166\u0167\3\2\2\2\u0167\u016b\3\2\2\2\u0168\u0169\7\60\2\2\u0169"+
		"\u016b\5\u00b5[\2\u016a\u0163\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d"+
		"\3\2\2\2\u016c\u016e\5\u00b1Y\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2"+
		"\2\u016e\u0170\3\2\2\2\u016f\u0171\t\4\2\2\u0170\u016f\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u017b\3\2\2\2\u0172\u0178\5\u00b5[\2\u0173\u0175\5\u00b1"+
		"Y\2\u0174\u0176\t\4\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0179\t\4\2\2\u0178\u0173\3\2\2\2\u0178\u0177\3\2"+
		"\2\2\u0179\u017b\3\2\2\2\u017a\u016a\3\2\2\2\u017a\u0172\3\2\2\2\u017b"+
		"N\3\2\2\2\u017c\u017d\7v\2\2\u017d\u017e\7t\2\2\u017e\u017f\7w\2\2\u017f"+
		"\u0186\7g\2\2\u0180\u0181\7h\2\2\u0181\u0182\7c\2\2\u0182\u0183\7n\2\2"+
		"\u0183\u0184\7u\2\2\u0184\u0186\7g\2\2\u0185\u017c\3\2\2\2\u0185\u0180"+
		"\3\2\2\2\u0186P\3\2\2\2\u0187\u018a\7)\2\2\u0188\u018b\n\5\2\2\u0189\u018b"+
		"\5\u00b3Z\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2"+
		"\2\u018c\u018d\7)\2\2\u018dR\3\2\2\2\u018e\u0193\7$\2\2\u018f\u0192\n"+
		"\6\2\2\u0190\u0192\5\u00b3Z\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2"+
		"\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7$\2\2\u0197T\3\2\2\2\u0198\u0199"+
		"\7p\2\2\u0199\u019a\7w\2\2\u019a\u019b\7n\2\2\u019b\u019c\7n\2\2\u019c"+
		"V\3\2\2\2\u019d\u01a2\5K&\2\u019e\u01a2\5M\'\2\u019f\u01a2\5Q)\2\u01a0"+
		"\u01a2\5S*\2\u01a1\u019d\3\2\2\2\u01a1\u019e\3\2\2\2\u01a1\u019f\3\2\2"+
		"\2\u01a1\u01a0\3\2\2\2\u01a2X\3\2\2\2\u01a3\u01ad\5[.\2\u01a4\u01ad\5"+
		"]/\2\u01a5\u01ad\5_\60\2\u01a6\u01ad\5a\61\2\u01a7\u01ad\5c\62\2\u01a8"+
		"\u01ad\5e\63\2\u01a9\u01ad\5g\64\2\u01aa\u01ad\5i\65\2\u01ab\u01ad\5k"+
		"\66\2\u01ac\u01a3\3\2\2\2\u01ac\u01a4\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ac"+
		"\u01a6\3\2\2\2\u01ac\u01a7\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ac\u01a9\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adZ\3\2\2\2\u01ae\u01af"+
		"\7*\2\2\u01af\\\3\2\2\2\u01b0\u01b1\7+\2\2\u01b1^\3\2\2\2\u01b2\u01b3"+
		"\7}\2\2\u01b3`\3\2\2\2\u01b4\u01b5\7\177\2\2\u01b5b\3\2\2\2\u01b6\u01b7"+
		"\7]\2\2\u01b7d\3\2\2\2\u01b8\u01b9\7_\2\2\u01b9f\3\2\2\2\u01ba\u01bb\7"+
		"=\2\2\u01bbh\3\2\2\2\u01bc\u01bd\7.\2\2\u01bdj\3\2\2\2\u01be\u01bf\7\60"+
		"\2\2\u01bfl\3\2\2\2\u01c0\u01d9\5o8\2\u01c1\u01d9\5q9\2\u01c2\u01d9\5"+
		"s:\2\u01c3\u01d9\5u;\2\u01c4\u01d9\5w<\2\u01c5\u01d9\5y=\2\u01c6\u01d9"+
		"\5{>\2\u01c7\u01d9\5}?\2\u01c8\u01d9\5\177@\2\u01c9\u01d9\5\u0081A\2\u01ca"+
		"\u01d9\5\u0083B\2\u01cb\u01d9\5\u0085C\2\u01cc\u01d9\5\u0087D\2\u01cd"+
		"\u01d9\5\u0089E\2\u01ce\u01d9\5\u008bF\2\u01cf\u01d9\5\u008dG\2\u01d0"+
		"\u01d9\5\u008fH\2\u01d1\u01d9\5\u0091I\2\u01d2\u01d9\5\u0093J\2\u01d3"+
		"\u01d9\5\u0095K\2\u01d4\u01d9\5\u0097L\2\u01d5\u01d9\5\u0099M\2\u01d6"+
		"\u01d9\5\u009bN\2\u01d7\u01d9\5\u009dO\2\u01d8\u01c0\3\2\2\2\u01d8\u01c1"+
		"\3\2\2\2\u01d8\u01c2\3\2\2\2\u01d8\u01c3\3\2\2\2\u01d8\u01c4\3\2\2\2\u01d8"+
		"\u01c5\3\2\2\2\u01d8\u01c6\3\2\2\2\u01d8\u01c7\3\2\2\2\u01d8\u01c8\3\2"+
		"\2\2\u01d8\u01c9\3\2\2\2\u01d8\u01ca\3\2\2\2\u01d8\u01cb\3\2\2\2\u01d8"+
		"\u01cc\3\2\2\2\u01d8\u01cd\3\2\2\2\u01d8\u01ce\3\2\2\2\u01d8\u01cf\3\2"+
		"\2\2\u01d8\u01d0\3\2\2\2\u01d8\u01d1\3\2\2\2\u01d8\u01d2\3\2\2\2\u01d8"+
		"\u01d3\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d8\u01d7\3\2\2\2\u01d9n\3\2\2\2\u01da\u01db\7?\2\2\u01dbp\3\2"+
		"\2\2\u01dc\u01dd\7@\2\2\u01ddr\3\2\2\2\u01de\u01df\7>\2\2\u01dft\3\2\2"+
		"\2\u01e0\u01e1\7#\2\2\u01e1v\3\2\2\2\u01e2\u01e3\7\u0080\2\2\u01e3x\3"+
		"\2\2\2\u01e4\u01e5\7A\2\2\u01e5z\3\2\2\2\u01e6\u01e7\7<\2\2\u01e7|\3\2"+
		"\2\2\u01e8\u01e9\7?\2\2\u01e9\u01ea\7?\2\2\u01ea~\3\2\2\2\u01eb\u01ec"+
		"\7>\2\2\u01ec\u01ed\7?\2\2\u01ed\u0080\3\2\2\2\u01ee\u01ef\7@\2\2\u01ef"+
		"\u01f0\7?\2\2\u01f0\u0082\3\2\2\2\u01f1\u01f2\7#\2\2\u01f2\u01f3\7?\2"+
		"\2\u01f3\u0084\3\2\2\2\u01f4\u01f5\7(\2\2\u01f5\u01f6\7(\2\2\u01f6\u0086"+
		"\3\2\2\2\u01f7\u01f8\7~\2\2\u01f8\u01f9\7~\2\2\u01f9\u0088\3\2\2\2\u01fa"+
		"\u01fb\7-\2\2\u01fb\u01fc\7-\2\2\u01fc\u008a\3\2\2\2\u01fd\u01fe\7/\2"+
		"\2\u01fe\u01ff\7/\2\2\u01ff\u008c\3\2\2\2\u0200\u0201\7-\2\2\u0201\u008e"+
		"\3\2\2\2\u0202\u0203\7/\2\2\u0203\u0090\3\2\2\2\u0204\u0205\7,\2\2\u0205"+
		"\u0092\3\2\2\2\u0206\u0207\7\61\2\2\u0207\u0094\3\2\2\2\u0208\u0209\7"+
		"\'\2\2\u0209\u0096\3\2\2\2\u020a\u020b\7-\2\2\u020b\u020c\7?\2\2\u020c"+
		"\u0098\3\2\2\2\u020d\u020e\7/\2\2\u020e\u020f\7?\2\2\u020f\u009a\3\2\2"+
		"\2\u0210\u0211\7,\2\2\u0211\u0212\7?\2\2\u0212\u009c\3\2\2\2\u0213\u0214"+
		"\7\61\2\2\u0214\u0215\7?\2\2\u0215\u009e\3\2\2\2\u0216\u0217\5\u00a1Q"+
		"\2\u0217\u00a0\3\2\2\2\u0218\u0219\7B\2\2\u0219\u00a2\3\2\2\2\u021a\u021b"+
		"\7(\2\2\u021b\u00a4\3\2\2\2\u021c\u021d\7`\2\2\u021d\u00a6\3\2\2\2\u021e"+
		"\u021f\7~\2\2\u021f\u00a8\3\2\2\2\u0220\u0222\t\7\2\2\u0221\u0220\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\bU\2\2\u0226\u00aa\3\2\2\2\u0227\u0228\7\61"+
		"\2\2\u0228\u0229\7,\2\2\u0229\u022d\3\2\2\2\u022a\u022c\13\2\2\2\u022b"+
		"\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022e\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\7,\2\2\u0231"+
		"\u0232\7\61\2\2\u0232\u0233\3\2\2\2\u0233\u0234\bV\2\2\u0234\u00ac\3\2"+
		"\2\2\u0235\u0236\7\61\2\2\u0236\u0237\7\61\2\2\u0237\u023b\3\2\2\2\u0238"+
		"\u023a\n\b\2\2\u0239\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2"+
		"\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e"+
		"\u023f\bW\2\2\u023f\u00ae\3\2\2\2\u0240\u0244\5\u00b9]\2\u0241\u0243\5"+
		"\u00b7\\\2\u0242\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2"+
		"\u0244\u0245\3\2\2\2\u0245\u00b0\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0249"+
		"\t\t\2\2\u0248\u024a\t\n\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u024c\5\u00b5[\2\u024c\u00b2\3\2\2\2\u024d\u024e"+
		"\7^\2\2\u024e\u024f\t\13\2\2\u024f\u00b4\3\2\2\2\u0250\u0258\t\f\2\2\u0251"+
		"\u0253\t\r\2\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2"+
		"\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257"+
		"\u0259\t\f\2\2\u0258\u0254\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u00b6\3\2"+
		"\2\2\u025a\u025d\5\u00b9]\2\u025b\u025d\t\f\2\2\u025c\u025a\3\2\2\2\u025c"+
		"\u025b\3\2\2\2\u025d\u00b8\3\2\2\2\u025e\u025f\t\16\2\2\u025f\u00ba\3"+
		"\2\2\2\u0260\u0265\7)\2\2\u0261\u0264\n\5\2\2\u0262\u0264\5\u00b3Z\2\u0263"+
		"\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268"+
		"\u0269\7)\2\2\u0269\u00bc\3\2\2\2\u026a\u026e\5\u00b5[\2\u026b\u026d\5"+
		"\u00b7\\\2\u026c\u026b\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2"+
		"\u026e\u026f\3\2\2\2\u026f\u00be\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272"+
		"\13\2\2\2\u0272\u00c0\3\2\2\2!\2\u0154\u0159\u015c\u015e\u0161\u0166\u016a"+
		"\u016d\u0170\u0175\u0178\u017a\u0185\u018a\u0191\u0193\u01a1\u01ac\u01d8"+
		"\u0223\u022d\u023b\u0244\u0249\u0254\u0258\u025c\u0263\u0265\u026e\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}