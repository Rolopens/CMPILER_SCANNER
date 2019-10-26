// Generated from D:/School/4th Year Term 1/Theory of Programming Languages/CMPILER_SCANNER/grammar\SHJava.g4 by ANTLR 4.7.2
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
		NULL_LITERAL=42, PRINTABLE_LITERALS=43, LPAREN=44, RPAREN=45, LBRACE=46, 
		RBRACE=47, LBRACK=48, RBRACK=49, SEMI=50, COMMA=51, DOT=52, ASSIGN=53, 
		GT=54, LT=55, BANG=56, TILDE=57, QUESTION=58, COLON=59, EQUAL=60, LE=61, 
		GE=62, NOTEQUAL=63, AND=64, OR=65, INC=66, DEC=67, ADD=68, SUB=69, MUL=70, 
		DIV=71, MOD=72, ADD_ASSIGN=73, SUB_ASSIGN=74, MUL_ASSIGN=75, DIV_ASSIGN=76, 
		TOKEN=77, AT=78, AMP=79, CARET=80, VBAR=81, WS=82, COMMENT=83, LINE_COMMENT=84, 
		IDENTIFIER=85, INVALIDCHAR_LITERAL=86, INVALIDIDENTIFIER=87, UnknownToken=88;
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
			"PRINTABLE_LITERALS", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
			"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "TOKEN", "AT", "AMP", "CARET", "VBAR", "WS", 
			"COMMENT", "LINE_COMMENT", "IDENTIFIER", "ExponentPart", "EscapeSequence", 
			"Digits", "LetterOrDigit", "Letter", "INVALIDCHAR_LITERAL", "INVALIDIDENTIFIER", 
			"UnknownToken"
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
			null, "'null'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
			"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", null, "'@'", "'&'", 
			"'^'", "'|'"
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
			"PRINTABLE_LITERALS", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
			"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "TOKEN", "AT", "AMP", "CARET", "VBAR", "WS", 
			"COMMENT", "LINE_COMMENT", "IDENTIFIER", "INVALIDCHAR_LITERAL", "INVALIDIDENTIFIER", 
			"UnknownToken"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Z\u024a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\3&\5&\u0151\n&\3&\6&\u0154\n&\r&\16&\u0155\3&\5&\u0159\n&\5&\u015b\n"+
		"&\3&\5&\u015e\n&\3\'\3\'\3\'\5\'\u0163\n\'\3\'\3\'\5\'\u0167\n\'\3\'\5"+
		"\'\u016a\n\'\3\'\5\'\u016d\n\'\3\'\3\'\3\'\5\'\u0172\n\'\3\'\5\'\u0175"+
		"\n\'\5\'\u0177\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0182\n(\3)\3)\3)\5)"+
		"\u0187\n)\3)\3)\3*\3*\3*\7*\u018e\n*\f*\16*\u0191\13*\3*\3*\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\5,\u019e\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3"+
		"B\3C\3C\3C\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\3K\3K\3K\3"+
		"L\3L\3L\3M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\6S\u01f9\nS\rS\16S\u01fa"+
		"\3S\3S\3T\3T\3T\3T\7T\u0203\nT\fT\16T\u0206\13T\3T\3T\3T\3T\3T\3U\3U\3"+
		"U\3U\7U\u0211\nU\fU\16U\u0214\13U\3U\3U\3V\3V\7V\u021a\nV\fV\16V\u021d"+
		"\13V\3W\3W\5W\u0221\nW\3W\3W\3X\3X\3X\3Y\3Y\7Y\u022a\nY\fY\16Y\u022d\13"+
		"Y\3Y\5Y\u0230\nY\3Z\3Z\5Z\u0234\nZ\3[\3[\3\\\3\\\3\\\7\\\u023b\n\\\f\\"+
		"\16\\\u023e\13\\\3\\\3\\\3]\3]\7]\u0244\n]\f]\16]\u0247\13]\3^\3^\3\u0204"+
		"\2_\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5"+
		"\2\u00b7X\u00b9Y\u00bbZ\3\2\17\3\2\63;\4\2KKNN\4\2HHhh\6\2\f\f\17\17)"+
		")^^\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\4\2--/"+
		"/\n\2$$))^^ddhhppttvv\3\2\62;\4\2\62;aa\6\2&&C\\aac|\2\u0262\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\3\u00bd"+
		"\3\2\2\2\5\u00c1\3\2\2\2\7\u00c5\3\2\2\2\t\u00c9\3\2\2\2\13\u00cd\3\2"+
		"\2\2\r\u00d1\3\2\2\2\17\u00d5\3\2\2\2\21\u00d9\3\2\2\2\23\u00dd\3\2\2"+
		"\2\25\u00e1\3\2\2\2\27\u00e5\3\2\2\2\31\u00e9\3\2\2\2\33\u00ed\3\2\2\2"+
		"\35\u00f1\3\2\2\2\37\u00f5\3\2\2\2!\u00f9\3\2\2\2#\u00fd\3\2\2\2%\u0101"+
		"\3\2\2\2\'\u0105\3\2\2\2)\u0109\3\2\2\2+\u010d\3\2\2\2-\u0111\3\2\2\2"+
		"/\u0115\3\2\2\2\61\u0119\3\2\2\2\63\u011d\3\2\2\2\65\u0121\3\2\2\2\67"+
		"\u0125\3\2\2\29\u0129\3\2\2\2;\u012d\3\2\2\2=\u0131\3\2\2\2?\u0135\3\2"+
		"\2\2A\u0139\3\2\2\2C\u013d\3\2\2\2E\u0141\3\2\2\2G\u0145\3\2\2\2I\u0149"+
		"\3\2\2\2K\u015a\3\2\2\2M\u0176\3\2\2\2O\u0181\3\2\2\2Q\u0183\3\2\2\2S"+
		"\u018a\3\2\2\2U\u0194\3\2\2\2W\u019d\3\2\2\2Y\u019f\3\2\2\2[\u01a1\3\2"+
		"\2\2]\u01a3\3\2\2\2_\u01a5\3\2\2\2a\u01a7\3\2\2\2c\u01a9\3\2\2\2e\u01ab"+
		"\3\2\2\2g\u01ad\3\2\2\2i\u01af\3\2\2\2k\u01b1\3\2\2\2m\u01b3\3\2\2\2o"+
		"\u01b5\3\2\2\2q\u01b7\3\2\2\2s\u01b9\3\2\2\2u\u01bb\3\2\2\2w\u01bd\3\2"+
		"\2\2y\u01bf\3\2\2\2{\u01c2\3\2\2\2}\u01c5\3\2\2\2\177\u01c8\3\2\2\2\u0081"+
		"\u01cb\3\2\2\2\u0083\u01ce\3\2\2\2\u0085\u01d1\3\2\2\2\u0087\u01d4\3\2"+
		"\2\2\u0089\u01d7\3\2\2\2\u008b\u01d9\3\2\2\2\u008d\u01db\3\2\2\2\u008f"+
		"\u01dd\3\2\2\2\u0091\u01df\3\2\2\2\u0093\u01e1\3\2\2\2\u0095\u01e4\3\2"+
		"\2\2\u0097\u01e7\3\2\2\2\u0099\u01ea\3\2\2\2\u009b\u01ed\3\2\2\2\u009d"+
		"\u01ef\3\2\2\2\u009f\u01f1\3\2\2\2\u00a1\u01f3\3\2\2\2\u00a3\u01f5\3\2"+
		"\2\2\u00a5\u01f8\3\2\2\2\u00a7\u01fe\3\2\2\2\u00a9\u020c\3\2\2\2\u00ab"+
		"\u0217\3\2\2\2\u00ad\u021e\3\2\2\2\u00af\u0224\3\2\2\2\u00b1\u0227\3\2"+
		"\2\2\u00b3\u0233\3\2\2\2\u00b5\u0235\3\2\2\2\u00b7\u0237\3\2\2\2\u00b9"+
		"\u0241\3\2\2\2\u00bb\u0248\3\2\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7d\2"+
		"\2\u00bf\u00c0\7u\2\2\u00c0\4\3\2\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7"+
		"u\2\2\u00c3\u00c4\7u\2\2\u00c4\6\3\2\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7"+
		"\7q\2\2\u00c7\u00c8\7q\2\2\u00c8\b\3\2\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb"+
		"\7t\2\2\u00cb\u00cc\7m\2\2\u00cc\n\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00d0\7u\2\2\u00d0\f\3\2\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3"+
		"\7j\2\2\u00d3\u00d4\7c\2\2\u00d4\16\3\2\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7"+
		"\7n\2\2\u00d7\u00d8\7c\2\2\u00d8\20\3\2\2\2\u00d9\u00da\7e\2\2\u00da\u00db"+
		"\7q\2\2\u00db\u00dc\7p\2\2\u00dc\22\3\2\2\2\u00dd\u00de\7f\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7h\2\2\u00e0\24\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3"+
		"\7f\2\2\u00e3\u00e4\7q\2\2\u00e4\26\3\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7"+
		"\7n\2\2\u00e7\u00e8\7u\2\2\u00e8\30\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7p\2\2\u00eb\u00ec\7w\2\2\u00ec\32\3\2\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef"+
		"\7z\2\2\u00ef\u00f0\7v\2\2\u00f0\34\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\36\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7"+
		"\7n\2\2\u00f7\u00f8\7q\2\2\u00f8 \3\2\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb"+
		"\7w\2\2\u00fb\u00fc\7t\2\2\u00fc\"\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff"+
		"\7k\2\2\u00ff\u0100\7h\2\2\u0100$\3\2\2\2\u0101\u0102\7k\2\2\u0102\u0103"+
		"\7o\2\2\u0103\u0104\7r\2\2\u0104&\3\2\2\2\u0105\u0106\7k\2\2\u0106\u0107"+
		"\7q\2\2\u0107\u0108\7h\2\2\u0108(\3\2\2\2\u0109\u010a\7f\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7e\2\2\u010c*\3\2\2\2\u010d\u010e\7k\2\2\u010e\u010f"+
		"\7h\2\2\u010f\u0110\7c\2\2\u0110,\3\2\2\2\u0111\u0112\7e\2\2\u0112\u0113"+
		"\7t\2\2\u0113\u0114\7g\2\2\u0114.\3\2\2\2\u0115\u0116\7p\2\2\u0116\u0117"+
		"\7w\2\2\u0117\u0118\7n\2\2\u0118\60\3\2\2\2\u0119\u011a\7r\2\2\u011a\u011b"+
		"\7t\2\2\u011b\u011c\7k\2\2\u011c\62\3\2\2\2\u011d\u011e\7q\2\2\u011e\u011f"+
		"\7w\2\2\u011f\u0120\7v\2\2\u0120\64\3\2\2\2\u0121\u0122\7r\2\2\u0122\u0123"+
		"\7t\2\2\u0123\u0124\7q\2\2\u0124\66\3\2\2\2\u0125\u0126\7r\2\2\u0126\u0127"+
		"\7w\2\2\u0127\u0128\7d\2\2\u01288\3\2\2\2\u0129\u012a\7t\2\2\u012a\u012b"+
		"\7g\2\2\u012b\u012c\7v\2\2\u012c:\3\2\2\2\u012d\u012e\7k\2\2\u012e\u012f"+
		"\7p\2\2\u012f\u0130\7r\2\2\u0130<\3\2\2\2\u0131\u0132\7u\2\2\u0132\u0133"+
		"\7v\2\2\u0133\u0134\7c\2\2\u0134>\3\2\2\2\u0135\u0136\7u\2\2\u0136\u0137"+
		"\7v\2\2\u0137\u0138\7t\2\2\u0138@\3\2\2\2\u0139\u013a\7u\2\2\u013a\u013b"+
		"\7w\2\2\u013b\u013c\7r\2\2\u013cB\3\2\2\2\u013d\u013e\7u\2\2\u013e\u013f"+
		"\7y\2\2\u013f\u0140\7k\2\2\u0140D\3\2\2\2\u0141\u0142\7v\2\2\u0142\u0143"+
		"\7j\2\2\u0143\u0144\7k\2\2\u0144F\3\2\2\2\u0145\u0146\7x\2\2\u0146\u0147"+
		"\7q\2\2\u0147\u0148\7k\2\2\u0148H\3\2\2\2\u0149\u014a\7y\2\2\u014a\u014b"+
		"\7j\2\2\u014b\u014c\7k\2\2\u014cJ\3\2\2\2\u014d\u015b\7\62\2\2\u014e\u0158"+
		"\t\2\2\2\u014f\u0151\5\u00b1Y\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2"+
		"\2\u0151\u0159\3\2\2\2\u0152\u0154\7a\2\2\u0153\u0152\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0159\5\u00b1Y\2\u0158\u0150\3\2\2\2\u0158\u0153\3\2\2\2\u0159\u015b"+
		"\3\2\2\2\u015a\u014d\3\2\2\2\u015a\u014e\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015e\t\3\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015eL\3\2\2\2"+
		"\u015f\u0160\5\u00b1Y\2\u0160\u0162\7\60\2\2\u0161\u0163\5\u00b1Y\2\u0162"+
		"\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0167\3\2\2\2\u0164\u0165\7\60"+
		"\2\2\u0165\u0167\5\u00b1Y\2\u0166\u015f\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u016a\5\u00adW\2\u0169\u0168\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u016d\t\4\2\2\u016c\u016b\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u0177\3\2\2\2\u016e\u0174\5\u00b1Y\2\u016f\u0171"+
		"\5\u00adW\2\u0170\u0172\t\4\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2"+
		"\2\u0172\u0175\3\2\2\2\u0173\u0175\t\4\2\2\u0174\u016f\3\2\2\2\u0174\u0173"+
		"\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0166\3\2\2\2\u0176\u016e\3\2\2\2\u0177"+
		"N\3\2\2\2\u0178\u0179\7v\2\2\u0179\u017a\7t\2\2\u017a\u017b\7w\2\2\u017b"+
		"\u0182\7g\2\2\u017c\u017d\7h\2\2\u017d\u017e\7c\2\2\u017e\u017f\7n\2\2"+
		"\u017f\u0180\7u\2\2\u0180\u0182\7g\2\2\u0181\u0178\3\2\2\2\u0181\u017c"+
		"\3\2\2\2\u0182P\3\2\2\2\u0183\u0186\7)\2\2\u0184\u0187\n\5\2\2\u0185\u0187"+
		"\5\u00afX\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2"+
		"\2\u0188\u0189\7)\2\2\u0189R\3\2\2\2\u018a\u018f\7$\2\2\u018b\u018e\n"+
		"\6\2\2\u018c\u018e\5\u00afX\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2"+
		"\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7$\2\2\u0193T\3\2\2\2\u0194\u0195"+
		"\7p\2\2\u0195\u0196\7w\2\2\u0196\u0197\7n\2\2\u0197\u0198\7n\2\2\u0198"+
		"V\3\2\2\2\u0199\u019e\5K&\2\u019a\u019e\5M\'\2\u019b\u019e\5Q)\2\u019c"+
		"\u019e\5S*\2\u019d\u0199\3\2\2\2\u019d\u019a\3\2\2\2\u019d\u019b\3\2\2"+
		"\2\u019d\u019c\3\2\2\2\u019eX\3\2\2\2\u019f\u01a0\7*\2\2\u01a0Z\3\2\2"+
		"\2\u01a1\u01a2\7+\2\2\u01a2\\\3\2\2\2\u01a3\u01a4\7}\2\2\u01a4^\3\2\2"+
		"\2\u01a5\u01a6\7\177\2\2\u01a6`\3\2\2\2\u01a7\u01a8\7]\2\2\u01a8b\3\2"+
		"\2\2\u01a9\u01aa\7_\2\2\u01aad\3\2\2\2\u01ab\u01ac\7=\2\2\u01acf\3\2\2"+
		"\2\u01ad\u01ae\7.\2\2\u01aeh\3\2\2\2\u01af\u01b0\7\60\2\2\u01b0j\3\2\2"+
		"\2\u01b1\u01b2\7?\2\2\u01b2l\3\2\2\2\u01b3\u01b4\7@\2\2\u01b4n\3\2\2\2"+
		"\u01b5\u01b6\7>\2\2\u01b6p\3\2\2\2\u01b7\u01b8\7#\2\2\u01b8r\3\2\2\2\u01b9"+
		"\u01ba\7\u0080\2\2\u01bat\3\2\2\2\u01bb\u01bc\7A\2\2\u01bcv\3\2\2\2\u01bd"+
		"\u01be\7<\2\2\u01bex\3\2\2\2\u01bf\u01c0\7?\2\2\u01c0\u01c1\7?\2\2\u01c1"+
		"z\3\2\2\2\u01c2\u01c3\7>\2\2\u01c3\u01c4\7?\2\2\u01c4|\3\2\2\2\u01c5\u01c6"+
		"\7@\2\2\u01c6\u01c7\7?\2\2\u01c7~\3\2\2\2\u01c8\u01c9\7#\2\2\u01c9\u01ca"+
		"\7?\2\2\u01ca\u0080\3\2\2\2\u01cb\u01cc\7(\2\2\u01cc\u01cd\7(\2\2\u01cd"+
		"\u0082\3\2\2\2\u01ce\u01cf\7~\2\2\u01cf\u01d0\7~\2\2\u01d0\u0084\3\2\2"+
		"\2\u01d1\u01d2\7-\2\2\u01d2\u01d3\7-\2\2\u01d3\u0086\3\2\2\2\u01d4\u01d5"+
		"\7/\2\2\u01d5\u01d6\7/\2\2\u01d6\u0088\3\2\2\2\u01d7\u01d8\7-\2\2\u01d8"+
		"\u008a\3\2\2\2\u01d9\u01da\7/\2\2\u01da\u008c\3\2\2\2\u01db\u01dc\7,\2"+
		"\2\u01dc\u008e\3\2\2\2\u01dd\u01de\7\61\2\2\u01de\u0090\3\2\2\2\u01df"+
		"\u01e0\7\'\2\2\u01e0\u0092\3\2\2\2\u01e1\u01e2\7-\2\2\u01e2\u01e3\7?\2"+
		"\2\u01e3\u0094\3\2\2\2\u01e4\u01e5\7/\2\2\u01e5\u01e6\7?\2\2\u01e6\u0096"+
		"\3\2\2\2\u01e7\u01e8\7,\2\2\u01e8\u01e9\7?\2\2\u01e9\u0098\3\2\2\2\u01ea"+
		"\u01eb\7\61\2\2\u01eb\u01ec\7?\2\2\u01ec\u009a\3\2\2\2\u01ed\u01ee\5\u009d"+
		"O\2\u01ee\u009c\3\2\2\2\u01ef\u01f0\7B\2\2\u01f0\u009e\3\2\2\2\u01f1\u01f2"+
		"\7(\2\2\u01f2\u00a0\3\2\2\2\u01f3\u01f4\7`\2\2\u01f4\u00a2\3\2\2\2\u01f5"+
		"\u01f6\7~\2\2\u01f6\u00a4\3\2\2\2\u01f7\u01f9\t\7\2\2\u01f8\u01f7\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\bS\2\2\u01fd\u00a6\3\2\2\2\u01fe\u01ff\7\61"+
		"\2\2\u01ff\u0200\7,\2\2\u0200\u0204\3\2\2\2\u0201\u0203\13\2\2\2\u0202"+
		"\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0205\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7,\2\2\u0208"+
		"\u0209\7\61\2\2\u0209\u020a\3\2\2\2\u020a\u020b\bT\2\2\u020b\u00a8\3\2"+
		"\2\2\u020c\u020d\7\61\2\2\u020d\u020e\7\61\2\2\u020e\u0212\3\2\2\2\u020f"+
		"\u0211\n\b\2\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u0216\bU\2\2\u0216\u00aa\3\2\2\2\u0217\u021b\5\u00b5[\2\u0218\u021a\5"+
		"\u00b3Z\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2"+
		"\u021b\u021c\3\2\2\2\u021c\u00ac\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0220"+
		"\t\t\2\2\u021f\u0221\t\n\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0223\5\u00b1Y\2\u0223\u00ae\3\2\2\2\u0224\u0225"+
		"\7^\2\2\u0225\u0226\t\13\2\2\u0226\u00b0\3\2\2\2\u0227\u022f\t\f\2\2\u0228"+
		"\u022a\t\r\2\2\u0229\u0228\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e"+
		"\u0230\t\f\2\2\u022f\u022b\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u00b2\3\2"+
		"\2\2\u0231\u0234\5\u00b5[\2\u0232\u0234\t\f\2\2\u0233\u0231\3\2\2\2\u0233"+
		"\u0232\3\2\2\2\u0234\u00b4\3\2\2\2\u0235\u0236\t\16\2\2\u0236\u00b6\3"+
		"\2\2\2\u0237\u023c\7)\2\2\u0238\u023b\n\5\2\2\u0239\u023b\5\u00afX\2\u023a"+
		"\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f"+
		"\u0240\7)\2\2\u0240\u00b8\3\2\2\2\u0241\u0245\5\u00b1Y\2\u0242\u0244\5"+
		"\u00b3Z\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2"+
		"\u0245\u0246\3\2\2\2\u0246\u00ba\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249"+
		"\13\2\2\2\u0249\u00bc\3\2\2\2\37\2\u0150\u0155\u0158\u015a\u015d\u0162"+
		"\u0166\u0169\u016c\u0171\u0174\u0176\u0181\u0186\u018d\u018f\u019d\u01fa"+
		"\u0204\u0212\u021b\u0220\u022b\u022f\u0233\u023a\u023c\u0245\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}