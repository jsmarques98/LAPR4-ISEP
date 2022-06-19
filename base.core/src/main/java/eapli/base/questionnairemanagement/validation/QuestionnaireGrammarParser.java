// Generated from C:/Users/joser/OneDrive/Ambiente de Trabalho/Projeto/lei21_22_s4_2di_02/base.core/src/main/java/eapli/base/questionnairemanagement/validation\QuestionnaireGrammar.g4 by ANTLR 4.10.1
package eapli.base.questionnairemanagement.validation;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuestionnaireGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, MANDATORY=11, OPTIONAL=12, CONDITIONAL=13, CONDITION=14, REP=15, 
		QUESTION=16, TYPE=17, VALUECHECK=18, EXTRAINFO=19, OPTION=20, OPTIONCHOICE=21, 
		VALUE=22, FREETEXT=23, LIMITCHAR=24, LIMITCHARLINE=25, DECIMAL=26, NUMERIC=27, 
		SINGLECHOICE=28, INPUTOPTION=29, MULTIPLECHOICE=30, SORTING=31, SCALING=32, 
		SCALE=33, IDVALUE=34, NUMBER=35, STRING=36, STRING_ML=37, WS=38, NEWLINE=39;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_header = 2, RULE_id = 3, RULE_title = 4, 
		RULE_welmsg = 5, RULE_endmsg = 6, RULE_section = 7, RULE_sid = 8, RULE_descr = 9, 
		RULE_obligat = 10, RULE_rep = 11, RULE_condicional = 12, RULE_condition = 13, 
		RULE_question = 14, RULE_qid = 15, RULE_question_ask = 16, RULE_instructions = 17, 
		RULE_type = 18, RULE_valuecheck = 19, RULE_extrainfo = 20, RULE_option = 21, 
		RULE_freetext = 22, RULE_limitchar = 23, RULE_limitcharline = 24, RULE_numeric = 25, 
		RULE_singlechoice = 26, RULE_singlechoiceinput = 27, RULE_inputoption = 28, 
		RULE_multiplechoice = 29, RULE_multiplechoiceinput = 30, RULE_sorting = 31, 
		RULE_scaling = 32, RULE_scale = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "start", "header", "id", "title", "welmsg", "endmsg", "section", 
			"sid", "descr", "obligat", "rep", "condicional", "condition", "question", 
			"qid", "question_ask", "instructions", "type", "valuecheck", "extrainfo", 
			"option", "freetext", "limitchar", "limitcharline", "numeric", "singlechoice", 
			"singlechoiceinput", "inputoption", "multiplechoice", "multiplechoiceinput", 
			"sorting", "scaling", "scale"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ID:'", "'TITLE:'", "'WELCOME MENSAGE:'", "'END MENSAGE:'", "'SECTION ID:'", 
			"'DESCRIPTION:'", "'OBLIGATORINESS:'", "'QUESTION ID:'", "'INTRUCTIONS:'", 
			"'-'", "'MANDATORY'", "'OPTIONAL'", "'CONDITIONAL'", "'CONDITION:'", 
			"'REP:'", "'QUESTION:'", "'TYPE:'", "'VALUECHECK:'", "'EXTRAINFO:'", 
			"'OPTION:'", null, "'VALUE:'", "'FREETEXT'", "'LIMITCHAR:'", "'LIMITCHARLINE:'", 
			"'DECIMAL'", "'NUMERIC'", "'SINGLECHOICE'", "'INPUTOPTION:'", "'MULTIPLECHOICE'", 
			"'SORTING'", "'SCALING'", "'SCALE:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "MANDATORY", 
			"OPTIONAL", "CONDITIONAL", "CONDITION", "REP", "QUESTION", "TYPE", "VALUECHECK", 
			"EXTRAINFO", "OPTION", "OPTIONCHOICE", "VALUE", "FREETEXT", "LIMITCHAR", 
			"LIMITCHARLINE", "DECIMAL", "NUMERIC", "SINGLECHOICE", "INPUTOPTION", 
			"MULTIPLECHOICE", "SORTING", "SCALING", "SCALE", "IDVALUE", "NUMBER", 
			"STRING", "STRING_ML", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "QuestionnaireGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuestionnaireGrammarParser(TokenStream input) {
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
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitProg(this);
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
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				start();
				}
				}
				setState(71); 
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
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitStart(this);
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
			setState(73);
			header();
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				section();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(79);
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
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterGenerateHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitGenerateHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitGenerateHeader(this);
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
			setState(81);
			id();
			setState(82);
			title();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(83);
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
		public TerminalNode IDVALUE() { return getToken(QuestionnaireGrammarParser.IDVALUE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitId(this);
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
			setState(86);
			match(T__0);
			}
			setState(87);
			match(IDVALUE);
			setState(88);
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
		public TerminalNode STRING() { return getToken(QuestionnaireGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitTitle(this);
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
			setState(90);
			match(T__1);
			}
			setState(91);
			match(STRING);
			setState(92);
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
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireGrammarParser.STRING_ML, 0); }
		public WelmsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_welmsg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterWelmsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitWelmsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitWelmsg(this);
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
			setState(94);
			match(T__2);
			}
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_ML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class EndmsgContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireGrammarParser.STRING_ML, 0); }
		public EndmsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endmsg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterEndmsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitEndmsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitEndmsg(this);
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
			setState(98);
			match(T__3);
			}
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_ML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class SectionContext extends ParserRuleContext {
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
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			sid();
			setState(103);
			title();
			setState(104);
			descr();
			setState(105);
			obligat();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REP) {
				{
				setState(106);
				rep();
				}
			}

			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				question();
				}
				}
				setState(112); 
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
		public TerminalNode NUMBER() { return getToken(QuestionnaireGrammarParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public SidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterSid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitSid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitSid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SidContext sid() throws RecognitionException {
		SidContext _localctx = new SidContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__4);
			setState(115);
			match(NUMBER);
			setState(116);
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
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireGrammarParser.STRING_ML, 0); }
		public DescrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterDescr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitDescr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitDescr(this);
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
			setState(118);
			match(T__5);
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_ML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
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
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public TerminalNode MANDATORY() { return getToken(QuestionnaireGrammarParser.MANDATORY, 0); }
		public TerminalNode OPTIONAL() { return getToken(QuestionnaireGrammarParser.OPTIONAL, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public ObligatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obligat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterObligat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitObligat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitObligat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObligatContext obligat() throws RecognitionException {
		ObligatContext _localctx = new ObligatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_obligat);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__6);
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==MANDATORY || _la==OPTIONAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__6);
				setState(126);
				condicional();
				setState(127);
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
		public TerminalNode REP() { return getToken(QuestionnaireGrammarParser.REP, 0); }
		public TerminalNode VALUE() { return getToken(QuestionnaireGrammarParser.VALUE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(QuestionnaireGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(QuestionnaireGrammarParser.NUMBER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(QuestionnaireGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(QuestionnaireGrammarParser.STRING, i);
		}
		public RepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterRep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitRep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitRep(this);
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
			setState(131);
			match(REP);
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				match(NUMBER);
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(137);
			match(VALUE);
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					match(STRING);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case NUMBER:
				{
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(NUMBER);
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(150);
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
		public TerminalNode CONDITIONAL() { return getToken(QuestionnaireGrammarParser.CONDITIONAL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(CONDITIONAL);
			setState(153);
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
		public TerminalNode CONDITION() { return getToken(QuestionnaireGrammarParser.CONDITION, 0); }
		public TerminalNode NUMBER() { return getToken(QuestionnaireGrammarParser.NUMBER, 0); }
		public TerminalNode VALUE() { return getToken(QuestionnaireGrammarParser.VALUE, 0); }
		public TerminalNode OPTIONCHOICE() { return getToken(QuestionnaireGrammarParser.OPTIONCHOICE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(CONDITION);
			setState(156);
			match(T__7);
			setState(157);
			match(NUMBER);
			setState(158);
			match(VALUE);
			setState(159);
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
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_question);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				qid();
				setState(162);
				question_ask();
				setState(163);
				obligat();
				setState(164);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				qid();
				setState(167);
				question_ask();
				setState(168);
				instructions();
				setState(169);
				obligat();
				setState(170);
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
		public TerminalNode NUMBER() { return getToken(QuestionnaireGrammarParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public QidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterQid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitQid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitQid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QidContext qid() throws RecognitionException {
		QidContext _localctx = new QidContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_qid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__7);
			setState(175);
			match(NUMBER);
			setState(176);
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
		public TerminalNode QUESTION() { return getToken(QuestionnaireGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public Question_askContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_ask; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterQuestion_ask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitQuestion_ask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitQuestion_ask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_askContext question_ask() throws RecognitionException {
		Question_askContext _localctx = new Question_askContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_question_ask);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(QUESTION);
			setState(179);
			match(STRING);
			setState(180);
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
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(QuestionnaireGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireGrammarParser.STRING_ML, 0); }
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitInstructions(this);
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
			setState(182);
			match(T__8);
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_ML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(QuestionnaireGrammarParser.TYPE, 0); }
		public FreetextContext freetext() {
			return getRuleContext(FreetextContext.class,0);
		}
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public SinglechoiceContext singlechoice() {
			return getRuleContext(SinglechoiceContext.class,0);
		}
		public SinglechoiceinputContext singlechoiceinput() {
			return getRuleContext(SinglechoiceinputContext.class,0);
		}
		public MultiplechoiceContext multiplechoice() {
			return getRuleContext(MultiplechoiceContext.class,0);
		}
		public MultiplechoiceinputContext multiplechoiceinput() {
			return getRuleContext(MultiplechoiceinputContext.class,0);
		}
		public SortingContext sorting() {
			return getRuleContext(SortingContext.class,0);
		}
		public ScalingContext scaling() {
			return getRuleContext(ScalingContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(TYPE);
				setState(187);
				freetext();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(TYPE);
				setState(189);
				numeric();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(TYPE);
				setState(191);
				singlechoice();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(TYPE);
				setState(193);
				singlechoiceinput();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(TYPE);
				setState(195);
				multiplechoice();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(TYPE);
				setState(197);
				multiplechoiceinput();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				match(TYPE);
				setState(199);
				sorting();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				match(TYPE);
				setState(201);
				scaling();
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

	public static class ValuecheckContext extends ParserRuleContext {
		public TerminalNode VALUECHECK() { return getToken(QuestionnaireGrammarParser.VALUECHECK, 0); }
		public TerminalNode OPTIONCHOICE() { return getToken(QuestionnaireGrammarParser.OPTIONCHOICE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public ValuecheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuecheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterValuecheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitValuecheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitValuecheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuecheckContext valuecheck() throws RecognitionException {
		ValuecheckContext _localctx = new ValuecheckContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valuecheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(VALUECHECK);
			setState(205);
			match(OPTIONCHOICE);
			setState(206);
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
		public TerminalNode EXTRAINFO() { return getToken(QuestionnaireGrammarParser.EXTRAINFO, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public TerminalNode STRING() { return getToken(QuestionnaireGrammarParser.STRING, 0); }
		public TerminalNode STRING_ML() { return getToken(QuestionnaireGrammarParser.STRING_ML, 0); }
		public ProcessExtraInfoContext(ExtrainfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterProcessExtraInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitProcessExtraInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitProcessExtraInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtrainfoContext extrainfo() throws RecognitionException {
		ExtrainfoContext _localctx = new ExtrainfoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_extrainfo);
		int _la;
		try {
			_localctx = new ProcessExtraInfoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(EXTRAINFO);
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==STRING_ML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
			match(NEWLINE);
			setState(211);
			option();
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				option();
				}
				}
				setState(215); 
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
		public TerminalNode OPTION() { return getToken(QuestionnaireGrammarParser.OPTION, 0); }
		public TerminalNode OPTIONCHOICE() { return getToken(QuestionnaireGrammarParser.OPTIONCHOICE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionnaireGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionnaireGrammarParser.NEWLINE, i);
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
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(OPTION);
			setState(218);
			match(OPTIONCHOICE);
			setState(219);
			match(NEWLINE);
			setState(220);
			descr();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(221);
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

	public static class FreetextContext extends ParserRuleContext {
		public TerminalNode FREETEXT() { return getToken(QuestionnaireGrammarParser.FREETEXT, 0); }
		public LimitcharContext limitchar() {
			return getRuleContext(LimitcharContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public LimitcharlineContext limitcharline() {
			return getRuleContext(LimitcharlineContext.class,0);
		}
		public FreetextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freetext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterFreetext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitFreetext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitFreetext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreetextContext freetext() throws RecognitionException {
		FreetextContext _localctx = new FreetextContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_freetext);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(FREETEXT);
				setState(225);
				limitchar();
				setState(226);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(FREETEXT);
				setState(229);
				limitcharline();
				setState(230);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(FREETEXT);
				setState(233);
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
		public TerminalNode LIMITCHAR() { return getToken(QuestionnaireGrammarParser.LIMITCHAR, 0); }
		public TerminalNode NUMBER() { return getToken(QuestionnaireGrammarParser.NUMBER, 0); }
		public LimitcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterLimitchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitLimitchar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitLimitchar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitcharContext limitchar() throws RecognitionException {
		LimitcharContext _localctx = new LimitcharContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_limitchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LIMITCHAR);
			setState(237);
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
		public TerminalNode LIMITCHARLINE() { return getToken(QuestionnaireGrammarParser.LIMITCHARLINE, 0); }
		public TerminalNode NUMBER() { return getToken(QuestionnaireGrammarParser.NUMBER, 0); }
		public LimitcharlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitcharline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterLimitcharline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitLimitcharline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitLimitcharline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitcharlineContext limitcharline() throws RecognitionException {
		LimitcharlineContext _localctx = new LimitcharlineContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_limitcharline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LIMITCHARLINE);
			setState(240);
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
		public TerminalNode NUMERIC() { return getToken(QuestionnaireGrammarParser.NUMERIC, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public ValuecheckContext valuecheck() {
			return getRuleContext(ValuecheckContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(QuestionnaireGrammarParser.DECIMAL, 0); }
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitNumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numeric);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUECHECK) {
					{
					setState(242);
					valuecheck();
					}
				}

				setState(245);
				match(NUMERIC);
				setState(246);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUECHECK) {
					{
					setState(247);
					valuecheck();
					}
				}

				setState(250);
				match(DECIMAL);
				setState(251);
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
		public TerminalNode SINGLECHOICE() { return getToken(QuestionnaireGrammarParser.SINGLECHOICE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
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
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterSinglechoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitSinglechoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitSinglechoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglechoiceContext singlechoice() throws RecognitionException {
		SinglechoiceContext _localctx = new SinglechoiceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_singlechoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(SINGLECHOICE);
			setState(255);
			match(NEWLINE);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUECHECK) {
				{
				setState(256);
				valuecheck();
				}
			}

			setState(259);
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
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterSinglechoiceinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitSinglechoiceinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitSinglechoiceinput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglechoiceinputContext singlechoiceinput() throws RecognitionException {
		SinglechoiceinputContext _localctx = new SinglechoiceinputContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_singlechoiceinput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			singlechoice();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUECHECK) {
				{
				setState(262);
				valuecheck();
				}
			}

			setState(265);
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
		public TerminalNode INPUTOPTION() { return getToken(QuestionnaireGrammarParser.INPUTOPTION, 0); }
		public TerminalNode OPTIONCHOICE() { return getToken(QuestionnaireGrammarParser.OPTIONCHOICE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public ValuecheckContext valuecheck() {
			return getRuleContext(ValuecheckContext.class,0);
		}
		public InputoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterInputoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitInputoption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitInputoption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputoptionContext inputoption() throws RecognitionException {
		InputoptionContext _localctx = new InputoptionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inputoption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(INPUTOPTION);
			setState(268);
			match(OPTIONCHOICE);
			setState(269);
			match(NEWLINE);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUECHECK) {
				{
				setState(270);
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
		public TerminalNode MULTIPLECHOICE() { return getToken(QuestionnaireGrammarParser.MULTIPLECHOICE, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
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
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterMultiplechoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitMultiplechoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitMultiplechoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplechoiceContext multiplechoice() throws RecognitionException {
		MultiplechoiceContext _localctx = new MultiplechoiceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiplechoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(MULTIPLECHOICE);
			setState(274);
			match(NEWLINE);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUECHECK) {
				{
				setState(275);
				valuecheck();
				}
			}

			setState(278);
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
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterMultiplechoiceinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitMultiplechoiceinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitMultiplechoiceinput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplechoiceinputContext multiplechoiceinput() throws RecognitionException {
		MultiplechoiceinputContext _localctx = new MultiplechoiceinputContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_multiplechoiceinput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			multiplechoice();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUECHECK) {
				{
				setState(281);
				valuecheck();
				}
			}

			setState(284);
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
		public TerminalNode SORTING() { return getToken(QuestionnaireGrammarParser.SORTING, 0); }
		public TerminalNode NEWLINE() { return getToken(QuestionnaireGrammarParser.NEWLINE, 0); }
		public ExtrainfoContext extrainfo() {
			return getRuleContext(ExtrainfoContext.class,0);
		}
		public SortingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterSorting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitSorting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitSorting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortingContext sorting() throws RecognitionException {
		SortingContext _localctx = new SortingContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sorting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(SORTING);
			setState(287);
			match(NEWLINE);
			setState(288);
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
		public TerminalNode SCALING() { return getToken(QuestionnaireGrammarParser.SCALING, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(QuestionnaireGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(QuestionnaireGrammarParser.NEWLINE, i);
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
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterScaling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitScaling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitScaling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalingContext scaling() throws RecognitionException {
		ScalingContext _localctx = new ScalingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_scaling);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(SCALING);
			setState(291);
			match(NEWLINE);
			setState(292);
			scale();
			setState(293);
			match(NEWLINE);
			setState(294);
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
		public TerminalNode SCALE() { return getToken(QuestionnaireGrammarParser.SCALE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(QuestionnaireGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(QuestionnaireGrammarParser.NUMBER, i);
		}
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionnaireGrammarListener ) ((QuestionnaireGrammarListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionnaireGrammarVisitor ) return ((QuestionnaireGrammarVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(SCALE);
			setState(297);
			match(NUMBER);
			setState(298);
			match(T__9);
			setState(299);
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
		"\u0004\u0001\'\u012e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0004"+
		"\u0000F\b\u0000\u000b\u0000\f\u0000G\u0001\u0001\u0001\u0001\u0004\u0001"+
		"L\b\u0001\u000b\u0001\f\u0001M\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007l\b\u0007\u0001\u0007\u0004\u0007o\b\u0007\u000b\u0007"+
		"\f\u0007p\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0082"+
		"\b\n\u0001\u000b\u0001\u000b\u0004\u000b\u0086\b\u000b\u000b\u000b\f\u000b"+
		"\u0087\u0001\u000b\u0001\u000b\u0004\u000b\u008c\b\u000b\u000b\u000b\f"+
		"\u000b\u008d\u0001\u000b\u0004\u000b\u0091\b\u000b\u000b\u000b\f\u000b"+
		"\u0092\u0003\u000b\u0095\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ad\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00cb\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00d6\b\u0014\u000b\u0014"+
		"\f\u0014\u00d7\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00df\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00eb\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0003\u0019\u00f4\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u00f9\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u00fd\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0102\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0108\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0110\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0115\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u011b\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0000\u0000\"\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@B\u0000\u0002\u0001\u0000$%\u0001\u0000\u000b\f\u0129\u0000E"+
		"\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004Q\u0001\u0000"+
		"\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000"+
		"\n^\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000ef\u0001\u0000"+
		"\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000\u0000"+
		"\u0014\u0081\u0001\u0000\u0000\u0000\u0016\u0083\u0001\u0000\u0000\u0000"+
		"\u0018\u0098\u0001\u0000\u0000\u0000\u001a\u009b\u0001\u0000\u0000\u0000"+
		"\u001c\u00ac\u0001\u0000\u0000\u0000\u001e\u00ae\u0001\u0000\u0000\u0000"+
		" \u00b2\u0001\u0000\u0000\u0000\"\u00b6\u0001\u0000\u0000\u0000$\u00ca"+
		"\u0001\u0000\u0000\u0000&\u00cc\u0001\u0000\u0000\u0000(\u00d0\u0001\u0000"+
		"\u0000\u0000*\u00d9\u0001\u0000\u0000\u0000,\u00ea\u0001\u0000\u0000\u0000"+
		".\u00ec\u0001\u0000\u0000\u00000\u00ef\u0001\u0000\u0000\u00002\u00fc"+
		"\u0001\u0000\u0000\u00004\u00fe\u0001\u0000\u0000\u00006\u0105\u0001\u0000"+
		"\u0000\u00008\u010b\u0001\u0000\u0000\u0000:\u0111\u0001\u0000\u0000\u0000"+
		"<\u0118\u0001\u0000\u0000\u0000>\u011e\u0001\u0000\u0000\u0000@\u0122"+
		"\u0001\u0000\u0000\u0000B\u0128\u0001\u0000\u0000\u0000DF\u0003\u0002"+
		"\u0001\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0001\u0001\u0000\u0000"+
		"\u0000IK\u0003\u0004\u0002\u0000JL\u0003\u000e\u0007\u0000KJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0003\f\u0006\u0000P\u0003"+
		"\u0001\u0000\u0000\u0000QR\u0003\u0006\u0003\u0000RT\u0003\b\u0004\u0000"+
		"SU\u0003\n\u0005\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"U\u0005\u0001\u0000\u0000\u0000VW\u0005\u0001\u0000\u0000WX\u0005\"\u0000"+
		"\u0000XY\u0005\'\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000Z[\u0005\u0002"+
		"\u0000\u0000[\\\u0005$\u0000\u0000\\]\u0005\'\u0000\u0000]\t\u0001\u0000"+
		"\u0000\u0000^_\u0005\u0003\u0000\u0000_`\u0007\u0000\u0000\u0000`a\u0005"+
		"\'\u0000\u0000a\u000b\u0001\u0000\u0000\u0000bc\u0005\u0004\u0000\u0000"+
		"cd\u0007\u0000\u0000\u0000de\u0005\'\u0000\u0000e\r\u0001\u0000\u0000"+
		"\u0000fg\u0003\u0010\b\u0000gh\u0003\b\u0004\u0000hi\u0003\u0012\t\u0000"+
		"ik\u0003\u0014\n\u0000jl\u0003\u0016\u000b\u0000kj\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mo\u0003\u001c\u000e"+
		"\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000q\u000f\u0001\u0000\u0000\u0000"+
		"rs\u0005\u0005\u0000\u0000st\u0005#\u0000\u0000tu\u0005\'\u0000\u0000"+
		"u\u0011\u0001\u0000\u0000\u0000vw\u0005\u0006\u0000\u0000wx\u0007\u0000"+
		"\u0000\u0000xy\u0005\'\u0000\u0000y\u0013\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0007\u0000\u0000{|\u0007\u0001\u0000\u0000|\u0082\u0005\'\u0000\u0000"+
		"}~\u0005\u0007\u0000\u0000~\u007f\u0003\u0018\f\u0000\u007f\u0080\u0005"+
		"\'\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081z\u0001\u0000"+
		"\u0000\u0000\u0081}\u0001\u0000\u0000\u0000\u0082\u0015\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0005\u000f\u0000\u0000\u0084\u0086\u0005#\u0000\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0094\u0005\u0016\u0000\u0000"+
		"\u008a\u008c\u0005$\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u0095\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0005#\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008b"+
		"\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005\'\u0000\u0000\u0097\u0017\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\r\u0000\u0000\u0099\u009a\u0003\u001a"+
		"\r\u0000\u009a\u0019\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u000e\u0000"+
		"\u0000\u009c\u009d\u0005\b\u0000\u0000\u009d\u009e\u0005#\u0000\u0000"+
		"\u009e\u009f\u0005\u0016\u0000\u0000\u009f\u00a0\u0005\u0015\u0000\u0000"+
		"\u00a0\u001b\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000"+
		"\u00a2\u00a3\u0003 \u0010\u0000\u00a3\u00a4\u0003\u0014\n\u0000\u00a4"+
		"\u00a5\u0003$\u0012\u0000\u00a5\u00ad\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0003\u001e\u000f\u0000\u00a7\u00a8\u0003 \u0010\u0000\u00a8\u00a9\u0003"+
		"\"\u0011\u0000\u00a9\u00aa\u0003\u0014\n\u0000\u00aa\u00ab\u0003$\u0012"+
		"\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a1\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ad\u001d\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005\b\u0000\u0000\u00af\u00b0\u0005#\u0000\u0000"+
		"\u00b0\u00b1\u0005\'\u0000\u0000\u00b1\u001f\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0010\u0000\u0000\u00b3\u00b4\u0005$\u0000\u0000\u00b4\u00b5"+
		"\u0005\'\u0000\u0000\u00b5!\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		"\t\u0000\u0000\u00b7\u00b8\u0007\u0000\u0000\u0000\u00b8\u00b9\u0005\'"+
		"\u0000\u0000\u00b9#\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0011\u0000"+
		"\u0000\u00bb\u00cb\u0003,\u0016\u0000\u00bc\u00bd\u0005\u0011\u0000\u0000"+
		"\u00bd\u00cb\u00032\u0019\u0000\u00be\u00bf\u0005\u0011\u0000\u0000\u00bf"+
		"\u00cb\u00034\u001a\u0000\u00c0\u00c1\u0005\u0011\u0000\u0000\u00c1\u00cb"+
		"\u00036\u001b\u0000\u00c2\u00c3\u0005\u0011\u0000\u0000\u00c3\u00cb\u0003"+
		":\u001d\u0000\u00c4\u00c5\u0005\u0011\u0000\u0000\u00c5\u00cb\u0003<\u001e"+
		"\u0000\u00c6\u00c7\u0005\u0011\u0000\u0000\u00c7\u00cb\u0003>\u001f\u0000"+
		"\u00c8\u00c9\u0005\u0011\u0000\u0000\u00c9\u00cb\u0003@ \u0000\u00ca\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ca\u00bc\u0001\u0000\u0000\u0000\u00ca\u00be"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c0\u0001\u0000\u0000\u0000\u00ca\u00c2"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000\u00ca\u00c6"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb%\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005\u0012\u0000\u0000\u00cd\u00ce\u0005"+
		"\u0015\u0000\u0000\u00ce\u00cf\u0005\'\u0000\u0000\u00cf\'\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005\u0013\u0000\u0000\u00d1\u00d2\u0007\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005\'\u0000\u0000\u00d3\u00d5\u0003*\u0015"+
		"\u0000\u00d4\u00d6\u0003*\u0015\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8)\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005\u0014\u0000\u0000\u00da\u00db\u0005\u0015\u0000\u0000\u00db"+
		"\u00dc\u0005\'\u0000\u0000\u00dc\u00de\u0003\u0012\t\u0000\u00dd\u00df"+
		"\u0005\'\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df+\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0017"+
		"\u0000\u0000\u00e1\u00e2\u0003.\u0017\u0000\u00e2\u00e3\u0005\'\u0000"+
		"\u0000\u00e3\u00eb\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0017\u0000"+
		"\u0000\u00e5\u00e6\u00030\u0018\u0000\u00e6\u00e7\u0005\'\u0000\u0000"+
		"\u00e7\u00eb\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0017\u0000\u0000"+
		"\u00e9\u00eb\u0005\'\u0000\u0000\u00ea\u00e0\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e4\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb"+
		"-\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0018\u0000\u0000\u00ed\u00ee"+
		"\u0005#\u0000\u0000\u00ee/\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0019"+
		"\u0000\u0000\u00f0\u00f1\u0005#\u0000\u0000\u00f11\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0003&\u0013\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0005\u001b\u0000\u0000\u00f6\u00fd\u0005\'\u0000\u0000\u00f7\u00f9"+
		"\u0003&\u0013\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u001a\u0000\u0000\u00fb\u00fd\u0005\'\u0000\u0000\u00fc\u00f3\u0001\u0000"+
		"\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fd3\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005\u001c\u0000\u0000\u00ff\u0101\u0005\'\u0000\u0000"+
		"\u0100\u0102\u0003&\u0013\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0003(\u0014\u0000\u01045\u0001\u0000\u0000\u0000\u0105\u0107\u0003"+
		"4\u001a\u0000\u0106\u0108\u0003&\u0013\u0000\u0107\u0106\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u00038\u001c\u0000\u010a7\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0005\u001d\u0000\u0000\u010c\u010d\u0005\u0015\u0000\u0000\u010d"+
		"\u010f\u0005\'\u0000\u0000\u010e\u0110\u0003&\u0013\u0000\u010f\u010e"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u01109\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0005\u001e\u0000\u0000\u0112\u0114\u0005"+
		"\'\u0000\u0000\u0113\u0115\u0003&\u0013\u0000\u0114\u0113\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0003(\u0014\u0000\u0117;\u0001\u0000\u0000\u0000"+
		"\u0118\u011a\u0003:\u001d\u0000\u0119\u011b\u0003&\u0013\u0000\u011a\u0119"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u00038\u001c\u0000\u011d=\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005\u001f\u0000\u0000\u011f\u0120\u0005\'\u0000"+
		"\u0000\u0120\u0121\u0003(\u0014\u0000\u0121?\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005 \u0000\u0000\u0123\u0124\u0005\'\u0000\u0000\u0124\u0125"+
		"\u0003B!\u0000\u0125\u0126\u0005\'\u0000\u0000\u0126\u0127\u0003(\u0014"+
		"\u0000\u0127A\u0001\u0000\u0000\u0000\u0128\u0129\u0005!\u0000\u0000\u0129"+
		"\u012a\u0005#\u0000\u0000\u012a\u012b\u0005\n\u0000\u0000\u012b\u012c"+
		"\u0005#\u0000\u0000\u012cC\u0001\u0000\u0000\u0000\u0017GMTkp\u0081\u0087"+
		"\u008d\u0092\u0094\u00ac\u00ca\u00d7\u00de\u00ea\u00f3\u00f8\u00fc\u0101"+
		"\u0107\u010f\u0114\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}