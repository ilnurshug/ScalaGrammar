// Generated from /home/user/Documents/antlr example/jetbrains-plugin-sample-master/src/grammars/org/antlr/jetbrains/sample/parser/SampleLanguage.g4 by ANTLR 4.5.3
package org.antlr.jetbrains.sample.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SampleLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, COLON=3, COMMA=4, LBRACK=5, RBRACK=6, LBRACE=7, RBRACE=8, 
		EQUAL=9, SUB=10, BANG=11, MUL=12, DIV=13, ADD=14, LT=15, LE=16, EQUAL_EQUAL=17, 
		NOT_EQUAL=18, GT=19, GE=20, OR=21, AND=22, DOT=23, IF=24, ELSE=25, WHILE=26, 
		VAR=27, RETURN=28, PRINT=29, FUNC=30, TYPEINT=31, TYPEFLOAT=32, TYPESTRING=33, 
		TYPEBOOLEAN=34, TRUE=35, FALSE=36, LINE_COMMENT=37, COMMENT=38, ID=39, 
		INT=40, FLOAT=41, STRING=42, WS=43, ERRCHAR=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LPAREN", "RPAREN", "COLON", "COMMA", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
		"EQUAL", "SUB", "BANG", "MUL", "DIV", "ADD", "LT", "LE", "EQUAL_EQUAL", 
		"NOT_EQUAL", "GT", "GE", "OR", "AND", "DOT", "IF", "ELSE", "WHILE", "VAR", 
		"RETURN", "PRINT", "FUNC", "TYPEINT", "TYPEFLOAT", "TYPESTRING", "TYPEBOOLEAN", 
		"TRUE", "FALSE", "LINE_COMMENT", "COMMENT", "ID", "INT", "FLOAT", "EXP", 
		"STRING", "ESC", "WS", "ERRCHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "','", "'['", "']'", "'{'", "'}'", "'='", "'-'", 
		"'!'", "'*'", "'/'", "'+'", "'<'", "'<='", "'=='", "'!='", "'>'", "'>='", 
		"'||'", "'&&'", "' . '", "'if'", "'else'", "'while'", "'var'", "'return'", 
		"'print'", "'func'", "'int'", "'float'", "'string'", "'boolean'", "'true'", 
		"'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAREN", "RPAREN", "COLON", "COMMA", "LBRACK", "RBRACK", "LBRACE", 
		"RBRACE", "EQUAL", "SUB", "BANG", "MUL", "DIV", "ADD", "LT", "LE", "EQUAL_EQUAL", 
		"NOT_EQUAL", "GT", "GE", "OR", "AND", "DOT", "IF", "ELSE", "WHILE", "VAR", 
		"RETURN", "PRINT", "FUNC", "TYPEINT", "TYPEFLOAT", "TYPESTRING", "TYPEBOOLEAN", 
		"TRUE", "FALSE", "LINE_COMMENT", "COMMENT", "ID", "INT", "FLOAT", "STRING", 
		"WS", "ERRCHAR"
	};
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


	public SampleLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SampleLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0134\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\7&\u00e2\n&\f&\16&\u00e5\13&\3&\5&\u00e8\n&\3&\3&\3"+
		"\'\3\'\3\'\3\'\7\'\u00f0\n\'\f\'\16\'\u00f3\13\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\7(\u00fc\n(\f(\16(\u00ff\13(\3)\6)\u0102\n)\r)\16)\u0103\3*\5*\u0107"+
		"\n*\3*\3*\3*\3*\5*\u010d\n*\3*\5*\u0110\n*\3*\3*\3*\5*\u0115\n*\3+\3+"+
		"\5+\u0119\n+\3+\3+\3,\3,\3,\7,\u0120\n,\f,\16,\u0123\13,\3,\3,\3-\3-\3"+
		"-\3.\6.\u012b\n.\r.\16.\u012c\3.\3.\3/\3/\3/\3/\4\u00e3\u00f1\2\60\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U\2W,Y\2[-].\3\2\13\3\3\f\f\5\2C\\aac|\6\2\62;C"+
		"\\aac|\3\2\62;\4\2GGgg\4\2--//\4\2$$^^\b\2\n\n$$hhppttvv\5\2\13\f\17\17"+
		"\"\"\u013d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2"+
		"\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23o\3\2"+
		"\2\2\25q\3\2\2\2\27s\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2\35y\3\2\2\2\37{\3"+
		"\2\2\2!}\3\2\2\2#\u0080\3\2\2\2%\u0083\3\2\2\2\'\u0086\3\2\2\2)\u0088"+
		"\3\2\2\2+\u008b\3\2\2\2-\u008e\3\2\2\2/\u0091\3\2\2\2\61\u0095\3\2\2\2"+
		"\63\u0098\3\2\2\2\65\u009d\3\2\2\2\67\u00a3\3\2\2\29\u00a7\3\2\2\2;\u00ae"+
		"\3\2\2\2=\u00b4\3\2\2\2?\u00b9\3\2\2\2A\u00bd\3\2\2\2C\u00c3\3\2\2\2E"+
		"\u00ca\3\2\2\2G\u00d2\3\2\2\2I\u00d7\3\2\2\2K\u00dd\3\2\2\2M\u00eb\3\2"+
		"\2\2O\u00f9\3\2\2\2Q\u0101\3\2\2\2S\u0114\3\2\2\2U\u0116\3\2\2\2W\u011c"+
		"\3\2\2\2Y\u0126\3\2\2\2[\u012a\3\2\2\2]\u0130\3\2\2\2_`\7*\2\2`\4\3\2"+
		"\2\2ab\7+\2\2b\6\3\2\2\2cd\7<\2\2d\b\3\2\2\2ef\7.\2\2f\n\3\2\2\2gh\7]"+
		"\2\2h\f\3\2\2\2ij\7_\2\2j\16\3\2\2\2kl\7}\2\2l\20\3\2\2\2mn\7\177\2\2"+
		"n\22\3\2\2\2op\7?\2\2p\24\3\2\2\2qr\7/\2\2r\26\3\2\2\2st\7#\2\2t\30\3"+
		"\2\2\2uv\7,\2\2v\32\3\2\2\2wx\7\61\2\2x\34\3\2\2\2yz\7-\2\2z\36\3\2\2"+
		"\2{|\7>\2\2| \3\2\2\2}~\7>\2\2~\177\7?\2\2\177\"\3\2\2\2\u0080\u0081\7"+
		"?\2\2\u0081\u0082\7?\2\2\u0082$\3\2\2\2\u0083\u0084\7#\2\2\u0084\u0085"+
		"\7?\2\2\u0085&\3\2\2\2\u0086\u0087\7@\2\2\u0087(\3\2\2\2\u0088\u0089\7"+
		"@\2\2\u0089\u008a\7?\2\2\u008a*\3\2\2\2\u008b\u008c\7~\2\2\u008c\u008d"+
		"\7~\2\2\u008d,\3\2\2\2\u008e\u008f\7(\2\2\u008f\u0090\7(\2\2\u0090.\3"+
		"\2\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7\60\2\2\u0093\u0094\7\"\2\2\u0094"+
		"\60\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7h\2\2\u0097\62\3\2\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2"+
		"\u009c\64\3\2\2\2\u009d\u009e\7y\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7"+
		"k\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\66\3\2\2\2\u00a3\u00a4"+
		"\7x\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7t\2\2\u00a68\3\2\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7w\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\u00ad\7p\2\2\u00ad:\3\2\2\2\u00ae\u00af\7r\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2"+
		"\u00b3<\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7p\2"+
		"\2\u00b7\u00b8\7e\2\2\u00b8>\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7"+
		"p\2\2\u00bb\u00bc\7v\2\2\u00bc@\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf"+
		"\7n\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7v\2\2\u00c2"+
		"B\3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7i\2\2\u00c9D\3\2\2\2\u00ca"+
		"\u00cb\7d\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7n\2\2"+
		"\u00ce\u00cf\7g\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7p\2\2\u00d1F\3\2\2"+
		"\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6H\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da"+
		"\7n\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7g\2\2\u00dcJ\3\2\2\2\u00dd\u00de"+
		"\7\61\2\2\u00de\u00df\7\61\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\13\2\2"+
		"\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\t\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b&\2\2\u00eaL\3\2\2\2\u00eb"+
		"\u00ec\7\61\2\2\u00ec\u00ed\7,\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00f0\13"+
		"\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7,"+
		"\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b\'\2\2\u00f8"+
		"N\3\2\2\2\u00f9\u00fd\t\3\2\2\u00fa\u00fc\t\4\2\2\u00fb\u00fa\3\2\2\2"+
		"\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00feP\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\t\5\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104R\3\2\2\2"+
		"\u0105\u0107\7/\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\5Q)\2\u0109\u010a\7\60\2\2\u010a\u010c\5Q)\2\u010b"+
		"\u010d\5U+\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0115\3\2\2"+
		"\2\u010e\u0110\7/\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\5Q)\2\u0112\u0113\5U+\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0106\3\2\2\2\u0114\u010f\3\2\2\2\u0115T\3\2\2\2\u0116\u0118\t\6\2\2"+
		"\u0117\u0119\t\7\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\5Q)\2\u011bV\3\2\2\2\u011c\u0121\7$\2\2\u011d\u0120"+
		"\5Y-\2\u011e\u0120\n\b\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7$\2\2\u0125X\3\2\2\2\u0126\u0127"+
		"\7^\2\2\u0127\u0128\t\t\2\2\u0128Z\3\2\2\2\u0129\u012b\t\n\2\2\u012a\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\b.\2\2\u012f\\\3\2\2\2\u0130\u0131\13\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132\u0133\b/\2\2\u0133^\3\2\2\2\20\2\u00e3\u00e7"+
		"\u00f1\u00fd\u0103\u0106\u010c\u010f\u0114\u0118\u011f\u0121\u012c\3\2"+
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