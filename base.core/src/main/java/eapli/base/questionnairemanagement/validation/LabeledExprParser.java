// Generated from /Users/joaomarques/Desktop/LAPR4/base.core/src/main/java/eapli/base/questionnairemanagement/validation/LabeledExpr.g4 by ANTLR 4.10.1
package eapli.base.questionnairemanagement.validation;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, FREETEXT=31, 
		NUMERIC=32, SINGLECHOICE=33, SINGLECHOICE_WITH_INPUT=34, MULTIPLECHOICE=35, 
		MULTIPLECHOICE_WITH_INPUT=36, SORTING_OPTIONS=37, SCALING_OPTIONS=38, 
		MANDATORY=39, OPTIONAL=40, CONDITION_DEPENDENT=41, DESCRIPTION=42, SIGNALS=43, 
		LOWERCASE=44, CAPSCASE=45, NUMBERS=46, NEWLINE=47, WS=48, ALPHANUMERIC=49;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_start1 = 2, RULE_id = 3, RULE_title = 4, 
		RULE_welcomeMessage = 5, RULE_finalMessage = 6, RULE_section = 7, RULE_start2 = 8, 
		RULE_start3 = 9, RULE_start4 = 10, RULE_start5 = 11, RULE_sID = 12, RULE_sTitle = 13, 
		RULE_sDescription = 14, RULE_sObligatoriness = 15, RULE_sCondition = 16, 
		RULE_sRepeatability = 17, RULE_question = 18, RULE_start6 = 19, RULE_start7 = 20, 
		RULE_qId = 21, RULE_qText = 22, RULE_instruction = 23, RULE_qType = 24, 
		RULE_qObligatoriness = 25, RULE_qCondition = 26, RULE_extraInfo = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "start", "start1", "id", "title", "welcomeMessage", "finalMessage", 
			"section", "start2", "start3", "start4", "start5", "sID", "sTitle", "sDescription", 
			"sObligatoriness", "sCondition", "sRepeatability", "question", "start6", 
			"start7", "qId", "qText", "instruction", "qType", "qObligatoriness", 
			"qCondition", "extraInfo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ID: '", "'Title: '", "'TITLE: '", "'Welcome Message: '", "'WelcomeMessage: '", 
			"'Final Message: '", "'FinalMessage: '", "'Section ID: '", "'SectionID: '", 
			"'Section Title: '", "'SectionTitle: '", "'Section Description: '", "'SectionDescription: '", 
			"'Section Obligatoriness: '", "'SectionObligatoriness: '", "'Condition Dependent: '", 
			"'ConditionDependent: '", "'Section Repeatability: '", "'SectionRepeatibility: '", 
			"'Question ID: '", "'QuestionID: '", "'Question Text: '", "'QuestionText: '", 
			"'Instruction: '", "'Type: '", "'TYPE: '", "'Question Obligatoriness: '", 
			"'QuestionObligatoriness: '", "'Extra Info: '", "'ExtraInfo: '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "FREETEXT", "NUMERIC", "SINGLECHOICE", 
			"SINGLECHOICE_WITH_INPUT", "MULTIPLECHOICE", "MULTIPLECHOICE_WITH_INPUT", 
			"SORTING_OPTIONS", "SCALING_OPTIONS", "MANDATORY", "OPTIONAL", "CONDITION_DEPENDENT", 
			"DESCRIPTION", "SIGNALS", "LOWERCASE", "CAPSCASE", "NUMBERS", "NEWLINE", 
			"WS", "ALPHANUMERIC"
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
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Start1Context start1() {
			return getRuleContext(Start1Context.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				start();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				start1();
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

	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Questionnarie1Context extends StartContext {
		public IdContext a;
		public TitleContext b;
		public WelcomeMessageContext c;
		public SectionContext d;
		public FinalMessageContext e;
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public WelcomeMessageContext welcomeMessage() {
			return getRuleContext(WelcomeMessageContext.class,0);
		}
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public FinalMessageContext finalMessage() {
			return getRuleContext(FinalMessageContext.class,0);
		}
		public Questionnarie1Context(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQuestionnarie1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQuestionnarie1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQuestionnarie1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			_localctx = new Questionnarie1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((Questionnarie1Context)_localctx).a = id();
			setState(61);
			match(NEWLINE);
			setState(62);
			((Questionnarie1Context)_localctx).b = title();
			setState(63);
			match(NEWLINE);
			setState(64);
			((Questionnarie1Context)_localctx).c = welcomeMessage();
			setState(65);
			match(NEWLINE);
			setState(66);
			((Questionnarie1Context)_localctx).d = section();
			setState(67);
			match(NEWLINE);
			setState(68);
			((Questionnarie1Context)_localctx).e = finalMessage();
			setState(69);
			match(NEWLINE);
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

	public static class Start1Context extends ParserRuleContext {
		public Start1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start1; }
	 
		public Start1Context() { }
		public void copyFrom(Start1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Questionnarie2Context extends Start1Context {
		public IdContext a;
		public TitleContext b;
		public SectionContext d;
		public FinalMessageContext e;
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public FinalMessageContext finalMessage() {
			return getRuleContext(FinalMessageContext.class,0);
		}
		public Questionnarie2Context(Start1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQuestionnarie2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQuestionnarie2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQuestionnarie2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start1Context start1() throws RecognitionException {
		Start1Context _localctx = new Start1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_start1);
		try {
			_localctx = new Questionnarie2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((Questionnarie2Context)_localctx).a = id();
			setState(72);
			match(NEWLINE);
			setState(73);
			((Questionnarie2Context)_localctx).b = title();
			setState(74);
			match(NEWLINE);
			setState(75);
			((Questionnarie2Context)_localctx).d = section();
			setState(76);
			match(NEWLINE);
			setState(77);
			((Questionnarie2Context)_localctx).e = finalMessage();
			setState(78);
			match(NEWLINE);
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

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(LabeledExprParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(LabeledExprParser.ALPHANUMERIC, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__0);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				match(ALPHANUMERIC);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHANUMERIC );
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

	public static class TitleContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(LabeledExprParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(LabeledExprParser.DESCRIPTION, i);
		}
		public List<TerminalNode> WS() { return getTokens(LabeledExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LabeledExprParser.WS, i);
		}
		public List<TerminalNode> SIGNALS() { return getTokens(LabeledExprParser.SIGNALS); }
		public TerminalNode SIGNALS(int i) {
			return getToken(LabeledExprParser.SIGNALS, i);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0) );
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

	public static class WelcomeMessageContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(LabeledExprParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(LabeledExprParser.DESCRIPTION, i);
		}
		public List<TerminalNode> WS() { return getTokens(LabeledExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LabeledExprParser.WS, i);
		}
		public List<TerminalNode> SIGNALS() { return getTokens(LabeledExprParser.SIGNALS); }
		public TerminalNode SIGNALS(int i) {
			return getToken(LabeledExprParser.SIGNALS, i);
		}
		public WelcomeMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_welcomeMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterWelcomeMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitWelcomeMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWelcomeMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WelcomeMessageContext welcomeMessage() throws RecognitionException {
		WelcomeMessageContext _localctx = new WelcomeMessageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_welcomeMessage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0) );
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

	public static class FinalMessageContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(LabeledExprParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(LabeledExprParser.DESCRIPTION, i);
		}
		public List<TerminalNode> WS() { return getTokens(LabeledExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LabeledExprParser.WS, i);
		}
		public List<TerminalNode> SIGNALS() { return getTokens(LabeledExprParser.SIGNALS); }
		public TerminalNode SIGNALS(int i) {
			return getToken(LabeledExprParser.SIGNALS, i);
		}
		public FinalMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFinalMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFinalMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFinalMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalMessageContext finalMessage() throws RecognitionException {
		FinalMessageContext _localctx = new FinalMessageContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_finalMessage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0) );
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

	public static class SectionContext extends ParserRuleContext {
		public List<Start2Context> start2() {
			return getRuleContexts(Start2Context.class);
		}
		public Start2Context start2(int i) {
			return getRuleContext(Start2Context.class,i);
		}
		public List<Start3Context> start3() {
			return getRuleContexts(Start3Context.class);
		}
		public Start3Context start3(int i) {
			return getRuleContext(Start3Context.class,i);
		}
		public List<Start4Context> start4() {
			return getRuleContexts(Start4Context.class);
		}
		public Start4Context start4(int i) {
			return getRuleContext(Start4Context.class,i);
		}
		public List<Start5Context> start5() {
			return getRuleContexts(Start5Context.class);
		}
		public Start5Context start5(int i) {
			return getRuleContext(Start5Context.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(104);
						start2();
						}
						break;
					case 2:
						{
						setState(105);
						start3();
						}
						break;
					case 3:
						{
						setState(106);
						start4();
						}
						break;
					case 4:
						{
						setState(107);
						start5();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Start2Context extends ParserRuleContext {
		public Start2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start2; }
	 
		public Start2Context() { }
		public void copyFrom(Start2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Questionnarie3Context extends Start2Context {
		public SIDContext a;
		public STitleContext b;
		public SDescriptionContext c;
		public SObligatorinessContext d;
		public SRepeatabilityContext e;
		public QuestionContext f;
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public SIDContext sID() {
			return getRuleContext(SIDContext.class,0);
		}
		public STitleContext sTitle() {
			return getRuleContext(STitleContext.class,0);
		}
		public SDescriptionContext sDescription() {
			return getRuleContext(SDescriptionContext.class,0);
		}
		public SObligatorinessContext sObligatoriness() {
			return getRuleContext(SObligatorinessContext.class,0);
		}
		public SRepeatabilityContext sRepeatability() {
			return getRuleContext(SRepeatabilityContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public Questionnarie3Context(Start2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQuestionnarie3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQuestionnarie3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQuestionnarie3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start2Context start2() throws RecognitionException {
		Start2Context _localctx = new Start2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_start2);
		try {
			_localctx = new Questionnarie3Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(112);
			match(NEWLINE);
			setState(113);
			((Questionnarie3Context)_localctx).a = sID();
			setState(114);
			match(NEWLINE);
			setState(115);
			((Questionnarie3Context)_localctx).b = sTitle();
			setState(116);
			match(NEWLINE);
			setState(117);
			((Questionnarie3Context)_localctx).c = sDescription();
			setState(118);
			match(NEWLINE);
			setState(119);
			((Questionnarie3Context)_localctx).d = sObligatoriness();
			setState(120);
			match(NEWLINE);
			setState(121);
			((Questionnarie3Context)_localctx).e = sRepeatability();
			setState(122);
			match(NEWLINE);
			setState(123);
			((Questionnarie3Context)_localctx).f = question();
			setState(124);
			match(NEWLINE);
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

	public static class Start3Context extends ParserRuleContext {
		public Start3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start3; }
	 
		public Start3Context() { }
		public void copyFrom(Start3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Questionnarie4Context extends Start3Context {
		public SIDContext a;
		public STitleContext b;
		public SDescriptionContext c;
		public SObligatorinessContext d;
		public QuestionContext f;
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public SIDContext sID() {
			return getRuleContext(SIDContext.class,0);
		}
		public STitleContext sTitle() {
			return getRuleContext(STitleContext.class,0);
		}
		public SDescriptionContext sDescription() {
			return getRuleContext(SDescriptionContext.class,0);
		}
		public SObligatorinessContext sObligatoriness() {
			return getRuleContext(SObligatorinessContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public Questionnarie4Context(Start3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQuestionnarie4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQuestionnarie4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQuestionnarie4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start3Context start3() throws RecognitionException {
		Start3Context _localctx = new Start3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_start3);
		try {
			_localctx = new Questionnarie4Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126);
			match(NEWLINE);
			setState(127);
			((Questionnarie4Context)_localctx).a = sID();
			setState(128);
			match(NEWLINE);
			setState(129);
			((Questionnarie4Context)_localctx).b = sTitle();
			setState(130);
			match(NEWLINE);
			setState(131);
			((Questionnarie4Context)_localctx).c = sDescription();
			setState(132);
			match(NEWLINE);
			setState(133);
			((Questionnarie4Context)_localctx).d = sObligatoriness();
			setState(134);
			match(NEWLINE);
			setState(135);
			((Questionnarie4Context)_localctx).f = question();
			setState(136);
			match(NEWLINE);
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

	public static class Start4Context extends ParserRuleContext {
		public Start4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start4; }
	 
		public Start4Context() { }
		public void copyFrom(Start4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Questionnarie5Context extends Start4Context {
		public SIDContext a;
		public STitleContext b;
		public SObligatorinessContext d;
		public SRepeatabilityContext e;
		public QuestionContext f;
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public SIDContext sID() {
			return getRuleContext(SIDContext.class,0);
		}
		public STitleContext sTitle() {
			return getRuleContext(STitleContext.class,0);
		}
		public SObligatorinessContext sObligatoriness() {
			return getRuleContext(SObligatorinessContext.class,0);
		}
		public SRepeatabilityContext sRepeatability() {
			return getRuleContext(SRepeatabilityContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public Questionnarie5Context(Start4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQuestionnarie5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQuestionnarie5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQuestionnarie5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start4Context start4() throws RecognitionException {
		Start4Context _localctx = new Start4Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_start4);
		try {
			_localctx = new Questionnarie5Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138);
			match(NEWLINE);
			setState(139);
			((Questionnarie5Context)_localctx).a = sID();
			setState(140);
			match(NEWLINE);
			setState(141);
			((Questionnarie5Context)_localctx).b = sTitle();
			setState(142);
			match(NEWLINE);
			setState(143);
			((Questionnarie5Context)_localctx).d = sObligatoriness();
			setState(144);
			match(NEWLINE);
			setState(145);
			((Questionnarie5Context)_localctx).e = sRepeatability();
			setState(146);
			match(NEWLINE);
			setState(147);
			((Questionnarie5Context)_localctx).f = question();
			setState(148);
			match(NEWLINE);
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

	public static class Start5Context extends ParserRuleContext {
		public Start5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start5; }
	 
		public Start5Context() { }
		public void copyFrom(Start5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Questionnarie6Context extends Start5Context {
		public SIDContext a;
		public STitleContext b;
		public SObligatorinessContext d;
		public QuestionContext f;
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public SIDContext sID() {
			return getRuleContext(SIDContext.class,0);
		}
		public STitleContext sTitle() {
			return getRuleContext(STitleContext.class,0);
		}
		public SObligatorinessContext sObligatoriness() {
			return getRuleContext(SObligatorinessContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public Questionnarie6Context(Start5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQuestionnarie6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQuestionnarie6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQuestionnarie6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start5Context start5() throws RecognitionException {
		Start5Context _localctx = new Start5Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_start5);
		try {
			_localctx = new Questionnarie6Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			match(NEWLINE);
			setState(151);
			((Questionnarie6Context)_localctx).a = sID();
			setState(152);
			match(NEWLINE);
			setState(153);
			((Questionnarie6Context)_localctx).b = sTitle();
			setState(154);
			match(NEWLINE);
			setState(155);
			((Questionnarie6Context)_localctx).d = sObligatoriness();
			setState(156);
			match(NEWLINE);
			setState(157);
			((Questionnarie6Context)_localctx).f = question();
			setState(158);
			match(NEWLINE);
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

	public static class SIDContext extends ParserRuleContext {
		public List<TerminalNode> NUMBERS() { return getTokens(LabeledExprParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(LabeledExprParser.NUMBERS, i);
		}
		public SIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SIDContext sID() throws RecognitionException {
		SIDContext _localctx = new SIDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				match(NUMBERS);
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBERS );
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

	public static class STitleContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(LabeledExprParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(LabeledExprParser.DESCRIPTION, i);
		}
		public List<TerminalNode> WS() { return getTokens(LabeledExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LabeledExprParser.WS, i);
		}
		public List<TerminalNode> SIGNALS() { return getTokens(LabeledExprParser.SIGNALS); }
		public TerminalNode SIGNALS(int i) {
			return getToken(LabeledExprParser.SIGNALS, i);
		}
		public STitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final STitleContext sTitle() throws RecognitionException {
		STitleContext _localctx = new STitleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sTitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0) );
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

	public static class SDescriptionContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(LabeledExprParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(LabeledExprParser.DESCRIPTION, i);
		}
		public List<TerminalNode> WS() { return getTokens(LabeledExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LabeledExprParser.WS, i);
		}
		public List<TerminalNode> SIGNALS() { return getTokens(LabeledExprParser.SIGNALS); }
		public TerminalNode SIGNALS(int i) {
			return getToken(LabeledExprParser.SIGNALS, i);
		}
		public SDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SDescriptionContext sDescription() throws RecognitionException {
		SDescriptionContext _localctx = new SDescriptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0) );
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

	public static class SObligatorinessContext extends ParserRuleContext {
		public List<TerminalNode> MANDATORY() { return getTokens(LabeledExprParser.MANDATORY); }
		public TerminalNode MANDATORY(int i) {
			return getToken(LabeledExprParser.MANDATORY, i);
		}
		public List<TerminalNode> OPTIONAL() { return getTokens(LabeledExprParser.OPTIONAL); }
		public TerminalNode OPTIONAL(int i) {
			return getToken(LabeledExprParser.OPTIONAL, i);
		}
		public List<SConditionContext> sCondition() {
			return getRuleContexts(SConditionContext.class);
		}
		public SConditionContext sCondition(int i) {
			return getRuleContext(SConditionContext.class,i);
		}
		public SObligatorinessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sObligatoriness; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSObligatoriness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSObligatoriness(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSObligatoriness(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SObligatorinessContext sObligatoriness() throws RecognitionException {
		SObligatorinessContext _localctx = new SObligatorinessContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sObligatoriness);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANDATORY:
					{
					setState(179);
					match(MANDATORY);
					}
					break;
				case OPTIONAL:
					{
					setState(180);
					match(OPTIONAL);
					}
					break;
				case T__15:
				case T__16:
					{
					setState(181);
					sCondition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << MANDATORY) | (1L << OPTIONAL))) != 0) );
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

	public static class SConditionContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(LabeledExprParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(LabeledExprParser.DESCRIPTION, i);
		}
		public List<TerminalNode> WS() { return getTokens(LabeledExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LabeledExprParser.WS, i);
		}
		public List<TerminalNode> SIGNALS() { return getTokens(LabeledExprParser.SIGNALS); }
		public TerminalNode SIGNALS(int i) {
			return getToken(LabeledExprParser.SIGNALS, i);
		}
		public SConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SConditionContext sCondition() throws RecognitionException {
		SConditionContext _localctx = new SConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0) );
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

	public static class SRepeatabilityContext extends ParserRuleContext {
		public List<TerminalNode> NUMBERS() { return getTokens(LabeledExprParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(LabeledExprParser.NUMBERS, i);
		}
		public SRepeatabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sRepeatability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSRepeatability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSRepeatability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSRepeatability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SRepeatabilityContext sRepeatability() throws RecognitionException {
		SRepeatabilityContext _localctx = new SRepeatabilityContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sRepeatability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				match(NUMBERS);
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBERS );
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

	public static class QuestionContext extends ParserRuleContext {
		public List<Start6Context> start6() {
			return getRuleContexts(Start6Context.class);
		}
		public Start6Context start6(int i) {
			return getRuleContext(Start6Context.class,i);
		}
		public List<Start7Context> start7() {
			return getRuleContexts(Start7Context.class);
		}
		public Start7Context start7(int i) {
			return getRuleContext(Start7Context.class,i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_question);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(198);
						start6();
						}
						break;
					case 2:
						{
						setState(199);
						start7();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Start6Context extends ParserRuleContext {
		public Start6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start6; }
	 
		public Start6Context() { }
		public void copyFrom(Start6Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Questionnarie11Context extends Start6Context {
		public QIdContext a;
		public QTextContext b;
		public InstructionContext c;
		public QTypeContext d;
		public QObligatorinessContext e;
		public ExtraInfoContext f;
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public QIdContext qId() {
			return getRuleContext(QIdContext.class,0);
		}
		public QTextContext qText() {
			return getRuleContext(QTextContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public QTypeContext qType() {
			return getRuleContext(QTypeContext.class,0);
		}
		public QObligatorinessContext qObligatoriness() {
			return getRuleContext(QObligatorinessContext.class,0);
		}
		public ExtraInfoContext extraInfo() {
			return getRuleContext(ExtraInfoContext.class,0);
		}
		public Questionnarie11Context(Start6Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQuestionnarie11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQuestionnarie11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQuestionnarie11(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start6Context start6() throws RecognitionException {
		Start6Context _localctx = new Start6Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_start6);
		try {
			_localctx = new Questionnarie11Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			match(NEWLINE);
			setState(205);
			((Questionnarie11Context)_localctx).a = qId();
			setState(206);
			match(NEWLINE);
			setState(207);
			((Questionnarie11Context)_localctx).b = qText();
			setState(208);
			match(NEWLINE);
			setState(209);
			((Questionnarie11Context)_localctx).c = instruction();
			setState(210);
			match(NEWLINE);
			setState(211);
			((Questionnarie11Context)_localctx).d = qType();
			setState(212);
			match(NEWLINE);
			setState(213);
			((Questionnarie11Context)_localctx).e = qObligatoriness();
			setState(214);
			match(NEWLINE);
			setState(215);
			((Questionnarie11Context)_localctx).f = extraInfo();
			setState(216);
			match(NEWLINE);
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

	public static class Start7Context extends ParserRuleContext {
		public Start7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start7; }
	 
		public Start7Context() { }
		public void copyFrom(Start7Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Questionnarie12Context extends Start7Context {
		public QIdContext a;
		public QTextContext b;
		public QTypeContext d;
		public QObligatorinessContext e;
		public ExtraInfoContext f;
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public QIdContext qId() {
			return getRuleContext(QIdContext.class,0);
		}
		public QTextContext qText() {
			return getRuleContext(QTextContext.class,0);
		}
		public QTypeContext qType() {
			return getRuleContext(QTypeContext.class,0);
		}
		public QObligatorinessContext qObligatoriness() {
			return getRuleContext(QObligatorinessContext.class,0);
		}
		public ExtraInfoContext extraInfo() {
			return getRuleContext(ExtraInfoContext.class,0);
		}
		public Questionnarie12Context(Start7Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQuestionnarie12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQuestionnarie12(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQuestionnarie12(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start7Context start7() throws RecognitionException {
		Start7Context _localctx = new Start7Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_start7);
		try {
			_localctx = new Questionnarie12Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(218);
			match(NEWLINE);
			setState(219);
			((Questionnarie12Context)_localctx).a = qId();
			setState(220);
			match(NEWLINE);
			setState(221);
			((Questionnarie12Context)_localctx).b = qText();
			setState(222);
			match(NEWLINE);
			setState(223);
			((Questionnarie12Context)_localctx).d = qType();
			setState(224);
			match(NEWLINE);
			setState(225);
			((Questionnarie12Context)_localctx).e = qObligatoriness();
			setState(226);
			match(NEWLINE);
			setState(227);
			((Questionnarie12Context)_localctx).f = extraInfo();
			setState(228);
			match(NEWLINE);
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

	public static class QIdContext extends ParserRuleContext {
		public List<TerminalNode> NUMBERS() { return getTokens(LabeledExprParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(LabeledExprParser.NUMBERS, i);
		}
		public QIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QIdContext qId() throws RecognitionException {
		QIdContext _localctx = new QIdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_qId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				match(NUMBERS);
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBERS );
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

	public static class QTextContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(LabeledExprParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(LabeledExprParser.DESCRIPTION, i);
		}
		public List<TerminalNode> WS() { return getTokens(LabeledExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LabeledExprParser.WS, i);
		}
		public List<TerminalNode> SIGNALS() { return getTokens(LabeledExprParser.SIGNALS); }
		public TerminalNode SIGNALS(int i) {
			return getToken(LabeledExprParser.SIGNALS, i);
		}
		public QTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QTextContext qText() throws RecognitionException {
		QTextContext _localctx = new QTextContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_qText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(237);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0) );
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

	public static class InstructionContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(LabeledExprParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(LabeledExprParser.DESCRIPTION, i);
		}
		public List<TerminalNode> WS() { return getTokens(LabeledExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LabeledExprParser.WS, i);
		}
		public List<TerminalNode> SIGNALS() { return getTokens(LabeledExprParser.SIGNALS); }
		public TerminalNode SIGNALS(int i) {
			return getToken(LabeledExprParser.SIGNALS, i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__23);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0) );
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

	public static class QTypeContext extends ParserRuleContext {
		public List<TerminalNode> FREETEXT() { return getTokens(LabeledExprParser.FREETEXT); }
		public TerminalNode FREETEXT(int i) {
			return getToken(LabeledExprParser.FREETEXT, i);
		}
		public List<TerminalNode> NUMERIC() { return getTokens(LabeledExprParser.NUMERIC); }
		public TerminalNode NUMERIC(int i) {
			return getToken(LabeledExprParser.NUMERIC, i);
		}
		public List<TerminalNode> SINGLECHOICE() { return getTokens(LabeledExprParser.SINGLECHOICE); }
		public TerminalNode SINGLECHOICE(int i) {
			return getToken(LabeledExprParser.SINGLECHOICE, i);
		}
		public List<TerminalNode> SINGLECHOICE_WITH_INPUT() { return getTokens(LabeledExprParser.SINGLECHOICE_WITH_INPUT); }
		public TerminalNode SINGLECHOICE_WITH_INPUT(int i) {
			return getToken(LabeledExprParser.SINGLECHOICE_WITH_INPUT, i);
		}
		public List<TerminalNode> MULTIPLECHOICE() { return getTokens(LabeledExprParser.MULTIPLECHOICE); }
		public TerminalNode MULTIPLECHOICE(int i) {
			return getToken(LabeledExprParser.MULTIPLECHOICE, i);
		}
		public List<TerminalNode> MULTIPLECHOICE_WITH_INPUT() { return getTokens(LabeledExprParser.MULTIPLECHOICE_WITH_INPUT); }
		public TerminalNode MULTIPLECHOICE_WITH_INPUT(int i) {
			return getToken(LabeledExprParser.MULTIPLECHOICE_WITH_INPUT, i);
		}
		public List<TerminalNode> SORTING_OPTIONS() { return getTokens(LabeledExprParser.SORTING_OPTIONS); }
		public TerminalNode SORTING_OPTIONS(int i) {
			return getToken(LabeledExprParser.SORTING_OPTIONS, i);
		}
		public List<TerminalNode> SCALING_OPTIONS() { return getTokens(LabeledExprParser.SCALING_OPTIONS); }
		public TerminalNode SCALING_OPTIONS(int i) {
			return getToken(LabeledExprParser.SCALING_OPTIONS, i);
		}
		public QTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QTypeContext qType() throws RecognitionException {
		QTypeContext _localctx = new QTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_qType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FREETEXT) | (1L << NUMERIC) | (1L << SINGLECHOICE) | (1L << SINGLECHOICE_WITH_INPUT) | (1L << MULTIPLECHOICE) | (1L << MULTIPLECHOICE_WITH_INPUT) | (1L << SORTING_OPTIONS) | (1L << SCALING_OPTIONS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FREETEXT) | (1L << NUMERIC) | (1L << SINGLECHOICE) | (1L << SINGLECHOICE_WITH_INPUT) | (1L << MULTIPLECHOICE) | (1L << MULTIPLECHOICE_WITH_INPUT) | (1L << SORTING_OPTIONS) | (1L << SCALING_OPTIONS))) != 0) );
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

	public static class QObligatorinessContext extends ParserRuleContext {
		public List<TerminalNode> MANDATORY() { return getTokens(LabeledExprParser.MANDATORY); }
		public TerminalNode MANDATORY(int i) {
			return getToken(LabeledExprParser.MANDATORY, i);
		}
		public List<TerminalNode> OPTIONAL() { return getTokens(LabeledExprParser.OPTIONAL); }
		public TerminalNode OPTIONAL(int i) {
			return getToken(LabeledExprParser.OPTIONAL, i);
		}
		public List<QConditionContext> qCondition() {
			return getRuleContexts(QConditionContext.class);
		}
		public QConditionContext qCondition(int i) {
			return getRuleContext(QConditionContext.class,i);
		}
		public QObligatorinessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qObligatoriness; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQObligatoriness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQObligatoriness(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQObligatoriness(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QObligatorinessContext qObligatoriness() throws RecognitionException {
		QObligatorinessContext _localctx = new QObligatorinessContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_qObligatoriness);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(258);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANDATORY:
					{
					setState(255);
					match(MANDATORY);
					}
					break;
				case OPTIONAL:
					{
					setState(256);
					match(OPTIONAL);
					}
					break;
				case T__15:
				case T__16:
					{
					setState(257);
					qCondition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << MANDATORY) | (1L << OPTIONAL))) != 0) );
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

	public static class QConditionContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(LabeledExprParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(LabeledExprParser.DESCRIPTION, i);
		}
		public List<TerminalNode> WS() { return getTokens(LabeledExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LabeledExprParser.WS, i);
		}
		public List<TerminalNode> SIGNALS() { return getTokens(LabeledExprParser.SIGNALS); }
		public TerminalNode SIGNALS(int i) {
			return getToken(LabeledExprParser.SIGNALS, i);
		}
		public QConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterQCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitQCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitQCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QConditionContext qCondition() throws RecognitionException {
		QConditionContext _localctx = new QConditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_qCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0) );
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

	public static class ExtraInfoContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(LabeledExprParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(LabeledExprParser.DESCRIPTION, i);
		}
		public List<TerminalNode> WS() { return getTokens(LabeledExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LabeledExprParser.WS, i);
		}
		public List<TerminalNode> SIGNALS() { return getTokens(LabeledExprParser.SIGNALS); }
		public TerminalNode SIGNALS(int i) {
			return getToken(LabeledExprParser.SIGNALS, i);
		}
		public ExtraInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterExtraInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitExtraInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitExtraInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraInfoContext extraInfo() throws RecognitionException {
		ExtraInfoContext _localctx = new ExtraInfoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_extraInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCRIPTION) | (1L << SIGNALS) | (1L << WS))) != 0) );
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
		"\u0004\u00011\u0113\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0004\u0003S\b\u0003\u000b\u0003\f\u0003T\u0001"+
		"\u0004\u0001\u0004\u0004\u0004Y\b\u0004\u000b\u0004\f\u0004Z\u0001\u0005"+
		"\u0001\u0005\u0004\u0005_\b\u0005\u000b\u0005\f\u0005`\u0001\u0006\u0001"+
		"\u0006\u0004\u0006e\b\u0006\u000b\u0006\f\u0006f\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007m\b\u0007\u000b\u0007\f\u0007n\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0004\f\u00a3\b\f\u000b\f\f\f\u00a4\u0001\r\u0001\r\u0004\r\u00a9\b"+
		"\r\u000b\r\f\r\u00aa\u0001\u000e\u0001\u000e\u0004\u000e\u00af\b\u000e"+
		"\u000b\u000e\f\u000e\u00b0\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u00b7\b\u000f\u000b\u000f\f\u000f\u00b8\u0001\u0010\u0001"+
		"\u0010\u0004\u0010\u00bd\b\u0010\u000b\u0010\f\u0010\u00be\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u00c3\b\u0011\u000b\u0011\f\u0011\u00c4\u0001"+
		"\u0012\u0001\u0012\u0004\u0012\u00c9\b\u0012\u000b\u0012\f\u0012\u00ca"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0004\u0015\u00e9\b\u0015"+
		"\u000b\u0015\f\u0015\u00ea\u0001\u0016\u0001\u0016\u0004\u0016\u00ef\b"+
		"\u0016\u000b\u0016\f\u0016\u00f0\u0001\u0017\u0001\u0017\u0004\u0017\u00f5"+
		"\b\u0017\u000b\u0017\f\u0017\u00f6\u0001\u0018\u0001\u0018\u0004\u0018"+
		"\u00fb\b\u0018\u000b\u0018\f\u0018\u00fc\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0004\u0019\u0103\b\u0019\u000b\u0019\f\u0019\u0104"+
		"\u0001\u001a\u0001\u001a\u0004\u001a\u0109\b\u001a\u000b\u001a\f\u001a"+
		"\u010a\u0001\u001b\u0001\u001b\u0004\u001b\u010f\b\u001b\u000b\u001b\f"+
		"\u001b\u0110\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"\u0000\u0010\u0001\u0000\u0002\u0003\u0002\u0000*+00\u0001\u0000\u0004"+
		"\u0005\u0001\u0000\u0006\u0007\u0001\u0000\b\t\u0001\u0000\n\u000b\u0001"+
		"\u0000\f\r\u0001\u0000\u000e\u000f\u0001\u0000\u0010\u0011\u0001\u0000"+
		"\u0012\u0013\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0017\u0001\u0000"+
		"\u0019\u001a\u0001\u0000\u001f&\u0001\u0000\u001b\u001c\u0001\u0000\u001d"+
		"\u001e\u0112\u0000:\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000"+
		"\u0004G\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bV\u0001"+
		"\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000"+
		"\u000el\u0001\u0000\u0000\u0000\u0010p\u0001\u0000\u0000\u0000\u0012~"+
		"\u0001\u0000\u0000\u0000\u0014\u008a\u0001\u0000\u0000\u0000\u0016\u0096"+
		"\u0001\u0000\u0000\u0000\u0018\u00a0\u0001\u0000\u0000\u0000\u001a\u00a6"+
		"\u0001\u0000\u0000\u0000\u001c\u00ac\u0001\u0000\u0000\u0000\u001e\u00b2"+
		"\u0001\u0000\u0000\u0000 \u00ba\u0001\u0000\u0000\u0000\"\u00c0\u0001"+
		"\u0000\u0000\u0000$\u00c8\u0001\u0000\u0000\u0000&\u00cc\u0001\u0000\u0000"+
		"\u0000(\u00da\u0001\u0000\u0000\u0000*\u00e6\u0001\u0000\u0000\u0000,"+
		"\u00ec\u0001\u0000\u0000\u0000.\u00f2\u0001\u0000\u0000\u00000\u00f8\u0001"+
		"\u0000\u0000\u00002\u00fe\u0001\u0000\u0000\u00004\u0106\u0001\u0000\u0000"+
		"\u00006\u010c\u0001\u0000\u0000\u00008;\u0003\u0002\u0001\u00009;\u0003"+
		"\u0004\u0002\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000"+
		";\u0001\u0001\u0000\u0000\u0000<=\u0003\u0006\u0003\u0000=>\u0005/\u0000"+
		"\u0000>?\u0003\b\u0004\u0000?@\u0005/\u0000\u0000@A\u0003\n\u0005\u0000"+
		"AB\u0005/\u0000\u0000BC\u0003\u000e\u0007\u0000CD\u0005/\u0000\u0000D"+
		"E\u0003\f\u0006\u0000EF\u0005/\u0000\u0000F\u0003\u0001\u0000\u0000\u0000"+
		"GH\u0003\u0006\u0003\u0000HI\u0005/\u0000\u0000IJ\u0003\b\u0004\u0000"+
		"JK\u0005/\u0000\u0000KL\u0003\u000e\u0007\u0000LM\u0005/\u0000\u0000M"+
		"N\u0003\f\u0006\u0000NO\u0005/\u0000\u0000O\u0005\u0001\u0000\u0000\u0000"+
		"PR\u0005\u0001\u0000\u0000QS\u00051\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000U\u0007\u0001\u0000\u0000\u0000VX\u0007\u0000\u0000\u0000WY\u0007"+
		"\u0001\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\t\u0001\u0000\u0000"+
		"\u0000\\^\u0007\u0002\u0000\u0000]_\u0007\u0001\u0000\u0000^]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a\u000b\u0001\u0000\u0000\u0000bd\u0007\u0003\u0000"+
		"\u0000ce\u0007\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\r\u0001"+
		"\u0000\u0000\u0000hm\u0003\u0010\b\u0000im\u0003\u0012\t\u0000jm\u0003"+
		"\u0014\n\u0000km\u0003\u0016\u000b\u0000lh\u0001\u0000\u0000\u0000li\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000o\u000f\u0001\u0000\u0000\u0000pq\u0005/\u0000\u0000qr\u0003\u0018"+
		"\f\u0000rs\u0005/\u0000\u0000st\u0003\u001a\r\u0000tu\u0005/\u0000\u0000"+
		"uv\u0003\u001c\u000e\u0000vw\u0005/\u0000\u0000wx\u0003\u001e\u000f\u0000"+
		"xy\u0005/\u0000\u0000yz\u0003\"\u0011\u0000z{\u0005/\u0000\u0000{|\u0003"+
		"$\u0012\u0000|}\u0005/\u0000\u0000}\u0011\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005/\u0000\u0000\u007f\u0080\u0003\u0018\f\u0000\u0080\u0081\u0005"+
		"/\u0000\u0000\u0081\u0082\u0003\u001a\r\u0000\u0082\u0083\u0005/\u0000"+
		"\u0000\u0083\u0084\u0003\u001c\u000e\u0000\u0084\u0085\u0005/\u0000\u0000"+
		"\u0085\u0086\u0003\u001e\u000f\u0000\u0086\u0087\u0005/\u0000\u0000\u0087"+
		"\u0088\u0003$\u0012\u0000\u0088\u0089\u0005/\u0000\u0000\u0089\u0013\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005/\u0000\u0000\u008b\u008c\u0003\u0018"+
		"\f\u0000\u008c\u008d\u0005/\u0000\u0000\u008d\u008e\u0003\u001a\r\u0000"+
		"\u008e\u008f\u0005/\u0000\u0000\u008f\u0090\u0003\u001e\u000f\u0000\u0090"+
		"\u0091\u0005/\u0000\u0000\u0091\u0092\u0003\"\u0011\u0000\u0092\u0093"+
		"\u0005/\u0000\u0000\u0093\u0094\u0003$\u0012\u0000\u0094\u0095\u0005/"+
		"\u0000\u0000\u0095\u0015\u0001\u0000\u0000\u0000\u0096\u0097\u0005/\u0000"+
		"\u0000\u0097\u0098\u0003\u0018\f\u0000\u0098\u0099\u0005/\u0000\u0000"+
		"\u0099\u009a\u0003\u001a\r\u0000\u009a\u009b\u0005/\u0000\u0000\u009b"+
		"\u009c\u0003\u001e\u000f\u0000\u009c\u009d\u0005/\u0000\u0000\u009d\u009e"+
		"\u0003$\u0012\u0000\u009e\u009f\u0005/\u0000\u0000\u009f\u0017\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a2\u0007\u0004\u0000\u0000\u00a1\u00a3\u0005.\u0000"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00a8\u0007\u0005\u0000"+
		"\u0000\u00a7\u00a9\u0007\u0001\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u001b\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0007\u0006\u0000\u0000\u00ad\u00af\u0007\u0001\u0000"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2\u00b6\u0007\u0007\u0000"+
		"\u0000\u00b3\u00b7\u0005\'\u0000\u0000\u00b4\u00b7\u0005(\u0000\u0000"+
		"\u00b5\u00b7\u0003 \u0010\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u001f\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bc\u0007\b\u0000\u0000\u00bb\u00bd\u0007\u0001\u0000\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf!\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c2\u0007\t\u0000\u0000\u00c1\u00c3\u0005."+
		"\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5#\u0001\u0000\u0000\u0000\u00c6\u00c9\u0003&\u0013\u0000"+
		"\u00c7\u00c9\u0003(\u0014\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"%\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005/\u0000\u0000\u00cd\u00ce\u0003"+
		"*\u0015\u0000\u00ce\u00cf\u0005/\u0000\u0000\u00cf\u00d0\u0003,\u0016"+
		"\u0000\u00d0\u00d1\u0005/\u0000\u0000\u00d1\u00d2\u0003.\u0017\u0000\u00d2"+
		"\u00d3\u0005/\u0000\u0000\u00d3\u00d4\u00030\u0018\u0000\u00d4\u00d5\u0005"+
		"/\u0000\u0000\u00d5\u00d6\u00032\u0019\u0000\u00d6\u00d7\u0005/\u0000"+
		"\u0000\u00d7\u00d8\u00036\u001b\u0000\u00d8\u00d9\u0005/\u0000\u0000\u00d9"+
		"\'\u0001\u0000\u0000\u0000\u00da\u00db\u0005/\u0000\u0000\u00db\u00dc"+
		"\u0003*\u0015\u0000\u00dc\u00dd\u0005/\u0000\u0000\u00dd\u00de\u0003,"+
		"\u0016\u0000\u00de\u00df\u0005/\u0000\u0000\u00df\u00e0\u00030\u0018\u0000"+
		"\u00e0\u00e1\u0005/\u0000\u0000\u00e1\u00e2\u00032\u0019\u0000\u00e2\u00e3"+
		"\u0005/\u0000\u0000\u00e3\u00e4\u00036\u001b\u0000\u00e4\u00e5\u0005/"+
		"\u0000\u0000\u00e5)\u0001\u0000\u0000\u0000\u00e6\u00e8\u0007\n\u0000"+
		"\u0000\u00e7\u00e9\u0005.\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb+\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ee\u0007\u000b\u0000\u0000\u00ed\u00ef\u0007\u0001\u0000\u0000\u00ee"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"-\u0001\u0000\u0000\u0000\u00f2\u00f4\u0005\u0018\u0000\u0000\u00f3\u00f5"+
		"\u0007\u0001\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7/\u0001\u0000\u0000\u0000\u00f8\u00fa\u0007"+
		"\f\u0000\u0000\u00f9\u00fb\u0007\r\u0000\u0000\u00fa\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd1\u0001\u0000\u0000"+
		"\u0000\u00fe\u0102\u0007\u000e\u0000\u0000\u00ff\u0103\u0005\'\u0000\u0000"+
		"\u0100\u0103\u0005(\u0000\u0000\u0101\u0103\u00034\u001a\u0000\u0102\u00ff"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u01053\u0001"+
		"\u0000\u0000\u0000\u0106\u0108\u0007\b\u0000\u0000\u0107\u0109\u0007\u0001"+
		"\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b5\u0001\u0000\u0000\u0000\u010c\u010e\u0007\u000f\u0000"+
		"\u0000\u010d\u010f\u0007\u0001\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u01117\u0001\u0000\u0000\u0000"+
		"\u0018:TZ`fln\u00a4\u00aa\u00b0\u00b6\u00b8\u00be\u00c4\u00c8\u00ca\u00ea"+
		"\u00f0\u00f6\u00fc\u0102\u0104\u010a\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}