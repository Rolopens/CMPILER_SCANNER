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
		NULL_LITERAL=42, LPAREN=43, RPAREN=44, LBRACE=45, RBRACE=46, LBRACK=47, 
		RBRACK=48, SEMI=49, COMMA=50, DOT=51, ASSIGN=52, GT=53, LT=54, BANG=55, 
		TILDE=56, QUESTION=57, COLON=58, EQUAL=59, LE=60, GE=61, NOTEQUAL=62, 
		AND=63, OR=64, INC=65, DEC=66, ADD=67, SUB=68, MUL=69, DIV=70, MOD=71, 
		ADD_ASSIGN=72, SUB_ASSIGN=73, MUL_ASSIGN=74, DIV_ASSIGN=75, AND_ASSIGN=76, 
		OR_ASSIGN=77, XOR_ASSIGN=78, MOD_ASSIGN=79, LSHIFT_ASSIGN=80, RSHIFT_ASSIGN=81, 
		URSHIFT_ASSIGN=82, AT=83, AMP=84, CARET=85, VBAR=86, ARROW=87, COLONCOLON=88, 
		ELLIPSIS=89, WS=90, COMMENT=91, LINE_COMMENT=92, IDENTIFIER=93, INVALIDCHAR_LITERAL=94, 
		INVALIDIDENTIFIER=95, QUOTE=96, UnknownToken=97;
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
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "AT", "AMP", "CARET", "VBAR", "ARROW", 
			"COLONCOLON", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", 
			"ExponentPart", "EscapeSequence", "Digits", "LetterOrDigit", "Letter", 
			"INVALIDCHAR_LITERAL", "INVALIDIDENTIFIER", "QUOTE", "UnknownToken"
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
			null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
			"'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
			"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='", "'<<='", "'>>='", "'>>>='", "'@'", "'&'", "'^'", "'|'", "'->'", 
			"'::'", "'...'", null, null, null, null, null, null, "'\"'"
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
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "AT", "AMP", "CARET", "VBAR", "ARROW", 
			"COLONCOLON", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", 
			"INVALIDCHAR_LITERAL", "INVALIDIDENTIFIER", "QUOTE", "UnknownToken"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2c\u0279\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\5&\u0163\n"+
		"&\3&\6&\u0166\n&\r&\16&\u0167\3&\5&\u016b\n&\5&\u016d\n&\3&\5&\u0170\n"+
		"&\3\'\3\'\3\'\5\'\u0175\n\'\3\'\3\'\5\'\u0179\n\'\3\'\5\'\u017c\n\'\3"+
		"\'\5\'\u017f\n\'\3\'\3\'\3\'\5\'\u0184\n\'\3\'\5\'\u0187\n\'\5\'\u0189"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0194\n(\3)\3)\3)\5)\u0199\n)\3)\3"+
		")\3*\3*\3*\7*\u01a0\n*\f*\16*\u01a3\13*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3"+
		">\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3"+
		"O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3U\3U\3"+
		"V\3V\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3[\6[\u0226\n[\r[\16[\u0227\3"+
		"[\3[\3\\\3\\\3\\\3\\\7\\\u0230\n\\\f\\\16\\\u0233\13\\\3\\\3\\\3\\\3\\"+
		"\3\\\3]\3]\3]\3]\7]\u023e\n]\f]\16]\u0241\13]\3]\3]\3^\3^\7^\u0247\n^"+
		"\f^\16^\u024a\13^\3_\3_\5_\u024e\n_\3_\3_\3`\3`\3`\3a\3a\7a\u0257\na\f"+
		"a\16a\u025a\13a\3a\5a\u025d\na\3b\3b\5b\u0261\nb\3c\3c\3d\3d\3d\7d\u0268"+
		"\nd\fd\16d\u026b\13d\3d\3d\3e\3e\7e\u0271\ne\fe\16e\u0274\13e\3f\3f\3"+
		"g\3g\3\u0231\2h\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd\2\u00bf\2\u00c1\2\u00c3\2"+
		"\u00c5\2\u00c7`\u00c9a\u00cbb\u00cdc\3\2\17\3\2\63;\4\2KKNN\4\2HHhh\6"+
		"\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4"+
		"\2GGgg\4\2--//\n\2$$))^^ddhhppttvv\3\2\62;\4\2\62;aa\6\2&&C\\aac|\2\u028e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2"+
		"\2\3\u00cf\3\2\2\2\5\u00d3\3\2\2\2\7\u00d7\3\2\2\2\t\u00db\3\2\2\2\13"+
		"\u00df\3\2\2\2\r\u00e3\3\2\2\2\17\u00e7\3\2\2\2\21\u00eb\3\2\2\2\23\u00ef"+
		"\3\2\2\2\25\u00f3\3\2\2\2\27\u00f7\3\2\2\2\31\u00fb\3\2\2\2\33\u00ff\3"+
		"\2\2\2\35\u0103\3\2\2\2\37\u0107\3\2\2\2!\u010b\3\2\2\2#\u010f\3\2\2\2"+
		"%\u0113\3\2\2\2\'\u0117\3\2\2\2)\u011b\3\2\2\2+\u011f\3\2\2\2-\u0123\3"+
		"\2\2\2/\u0127\3\2\2\2\61\u012b\3\2\2\2\63\u012f\3\2\2\2\65\u0133\3\2\2"+
		"\2\67\u0137\3\2\2\29\u013b\3\2\2\2;\u013f\3\2\2\2=\u0143\3\2\2\2?\u0147"+
		"\3\2\2\2A\u014b\3\2\2\2C\u014f\3\2\2\2E\u0153\3\2\2\2G\u0157\3\2\2\2I"+
		"\u015b\3\2\2\2K\u016c\3\2\2\2M\u0188\3\2\2\2O\u0193\3\2\2\2Q\u0195\3\2"+
		"\2\2S\u019c\3\2\2\2U\u01a6\3\2\2\2W\u01ab\3\2\2\2Y\u01ad\3\2\2\2[\u01af"+
		"\3\2\2\2]\u01b1\3\2\2\2_\u01b3\3\2\2\2a\u01b5\3\2\2\2c\u01b7\3\2\2\2e"+
		"\u01b9\3\2\2\2g\u01bb\3\2\2\2i\u01bd\3\2\2\2k\u01bf\3\2\2\2m\u01c1\3\2"+
		"\2\2o\u01c3\3\2\2\2q\u01c5\3\2\2\2s\u01c7\3\2\2\2u\u01c9\3\2\2\2w\u01cb"+
		"\3\2\2\2y\u01ce\3\2\2\2{\u01d1\3\2\2\2}\u01d4\3\2\2\2\177\u01d7\3\2\2"+
		"\2\u0081\u01da\3\2\2\2\u0083\u01dd\3\2\2\2\u0085\u01e0\3\2\2\2\u0087\u01e3"+
		"\3\2\2\2\u0089\u01e5\3\2\2\2\u008b\u01e7\3\2\2\2\u008d\u01e9\3\2\2\2\u008f"+
		"\u01eb\3\2\2\2\u0091\u01ed\3\2\2\2\u0093\u01f0\3\2\2\2\u0095\u01f3\3\2"+
		"\2\2\u0097\u01f6\3\2\2\2\u0099\u01f9\3\2\2\2\u009b\u01fc\3\2\2\2\u009d"+
		"\u01ff\3\2\2\2\u009f\u0202\3\2\2\2\u00a1\u0205\3\2\2\2\u00a3\u0209\3\2"+
		"\2\2\u00a5\u020d\3\2\2\2\u00a7\u0212\3\2\2\2\u00a9\u0214\3\2\2\2\u00ab"+
		"\u0216\3\2\2\2\u00ad\u0218\3\2\2\2\u00af\u021a\3\2\2\2\u00b1\u021d\3\2"+
		"\2\2\u00b3\u0220\3\2\2\2\u00b5\u0225\3\2\2\2\u00b7\u022b\3\2\2\2\u00b9"+
		"\u0239\3\2\2\2\u00bb\u0244\3\2\2\2\u00bd\u024b\3\2\2\2\u00bf\u0251\3\2"+
		"\2\2\u00c1\u0254\3\2\2\2\u00c3\u0260\3\2\2\2\u00c5\u0262\3\2\2\2\u00c7"+
		"\u0264\3\2\2\2\u00c9\u026e\3\2\2\2\u00cb\u0275\3\2\2\2\u00cd\u0277\3\2"+
		"\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7u\2\2\u00d2\4"+
		"\3\2\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7u\2\2\u00d6"+
		"\6\3\2\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7q\2\2\u00da"+
		"\b\3\2\2\2\u00db\u00dc\7d\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7m\2\2\u00de"+
		"\n\3\2\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\f\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6\7c\2\2\u00e6"+
		"\16\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7c\2\2\u00ea"+
		"\20\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7p\2\2\u00ee"+
		"\22\3\2\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7h\2\2\u00f2"+
		"\24\3\2\2\2\u00f3\u00f4\7f\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6\7q\2\2\u00f6"+
		"\26\3\2\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7u\2\2\u00fa"+
		"\30\3\2\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7w\2\2\u00fe"+
		"\32\3\2\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7z\2\2\u0101\u0102\7v\2\2\u0102"+
		"\34\3\2\2\2\u0103\u0104\7h\2\2\u0104\u0105\7k\2\2\u0105\u0106\7p\2\2\u0106"+
		"\36\3\2\2\2\u0107\u0108\7h\2\2\u0108\u0109\7n\2\2\u0109\u010a\7q\2\2\u010a"+
		" \3\2\2\2\u010b\u010c\7f\2\2\u010c\u010d\7w\2\2\u010d\u010e\7t\2\2\u010e"+
		"\"\3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111\7k\2\2\u0111\u0112\7h\2\2\u0112"+
		"$\3\2\2\2\u0113\u0114\7k\2\2\u0114\u0115\7o\2\2\u0115\u0116\7r\2\2\u0116"+
		"&\3\2\2\2\u0117\u0118\7k\2\2\u0118\u0119\7q\2\2\u0119\u011a\7h\2\2\u011a"+
		"(\3\2\2\2\u011b\u011c\7f\2\2\u011c\u011d\7g\2\2\u011d\u011e\7e\2\2\u011e"+
		"*\3\2\2\2\u011f\u0120\7k\2\2\u0120\u0121\7h\2\2\u0121\u0122\7c\2\2\u0122"+
		",\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125\7t\2\2\u0125\u0126\7g\2\2\u0126"+
		".\3\2\2\2\u0127\u0128\7p\2\2\u0128\u0129\7w\2\2\u0129\u012a\7n\2\2\u012a"+
		"\60\3\2\2\2\u012b\u012c\7r\2\2\u012c\u012d\7t\2\2\u012d\u012e\7k\2\2\u012e"+
		"\62\3\2\2\2\u012f\u0130\7q\2\2\u0130\u0131\7w\2\2\u0131\u0132\7v\2\2\u0132"+
		"\64\3\2\2\2\u0133\u0134\7r\2\2\u0134\u0135\7t\2\2\u0135\u0136\7q\2\2\u0136"+
		"\66\3\2\2\2\u0137\u0138\7r\2\2\u0138\u0139\7w\2\2\u0139\u013a\7d\2\2\u013a"+
		"8\3\2\2\2\u013b\u013c\7t\2\2\u013c\u013d\7g\2\2\u013d\u013e\7v\2\2\u013e"+
		":\3\2\2\2\u013f\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142\7r\2\2\u0142"+
		"<\3\2\2\2\u0143\u0144\7u\2\2\u0144\u0145\7v\2\2\u0145\u0146\7c\2\2\u0146"+
		">\3\2\2\2\u0147\u0148\7u\2\2\u0148\u0149\7v\2\2\u0149\u014a\7t\2\2\u014a"+
		"@\3\2\2\2\u014b\u014c\7u\2\2\u014c\u014d\7w\2\2\u014d\u014e\7r\2\2\u014e"+
		"B\3\2\2\2\u014f\u0150\7u\2\2\u0150\u0151\7y\2\2\u0151\u0152\7k\2\2\u0152"+
		"D\3\2\2\2\u0153\u0154\7v\2\2\u0154\u0155\7j\2\2\u0155\u0156\7k\2\2\u0156"+
		"F\3\2\2\2\u0157\u0158\7x\2\2\u0158\u0159\7q\2\2\u0159\u015a\7k\2\2\u015a"+
		"H\3\2\2\2\u015b\u015c\7y\2\2\u015c\u015d\7j\2\2\u015d\u015e\7k\2\2\u015e"+
		"J\3\2\2\2\u015f\u016d\7\62\2\2\u0160\u016a\t\2\2\2\u0161\u0163\5\u00c1"+
		"a\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u016b\3\2\2\2\u0164"+
		"\u0166\7a\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\5\u00c1a\2\u016a"+
		"\u0162\3\2\2\2\u016a\u0165\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u015f\3\2"+
		"\2\2\u016c\u0160\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0170\t\3\2\2\u016f"+
		"\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170L\3\2\2\2\u0171\u0172\5\u00c1"+
		"a\2\u0172\u0174\7\60\2\2\u0173\u0175\5\u00c1a\2\u0174\u0173\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0179\3\2\2\2\u0176\u0177\7\60\2\2\u0177\u0179\5"+
		"\u00c1a\2\u0178\u0171\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\3\2\2\2"+
		"\u017a\u017c\5\u00bd_\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u017f\t\4\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0189\3\2\2\2\u0180\u0186\5\u00c1a\2\u0181\u0183\5\u00bd_\2"+
		"\u0182\u0184\t\4\2\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0187"+
		"\3\2\2\2\u0185\u0187\t\4\2\2\u0186\u0181\3\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u0189\3\2\2\2\u0188\u0178\3\2\2\2\u0188\u0180\3\2\2\2\u0189N\3\2\2\2"+
		"\u018a\u018b\7v\2\2\u018b\u018c\7t\2\2\u018c\u018d\7w\2\2\u018d\u0194"+
		"\7g\2\2\u018e\u018f\7h\2\2\u018f\u0190\7c\2\2\u0190\u0191\7n\2\2\u0191"+
		"\u0192\7u\2\2\u0192\u0194\7g\2\2\u0193\u018a\3\2\2\2\u0193\u018e\3\2\2"+
		"\2\u0194P\3\2\2\2\u0195\u0198\7)\2\2\u0196\u0199\n\5\2\2\u0197\u0199\5"+
		"\u00bf`\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2"+
		"\u019a\u019b\7)\2\2\u019bR\3\2\2\2\u019c\u01a1\7$\2\2\u019d\u01a0\n\6"+
		"\2\2\u019e\u01a0\5\u00bf`\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7$\2\2\u01a5T\3\2\2\2\u01a6\u01a7"+
		"\7p\2\2\u01a7\u01a8\7w\2\2\u01a8\u01a9\7n\2\2\u01a9\u01aa\7n\2\2\u01aa"+
		"V\3\2\2\2\u01ab\u01ac\7*\2\2\u01acX\3\2\2\2\u01ad\u01ae\7+\2\2\u01aeZ"+
		"\3\2\2\2\u01af\u01b0\7}\2\2\u01b0\\\3\2\2\2\u01b1\u01b2\7\177\2\2\u01b2"+
		"^\3\2\2\2\u01b3\u01b4\7]\2\2\u01b4`\3\2\2\2\u01b5\u01b6\7_\2\2\u01b6b"+
		"\3\2\2\2\u01b7\u01b8\7=\2\2\u01b8d\3\2\2\2\u01b9\u01ba\7.\2\2\u01baf\3"+
		"\2\2\2\u01bb\u01bc\7\60\2\2\u01bch\3\2\2\2\u01bd\u01be\7?\2\2\u01bej\3"+
		"\2\2\2\u01bf\u01c0\7@\2\2\u01c0l\3\2\2\2\u01c1\u01c2\7>\2\2\u01c2n\3\2"+
		"\2\2\u01c3\u01c4\7#\2\2\u01c4p\3\2\2\2\u01c5\u01c6\7\u0080\2\2\u01c6r"+
		"\3\2\2\2\u01c7\u01c8\7A\2\2\u01c8t\3\2\2\2\u01c9\u01ca\7<\2\2\u01cav\3"+
		"\2\2\2\u01cb\u01cc\7?\2\2\u01cc\u01cd\7?\2\2\u01cdx\3\2\2\2\u01ce\u01cf"+
		"\7>\2\2\u01cf\u01d0\7?\2\2\u01d0z\3\2\2\2\u01d1\u01d2\7@\2\2\u01d2\u01d3"+
		"\7?\2\2\u01d3|\3\2\2\2\u01d4\u01d5\7#\2\2\u01d5\u01d6\7?\2\2\u01d6~\3"+
		"\2\2\2\u01d7\u01d8\7(\2\2\u01d8\u01d9\7(\2\2\u01d9\u0080\3\2\2\2\u01da"+
		"\u01db\7~\2\2\u01db\u01dc\7~\2\2\u01dc\u0082\3\2\2\2\u01dd\u01de\7-\2"+
		"\2\u01de\u01df\7-\2\2\u01df\u0084\3\2\2\2\u01e0\u01e1\7/\2\2\u01e1\u01e2"+
		"\7/\2\2\u01e2\u0086\3\2\2\2\u01e3\u01e4\7-\2\2\u01e4\u0088\3\2\2\2\u01e5"+
		"\u01e6\7/\2\2\u01e6\u008a\3\2\2\2\u01e7\u01e8\7,\2\2\u01e8\u008c\3\2\2"+
		"\2\u01e9\u01ea\7\61\2\2\u01ea\u008e\3\2\2\2\u01eb\u01ec\7\'\2\2\u01ec"+
		"\u0090\3\2\2\2\u01ed\u01ee\7-\2\2\u01ee\u01ef\7?\2\2\u01ef\u0092\3\2\2"+
		"\2\u01f0\u01f1\7/\2\2\u01f1\u01f2\7?\2\2\u01f2\u0094\3\2\2\2\u01f3\u01f4"+
		"\7,\2\2\u01f4\u01f5\7?\2\2\u01f5\u0096\3\2\2\2\u01f6\u01f7\7\61\2\2\u01f7"+
		"\u01f8\7?\2\2\u01f8\u0098\3\2\2\2\u01f9\u01fa\7(\2\2\u01fa\u01fb\7?\2"+
		"\2\u01fb\u009a\3\2\2\2\u01fc\u01fd\7~\2\2\u01fd\u01fe\7?\2\2\u01fe\u009c"+
		"\3\2\2\2\u01ff\u0200\7`\2\2\u0200\u0201\7?\2\2\u0201\u009e\3\2\2\2\u0202"+
		"\u0203\7\'\2\2\u0203\u0204\7?\2\2\u0204\u00a0\3\2\2\2\u0205\u0206\7>\2"+
		"\2\u0206\u0207\7>\2\2\u0207\u0208\7?\2\2\u0208\u00a2\3\2\2\2\u0209\u020a"+
		"\7@\2\2\u020a\u020b\7@\2\2\u020b\u020c\7?\2\2\u020c\u00a4\3\2\2\2\u020d"+
		"\u020e\7@\2\2\u020e\u020f\7@\2\2\u020f\u0210\7@\2\2\u0210\u0211\7?\2\2"+
		"\u0211\u00a6\3\2\2\2\u0212\u0213\7B\2\2\u0213\u00a8\3\2\2\2\u0214\u0215"+
		"\7(\2\2\u0215\u00aa\3\2\2\2\u0216\u0217\7`\2\2\u0217\u00ac\3\2\2\2\u0218"+
		"\u0219\7~\2\2\u0219\u00ae\3\2\2\2\u021a\u021b\7/\2\2\u021b\u021c\7@\2"+
		"\2\u021c\u00b0\3\2\2\2\u021d\u021e\7<\2\2\u021e\u021f\7<\2\2\u021f\u00b2"+
		"\3\2\2\2\u0220\u0221\7\60\2\2\u0221\u0222\7\60\2\2\u0222\u0223\7\60\2"+
		"\2\u0223\u00b4\3\2\2\2\u0224\u0226\t\7\2\2\u0225\u0224\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022a\b[\2\2\u022a\u00b6\3\2\2\2\u022b\u022c\7\61\2\2\u022c\u022d\7,"+
		"\2\2\u022d\u0231\3\2\2\2\u022e\u0230\13\2\2\2\u022f\u022e\3\2\2\2\u0230"+
		"\u0233\3\2\2\2\u0231\u0232\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0234\3\2"+
		"\2\2\u0233\u0231\3\2\2\2\u0234\u0235\7,\2\2\u0235\u0236\7\61\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0238\b\\\2\2\u0238\u00b8\3\2\2\2\u0239\u023a\7\61"+
		"\2\2\u023a\u023b\7\61\2\2\u023b\u023f\3\2\2\2\u023c\u023e\n\b\2\2\u023d"+
		"\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\b]\2\2\u0243"+
		"\u00ba\3\2\2\2\u0244\u0248\5\u00c5c\2\u0245\u0247\5\u00c3b\2\u0246\u0245"+
		"\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u00bc\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024d\t\t\2\2\u024c\u024e\t\n"+
		"\2\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0250\5\u00c1a\2\u0250\u00be\3\2\2\2\u0251\u0252\7^\2\2\u0252\u0253\t"+
		"\13\2\2\u0253\u00c0\3\2\2\2\u0254\u025c\t\f\2\2\u0255\u0257\t\r\2\2\u0256"+
		"\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259\u025b\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025d\t\f\2\2\u025c"+
		"\u0258\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u00c2\3\2\2\2\u025e\u0261\5\u00c5"+
		"c\2\u025f\u0261\t\f\2\2\u0260\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261"+
		"\u00c4\3\2\2\2\u0262\u0263\t\16\2\2\u0263\u00c6\3\2\2\2\u0264\u0269\7"+
		")\2\2\u0265\u0268\n\5\2\2\u0266\u0268\5\u00bf`\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2"+
		"\2\2\u026a\u026c\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026d\7)\2\2\u026d"+
		"\u00c8\3\2\2\2\u026e\u0272\5\u00c1a\2\u026f\u0271\5\u00c3b\2\u0270\u026f"+
		"\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u00ca\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0276\7$\2\2\u0276\u00cc\3\2"+
		"\2\2\u0277\u0278\13\2\2\2\u0278\u00ce\3\2\2\2\36\2\u0162\u0167\u016a\u016c"+
		"\u016f\u0174\u0178\u017b\u017e\u0183\u0186\u0188\u0193\u0198\u019f\u01a1"+
		"\u0227\u0231\u023f\u0248\u024d\u0258\u025c\u0260\u0267\u0269\u0272\3\2"+
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