// Generated from C:/Users/joser/OneDrive/Ambiente de Trabalho/Projeto/lei21_22_s4_2di_02/base.core/src/main/java/eapli/base/answerQuestionnairemanagement/validation\QuestionnaireAnswerGrammar.g4 by ANTLR 4.10.1
package eapli.base.answerQuestionnairemanagement.validation;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuestionnaireAnswerGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, OBLIGAT=11, MANDATORY=12, OPTIONAL=13, CONDITIONAL=14, CONDITION=15, 
		REP=16, QUESTION=17, RESPONSEINPUT=18, TYPE=19, VALUECHECK=20, EXTRAINFO=21, 
		OPTION=22, OPTIONCHOICE=23, VALUE=24, MULTIPLEOPTIONCHOICE=25, OPTIONSCALING=26, 
		RESPONSE=27, FREETEXT=28, LIMITCHAR=29, LIMITCHARLINE=30, DECIMAL=31, 
		NUMERIC=32, SINGLECHOICE=33, INPUTOPTION=34, MULTIPLECHOICE=35, SORTING=36, 
		SCALING=37, SCALE=38, IDVALUE=39, NUMBER=40, DECIMALNUMBER=41, STRING=42, 
		STRING_ML=43, WS=44, NEWLINE=45;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_header = 2, RULE_id = 3, RULE_title = 4, 
		RULE_welmsg = 5, RULE_endmsg = 6, RULE_section = 7, RULE_sid = 8, RULE_descr = 9, 
		RULE_obligat = 10, RULE_rep = 11, RULE_condicional = 12, RULE_condition = 13, 
		RULE_question = 14, RULE_qid = 15, RULE_question_ask = 16, RULE_instructions = 17, 
		RULE_type = 18, RULE_responseinput = 19, RULE_valuecheck = 20, RULE_extrainfo = 21, 
		RULE_option = 22, RULE_response = 23, RULE_responsechoice = 24, RULE_responsescaling = 25, 
		RULE_freetext = 26, RULE_limitchar = 27, RULE_limitcharline = 28, RULE_numeric = 29, 
		RULE_singlechoice = 30, RULE_singlechoiceinput = 31, RULE_inputoption = 32, 
		RULE_multiplechoice = 33, RULE_multiplechoiceinput = 34, RULE_sorting = 35, 
		RULE_scaling = 36, RULE_scale = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "start", "header", "id", "title", "welmsg", "endmsg", "section", 
			"sid", "descr", "obligat", "rep", "condicional", "condition", "question", 
			"qid", "question_ask", "instructions", "type", "responseinput", "valuecheck", 
			"extrainfo", "option", "response", "responsechoice", "responsescaling", 
			"freetext", "limitchar", "limitcharline", "numeric", "singlechoice", 
			"singlechoiceinput", "inputoption", "multiplechoice", "multiplechoiceinput", 
			"sorting", "scaling", "scale"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ID:'", "'TITLE:'", "'WELCOME MENSAGE:'", "'END MENSAGE:'", "'SECTION ID:'", 
			"'DESCRIPTION:'", "'OBLIGATORINESS:'", "'QUESTION ID:'", "'INTRUCTIONS:'", 
			"'-'", "'OBLIGAT:'", "'MANDATORY'", "'OPTIONAL'", "'CONDITIONAL'", "'CONDITION:'", 
			"'REP:'", "'QUESTION:'", "'RESPONSEINPUT:'", "'TYPE:'", "'VALUECHECK:'", 
			"'EXTRAINFO:'", "'OPTION:'", null, "'VALUE:'", null, null, "'RESPONSE:'", 
			"'FREETEXT'", "'LIMITCHAR:'", "'LIMITCHARLINE:'", "'DECIMAL'", "'NUMERIC'", 
			"'SINGLECHOICE'", "'INPUTOPTION:'", "'MULTIPLECHOICE'", "'SORTING'", 
			"'SCALING'", "'SCALE:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "OBLIGAT", 
			"MANDATORY", "OPTIONAL", "CONDITIONAL", "CONDITION", "REP", "QUESTION", 
			"RESPONSEINPUT", "TYPE", "VALUECHECK", "EXTRAINFO", "OPTION", "OPTIONCHOICE", 
			"VALUE", "MULTIPLEOPTIONCHOICE", "OPTIONSCALING", "RESPONSE", "FREETEXT", 
			"LIMITCHAR", "LIMITCHARLINE", "DECIMAL", "NUMERIC", "SINGLECHOICE", "INPUTOPTION", 
			"MULTIPLECHOICE", "SORTING", "SCALING", "SCALE", "IDVALUE", "NUMBER", 
			"DECIMALNUMBER", "STRING", "STRING_ML", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "QuestionnaireAnswerGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuestionnaireAnswerGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				start();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public EndmsgContext endmsg() {
			return getRuleContext(EndmsgContext.class,0);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			header();
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				section();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(87);
			endmsg();
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

	public static class HeaderContext extends ParserRuleContext {
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
	 
		public HeaderContext() { }
		public void copyFrom(HeaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GenerateHeaderContext extends HeaderContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public WelmsgContext welmsg() {
			return getRuleContext(WelmsgContext.class,0);
		}
		public GenerateHeaderContext(HeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterGenerateHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitGenerateHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitGenerateHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		int _la;
		try {
			_localctx = new GenerateHeaderContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			id();
			setState(90);
			title();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(91);
				welmsg();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDVALUE() { return getToken(QuestionnaireAnswerGrammarParser.IDVALUE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			match(T__0);
			}
			setState(95);
			match(IDVALUE);
			setState(96);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QuestionnaireAnswerGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			match(T__1);
			}
			setState(99);
			match(STRING);
			setState(100);
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

	public static class WelmsgContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireAnswerGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireAnswerGrammarParser.STRING_ML, 0); }
		public WelmsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_welmsg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterWelmsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitWelmsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitWelmsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WelmsgContext welmsg() throws RecognitionException {
		WelmsgContext _localctx = new WelmsgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_welmsg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			match(T__2);
			}
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_ML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(104);
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

	public static class EndmsgContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireAnswerGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireAnswerGrammarParser.STRING_ML, 0); }
		public EndmsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endmsg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterEndmsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitEndmsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitEndmsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndmsgContext endmsg() throws RecognitionException {
		EndmsgContext _localctx = new EndmsgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_endmsg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			match(T__3);
			}
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_ML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(108);
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

	public static class SectionContext extends ParserRuleContext {
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
	 
		public SectionContext() { }
		public void copyFrom(SectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VerifySectionContext extends SectionContext {
		public SidContext sid() {
			return getRuleContext(SidContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public DescrContext descr() {
			return getRuleContext(DescrContext.class,0);
		}
		public ObligatContext obligat() {
			return getRuleContext(ObligatContext.class,0);
		}
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public VerifySectionContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterVerifySection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitVerifySection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitVerifySection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_section);
		int _la;
		try {
			_localctx = new VerifySectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			sid();
			setState(111);
			title();
			setState(112);
			descr();
			setState(113);
			obligat();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REP) {
				{
				setState(114);
				rep();
				}
			}

			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				question();
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
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

	public static class SidContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(QuestionnaireAnswerGrammarParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public SidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterSid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitSid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitSid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SidContext sid() throws RecognitionException {
		SidContext _localctx = new SidContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__4);
			setState(123);
			match(NUMBER);
			setState(124);
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

	public static class DescrContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireAnswerGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireAnswerGrammarParser.STRING_ML, 0); }
		public DescrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterDescr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitDescr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitDescr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescrContext descr() throws RecognitionException {
		DescrContext _localctx = new DescrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_descr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__5);
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_ML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
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

	public static class ObligatContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public TerminalNode MANDATORY() { return getToken(QuestionnaireAnswerGrammarParser.MANDATORY, 0); }
		public TerminalNode OPTIONAL() { return getToken(QuestionnaireAnswerGrammarParser.OPTIONAL, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public ObligatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obligat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterObligat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitObligat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitObligat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObligatContext obligat() throws RecognitionException {
		ObligatContext _localctx = new ObligatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_obligat);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__6);
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==MANDATORY || _la==OPTIONAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__6);
				setState(134);
				condicional();
				setState(135);
				match(NEWLINE);
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

	public static class RepContext extends ParserRuleContext {
		public TerminalNode REP() { return getToken(QuestionnaireAnswerGrammarParser.REP, 0); }
		public TerminalNode VALUE() { return getToken(QuestionnaireAnswerGrammarParser.VALUE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(QuestionnaireAnswerGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(QuestionnaireAnswerGrammarParser.NUMBER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(QuestionnaireAnswerGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(QuestionnaireAnswerGrammarParser.STRING, i);
		}
		public RepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterRep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitRep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitRep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepContext rep() throws RecognitionException {
		RepContext _localctx = new RepContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(REP);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				match(NUMBER);
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(145);
			match(VALUE);
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					match(STRING);
					}
					}
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case NUMBER:
				{
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151);
					match(NUMBER);
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode CONDITIONAL() { return getToken(QuestionnaireAnswerGrammarParser.CONDITIONAL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(CONDITIONAL);
			setState(161);
			condition();
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode CONDITION() { return getToken(QuestionnaireAnswerGrammarParser.CONDITION, 0); }
		public TerminalNode NUMBER() { return getToken(QuestionnaireAnswerGrammarParser.NUMBER, 0); }
		public TerminalNode VALUE() { return getToken(QuestionnaireAnswerGrammarParser.VALUE, 0); }
		public TerminalNode OPTIONCHOICE() { return getToken(QuestionnaireAnswerGrammarParser.OPTIONCHOICE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CONDITION);
			setState(164);
			match(T__7);
			setState(165);
			match(NUMBER);
			setState(166);
			match(VALUE);
			setState(167);
			match(OPTIONCHOICE);
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
		public QidContext qid() {
			return getRuleContext(QidContext.class,0);
		}
		public Question_askContext question_ask() {
			return getRuleContext(Question_askContext.class,0);
		}
		public ObligatContext obligat() {
			return getRuleContext(ObligatContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_question);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				qid();
				setState(170);
				question_ask();
				setState(171);
				obligat();
				setState(172);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				qid();
				setState(175);
				question_ask();
				setState(176);
				instructions();
				setState(177);
				obligat();
				setState(178);
				type();
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

	public static class QidContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(QuestionnaireAnswerGrammarParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public QidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterQid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitQid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitQid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QidContext qid() throws RecognitionException {
		QidContext _localctx = new QidContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_qid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__7);
			setState(183);
			match(NUMBER);
			setState(184);
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

	public static class Question_askContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(QuestionnaireAnswerGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireAnswerGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public Question_askContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_ask; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterQuestion_ask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitQuestion_ask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitQuestion_ask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_askContext question_ask() throws RecognitionException {
		Question_askContext _localctx = new Question_askContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_question_ask);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(QUESTION);
			setState(187);
			match(STRING);
			setState(188);
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

	public static class InstructionsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireAnswerGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireAnswerGrammarParser.STRING_ML, 0); }
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__8);
			setState(191);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_ML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(192);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VerifyMultipleChoiceContext extends TypeContext {
		public TerminalNode TYPE() { return getToken(QuestionnaireAnswerGrammarParser.TYPE, 0); }
		public MultiplechoiceContext multiplechoice() {
			return getRuleContext(MultiplechoiceContext.class,0);
		}
		public ResponsechoiceContext responsechoice() {
			return getRuleContext(ResponsechoiceContext.class,0);
		}
		public VerifyMultipleChoiceContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterVerifyMultipleChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitVerifyMultipleChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitVerifyMultipleChoice(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerifySingleChoiceContext extends TypeContext {
		public TerminalNode TYPE() { return getToken(QuestionnaireAnswerGrammarParser.TYPE, 0); }
		public SinglechoiceContext singlechoice() {
			return getRuleContext(SinglechoiceContext.class,0);
		}
		public ResponsechoiceContext responsechoice() {
			return getRuleContext(ResponsechoiceContext.class,0);
		}
		public VerifySingleChoiceContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterVerifySingleChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitVerifySingleChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitVerifySingleChoice(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerifyNumericContext extends TypeContext {
		public TerminalNode TYPE() { return getToken(QuestionnaireAnswerGrammarParser.TYPE, 0); }
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public ResponseContext response() {
			return getRuleContext(ResponseContext.class,0);
		}
		public VerifyNumericContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterVerifyNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitVerifyNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitVerifyNumeric(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerifyMultipleChoiceInputContext extends TypeContext {
		public TerminalNode TYPE() { return getToken(QuestionnaireAnswerGrammarParser.TYPE, 0); }
		public MultiplechoiceinputContext multiplechoiceinput() {
			return getRuleContext(MultiplechoiceinputContext.class,0);
		}
		public ResponsechoiceContext responsechoice() {
			return getRuleContext(ResponsechoiceContext.class,0);
		}
		public ResponseinputContext responseinput() {
			return getRuleContext(ResponseinputContext.class,0);
		}
		public VerifyMultipleChoiceInputContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterVerifyMultipleChoiceInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitVerifyMultipleChoiceInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitVerifyMultipleChoiceInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerifySingleChoiceInputContext extends TypeContext {
		public TerminalNode TYPE() { return getToken(QuestionnaireAnswerGrammarParser.TYPE, 0); }
		public SinglechoiceinputContext singlechoiceinput() {
			return getRuleContext(SinglechoiceinputContext.class,0);
		}
		public ResponsechoiceContext responsechoice() {
			return getRuleContext(ResponsechoiceContext.class,0);
		}
		public ResponseinputContext responseinput() {
			return getRuleContext(ResponseinputContext.class,0);
		}
		public VerifySingleChoiceInputContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterVerifySingleChoiceInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitVerifySingleChoiceInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitVerifySingleChoiceInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerifyFreeTextContext extends TypeContext {
		public TerminalNode TYPE() { return getToken(QuestionnaireAnswerGrammarParser.TYPE, 0); }
		public FreetextContext freetext() {
			return getRuleContext(FreetextContext.class,0);
		}
		public ResponseContext response() {
			return getRuleContext(ResponseContext.class,0);
		}
		public VerifyFreeTextContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterVerifyFreeText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitVerifyFreeText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitVerifyFreeText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerifySortingContext extends TypeContext {
		public TerminalNode TYPE() { return getToken(QuestionnaireAnswerGrammarParser.TYPE, 0); }
		public SortingContext sorting() {
			return getRuleContext(SortingContext.class,0);
		}
		public ResponsechoiceContext responsechoice() {
			return getRuleContext(ResponsechoiceContext.class,0);
		}
		public VerifySortingContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterVerifySorting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitVerifySorting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitVerifySorting(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerifyScalingContext extends TypeContext {
		public TerminalNode TYPE() { return getToken(QuestionnaireAnswerGrammarParser.TYPE, 0); }
		public ScalingContext scaling() {
			return getRuleContext(ScalingContext.class,0);
		}
		public ResponsescalingContext responsescaling() {
			return getRuleContext(ResponsescalingContext.class,0);
		}
		public VerifyScalingContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterVerifyScaling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitVerifyScaling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitVerifyScaling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new VerifyFreeTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(TYPE);
				setState(195);
				freetext();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESPONSE) {
					{
					setState(196);
					response();
					}
				}

				}
				break;
			case 2:
				_localctx = new VerifyNumericContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(TYPE);
				setState(200);
				numeric();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESPONSE) {
					{
					setState(201);
					response();
					}
				}

				}
				break;
			case 3:
				_localctx = new VerifySingleChoiceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(TYPE);
				setState(205);
				singlechoice();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESPONSE) {
					{
					setState(206);
					responsechoice();
					}
				}

				}
				break;
			case 4:
				_localctx = new VerifySingleChoiceInputContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(TYPE);
				setState(210);
				singlechoiceinput();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESPONSE) {
					{
					setState(211);
					responsechoice();
					}
				}

				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESPONSEINPUT) {
					{
					setState(214);
					responseinput();
					}
				}

				}
				break;
			case 5:
				_localctx = new VerifyMultipleChoiceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				match(TYPE);
				setState(218);
				multiplechoice();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESPONSE) {
					{
					setState(219);
					responsechoice();
					}
				}

				}
				break;
			case 6:
				_localctx = new VerifyMultipleChoiceInputContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(TYPE);
				setState(223);
				multiplechoiceinput();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESPONSE) {
					{
					setState(224);
					responsechoice();
					}
				}

				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESPONSEINPUT) {
					{
					setState(227);
					responseinput();
					}
				}

				}
				break;
			case 7:
				_localctx = new VerifySortingContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				match(TYPE);
				setState(231);
				sorting();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESPONSE) {
					{
					setState(232);
					responsechoice();
					}
				}

				}
				break;
			case 8:
				_localctx = new VerifyScalingContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				match(TYPE);
				setState(236);
				scaling();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESPONSE) {
					{
					setState(237);
					responsescaling();
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

	public static class ResponseinputContext extends ParserRuleContext {
		public TerminalNode RESPONSEINPUT() { return getToken(QuestionnaireAnswerGrammarParser.RESPONSEINPUT, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireAnswerGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public ResponseinputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseinput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterResponseinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitResponseinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitResponseinput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResponseinputContext responseinput() throws RecognitionException {
		ResponseinputContext _localctx = new ResponseinputContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_responseinput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(RESPONSEINPUT);
			setState(243);
			match(STRING);
			setState(244);
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

	public static class ValuecheckContext extends ParserRuleContext {
		public TerminalNode VALUECHECK() { return getToken(QuestionnaireAnswerGrammarParser.VALUECHECK, 0); }
		public TerminalNode OPTIONCHOICE() { return getToken(QuestionnaireAnswerGrammarParser.OPTIONCHOICE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public ValuecheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuecheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterValuecheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitValuecheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitValuecheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuecheckContext valuecheck() throws RecognitionException {
		ValuecheckContext _localctx = new ValuecheckContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valuecheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(VALUECHECK);
			setState(247);
			match(OPTIONCHOICE);
			setState(248);
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

	public static class ExtrainfoContext extends ParserRuleContext {
		public ExtrainfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extrainfo; }
	 
		public ExtrainfoContext() { }
		public void copyFrom(ExtrainfoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcessExtraInfoContext extends ExtrainfoContext {
		public TerminalNode EXTRAINFO() { return getToken(QuestionnaireAnswerGrammarParser.EXTRAINFO, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public TerminalNode STRING() { return getToken(QuestionnaireAnswerGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireAnswerGrammarParser.STRING_ML, 0); }
		public ProcessExtraInfoContext(ExtrainfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterProcessExtraInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitProcessExtraInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitProcessExtraInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtrainfoContext extrainfo() throws RecognitionException {
		ExtrainfoContext _localctx = new ExtrainfoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_extrainfo);
		int _la;
		try {
			_localctx = new ProcessExtraInfoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(EXTRAINFO);
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_ML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(252);
			match(NEWLINE);
			setState(253);
			option();
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				option();
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPTION );
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(QuestionnaireAnswerGrammarParser.OPTION, 0); }
		public TerminalNode OPTIONCHOICE() { return getToken(QuestionnaireAnswerGrammarParser.OPTIONCHOICE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionnaireAnswerGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, i);
		}
		public DescrContext descr() {
			return getRuleContext(DescrContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(OPTION);
			setState(260);
			match(OPTIONCHOICE);
			setState(261);
			match(NEWLINE);
			setState(262);
			descr();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(263);
				match(NEWLINE);
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

	public static class ResponseContext extends ParserRuleContext {
		public TerminalNode RESPONSE() { return getToken(QuestionnaireAnswerGrammarParser.RESPONSE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireAnswerGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireAnswerGrammarParser.STRING_ML, 0); }
		public TerminalNode NUMBER() { return getToken(QuestionnaireAnswerGrammarParser.NUMBER, 0); }
		public TerminalNode DECIMALNUMBER() { return getToken(QuestionnaireAnswerGrammarParser.DECIMALNUMBER, 0); }
		public ResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitResponse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitResponse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResponseContext response() throws RecognitionException {
		ResponseContext _localctx = new ResponseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(RESPONSE);
			setState(267);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << DECIMALNUMBER) | (1L << STRING) | (1L << STRING_ML))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(268);
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

	public static class ResponsechoiceContext extends ParserRuleContext {
		public TerminalNode RESPONSE() { return getToken(QuestionnaireAnswerGrammarParser.RESPONSE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public TerminalNode OPTIONCHOICE() { return getToken(QuestionnaireAnswerGrammarParser.OPTIONCHOICE, 0); }
		public TerminalNode MULTIPLEOPTIONCHOICE() { return getToken(QuestionnaireAnswerGrammarParser.MULTIPLEOPTIONCHOICE, 0); }
		public ResponsechoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responsechoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterResponsechoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitResponsechoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitResponsechoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResponsechoiceContext responsechoice() throws RecognitionException {
		ResponsechoiceContext _localctx = new ResponsechoiceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_responsechoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(RESPONSE);
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==OPTIONCHOICE || _la==MULTIPLEOPTIONCHOICE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(272);
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

	public static class ResponsescalingContext extends ParserRuleContext {
		public TerminalNode RESPONSE() { return getToken(QuestionnaireAnswerGrammarParser.RESPONSE, 0); }
		public TerminalNode OPTIONSCALING() { return getToken(QuestionnaireAnswerGrammarParser.OPTIONSCALING, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public ResponsescalingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responsescaling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterResponsescaling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitResponsescaling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitResponsescaling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResponsescalingContext responsescaling() throws RecognitionException {
		ResponsescalingContext _localctx = new ResponsescalingContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_responsescaling);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(RESPONSE);
			setState(275);
			match(OPTIONSCALING);
			setState(276);
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

	public static class FreetextContext extends ParserRuleContext {
		public TerminalNode FREETEXT() { return getToken(QuestionnaireAnswerGrammarParser.FREETEXT, 0); }
		public LimitcharContext limitchar() {
			return getRuleContext(LimitcharContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public LimitcharlineContext limitcharline() {
			return getRuleContext(LimitcharlineContext.class,0);
		}
		public FreetextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freetext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterFreetext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitFreetext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitFreetext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreetextContext freetext() throws RecognitionException {
		FreetextContext _localctx = new FreetextContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_freetext);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(FREETEXT);
				setState(279);
				limitchar();
				setState(280);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(FREETEXT);
				setState(283);
				limitcharline();
				setState(284);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(FREETEXT);
				setState(287);
				match(NEWLINE);
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

	public static class LimitcharContext extends ParserRuleContext {
		public TerminalNode LIMITCHAR() { return getToken(QuestionnaireAnswerGrammarParser.LIMITCHAR, 0); }
		public TerminalNode NUMBER() { return getToken(QuestionnaireAnswerGrammarParser.NUMBER, 0); }
		public LimitcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterLimitchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitLimitchar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitLimitchar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitcharContext limitchar() throws RecognitionException {
		LimitcharContext _localctx = new LimitcharContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_limitchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(LIMITCHAR);
			setState(291);
			match(NUMBER);
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

	public static class LimitcharlineContext extends ParserRuleContext {
		public TerminalNode LIMITCHARLINE() { return getToken(QuestionnaireAnswerGrammarParser.LIMITCHARLINE, 0); }
		public TerminalNode NUMBER() { return getToken(QuestionnaireAnswerGrammarParser.NUMBER, 0); }
		public LimitcharlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitcharline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterLimitcharline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitLimitcharline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitLimitcharline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitcharlineContext limitcharline() throws RecognitionException {
		LimitcharlineContext _localctx = new LimitcharlineContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_limitcharline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(LIMITCHARLINE);
			setState(294);
			match(NUMBER);
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

	public static class NumericContext extends ParserRuleContext {
		public TerminalNode NUMERIC() { return getToken(QuestionnaireAnswerGrammarParser.NUMERIC, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public ValuecheckContext valuecheck() {
			return getRuleContext(ValuecheckContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(QuestionnaireAnswerGrammarParser.DECIMAL, 0); }
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitNumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_numeric);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUECHECK) {
					{
					setState(296);
					valuecheck();
					}
				}

				setState(299);
				match(NUMERIC);
				setState(300);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUECHECK) {
					{
					setState(301);
					valuecheck();
					}
				}

				setState(304);
				match(DECIMAL);
				setState(305);
				match(NEWLINE);
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

	public static class SinglechoiceContext extends ParserRuleContext {
		public TerminalNode SINGLECHOICE() { return getToken(QuestionnaireAnswerGrammarParser.SINGLECHOICE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public ExtrainfoContext extrainfo() {
			return getRuleContext(ExtrainfoContext.class,0);
		}
		public ValuecheckContext valuecheck() {
			return getRuleContext(ValuecheckContext.class,0);
		}
		public SinglechoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlechoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterSinglechoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitSinglechoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitSinglechoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglechoiceContext singlechoice() throws RecognitionException {
		SinglechoiceContext _localctx = new SinglechoiceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_singlechoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(SINGLECHOICE);
			setState(309);
			match(NEWLINE);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUECHECK) {
				{
				setState(310);
				valuecheck();
				}
			}

			setState(313);
			extrainfo();
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

	public static class SinglechoiceinputContext extends ParserRuleContext {
		public SinglechoiceContext singlechoice() {
			return getRuleContext(SinglechoiceContext.class,0);
		}
		public InputoptionContext inputoption() {
			return getRuleContext(InputoptionContext.class,0);
		}
		public ValuecheckContext valuecheck() {
			return getRuleContext(ValuecheckContext.class,0);
		}
		public SinglechoiceinputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlechoiceinput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterSinglechoiceinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitSinglechoiceinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitSinglechoiceinput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglechoiceinputContext singlechoiceinput() throws RecognitionException {
		SinglechoiceinputContext _localctx = new SinglechoiceinputContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_singlechoiceinput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			singlechoice();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUECHECK) {
				{
				setState(316);
				valuecheck();
				}
			}

			setState(319);
			inputoption();
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

	public static class InputoptionContext extends ParserRuleContext {
		public TerminalNode INPUTOPTION() { return getToken(QuestionnaireAnswerGrammarParser.INPUTOPTION, 0); }
		public TerminalNode OPTIONCHOICE() { return getToken(QuestionnaireAnswerGrammarParser.OPTIONCHOICE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public ValuecheckContext valuecheck() {
			return getRuleContext(ValuecheckContext.class,0);
		}
		public InputoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterInputoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitInputoption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitInputoption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputoptionContext inputoption() throws RecognitionException {
		InputoptionContext _localctx = new InputoptionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_inputoption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(INPUTOPTION);
			setState(322);
			match(OPTIONCHOICE);
			setState(323);
			match(NEWLINE);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUECHECK) {
				{
				setState(324);
				valuecheck();
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

	public static class MultiplechoiceContext extends ParserRuleContext {
		public TerminalNode MULTIPLECHOICE() { return getToken(QuestionnaireAnswerGrammarParser.MULTIPLECHOICE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public ExtrainfoContext extrainfo() {
			return getRuleContext(ExtrainfoContext.class,0);
		}
		public ValuecheckContext valuecheck() {
			return getRuleContext(ValuecheckContext.class,0);
		}
		public MultiplechoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplechoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterMultiplechoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitMultiplechoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitMultiplechoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplechoiceContext multiplechoice() throws RecognitionException {
		MultiplechoiceContext _localctx = new MultiplechoiceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiplechoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(MULTIPLECHOICE);
			setState(328);
			match(NEWLINE);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUECHECK) {
				{
				setState(329);
				valuecheck();
				}
			}

			setState(332);
			extrainfo();
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

	public static class MultiplechoiceinputContext extends ParserRuleContext {
		public MultiplechoiceContext multiplechoice() {
			return getRuleContext(MultiplechoiceContext.class,0);
		}
		public InputoptionContext inputoption() {
			return getRuleContext(InputoptionContext.class,0);
		}
		public ValuecheckContext valuecheck() {
			return getRuleContext(ValuecheckContext.class,0);
		}
		public MultiplechoiceinputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplechoiceinput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterMultiplechoiceinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitMultiplechoiceinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitMultiplechoiceinput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplechoiceinputContext multiplechoiceinput() throws RecognitionException {
		MultiplechoiceinputContext _localctx = new MultiplechoiceinputContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiplechoiceinput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			multiplechoice();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUECHECK) {
				{
				setState(335);
				valuecheck();
				}
			}

			setState(338);
			inputoption();
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

	public static class SortingContext extends ParserRuleContext {
		public TerminalNode SORTING() { return getToken(QuestionnaireAnswerGrammarParser.SORTING, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, 0); }
		public ExtrainfoContext extrainfo() {
			return getRuleContext(ExtrainfoContext.class,0);
		}
		public SortingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterSorting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitSorting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitSorting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortingContext sorting() throws RecognitionException {
		SortingContext _localctx = new SortingContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sorting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(SORTING);
			setState(341);
			match(NEWLINE);
			setState(342);
			extrainfo();
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

	public static class ScalingContext extends ParserRuleContext {
		public TerminalNode SCALING() { return getToken(QuestionnaireAnswerGrammarParser.SCALING, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionnaireAnswerGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionnaireAnswerGrammarParser.NEWLINE, i);
		}
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public ExtrainfoContext extrainfo() {
			return getRuleContext(ExtrainfoContext.class,0);
		}
		public ScalingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterScaling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitScaling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitScaling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalingContext scaling() throws RecognitionException {
		ScalingContext _localctx = new ScalingContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_scaling);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(SCALING);
			setState(345);
			match(NEWLINE);
			setState(346);
			scale();
			setState(347);
			match(NEWLINE);
			setState(348);
			extrainfo();
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

	public static class ScaleContext extends ParserRuleContext {
		public TerminalNode SCALE() { return getToken(QuestionnaireAnswerGrammarParser.SCALE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(QuestionnaireAnswerGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(QuestionnaireAnswerGrammarParser.NUMBER, i);
		}
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireAnswerGrammarListener ) ((QuestionnaireAnswerGrammarListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireAnswerGrammarVisitor ) return ((QuestionnaireAnswerGrammarVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(SCALE);
			setState(351);
			match(NUMBER);
			setState(352);
			match(T__9);
			setState(353);
			match(NUMBER);
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
		"\u0004\u0001-\u0164\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0004\u0000N\b\u0000"+
		"\u000b\u0000\f\u0000O\u0001\u0001\u0001\u0001\u0004\u0001T\b\u0001\u000b"+
		"\u0001\f\u0001U\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002]\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007t\b\u0007\u0001\u0007\u0004\u0007w\b\u0007\u000b\u0007\f\u0007x"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008a\b\n\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u008e\b\u000b\u000b\u000b\f\u000b\u008f"+
		"\u0001\u000b\u0001\u000b\u0004\u000b\u0094\b\u000b\u000b\u000b\f\u000b"+
		"\u0095\u0001\u000b\u0004\u000b\u0099\b\u000b\u000b\u000b\f\u000b\u009a"+
		"\u0003\u000b\u009d\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b5\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00c6\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00cb\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00d0\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00d5\b\u0012\u0001\u0012\u0003\u0012\u00d8\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00dd\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00e2\b\u0012\u0001\u0012\u0003\u0012\u00e5\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ea\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00ef\b\u0012\u0003\u0012\u00f1\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0004\u0015\u0100\b\u0015\u000b\u0015\f\u0015\u0101"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0109\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0121\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0003\u001d\u012a\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u012f\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0133\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0138\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u013e"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u0146"+
		"\b \u0001!\u0001!\u0001!\u0003!\u014b\b!\u0001!\u0001!\u0001\"\u0001\""+
		"\u0003\"\u0151\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0000\u0000&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0004"+
		"\u0001\u0000*+\u0001\u0000\f\r\u0001\u0000(+\u0002\u0000\u0017\u0017\u0019"+
		"\u0019\u0165\u0000M\u0001\u0000\u0000\u0000\u0002Q\u0001\u0000\u0000\u0000"+
		"\u0004Y\u0001\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\bb\u0001"+
		"\u0000\u0000\u0000\nf\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000"+
		"\u000en\u0001\u0000\u0000\u0000\u0010z\u0001\u0000\u0000\u0000\u0012~"+
		"\u0001\u0000\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u008b"+
		"\u0001\u0000\u0000\u0000\u0018\u00a0\u0001\u0000\u0000\u0000\u001a\u00a3"+
		"\u0001\u0000\u0000\u0000\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00b6"+
		"\u0001\u0000\u0000\u0000 \u00ba\u0001\u0000\u0000\u0000\"\u00be\u0001"+
		"\u0000\u0000\u0000$\u00f0\u0001\u0000\u0000\u0000&\u00f2\u0001\u0000\u0000"+
		"\u0000(\u00f6\u0001\u0000\u0000\u0000*\u00fa\u0001\u0000\u0000\u0000,"+
		"\u0103\u0001\u0000\u0000\u0000.\u010a\u0001\u0000\u0000\u00000\u010e\u0001"+
		"\u0000\u0000\u00002\u0112\u0001\u0000\u0000\u00004\u0120\u0001\u0000\u0000"+
		"\u00006\u0122\u0001\u0000\u0000\u00008\u0125\u0001\u0000\u0000\u0000:"+
		"\u0132\u0001\u0000\u0000\u0000<\u0134\u0001\u0000\u0000\u0000>\u013b\u0001"+
		"\u0000\u0000\u0000@\u0141\u0001\u0000\u0000\u0000B\u0147\u0001\u0000\u0000"+
		"\u0000D\u014e\u0001\u0000\u0000\u0000F\u0154\u0001\u0000\u0000\u0000H"+
		"\u0158\u0001\u0000\u0000\u0000J\u015e\u0001\u0000\u0000\u0000LN\u0003"+
		"\u0002\u0001\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0001\u0001\u0000"+
		"\u0000\u0000QS\u0003\u0004\u0002\u0000RT\u0003\u000e\u0007\u0000SR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0003\f\u0006\u0000"+
		"X\u0003\u0001\u0000\u0000\u0000YZ\u0003\u0006\u0003\u0000Z\\\u0003\b\u0004"+
		"\u0000[]\u0003\n\u0005\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]\u0005\u0001\u0000\u0000\u0000^_\u0005\u0001\u0000\u0000"+
		"_`\u0005\'\u0000\u0000`a\u0005-\u0000\u0000a\u0007\u0001\u0000\u0000\u0000"+
		"bc\u0005\u0002\u0000\u0000cd\u0005*\u0000\u0000de\u0005-\u0000\u0000e"+
		"\t\u0001\u0000\u0000\u0000fg\u0005\u0003\u0000\u0000gh\u0007\u0000\u0000"+
		"\u0000hi\u0005-\u0000\u0000i\u000b\u0001\u0000\u0000\u0000jk\u0005\u0004"+
		"\u0000\u0000kl\u0007\u0000\u0000\u0000lm\u0005-\u0000\u0000m\r\u0001\u0000"+
		"\u0000\u0000no\u0003\u0010\b\u0000op\u0003\b\u0004\u0000pq\u0003\u0012"+
		"\t\u0000qs\u0003\u0014\n\u0000rt\u0003\u0016\u000b\u0000sr\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000uw\u0003"+
		"\u001c\u000e\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u000f\u0001\u0000"+
		"\u0000\u0000z{\u0005\u0005\u0000\u0000{|\u0005(\u0000\u0000|}\u0005-\u0000"+
		"\u0000}\u0011\u0001\u0000\u0000\u0000~\u007f\u0005\u0006\u0000\u0000\u007f"+
		"\u0080\u0007\u0000\u0000\u0000\u0080\u0081\u0005-\u0000\u0000\u0081\u0013"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0007\u0000\u0000\u0083\u0084"+
		"\u0007\u0001\u0000\u0000\u0084\u008a\u0005-\u0000\u0000\u0085\u0086\u0005"+
		"\u0007\u0000\u0000\u0086\u0087\u0003\u0018\f\u0000\u0087\u0088\u0005-"+
		"\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0082\u0001\u0000"+
		"\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u008a\u0015\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0005\u0010\u0000\u0000\u008c\u008e\u0005(\u0000"+
		"\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u009c\u0005\u0018\u0000"+
		"\u0000\u0092\u0094\u0005*\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u009d\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0005(\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c"+
		"\u0093\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005-\u0000\u0000\u009f\u0017"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u000e\u0000\u0000\u00a1\u00a2"+
		"\u0003\u001a\r\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u000f\u0000\u0000\u00a4\u00a5\u0005\b\u0000\u0000\u00a5\u00a6\u0005("+
		"\u0000\u0000\u00a6\u00a7\u0005\u0018\u0000\u0000\u00a7\u00a8\u0005\u0017"+
		"\u0000\u0000\u00a8\u001b\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003\u001e"+
		"\u000f\u0000\u00aa\u00ab\u0003 \u0010\u0000\u00ab\u00ac\u0003\u0014\n"+
		"\u0000\u00ac\u00ad\u0003$\u0012\u0000\u00ad\u00b5\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0003\u001e\u000f\u0000\u00af\u00b0\u0003 \u0010\u0000\u00b0"+
		"\u00b1\u0003\"\u0011\u0000\u00b1\u00b2\u0003\u0014\n\u0000\u00b2\u00b3"+
		"\u0003$\u0012\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00a9\u0001"+
		"\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b5\u001d\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\b\u0000\u0000\u00b7\u00b8\u0005("+
		"\u0000\u0000\u00b8\u00b9\u0005-\u0000\u0000\u00b9\u001f\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005\u0011\u0000\u0000\u00bb\u00bc\u0005*\u0000\u0000"+
		"\u00bc\u00bd\u0005-\u0000\u0000\u00bd!\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005\t\u0000\u0000\u00bf\u00c0\u0007\u0000\u0000\u0000\u00c0\u00c1\u0005"+
		"-\u0000\u0000\u00c1#\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0013\u0000"+
		"\u0000\u00c3\u00c5\u00034\u001a\u0000\u00c4\u00c6\u0003.\u0017\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00f1\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0013\u0000\u0000\u00c8"+
		"\u00ca\u0003:\u001d\u0000\u00c9\u00cb\u0003.\u0017\u0000\u00ca\u00c9\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00f1\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005\u0013\u0000\u0000\u00cd\u00cf\u0003"+
		"<\u001e\u0000\u00ce\u00d0\u00030\u0018\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00f1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0013\u0000\u0000\u00d2\u00d4\u0003>\u001f\u0000"+
		"\u00d3\u00d5\u00030\u0018\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d8\u0003&\u0013\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00f1\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005\u0013\u0000\u0000\u00da\u00dc\u0003B!\u0000\u00db\u00dd\u00030"+
		"\u0018\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00f1\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0013"+
		"\u0000\u0000\u00df\u00e1\u0003D\"\u0000\u00e0\u00e2\u00030\u0018\u0000"+
		"\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e5\u0003&\u0013\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00f1\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0013\u0000\u0000\u00e7"+
		"\u00e9\u0003F#\u0000\u00e8\u00ea\u00030\u0018\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00f1\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005\u0013\u0000\u0000\u00ec\u00ee\u0003"+
		"H$\u0000\u00ed\u00ef\u00032\u0019\u0000\u00ee\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00c2\u0001\u0000\u0000\u0000\u00f0\u00c7\u0001\u0000\u0000"+
		"\u0000\u00f0\u00cc\u0001\u0000\u0000\u0000\u00f0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00d9\u0001\u0000\u0000\u0000\u00f0\u00de\u0001\u0000\u0000"+
		"\u0000\u00f0\u00e6\u0001\u0000\u0000\u0000\u00f0\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f1%\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0012\u0000\u0000"+
		"\u00f3\u00f4\u0005*\u0000\u0000\u00f4\u00f5\u0005-\u0000\u0000\u00f5\'"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0014\u0000\u0000\u00f7\u00f8"+
		"\u0005\u0017\u0000\u0000\u00f8\u00f9\u0005-\u0000\u0000\u00f9)\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0005\u0015\u0000\u0000\u00fb\u00fc\u0007\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005-\u0000\u0000\u00fd\u00ff\u0003,\u0016\u0000"+
		"\u00fe\u0100\u0003,\u0016\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102+\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0005\u0016\u0000\u0000\u0104\u0105\u0005\u0017\u0000\u0000\u0105\u0106"+
		"\u0005-\u0000\u0000\u0106\u0108\u0003\u0012\t\u0000\u0107\u0109\u0005"+
		"-\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109-\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u001b\u0000"+
		"\u0000\u010b\u010c\u0007\u0002\u0000\u0000\u010c\u010d\u0005-\u0000\u0000"+
		"\u010d/\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u001b\u0000\u0000\u010f"+
		"\u0110\u0007\u0003\u0000\u0000\u0110\u0111\u0005-\u0000\u0000\u01111\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005\u001b\u0000\u0000\u0113\u0114\u0005"+
		"\u001a\u0000\u0000\u0114\u0115\u0005-\u0000\u0000\u01153\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005\u001c\u0000\u0000\u0117\u0118\u00036\u001b\u0000"+
		"\u0118\u0119\u0005-\u0000\u0000\u0119\u0121\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0005\u001c\u0000\u0000\u011b\u011c\u00038\u001c\u0000\u011c\u011d"+
		"\u0005-\u0000\u0000\u011d\u0121\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		"\u001c\u0000\u0000\u011f\u0121\u0005-\u0000\u0000\u0120\u0116\u0001\u0000"+
		"\u0000\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u01215\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u001d\u0000"+
		"\u0000\u0123\u0124\u0005(\u0000\u0000\u01247\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0005\u001e\u0000\u0000\u0126\u0127\u0005(\u0000\u0000\u01279\u0001"+
		"\u0000\u0000\u0000\u0128\u012a\u0003(\u0014\u0000\u0129\u0128\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005 \u0000\u0000\u012c\u0133\u0005-\u0000\u0000"+
		"\u012d\u012f\u0003(\u0014\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0005\u001f\u0000\u0000\u0131\u0133\u0005-\u0000\u0000\u0132\u0129"+
		"\u0001\u0000\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0133;\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005!\u0000\u0000\u0135\u0137\u0005-\u0000"+
		"\u0000\u0136\u0138\u0003(\u0014\u0000\u0137\u0136\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0003*\u0015\u0000\u013a=\u0001\u0000\u0000\u0000\u013b\u013d"+
		"\u0003<\u001e\u0000\u013c\u013e\u0003(\u0014\u0000\u013d\u013c\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0003@ \u0000\u0140?\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0005\"\u0000\u0000\u0142\u0143\u0005\u0017\u0000\u0000\u0143"+
		"\u0145\u0005-\u0000\u0000\u0144\u0146\u0003(\u0014\u0000\u0145\u0144\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146A\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0005#\u0000\u0000\u0148\u014a\u0005-\u0000\u0000"+
		"\u0149\u014b\u0003(\u0014\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0003*\u0015\u0000\u014dC\u0001\u0000\u0000\u0000\u014e\u0150\u0003"+
		"B!\u0000\u014f\u0151\u0003(\u0014\u0000\u0150\u014f\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0003@ \u0000\u0153E\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005$\u0000\u0000\u0155\u0156\u0005-\u0000\u0000\u0156\u0157\u0003"+
		"*\u0015\u0000\u0157G\u0001\u0000\u0000\u0000\u0158\u0159\u0005%\u0000"+
		"\u0000\u0159\u015a\u0005-\u0000\u0000\u015a\u015b\u0003J%\u0000\u015b"+
		"\u015c\u0005-\u0000\u0000\u015c\u015d\u0003*\u0015\u0000\u015dI\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0005&\u0000\u0000\u015f\u0160\u0005(\u0000"+
		"\u0000\u0160\u0161\u0005\n\u0000\u0000\u0161\u0162\u0005(\u0000\u0000"+
		"\u0162K\u0001\u0000\u0000\u0000!OU\\sx\u0089\u008f\u0095\u009a\u009c\u00b4"+
		"\u00c5\u00ca\u00cf\u00d4\u00d7\u00dc\u00e1\u00e4\u00e9\u00ee\u00f0\u0101"+
		"\u0108\u0120\u0129\u012e\u0132\u0137\u013d\u0145\u014a\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}