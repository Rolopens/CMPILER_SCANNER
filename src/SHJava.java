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
		KEYWORD=1, ABSTRACT=2, ASSERT=3, BOOLEAN=4, BREAK=5, CASE=6, CHAR=7, CLASS=8, 
		CONST=9, DEFAULT=10, DO=11, ELSE=12, ENUM=13, EXTENDS=14, FINAL=15, FLOAT=16, 
		FOR=17, IF=18, IMPLEMENTS=19, INSTANCEOF=20, INT=21, INTERFACE=22, NEW=23, 
		NULL=24, PRIVATE=25, PRINT=26, PROTECTED=27, PUBLIC=28, RETURN=29, SCAN=30, 
		STATIC=31, STRING=32, SUPER=33, SWITCH=34, THIS=35, VOID=36, WHILE=37, 
		DECIMAL_LITERAL=38, FLOAT_LITERAL=39, BOOL_LITERAL=40, CHAR_LITERAL=41, 
		STRING_LITERAL=42, NULL_LITERAL=43, PRINTABLE_LITERALS=44, SEPARATOR=45, 
		LPAREN=46, RPAREN=47, LBRACE=48, RBRACE=49, LBRACK=50, RBRACK=51, SEMI=52, 
		COMMA=53, DOT=54, OPERATORS=55, ASSIGN=56, GT=57, LT=58, BANG=59, TILDE=60, 
		QUESTION=61, COLON=62, EQUAL=63, LE=64, GE=65, NOTEQUAL=66, AND=67, OR=68, 
		INC=69, DEC=70, ADD=71, SUB=72, MUL=73, DIV=74, MOD=75, ADD_ASSIGN=76, 
		SUB_ASSIGN=77, MUL_ASSIGN=78, DIV_ASSIGN=79, TOKEN=80, AT=81, WS=82, COMMENT=83, 
		LINE_COMMENT=84, IDENTIFIER=85;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KEYWORD", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "CASE", "CHAR", 
			"CLASS", "CONST", "DEFAULT", "DO", "ELSE", "ENUM", "EXTENDS", "FINAL", 
			"FLOAT", "FOR", "IF", "IMPLEMENTS", "INSTANCEOF", "INT", "INTERFACE", 
			"NEW", "NULL", "PRIVATE", "PRINT", "PROTECTED", "PUBLIC", "RETURN", "SCAN", 
			"STATIC", "STRING", "SUPER", "SWITCH", "THIS", "VOID", "WHILE", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
			"PRINTABLE_LITERALS", "SEPARATOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "OPERATORS", "ASSIGN", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "TOKEN", "AT", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER", "ExponentPart", "EscapeSequence", "Digits", 
			"LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'abs'", "'ass'", "'boo'", "'brk'", "'cas'", "'cha'", "'cla'", 
			"'con'", "'def'", "'ddo'", "'els'", "'enu'", "'ext'", "'fin'", "'flo'", 
			"'dur'", "'iif'", "'imp'", "'iof'", "'dec'", "'ifa'", "'cre'", "'nul'", 
			"'pri'", "'out'", "'pro'", "'pub'", "'ret'", "'inp'", "'sta'", "'str'", 
			"'sup'", "'swi'", "'thi'", "'voi'", "'whi'", null, null, null, null, 
			null, "'null'", null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", null, "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", null, 
			"'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "CASE", "CHAR", 
			"CLASS", "CONST", "DEFAULT", "DO", "ELSE", "ENUM", "EXTENDS", "FINAL", 
			"FLOAT", "FOR", "IF", "IMPLEMENTS", "INSTANCEOF", "INT", "INTERFACE", 
			"NEW", "NULL", "PRIVATE", "PRINT", "PROTECTED", "PUBLIC", "RETURN", "SCAN", 
			"STATIC", "STRING", "SUPER", "SWITCH", "THIS", "VOID", "WHILE", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", 
			"PRINTABLE_LITERALS", "SEPARATOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "OPERATORS", "ASSIGN", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "TOKEN", "AT", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2W\u0276\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00dc\n\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\5\'\u0171\n\'\3\'\6\'\u0174\n\'\r\'\16\'\u0175\3\'\5\'\u0179\n\'\5\'"+
		"\u017b\n\'\3\'\5\'\u017e\n\'\3(\3(\3(\5(\u0183\n(\3(\3(\5(\u0187\n(\3"+
		"(\5(\u018a\n(\3(\5(\u018d\n(\3(\3(\3(\5(\u0192\n(\3(\5(\u0195\n(\5(\u0197"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01a2\n)\3*\3*\3*\5*\u01a7\n*\3*\3*"+
		"\3+\3+\3+\7+\u01ae\n+\f+\16+\u01b1\13+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\5-\u01be\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01c9\n.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\58\u01f5\n8\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3A\3"+
		"A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3I\3"+
		"I\3J\3J\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3R\3R\3"+
		"S\6S\u0238\nS\rS\16S\u0239\3S\3S\3T\3T\3T\3T\7T\u0242\nT\fT\16T\u0245"+
		"\13T\3T\3T\3T\3T\3T\3U\3U\3U\3U\7U\u0250\nU\fU\16U\u0253\13U\3U\3U\3V"+
		"\3V\7V\u0259\nV\fV\16V\u025c\13V\3W\3W\5W\u0260\nW\3W\3W\3X\3X\3X\3Y\3"+
		"Y\7Y\u0269\nY\fY\16Y\u026c\13Y\3Y\5Y\u026f\nY\3Z\3Z\5Z\u0273\nZ\3[\3["+
		"\3\u0243\2\\\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad\2\u00af\2\u00b1"+
		"\2\u00b3\2\u00b5\2\3\2\17\3\2\63;\4\2KKNN\4\2HHhh\6\2\f\f\17\17))^^\6"+
		"\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\4\2--//\n\2"+
		"$$))^^ddhhppttvv\3\2\62;\4\2\62;aa\6\2&&C\\aac|\2\u02cd\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\3\u00db\3\2\2\2\5\u00dd\3\2\2\2\7\u00e1\3\2\2\2\t\u00e5"+
		"\3\2\2\2\13\u00e9\3\2\2\2\r\u00ed\3\2\2\2\17\u00f1\3\2\2\2\21\u00f5\3"+
		"\2\2\2\23\u00f9\3\2\2\2\25\u00fd\3\2\2\2\27\u0101\3\2\2\2\31\u0105\3\2"+
		"\2\2\33\u0109\3\2\2\2\35\u010d\3\2\2\2\37\u0111\3\2\2\2!\u0115\3\2\2\2"+
		"#\u0119\3\2\2\2%\u011d\3\2\2\2\'\u0121\3\2\2\2)\u0125\3\2\2\2+\u0129\3"+
		"\2\2\2-\u012d\3\2\2\2/\u0131\3\2\2\2\61\u0135\3\2\2\2\63\u0139\3\2\2\2"+
		"\65\u013d\3\2\2\2\67\u0141\3\2\2\29\u0145\3\2\2\2;\u0149\3\2\2\2=\u014d"+
		"\3\2\2\2?\u0151\3\2\2\2A\u0155\3\2\2\2C\u0159\3\2\2\2E\u015d\3\2\2\2G"+
		"\u0161\3\2\2\2I\u0165\3\2\2\2K\u0169\3\2\2\2M\u017a\3\2\2\2O\u0196\3\2"+
		"\2\2Q\u01a1\3\2\2\2S\u01a3\3\2\2\2U\u01aa\3\2\2\2W\u01b4\3\2\2\2Y\u01bd"+
		"\3\2\2\2[\u01c8\3\2\2\2]\u01ca\3\2\2\2_\u01cc\3\2\2\2a\u01ce\3\2\2\2c"+
		"\u01d0\3\2\2\2e\u01d2\3\2\2\2g\u01d4\3\2\2\2i\u01d6\3\2\2\2k\u01d8\3\2"+
		"\2\2m\u01da\3\2\2\2o\u01f4\3\2\2\2q\u01f6\3\2\2\2s\u01f8\3\2\2\2u\u01fa"+
		"\3\2\2\2w\u01fc\3\2\2\2y\u01fe\3\2\2\2{\u0200\3\2\2\2}\u0202\3\2\2\2\177"+
		"\u0204\3\2\2\2\u0081\u0207\3\2\2\2\u0083\u020a\3\2\2\2\u0085\u020d\3\2"+
		"\2\2\u0087\u0210\3\2\2\2\u0089\u0213\3\2\2\2\u008b\u0216\3\2\2\2\u008d"+
		"\u0219\3\2\2\2\u008f\u021c\3\2\2\2\u0091\u021e\3\2\2\2\u0093\u0220\3\2"+
		"\2\2\u0095\u0222\3\2\2\2\u0097\u0224\3\2\2\2\u0099\u0226\3\2\2\2\u009b"+
		"\u0229\3\2\2\2\u009d\u022c\3\2\2\2\u009f\u022f\3\2\2\2\u00a1\u0232\3\2"+
		"\2\2\u00a3\u0234\3\2\2\2\u00a5\u0237\3\2\2\2\u00a7\u023d\3\2\2\2\u00a9"+
		"\u024b\3\2\2\2\u00ab\u0256\3\2\2\2\u00ad\u025d\3\2\2\2\u00af\u0263\3\2"+
		"\2\2\u00b1\u0266\3\2\2\2\u00b3\u0272\3\2\2\2\u00b5\u0274\3\2\2\2\u00b7"+
		"\u00dc\5\5\3\2\u00b8\u00dc\5\7\4\2\u00b9\u00dc\5\t\5\2\u00ba\u00dc\5\13"+
		"\6\2\u00bb\u00dc\5\r\7\2\u00bc\u00dc\5\17\b\2\u00bd\u00dc\5\21\t\2\u00be"+
		"\u00dc\5\23\n\2\u00bf\u00dc\5\25\13\2\u00c0\u00dc\5\27\f\2\u00c1\u00dc"+
		"\5\31\r\2\u00c2\u00dc\5\33\16\2\u00c3\u00dc\5\35\17\2\u00c4\u00dc\5\37"+
		"\20\2\u00c5\u00dc\5!\21\2\u00c6\u00dc\5#\22\2\u00c7\u00dc\5%\23\2\u00c8"+
		"\u00dc\5\'\24\2\u00c9\u00dc\5)\25\2\u00ca\u00dc\5+\26\2\u00cb\u00dc\5"+
		"-\27\2\u00cc\u00dc\5/\30\2\u00cd\u00dc\5\61\31\2\u00ce\u00dc\5\63\32\2"+
		"\u00cf\u00dc\5\65\33\2\u00d0\u00dc\5\67\34\2\u00d1\u00dc\59\35\2\u00d2"+
		"\u00dc\5;\36\2\u00d3\u00dc\5=\37\2\u00d4\u00dc\5? \2\u00d5\u00dc\5A!\2"+
		"\u00d6\u00dc\5C\"\2\u00d7\u00dc\5E#\2\u00d8\u00dc\5G$\2\u00d9\u00dc\5"+
		"I%\2\u00da\u00dc\5K&\2\u00db\u00b7\3\2\2\2\u00db\u00b8\3\2\2\2\u00db\u00b9"+
		"\3\2\2\2\u00db\u00ba\3\2\2\2\u00db\u00bb\3\2\2\2\u00db\u00bc\3\2\2\2\u00db"+
		"\u00bd\3\2\2\2\u00db\u00be\3\2\2\2\u00db\u00bf\3\2\2\2\u00db\u00c0\3\2"+
		"\2\2\u00db\u00c1\3\2\2\2\u00db\u00c2\3\2\2\2\u00db\u00c3\3\2\2\2\u00db"+
		"\u00c4\3\2\2\2\u00db\u00c5\3\2\2\2\u00db\u00c6\3\2\2\2\u00db\u00c7\3\2"+
		"\2\2\u00db\u00c8\3\2\2\2\u00db\u00c9\3\2\2\2\u00db\u00ca\3\2\2\2\u00db"+
		"\u00cb\3\2\2\2\u00db\u00cc\3\2\2\2\u00db\u00cd\3\2\2\2\u00db\u00ce\3\2"+
		"\2\2\u00db\u00cf\3\2\2\2\u00db\u00d0\3\2\2\2\u00db\u00d1\3\2\2\2\u00db"+
		"\u00d2\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2\2\2\u00db\u00d5\3\2"+
		"\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\4\3\2\2\2\u00dd\u00de\7c\2\2"+
		"\u00de\u00df\7d\2\2\u00df\u00e0\7u\2\2\u00e0\6\3\2\2\2\u00e1\u00e2\7c"+
		"\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7u\2\2\u00e4\b\3\2\2\2\u00e5\u00e6"+
		"\7d\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7q\2\2\u00e8\n\3\2\2\2\u00e9\u00ea"+
		"\7d\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7m\2\2\u00ec\f\3\2\2\2\u00ed\u00ee"+
		"\7e\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7u\2\2\u00f0\16\3\2\2\2\u00f1\u00f2"+
		"\7e\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4\7c\2\2\u00f4\20\3\2\2\2\u00f5\u00f6"+
		"\7e\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7c\2\2\u00f8\22\3\2\2\2\u00f9\u00fa"+
		"\7e\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7p\2\2\u00fc\24\3\2\2\2\u00fd\u00fe"+
		"\7f\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7h\2\2\u0100\26\3\2\2\2\u0101\u0102"+
		"\7f\2\2\u0102\u0103\7f\2\2\u0103\u0104\7q\2\2\u0104\30\3\2\2\2\u0105\u0106"+
		"\7g\2\2\u0106\u0107\7n\2\2\u0107\u0108\7u\2\2\u0108\32\3\2\2\2\u0109\u010a"+
		"\7g\2\2\u010a\u010b\7p\2\2\u010b\u010c\7w\2\2\u010c\34\3\2\2\2\u010d\u010e"+
		"\7g\2\2\u010e\u010f\7z\2\2\u010f\u0110\7v\2\2\u0110\36\3\2\2\2\u0111\u0112"+
		"\7h\2\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114 \3\2\2\2\u0115\u0116"+
		"\7h\2\2\u0116\u0117\7n\2\2\u0117\u0118\7q\2\2\u0118\"\3\2\2\2\u0119\u011a"+
		"\7f\2\2\u011a\u011b\7w\2\2\u011b\u011c\7t\2\2\u011c$\3\2\2\2\u011d\u011e"+
		"\7k\2\2\u011e\u011f\7k\2\2\u011f\u0120\7h\2\2\u0120&\3\2\2\2\u0121\u0122"+
		"\7k\2\2\u0122\u0123\7o\2\2\u0123\u0124\7r\2\2\u0124(\3\2\2\2\u0125\u0126"+
		"\7k\2\2\u0126\u0127\7q\2\2\u0127\u0128\7h\2\2\u0128*\3\2\2\2\u0129\u012a"+
		"\7f\2\2\u012a\u012b\7g\2\2\u012b\u012c\7e\2\2\u012c,\3\2\2\2\u012d\u012e"+
		"\7k\2\2\u012e\u012f\7h\2\2\u012f\u0130\7c\2\2\u0130.\3\2\2\2\u0131\u0132"+
		"\7e\2\2\u0132\u0133\7t\2\2\u0133\u0134\7g\2\2\u0134\60\3\2\2\2\u0135\u0136"+
		"\7p\2\2\u0136\u0137\7w\2\2\u0137\u0138\7n\2\2\u0138\62\3\2\2\2\u0139\u013a"+
		"\7r\2\2\u013a\u013b\7t\2\2\u013b\u013c\7k\2\2\u013c\64\3\2\2\2\u013d\u013e"+
		"\7q\2\2\u013e\u013f\7w\2\2\u013f\u0140\7v\2\2\u0140\66\3\2\2\2\u0141\u0142"+
		"\7r\2\2\u0142\u0143\7t\2\2\u0143\u0144\7q\2\2\u01448\3\2\2\2\u0145\u0146"+
		"\7r\2\2\u0146\u0147\7w\2\2\u0147\u0148\7d\2\2\u0148:\3\2\2\2\u0149\u014a"+
		"\7t\2\2\u014a\u014b\7g\2\2\u014b\u014c\7v\2\2\u014c<\3\2\2\2\u014d\u014e"+
		"\7k\2\2\u014e\u014f\7p\2\2\u014f\u0150\7r\2\2\u0150>\3\2\2\2\u0151\u0152"+
		"\7u\2\2\u0152\u0153\7v\2\2\u0153\u0154\7c\2\2\u0154@\3\2\2\2\u0155\u0156"+
		"\7u\2\2\u0156\u0157\7v\2\2\u0157\u0158\7t\2\2\u0158B\3\2\2\2\u0159\u015a"+
		"\7u\2\2\u015a\u015b\7w\2\2\u015b\u015c\7r\2\2\u015cD\3\2\2\2\u015d\u015e"+
		"\7u\2\2\u015e\u015f\7y\2\2\u015f\u0160\7k\2\2\u0160F\3\2\2\2\u0161\u0162"+
		"\7v\2\2\u0162\u0163\7j\2\2\u0163\u0164\7k\2\2\u0164H\3\2\2\2\u0165\u0166"+
		"\7x\2\2\u0166\u0167\7q\2\2\u0167\u0168\7k\2\2\u0168J\3\2\2\2\u0169\u016a"+
		"\7y\2\2\u016a\u016b\7j\2\2\u016b\u016c\7k\2\2\u016cL\3\2\2\2\u016d\u017b"+
		"\7\62\2\2\u016e\u0178\t\2\2\2\u016f\u0171\5\u00b1Y\2\u0170\u016f\3\2\2"+
		"\2\u0170\u0171\3\2\2\2\u0171\u0179\3\2\2\2\u0172\u0174\7a\2\2\u0173\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0179\5\u00b1Y\2\u0178\u0170\3\2\2\2\u0178\u0173"+
		"\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u016d\3\2\2\2\u017a\u016e\3\2\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u017e\t\3\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017eN\3\2\2\2\u017f\u0180\5\u00b1Y\2\u0180\u0182\7\60\2\2\u0181"+
		"\u0183\5\u00b1Y\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0187"+
		"\3\2\2\2\u0184\u0185\7\60\2\2\u0185\u0187\5\u00b1Y\2\u0186\u017f\3\2\2"+
		"\2\u0186\u0184\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u018a\5\u00adW\2\u0189"+
		"\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u018d\t\4"+
		"\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0197\3\2\2\2\u018e"+
		"\u0194\5\u00b1Y\2\u018f\u0191\5\u00adW\2\u0190\u0192\t\4\2\2\u0191\u0190"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0195\t\4\2\2\u0194"+
		"\u018f\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0186\3\2"+
		"\2\2\u0196\u018e\3\2\2\2\u0197P\3\2\2\2\u0198\u0199\7v\2\2\u0199\u019a"+
		"\7t\2\2\u019a\u019b\7w\2\2\u019b\u01a2\7g\2\2\u019c\u019d\7h\2\2\u019d"+
		"\u019e\7c\2\2\u019e\u019f\7n\2\2\u019f\u01a0\7u\2\2\u01a0\u01a2\7g\2\2"+
		"\u01a1\u0198\3\2\2\2\u01a1\u019c\3\2\2\2\u01a2R\3\2\2\2\u01a3\u01a6\7"+
		")\2\2\u01a4\u01a7\n\5\2\2\u01a5\u01a7\5\u00afX\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7)\2\2\u01a9T\3\2\2\2\u01aa"+
		"\u01af\7$\2\2\u01ab\u01ae\n\6\2\2\u01ac\u01ae\5\u00afX\2\u01ad\u01ab\3"+
		"\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7$"+
		"\2\2\u01b3V\3\2\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7w\2\2\u01b6\u01b7"+
		"\7n\2\2\u01b7\u01b8\7n\2\2\u01b8X\3\2\2\2\u01b9\u01be\5M\'\2\u01ba\u01be"+
		"\5O(\2\u01bb\u01be\5S*\2\u01bc\u01be\5U+\2\u01bd\u01b9\3\2\2\2\u01bd\u01ba"+
		"\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01beZ\3\2\2\2\u01bf"+
		"\u01c9\5]/\2\u01c0\u01c9\5_\60\2\u01c1\u01c9\5a\61\2\u01c2\u01c9\5c\62"+
		"\2\u01c3\u01c9\5e\63\2\u01c4\u01c9\5g\64\2\u01c5\u01c9\5i\65\2\u01c6\u01c9"+
		"\5k\66\2\u01c7\u01c9\5m\67\2\u01c8\u01bf\3\2\2\2\u01c8\u01c0\3\2\2\2\u01c8"+
		"\u01c1\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c8\u01c4\3\2"+
		"\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\\\3\2\2\2\u01ca\u01cb\7*\2\2\u01cb^\3\2\2\2\u01cc\u01cd\7+\2\2\u01cd"+
		"`\3\2\2\2\u01ce\u01cf\7}\2\2\u01cfb\3\2\2\2\u01d0\u01d1\7\177\2\2\u01d1"+
		"d\3\2\2\2\u01d2\u01d3\7]\2\2\u01d3f\3\2\2\2\u01d4\u01d5\7_\2\2\u01d5h"+
		"\3\2\2\2\u01d6\u01d7\7=\2\2\u01d7j\3\2\2\2\u01d8\u01d9\7.\2\2\u01d9l\3"+
		"\2\2\2\u01da\u01db\7\60\2\2\u01dbn\3\2\2\2\u01dc\u01f5\5q9\2\u01dd\u01f5"+
		"\5s:\2\u01de\u01f5\5u;\2\u01df\u01f5\5w<\2\u01e0\u01f5\5y=\2\u01e1\u01f5"+
		"\5{>\2\u01e2\u01f5\5}?\2\u01e3\u01f5\5\177@\2\u01e4\u01f5\5\u0081A\2\u01e5"+
		"\u01f5\5\u0083B\2\u01e6\u01f5\5\u0085C\2\u01e7\u01f5\5\u0087D\2\u01e8"+
		"\u01f5\5\u0089E\2\u01e9\u01f5\5\u008bF\2\u01ea\u01f5\5\u008dG\2\u01eb"+
		"\u01f5\5\u008fH\2\u01ec\u01f5\5\u0091I\2\u01ed\u01f5\5\u0093J\2\u01ee"+
		"\u01f5\5\u0095K\2\u01ef\u01f5\5\u0097L\2\u01f0\u01f5\5\u0099M\2\u01f1"+
		"\u01f5\5\u009bN\2\u01f2\u01f5\5\u009dO\2\u01f3\u01f5\5\u009fP\2\u01f4"+
		"\u01dc\3\2\2\2\u01f4\u01dd\3\2\2\2\u01f4\u01de\3\2\2\2\u01f4\u01df\3\2"+
		"\2\2\u01f4\u01e0\3\2\2\2\u01f4\u01e1\3\2\2\2\u01f4\u01e2\3\2\2\2\u01f4"+
		"\u01e3\3\2\2\2\u01f4\u01e4\3\2\2\2\u01f4\u01e5\3\2\2\2\u01f4\u01e6\3\2"+
		"\2\2\u01f4\u01e7\3\2\2\2\u01f4\u01e8\3\2\2\2\u01f4\u01e9\3\2\2\2\u01f4"+
		"\u01ea\3\2\2\2\u01f4\u01eb\3\2\2\2\u01f4\u01ec\3\2\2\2\u01f4\u01ed\3\2"+
		"\2\2\u01f4\u01ee\3\2\2\2\u01f4\u01ef\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f4"+
		"\u01f1\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5p\3\2\2\2"+
		"\u01f6\u01f7\7?\2\2\u01f7r\3\2\2\2\u01f8\u01f9\7@\2\2\u01f9t\3\2\2\2\u01fa"+
		"\u01fb\7>\2\2\u01fbv\3\2\2\2\u01fc\u01fd\7#\2\2\u01fdx\3\2\2\2\u01fe\u01ff"+
		"\7\u0080\2\2\u01ffz\3\2\2\2\u0200\u0201\7A\2\2\u0201|\3\2\2\2\u0202\u0203"+
		"\7<\2\2\u0203~\3\2\2\2\u0204\u0205\7?\2\2\u0205\u0206\7?\2\2\u0206\u0080"+
		"\3\2\2\2\u0207\u0208\7>\2\2\u0208\u0209\7?\2\2\u0209\u0082\3\2\2\2\u020a"+
		"\u020b\7@\2\2\u020b\u020c\7?\2\2\u020c\u0084\3\2\2\2\u020d\u020e\7#\2"+
		"\2\u020e\u020f\7?\2\2\u020f\u0086\3\2\2\2\u0210\u0211\7(\2\2\u0211\u0212"+
		"\7(\2\2\u0212\u0088\3\2\2\2\u0213\u0214\7~\2\2\u0214\u0215\7~\2\2\u0215"+
		"\u008a\3\2\2\2\u0216\u0217\7-\2\2\u0217\u0218\7-\2\2\u0218\u008c\3\2\2"+
		"\2\u0219\u021a\7/\2\2\u021a\u021b\7/\2\2\u021b\u008e\3\2\2\2\u021c\u021d"+
		"\7-\2\2\u021d\u0090\3\2\2\2\u021e\u021f\7/\2\2\u021f\u0092\3\2\2\2\u0220"+
		"\u0221\7,\2\2\u0221\u0094\3\2\2\2\u0222\u0223\7\61\2\2\u0223\u0096\3\2"+
		"\2\2\u0224\u0225\7\'\2\2\u0225\u0098\3\2\2\2\u0226\u0227\7-\2\2\u0227"+
		"\u0228\7?\2\2\u0228\u009a\3\2\2\2\u0229\u022a\7/\2\2\u022a\u022b\7?\2"+
		"\2\u022b\u009c\3\2\2\2\u022c\u022d\7,\2\2\u022d\u022e\7?\2\2\u022e\u009e"+
		"\3\2\2\2\u022f\u0230\7\61\2\2\u0230\u0231\7?\2\2\u0231\u00a0\3\2\2\2\u0232"+
		"\u0233\5\u00a3R\2\u0233\u00a2\3\2\2\2\u0234\u0235\7B\2\2\u0235\u00a4\3"+
		"\2\2\2\u0236\u0238\t\7\2\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\bS"+
		"\2\2\u023c\u00a6\3\2\2\2\u023d\u023e\7\61\2\2\u023e\u023f\7,\2\2\u023f"+
		"\u0243\3\2\2\2\u0240\u0242\13\2\2\2\u0241\u0240\3\2\2\2\u0242\u0245\3"+
		"\2\2\2\u0243\u0244\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0246\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0247\7,\2\2\u0247\u0248\7\61\2\2\u0248\u0249\3\2"+
		"\2\2\u0249\u024a\bT\2\2\u024a\u00a8\3\2\2\2\u024b\u024c\7\61\2\2\u024c"+
		"\u024d\7\61\2\2\u024d\u0251\3\2\2\2\u024e\u0250\n\b\2\2\u024f\u024e\3"+
		"\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0255\bU\2\2\u0255\u00aa\3\2"+
		"\2\2\u0256\u025a\5\u00b5[\2\u0257\u0259\5\u00b3Z\2\u0258\u0257\3\2\2\2"+
		"\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u00ac"+
		"\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025f\t\t\2\2\u025e\u0260\t\n\2\2\u025f"+
		"\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\5\u00b1"+
		"Y\2\u0262\u00ae\3\2\2\2\u0263\u0264\7^\2\2\u0264\u0265\t\13\2\2\u0265"+
		"\u00b0\3\2\2\2\u0266\u026e\t\f\2\2\u0267\u0269\t\r\2\2\u0268\u0267\3\2"+
		"\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026f\t\f\2\2\u026e\u026a\3\2"+
		"\2\2\u026e\u026f\3\2\2\2\u026f\u00b2\3\2\2\2\u0270\u0273\5\u00b5[\2\u0271"+
		"\u0273\t\f\2\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273\u00b4\3\2"+
		"\2\2\u0274\u0275\t\16\2\2\u0275\u00b6\3\2\2\2\37\2\u00db\u0170\u0175\u0178"+
		"\u017a\u017d\u0182\u0186\u0189\u018c\u0191\u0194\u0196\u01a1\u01a6\u01ad"+
		"\u01af\u01bd\u01c8\u01f4\u0239\u0243\u0251\u025a\u025f\u026a\u026e\u0272"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}