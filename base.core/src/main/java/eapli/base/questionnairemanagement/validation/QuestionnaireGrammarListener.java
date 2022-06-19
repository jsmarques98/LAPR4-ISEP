// Generated from C:/Users/joser/OneDrive/Ambiente de Trabalho/Projeto/lei21_22_s4_2di_02/base.core/src/main/java/eapli/base/questionnairemanagement/validation\QuestionnaireGrammar.g4 by ANTLR 4.10.1
package eapli.base.questionnairemanagement.validation;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuestionnaireGrammarParser}.
 */
public interface QuestionnaireGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(QuestionnaireGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(QuestionnaireGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(QuestionnaireGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(QuestionnaireGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generateHeader}
	 * labeled alternative in {@link QuestionnaireGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterGenerateHeader(QuestionnaireGrammarParser.GenerateHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generateHeader}
	 * labeled alternative in {@link QuestionnaireGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitGenerateHeader(QuestionnaireGrammarParser.GenerateHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QuestionnaireGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QuestionnaireGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(QuestionnaireGrammarParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(QuestionnaireGrammarParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#welmsg}.
	 * @param ctx the parse tree
	 */
	void enterWelmsg(QuestionnaireGrammarParser.WelmsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#welmsg}.
	 * @param ctx the parse tree
	 */
	void exitWelmsg(QuestionnaireGrammarParser.WelmsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#endmsg}.
	 * @param ctx the parse tree
	 */
	void enterEndmsg(QuestionnaireGrammarParser.EndmsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#endmsg}.
	 * @param ctx the parse tree
	 */
	void exitEndmsg(QuestionnaireGrammarParser.EndmsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(QuestionnaireGrammarParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(QuestionnaireGrammarParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#sid}.
	 * @param ctx the parse tree
	 */
	void enterSid(QuestionnaireGrammarParser.SidContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#sid}.
	 * @param ctx the parse tree
	 */
	void exitSid(QuestionnaireGrammarParser.SidContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#descr}.
	 * @param ctx the parse tree
	 */
	void enterDescr(QuestionnaireGrammarParser.DescrContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#descr}.
	 * @param ctx the parse tree
	 */
	void exitDescr(QuestionnaireGrammarParser.DescrContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#obligat}.
	 * @param ctx the parse tree
	 */
	void enterObligat(QuestionnaireGrammarParser.ObligatContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#obligat}.
	 * @param ctx the parse tree
	 */
	void exitObligat(QuestionnaireGrammarParser.ObligatContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#rep}.
	 * @param ctx the parse tree
	 */
	void enterRep(QuestionnaireGrammarParser.RepContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#rep}.
	 * @param ctx the parse tree
	 */
	void exitRep(QuestionnaireGrammarParser.RepContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(QuestionnaireGrammarParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(QuestionnaireGrammarParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(QuestionnaireGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(QuestionnaireGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(QuestionnaireGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(QuestionnaireGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#qid}.
	 * @param ctx the parse tree
	 */
	void enterQid(QuestionnaireGrammarParser.QidContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#qid}.
	 * @param ctx the parse tree
	 */
	void exitQid(QuestionnaireGrammarParser.QidContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#question_ask}.
	 * @param ctx the parse tree
	 */
	void enterQuestion_ask(QuestionnaireGrammarParser.Question_askContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#question_ask}.
	 * @param ctx the parse tree
	 */
	void exitQuestion_ask(QuestionnaireGrammarParser.Question_askContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(QuestionnaireGrammarParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(QuestionnaireGrammarParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QuestionnaireGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QuestionnaireGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#valuecheck}.
	 * @param ctx the parse tree
	 */
	void enterValuecheck(QuestionnaireGrammarParser.ValuecheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#valuecheck}.
	 * @param ctx the parse tree
	 */
	void exitValuecheck(QuestionnaireGrammarParser.ValuecheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code processExtraInfo}
	 * labeled alternative in {@link QuestionnaireGrammarParser#extrainfo}.
	 * @param ctx the parse tree
	 */
	void enterProcessExtraInfo(QuestionnaireGrammarParser.ProcessExtraInfoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code processExtraInfo}
	 * labeled alternative in {@link QuestionnaireGrammarParser#extrainfo}.
	 * @param ctx the parse tree
	 */
	void exitProcessExtraInfo(QuestionnaireGrammarParser.ProcessExtraInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(QuestionnaireGrammarParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(QuestionnaireGrammarParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#freetext}.
	 * @param ctx the parse tree
	 */
	void enterFreetext(QuestionnaireGrammarParser.FreetextContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#freetext}.
	 * @param ctx the parse tree
	 */
	void exitFreetext(QuestionnaireGrammarParser.FreetextContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#limitchar}.
	 * @param ctx the parse tree
	 */
	void enterLimitchar(QuestionnaireGrammarParser.LimitcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#limitchar}.
	 * @param ctx the parse tree
	 */
	void exitLimitchar(QuestionnaireGrammarParser.LimitcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#limitcharline}.
	 * @param ctx the parse tree
	 */
	void enterLimitcharline(QuestionnaireGrammarParser.LimitcharlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#limitcharline}.
	 * @param ctx the parse tree
	 */
	void exitLimitcharline(QuestionnaireGrammarParser.LimitcharlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(QuestionnaireGrammarParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(QuestionnaireGrammarParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#singlechoice}.
	 * @param ctx the parse tree
	 */
	void enterSinglechoice(QuestionnaireGrammarParser.SinglechoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#singlechoice}.
	 * @param ctx the parse tree
	 */
	void exitSinglechoice(QuestionnaireGrammarParser.SinglechoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#singlechoiceinput}.
	 * @param ctx the parse tree
	 */
	void enterSinglechoiceinput(QuestionnaireGrammarParser.SinglechoiceinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#singlechoiceinput}.
	 * @param ctx the parse tree
	 */
	void exitSinglechoiceinput(QuestionnaireGrammarParser.SinglechoiceinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#inputoption}.
	 * @param ctx the parse tree
	 */
	void enterInputoption(QuestionnaireGrammarParser.InputoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#inputoption}.
	 * @param ctx the parse tree
	 */
	void exitInputoption(QuestionnaireGrammarParser.InputoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#multiplechoice}.
	 * @param ctx the parse tree
	 */
	void enterMultiplechoice(QuestionnaireGrammarParser.MultiplechoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#multiplechoice}.
	 * @param ctx the parse tree
	 */
	void exitMultiplechoice(QuestionnaireGrammarParser.MultiplechoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#multiplechoiceinput}.
	 * @param ctx the parse tree
	 */
	void enterMultiplechoiceinput(QuestionnaireGrammarParser.MultiplechoiceinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#multiplechoiceinput}.
	 * @param ctx the parse tree
	 */
	void exitMultiplechoiceinput(QuestionnaireGrammarParser.MultiplechoiceinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#sorting}.
	 * @param ctx the parse tree
	 */
	void enterSorting(QuestionnaireGrammarParser.SortingContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#sorting}.
	 * @param ctx the parse tree
	 */
	void exitSorting(QuestionnaireGrammarParser.SortingContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#scaling}.
	 * @param ctx the parse tree
	 */
	void enterScaling(QuestionnaireGrammarParser.ScalingContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#scaling}.
	 * @param ctx the parse tree
	 */
	void exitScaling(QuestionnaireGrammarParser.ScalingContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireGrammarParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(QuestionnaireGrammarParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireGrammarParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(QuestionnaireGrammarParser.ScaleContext ctx);
}