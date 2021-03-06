// Generated from E:/STM32_projects/Stm32DSL/src/main/resources\Stm32DSL.g4 by ANTLR 4.9.1
package io.github.therealmone.stm32.dsl.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Stm32DSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SCRIPT_KW=2, LFB=3, RFB=4, LB=5, RB=6, LED_ON_KW=7, LED_OFF_KW=8, 
		BLINK_KW=9, DELAY_KW=10, IS_LOUD_KW=11, PRINT_KW=12, WHILE_KW=13, DEL=14, 
		FOR_KW=15, IF_KW=16, ELSE_KW=17, RELATIONAL_OP=18, EQUALITY_OP=19, LOGICAL_OR_OP=20, 
		LOGICAL_AND_OP=21, TIME_UNIT=22, VAR_KW=23, VAR=24, INCREMENT=25, DECREMENT=26, 
		OP=27, NUMBER=28, CHAR_LITERAL=29, STRING_LITERAL=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "SCRIPT_KW", "LFB", "RFB", "LB", "RB", "LED_ON_KW", "LED_OFF_KW", 
			"BLINK_KW", "DELAY_KW", "IS_LOUD_KW", "PRINT_KW", "WHILE_KW", "DEL", 
			"FOR_KW", "IF_KW", "ELSE_KW", "RELATIONAL_OP", "EQUALITY_OP", "LOGICAL_OR_OP", 
			"LOGICAL_AND_OP", "TIME_UNIT", "VAR_KW", "VAR", "INCREMENT", "DECREMENT", 
			"OP", "NUMBER", "CHAR_LITERAL", "STRING_LITERAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'script'", "'{'", "'}'", "'('", "')'", "'ledon'", "'ledoff'", 
			"'blink'", "'delay'", "'isloud'", "'print'", "'while'", "';'", "'for'", 
			"'if'", "'else'", null, null, "'||'", "'&&'", null, "'var'", null, "'++'", 
			"'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SCRIPT_KW", "LFB", "RFB", "LB", "RB", "LED_ON_KW", "LED_OFF_KW", 
			"BLINK_KW", "DELAY_KW", "IS_LOUD_KW", "PRINT_KW", "WHILE_KW", "DEL", 
			"FOR_KW", "IF_KW", "ELSE_KW", "RELATIONAL_OP", "EQUALITY_OP", "LOGICAL_OR_OP", 
			"LOGICAL_AND_OP", "TIME_UNIT", "VAR_KW", "VAR", "INCREMENT", "DECREMENT", 
			"OP", "NUMBER", "CHAR_LITERAL", "STRING_LITERAL", "WS"
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


	public Stm32DSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stm32DSL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\5\24\u0093\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27"+
		"\u009e\n\27\3\30\3\30\3\30\3\30\3\31\6\31\u00a5\n\31\r\31\16\31\u00a6"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u00b3\n\35\3\35"+
		"\3\35\7\35\u00b7\n\35\f\35\16\35\u00ba\13\35\5\35\u00bc\n\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\6\37\u00c4\n\37\r\37\16\37\u00c5\3\37\3\37\3 \6 "+
		"\u00cb\n \r \16 \u00cc\3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\13\4\2>>@@\5\2jjoouu\4\2C\\c"+
		"|\6\2\'\',-//\61\61\3\2\63;\3\2\62;\3\2))\3\2$$\5\2\13\f\17\17\"\"\2\u00d7"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7J\3\2\2\2\tL\3\2\2"+
		"\2\13N\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21X\3\2\2\2\23_\3\2\2\2\25e\3\2"+
		"\2\2\27k\3\2\2\2\31r\3\2\2\2\33x\3\2\2\2\35~\3\2\2\2\37\u0080\3\2\2\2"+
		"!\u0084\3\2\2\2#\u0087\3\2\2\2%\u008c\3\2\2\2\'\u0092\3\2\2\2)\u0094\3"+
		"\2\2\2+\u0097\3\2\2\2-\u009d\3\2\2\2/\u009f\3\2\2\2\61\u00a4\3\2\2\2\63"+
		"\u00a8\3\2\2\2\65\u00ab\3\2\2\2\67\u00ae\3\2\2\29\u00bb\3\2\2\2;\u00bd"+
		"\3\2\2\2=\u00c1\3\2\2\2?\u00ca\3\2\2\2AB\7?\2\2B\4\3\2\2\2CD\7u\2\2DE"+
		"\7e\2\2EF\7t\2\2FG\7k\2\2GH\7r\2\2HI\7v\2\2I\6\3\2\2\2JK\7}\2\2K\b\3\2"+
		"\2\2LM\7\177\2\2M\n\3\2\2\2NO\7*\2\2O\f\3\2\2\2PQ\7+\2\2Q\16\3\2\2\2R"+
		"S\7n\2\2ST\7g\2\2TU\7f\2\2UV\7q\2\2VW\7p\2\2W\20\3\2\2\2XY\7n\2\2YZ\7"+
		"g\2\2Z[\7f\2\2[\\\7q\2\2\\]\7h\2\2]^\7h\2\2^\22\3\2\2\2_`\7d\2\2`a\7n"+
		"\2\2ab\7k\2\2bc\7p\2\2cd\7m\2\2d\24\3\2\2\2ef\7f\2\2fg\7g\2\2gh\7n\2\2"+
		"hi\7c\2\2ij\7{\2\2j\26\3\2\2\2kl\7k\2\2lm\7u\2\2mn\7n\2\2no\7q\2\2op\7"+
		"w\2\2pq\7f\2\2q\30\3\2\2\2rs\7r\2\2st\7t\2\2tu\7k\2\2uv\7p\2\2vw\7v\2"+
		"\2w\32\3\2\2\2xy\7y\2\2yz\7j\2\2z{\7k\2\2{|\7n\2\2|}\7g\2\2}\34\3\2\2"+
		"\2~\177\7=\2\2\177\36\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7q\2\2\u0082"+
		"\u0083\7t\2\2\u0083 \3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7h\2\2\u0086"+
		"\"\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a"+
		"\u008b\7g\2\2\u008b$\3\2\2\2\u008c\u008d\t\2\2\2\u008d&\3\2\2\2\u008e"+
		"\u008f\7?\2\2\u008f\u0093\7?\2\2\u0090\u0091\7#\2\2\u0091\u0093\7?\2\2"+
		"\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0093(\3\2\2\2\u0094\u0095\7"+
		"~\2\2\u0095\u0096\7~\2\2\u0096*\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099"+
		"\7(\2\2\u0099,\3\2\2\2\u009a\u009b\7o\2\2\u009b\u009e\7u\2\2\u009c\u009e"+
		"\t\3\2\2\u009d\u009a\3\2\2\2\u009d\u009c\3\2\2\2\u009e.\3\2\2\2\u009f"+
		"\u00a0\7x\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7t\2\2\u00a2\60\3\2\2\2\u00a3"+
		"\u00a5\t\4\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\u00aa"+
		"\7-\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ad\7/\2\2\u00ad\66"+
		"\3\2\2\2\u00ae\u00af\t\5\2\2\u00af8\3\2\2\2\u00b0\u00bc\7\62\2\2\u00b1"+
		"\u00b3\7/\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b8\t\6\2\2\u00b5\u00b7\t\7\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b0\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bc"+
		":\3\2\2\2\u00bd\u00be\7)\2\2\u00be\u00bf\n\b\2\2\u00bf\u00c0\7)\2\2\u00c0"+
		"<\3\2\2\2\u00c1\u00c3\7$\2\2\u00c2\u00c4\n\t\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\7$\2\2\u00c8>\3\2\2\2\u00c9\u00cb\t\n\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\b \2\2\u00cf@\3\2\2\2\13\2\u0092\u009d\u00a6"+
		"\u00b2\u00b8\u00bb\u00c5\u00cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}