// Generated from E:/STM32_projects/Stm32DSL/src/main/resources\Stm32DSL.g4 by ANTLR 4.9.1
package io.github.therealmone.stm32.dsl.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Stm32DSLParser extends Parser {
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
	public static final int
		RULE_script = 0, RULE_expression = 1, RULE_ledOnExpression = 2, RULE_ledOffExpression = 3, 
		RULE_delayExpression = 4, RULE_blinkExpression = 5, RULE_timeExpression = 6, 
		RULE_whileExpression = 7, RULE_forExpression = 8, RULE_varExpression = 9, 
		RULE_assignExpression = 10, RULE_printExpression = 11, RULE_ifExpression = 12, 
		RULE_conditionalExpression = 13, RULE_logicalOrExpression = 14, RULE_logicalAndExpression = 15, 
		RULE_equalityExpression = 16, RULE_relationalExpression = 17, RULE_valueExpression = 18, 
		RULE_valueExpressionWithBrackets = 19, RULE_value = 20, RULE_isLoudExpression = 21, 
		RULE_block = 22, RULE_unaryExpression = 23, RULE_postfixExpression = 24, 
		RULE_prefixExpression = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "expression", "ledOnExpression", "ledOffExpression", "delayExpression", 
			"blinkExpression", "timeExpression", "whileExpression", "forExpression", 
			"varExpression", "assignExpression", "printExpression", "ifExpression", 
			"conditionalExpression", "logicalOrExpression", "logicalAndExpression", 
			"equalityExpression", "relationalExpression", "valueExpression", "valueExpressionWithBrackets", 
			"value", "isLoudExpression", "block", "unaryExpression", "postfixExpression", 
			"prefixExpression"
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

	@Override
	public String getGrammarFileName() { return "Stm32DSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Stm32DSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_KW() { return getToken(Stm32DSLParser.SCRIPT_KW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(SCRIPT_KW);
			setState(53);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BlinkExpressionContext blinkExpression() {
			return getRuleContext(BlinkExpressionContext.class,0);
		}
		public LedOnExpressionContext ledOnExpression() {
			return getRuleContext(LedOnExpressionContext.class,0);
		}
		public LedOffExpressionContext ledOffExpression() {
			return getRuleContext(LedOffExpressionContext.class,0);
		}
		public DelayExpressionContext delayExpression() {
			return getRuleContext(DelayExpressionContext.class,0);
		}
		public WhileExpressionContext whileExpression() {
			return getRuleContext(WhileExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public VarExpressionContext varExpression() {
			return getRuleContext(VarExpressionContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PrintExpressionContext printExpression() {
			return getRuleContext(PrintExpressionContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				blinkExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				ledOnExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				ledOffExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				delayExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				whileExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				forExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				varExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				assignExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(63);
				unaryExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(64);
				printExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(65);
				ifExpression();
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

	public static class LedOnExpressionContext extends ParserRuleContext {
		public TerminalNode LED_ON_KW() { return getToken(Stm32DSLParser.LED_ON_KW, 0); }
		public LedOnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ledOnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterLedOnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitLedOnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitLedOnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LedOnExpressionContext ledOnExpression() throws RecognitionException {
		LedOnExpressionContext _localctx = new LedOnExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ledOnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(LED_ON_KW);
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

	public static class LedOffExpressionContext extends ParserRuleContext {
		public TerminalNode LED_OFF_KW() { return getToken(Stm32DSLParser.LED_OFF_KW, 0); }
		public LedOffExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ledOffExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterLedOffExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitLedOffExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitLedOffExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LedOffExpressionContext ledOffExpression() throws RecognitionException {
		LedOffExpressionContext _localctx = new LedOffExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ledOffExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LED_OFF_KW);
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

	public static class DelayExpressionContext extends ParserRuleContext {
		public TerminalNode DELAY_KW() { return getToken(Stm32DSLParser.DELAY_KW, 0); }
		public TimeExpressionContext timeExpression() {
			return getRuleContext(TimeExpressionContext.class,0);
		}
		public DelayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterDelayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitDelayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitDelayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelayExpressionContext delayExpression() throws RecognitionException {
		DelayExpressionContext _localctx = new DelayExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_delayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(DELAY_KW);
			setState(73);
			timeExpression();
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

	public static class BlinkExpressionContext extends ParserRuleContext {
		public TerminalNode BLINK_KW() { return getToken(Stm32DSLParser.BLINK_KW, 0); }
		public TimeExpressionContext timeExpression() {
			return getRuleContext(TimeExpressionContext.class,0);
		}
		public BlinkExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blinkExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterBlinkExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitBlinkExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitBlinkExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlinkExpressionContext blinkExpression() throws RecognitionException {
		BlinkExpressionContext _localctx = new BlinkExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blinkExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(BLINK_KW);
			setState(76);
			timeExpression();
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

	public static class TimeExpressionContext extends ParserRuleContext {
		public TerminalNode TIME_UNIT() { return getToken(Stm32DSLParser.TIME_UNIT, 0); }
		public TerminalNode NUMBER() { return getToken(Stm32DSLParser.NUMBER, 0); }
		public ValueExpressionWithBracketsContext valueExpressionWithBrackets() {
			return getRuleContext(ValueExpressionWithBracketsContext.class,0);
		}
		public TimeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterTimeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitTimeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitTimeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeExpressionContext timeExpression() throws RecognitionException {
		TimeExpressionContext _localctx = new TimeExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_timeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(78);
				match(NUMBER);
				}
				break;
			case LB:
				{
				setState(79);
				valueExpressionWithBrackets();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82);
			match(TIME_UNIT);
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

	public static class WhileExpressionContext extends ParserRuleContext {
		public TerminalNode WHILE_KW() { return getToken(Stm32DSLParser.WHILE_KW, 0); }
		public TerminalNode LB() { return getToken(Stm32DSLParser.LB, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(Stm32DSLParser.RB, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitWhileExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitWhileExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExpressionContext whileExpression() throws RecognitionException {
		WhileExpressionContext _localctx = new WhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(WHILE_KW);
			setState(85);
			match(LB);
			setState(86);
			conditionalExpression();
			setState(87);
			match(RB);
			setState(88);
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

	public static class ForExpressionContext extends ParserRuleContext {
		public TerminalNode FOR_KW() { return getToken(Stm32DSLParser.FOR_KW, 0); }
		public TerminalNode LB() { return getToken(Stm32DSLParser.LB, 0); }
		public VarExpressionContext varExpression() {
			return getRuleContext(VarExpressionContext.class,0);
		}
		public List<TerminalNode> DEL() { return getTokens(Stm32DSLParser.DEL); }
		public TerminalNode DEL(int i) {
			return getToken(Stm32DSLParser.DEL, i);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(Stm32DSLParser.RB, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(FOR_KW);
			setState(91);
			match(LB);
			setState(92);
			varExpression();
			setState(93);
			match(DEL);
			setState(94);
			conditionalExpression();
			setState(95);
			match(DEL);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(96);
				assignExpression();
				}
				break;
			case 2:
				{
				setState(97);
				unaryExpression();
				}
				break;
			}
			setState(100);
			match(RB);
			setState(101);
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

	public static class VarExpressionContext extends ParserRuleContext {
		public TerminalNode VAR_KW() { return getToken(Stm32DSLParser.VAR_KW, 0); }
		public TerminalNode VAR() { return getToken(Stm32DSLParser.VAR, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public VarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExpressionContext varExpression() throws RecognitionException {
		VarExpressionContext _localctx = new VarExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(VAR_KW);
			setState(104);
			match(VAR);
			setState(105);
			match(T__0);
			setState(106);
			valueExpression();
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

	public static class AssignExpressionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Stm32DSLParser.VAR, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(VAR);
			setState(109);
			match(T__0);
			setState(110);
			valueExpression();
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

	public static class PrintExpressionContext extends ParserRuleContext {
		public TerminalNode PRINT_KW() { return getToken(Stm32DSLParser.PRINT_KW, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Stm32DSLParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(Stm32DSLParser.CHAR_LITERAL, 0); }
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PRINT_KW);
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==CHAR_LITERAL || _la==STRING_LITERAL) ) {
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

	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode IF_KW() { return getToken(Stm32DSLParser.IF_KW, 0); }
		public TerminalNode LB() { return getToken(Stm32DSLParser.LB, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(Stm32DSLParser.RB, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE_KW() { return getToken(Stm32DSLParser.ELSE_KW, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IF_KW);
			setState(116);
			match(LB);
			setState(117);
			conditionalExpression();
			setState(118);
			match(RB);
			setState(119);
			block();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(120);
				match(ELSE_KW);
				setState(121);
				block();
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			logicalOrExpression();
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OR_OP() { return getTokens(Stm32DSLParser.LOGICAL_OR_OP); }
		public TerminalNode LOGICAL_OR_OP(int i) {
			return getToken(Stm32DSLParser.LOGICAL_OR_OP, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			logicalAndExpression();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR_OP) {
				{
				{
				setState(127);
				match(LOGICAL_OR_OP);
				setState(128);
				logicalAndExpression();
				}
				}
				setState(133);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_AND_OP() { return getTokens(Stm32DSLParser.LOGICAL_AND_OP); }
		public TerminalNode LOGICAL_AND_OP(int i) {
			return getToken(Stm32DSLParser.LOGICAL_AND_OP, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			equalityExpression();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND_OP) {
				{
				{
				setState(135);
				match(LOGICAL_AND_OP);
				setState(136);
				equalityExpression();
				}
				}
				setState(141);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUALITY_OP() { return getTokens(Stm32DSLParser.EQUALITY_OP); }
		public TerminalNode EQUALITY_OP(int i) {
			return getToken(Stm32DSLParser.EQUALITY_OP, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			relationalExpression();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALITY_OP) {
				{
				{
				setState(143);
				match(EQUALITY_OP);
				setState(144);
				relationalExpression();
				}
				}
				setState(149);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public List<TerminalNode> RELATIONAL_OP() { return getTokens(Stm32DSLParser.RELATIONAL_OP); }
		public TerminalNode RELATIONAL_OP(int i) {
			return getToken(Stm32DSLParser.RELATIONAL_OP, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			valueExpression();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OP) {
				{
				{
				setState(151);
				match(RELATIONAL_OP);
				setState(152);
				valueExpression();
				}
				}
				setState(157);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExpressionWithBracketsContext valueExpressionWithBrackets() {
			return getRuleContext(ValueExpressionWithBracketsContext.class,0);
		}
		public List<TerminalNode> OP() { return getTokens(Stm32DSLParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(Stm32DSLParser.OP, i);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valueExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS_LOUD_KW:
			case VAR:
			case INCREMENT:
			case DECREMENT:
			case NUMBER:
				{
				setState(158);
				value();
				}
				break;
			case LB:
				{
				setState(159);
				valueExpressionWithBrackets();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					match(OP);
					setState(163);
					valueExpression();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ValueExpressionWithBracketsContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(Stm32DSLParser.LB, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(Stm32DSLParser.RB, 0); }
		public ValueExpressionWithBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpressionWithBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterValueExpressionWithBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitValueExpressionWithBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitValueExpressionWithBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionWithBracketsContext valueExpressionWithBrackets() throws RecognitionException {
		ValueExpressionWithBracketsContext _localctx = new ValueExpressionWithBracketsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valueExpressionWithBrackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(LB);
			setState(170);
			valueExpression();
			setState(171);
			match(RB);
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

	public static class ValueContext extends ParserRuleContext {
		public IsLoudExpressionContext isLoudExpression() {
			return getRuleContext(IsLoudExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(Stm32DSLParser.NUMBER, 0); }
		public TerminalNode VAR() { return getToken(Stm32DSLParser.VAR, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				isLoudExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				unaryExpression();
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

	public static class IsLoudExpressionContext extends ParserRuleContext {
		public TerminalNode IS_LOUD_KW() { return getToken(Stm32DSLParser.IS_LOUD_KW, 0); }
		public IsLoudExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isLoudExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterIsLoudExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitIsLoudExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitIsLoudExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsLoudExpressionContext isLoudExpression() throws RecognitionException {
		IsLoudExpressionContext _localctx = new IsLoudExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_isLoudExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(IS_LOUD_KW);
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
		public TerminalNode LFB() { return getToken(Stm32DSLParser.LFB, 0); }
		public TerminalNode RFB() { return getToken(Stm32DSLParser.RFB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LFB);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LED_ON_KW) | (1L << LED_OFF_KW) | (1L << BLINK_KW) | (1L << DELAY_KW) | (1L << PRINT_KW) | (1L << WHILE_KW) | (1L << FOR_KW) | (1L << IF_KW) | (1L << VAR_KW) | (1L << VAR) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) {
				{
				{
				setState(182);
				expression();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(RFB);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryExpression);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				prefixExpression();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				postfixExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Stm32DSLParser.VAR, 0); }
		public TerminalNode INCREMENT() { return getToken(Stm32DSLParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(Stm32DSLParser.DECREMENT, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(VAR);
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
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

	public static class PrefixExpressionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Stm32DSLParser.VAR, 0); }
		public TerminalNode INCREMENT() { return getToken(Stm32DSLParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(Stm32DSLParser.DECREMENT, 0); }
		public PrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Stm32DSLListener ) ((Stm32DSLListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Stm32DSLVisitor ) return ((Stm32DSLVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixExpressionContext prefixExpression() throws RecognitionException {
		PrefixExpressionContext _localctx = new PrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_prefixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198);
			match(VAR);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3E\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\bS\n"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"e\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16}\n\16\3\17\3\17\3\20\3\20\3\20"+
		"\7\20\u0084\n\20\f\20\16\20\u0087\13\20\3\21\3\21\3\21\7\21\u008c\n\21"+
		"\f\21\16\21\u008f\13\21\3\22\3\22\3\22\7\22\u0094\n\22\f\22\16\22\u0097"+
		"\13\22\3\23\3\23\3\23\7\23\u009c\n\23\f\23\16\23\u009f\13\23\3\24\3\24"+
		"\5\24\u00a3\n\24\3\24\3\24\7\24\u00a7\n\24\f\24\16\24\u00aa\13\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00b4\n\26\3\27\3\27\3\30\3\30"+
		"\7\30\u00ba\n\30\f\30\16\30\u00bd\13\30\3\30\3\30\3\31\3\31\5\31\u00c3"+
		"\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\3\2\37 \3\2\33\34\2\u00c8\2\66\3"+
		"\2\2\2\4D\3\2\2\2\6F\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2\fM\3\2\2\2\16R\3\2"+
		"\2\2\20V\3\2\2\2\22\\\3\2\2\2\24i\3\2\2\2\26n\3\2\2\2\30r\3\2\2\2\32u"+
		"\3\2\2\2\34~\3\2\2\2\36\u0080\3\2\2\2 \u0088\3\2\2\2\"\u0090\3\2\2\2$"+
		"\u0098\3\2\2\2&\u00a2\3\2\2\2(\u00ab\3\2\2\2*\u00b3\3\2\2\2,\u00b5\3\2"+
		"\2\2.\u00b7\3\2\2\2\60\u00c2\3\2\2\2\62\u00c4\3\2\2\2\64\u00c7\3\2\2\2"+
		"\66\67\7\4\2\2\678\5.\30\28\3\3\2\2\29E\5\f\7\2:E\5\6\4\2;E\5\b\5\2<E"+
		"\5\n\6\2=E\5\20\t\2>E\5\22\n\2?E\5\24\13\2@E\5\26\f\2AE\5\60\31\2BE\5"+
		"\30\r\2CE\5\32\16\2D9\3\2\2\2D:\3\2\2\2D;\3\2\2\2D<\3\2\2\2D=\3\2\2\2"+
		"D>\3\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\5\3\2\2"+
		"\2FG\7\t\2\2G\7\3\2\2\2HI\7\n\2\2I\t\3\2\2\2JK\7\f\2\2KL\5\16\b\2L\13"+
		"\3\2\2\2MN\7\13\2\2NO\5\16\b\2O\r\3\2\2\2PS\7\36\2\2QS\5(\25\2RP\3\2\2"+
		"\2RQ\3\2\2\2ST\3\2\2\2TU\7\30\2\2U\17\3\2\2\2VW\7\17\2\2WX\7\7\2\2XY\5"+
		"\34\17\2YZ\7\b\2\2Z[\5.\30\2[\21\3\2\2\2\\]\7\21\2\2]^\7\7\2\2^_\5\24"+
		"\13\2_`\7\20\2\2`a\5\34\17\2ad\7\20\2\2be\5\26\f\2ce\5\60\31\2db\3\2\2"+
		"\2dc\3\2\2\2ef\3\2\2\2fg\7\b\2\2gh\5.\30\2h\23\3\2\2\2ij\7\31\2\2jk\7"+
		"\32\2\2kl\7\3\2\2lm\5&\24\2m\25\3\2\2\2no\7\32\2\2op\7\3\2\2pq\5&\24\2"+
		"q\27\3\2\2\2rs\7\16\2\2st\t\2\2\2t\31\3\2\2\2uv\7\22\2\2vw\7\7\2\2wx\5"+
		"\34\17\2xy\7\b\2\2y|\5.\30\2z{\7\23\2\2{}\5.\30\2|z\3\2\2\2|}\3\2\2\2"+
		"}\33\3\2\2\2~\177\5\36\20\2\177\35\3\2\2\2\u0080\u0085\5 \21\2\u0081\u0082"+
		"\7\26\2\2\u0082\u0084\5 \21\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\37\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008d\5\"\22\2\u0089\u008a\7\27\2\2\u008a\u008c\5\"\22"+
		"\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e!\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0095\5$\23\2\u0091"+
		"\u0092\7\25\2\2\u0092\u0094\5$\23\2\u0093\u0091\3\2\2\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096#\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009d\5&\24\2\u0099\u009a\7\24\2\2\u009a\u009c\5&\24\2"+
		"\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e%\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a3\5*\26\2\u00a1"+
		"\u00a3\5(\25\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a8\3\2"+
		"\2\2\u00a4\u00a5\7\35\2\2\u00a5\u00a7\5&\24\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\'\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\7\2\2\u00ac\u00ad\5&\24\2\u00ad\u00ae"+
		"\7\b\2\2\u00ae)\3\2\2\2\u00af\u00b4\5,\27\2\u00b0\u00b4\7\36\2\2\u00b1"+
		"\u00b4\7\32\2\2\u00b2\u00b4\5\60\31\2\u00b3\u00af\3\2\2\2\u00b3\u00b0"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4+\3\2\2\2\u00b5"+
		"\u00b6\7\r\2\2\u00b6-\3\2\2\2\u00b7\u00bb\7\5\2\2\u00b8\u00ba\5\4\3\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\6\2\2\u00bf"+
		"/\3\2\2\2\u00c0\u00c3\5\64\33\2\u00c1\u00c3\5\62\32\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c1\3\2\2\2\u00c3\61\3\2\2\2\u00c4\u00c5\7\32\2\2\u00c5\u00c6"+
		"\t\3\2\2\u00c6\63\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8\u00c9\7\32\2\2\u00c9"+
		"\65\3\2\2\2\17DRd|\u0085\u008d\u0095\u009d\u00a2\u00a8\u00b3\u00bb\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}