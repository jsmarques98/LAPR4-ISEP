// Generated from C:/Users/joser/OneDrive/Ambiente de Trabalho/Projeto/lei21_22_s4_2di_02/base.core/src/main/java/eapli/base/answerQuestionnairemanagement/validation\QuestionnaireAnswerGrammar.g4 by ANTLR 4.10.1
package eapli.base.answerQuestionnairemanagement.validation;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuestionnaireAnswerGrammarParser}.
 */
public interface QuestionnaireAnswerGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(QuestionnaireAnswerGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(QuestionnaireAnswerGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(QuestionnaireAnswerGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(QuestionnaireAnswerGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generateHeader}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterGenerateHeader(QuestionnaireAnswerGrammarParser.GenerateHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generateHeader}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitGenerateHeader(QuestionnaireAnswerGrammarParser.GenerateHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QuestionnaireAnswerGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QuestionnaireAnswerGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(QuestionnaireAnswerGrammarParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(QuestionnaireAnswerGrammarParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#welmsg}.
	 * @param ctx the parse tree
	 */
	void enterWelmsg(QuestionnaireAnswerGrammarParser.WelmsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#welmsg}.
	 * @param ctx the parse tree
	 */
	void exitWelmsg(QuestionnaireAnswerGrammarParser.WelmsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#endmsg}.
	 * @param ctx the parse tree
	 */
	void enterEndmsg(QuestionnaireAnswerGrammarParser.EndmsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#endmsg}.
	 * @param ctx the parse tree
	 */
	void exitEndmsg(QuestionnaireAnswerGrammarParser.EndmsgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verifySection}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void enterVerifySection(QuestionnaireAnswerGrammarParser.VerifySectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verifySection}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void exitVerifySection(QuestionnaireAnswerGrammarParser.VerifySectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#sid}.
	 * @param ctx the parse tree
	 */
	void enterSid(QuestionnaireAnswerGrammarParser.SidContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#sid}.
	 * @param ctx the parse tree
	 */
	void exitSid(QuestionnaireAnswerGrammarParser.SidContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#descr}.
	 * @param ctx the parse tree
	 */
	void enterDescr(QuestionnaireAnswerGrammarParser.DescrContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#descr}.
	 * @param ctx the parse tree
	 */
	void exitDescr(QuestionnaireAnswerGrammarParser.DescrContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#obligat}.
	 * @param ctx the parse tree
	 */
	void enterObligat(QuestionnaireAnswerGrammarParser.ObligatContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#obligat}.
	 * @param ctx the parse tree
	 */
	void exitObligat(QuestionnaireAnswerGrammarParser.ObligatContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#rep}.
	 * @param ctx the parse tree
	 */
	void enterRep(QuestionnaireAnswerGrammarParser.RepContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#rep}.
	 * @param ctx the parse tree
	 */
	void exitRep(QuestionnaireAnswerGrammarParser.RepContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(QuestionnaireAnswerGrammarParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(QuestionnaireAnswerGrammarParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(QuestionnaireAnswerGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(QuestionnaireAnswerGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(QuestionnaireAnswerGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(QuestionnaireAnswerGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#qid}.
	 * @param ctx the parse tree
	 */
	void enterQid(QuestionnaireAnswerGrammarParser.QidContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#qid}.
	 * @param ctx the parse tree
	 */
	void exitQid(QuestionnaireAnswerGrammarParser.QidContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#question_ask}.
	 * @param ctx the parse tree
	 */
	void enterQuestion_ask(QuestionnaireAnswerGrammarParser.Question_askContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#question_ask}.
	 * @param ctx the parse tree
	 */
	void exitQuestion_ask(QuestionnaireAnswerGrammarParser.Question_askContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(QuestionnaireAnswerGrammarParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(QuestionnaireAnswerGrammarParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verifyFreeText}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVerifyFreeText(QuestionnaireAnswerGrammarParser.VerifyFreeTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verifyFreeText}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVerifyFreeText(QuestionnaireAnswerGrammarParser.VerifyFreeTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verifyNumeric}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVerifyNumeric(QuestionnaireAnswerGrammarParser.VerifyNumericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verifyNumeric}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVerifyNumeric(QuestionnaireAnswerGrammarParser.VerifyNumericContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verifySingleChoice}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVerifySingleChoice(QuestionnaireAnswerGrammarParser.VerifySingleChoiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verifySingleChoice}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVerifySingleChoice(QuestionnaireAnswerGrammarParser.VerifySingleChoiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verifySingleChoiceInput}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVerifySingleChoiceInput(QuestionnaireAnswerGrammarParser.VerifySingleChoiceInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verifySingleChoiceInput}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVerifySingleChoiceInput(QuestionnaireAnswerGrammarParser.VerifySingleChoiceInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verifyMultipleChoice}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVerifyMultipleChoice(QuestionnaireAnswerGrammarParser.VerifyMultipleChoiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verifyMultipleChoice}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVerifyMultipleChoice(QuestionnaireAnswerGrammarParser.VerifyMultipleChoiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verifyMultipleChoiceInput}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVerifyMultipleChoiceInput(QuestionnaireAnswerGrammarParser.VerifyMultipleChoiceInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verifyMultipleChoiceInput}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVerifyMultipleChoiceInput(QuestionnaireAnswerGrammarParser.VerifyMultipleChoiceInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verifySorting}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVerifySorting(QuestionnaireAnswerGrammarParser.VerifySortingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verifySorting}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVerifySorting(QuestionnaireAnswerGrammarParser.VerifySortingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verifyScaling}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVerifyScaling(QuestionnaireAnswerGrammarParser.VerifyScalingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verifyScaling}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVerifyScaling(QuestionnaireAnswerGrammarParser.VerifyScalingContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#responseinput}.
	 * @param ctx the parse tree
	 */
	void enterResponseinput(QuestionnaireAnswerGrammarParser.ResponseinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#responseinput}.
	 * @param ctx the parse tree
	 */
	void exitResponseinput(QuestionnaireAnswerGrammarParser.ResponseinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#valuecheck}.
	 * @param ctx the parse tree
	 */
	void enterValuecheck(QuestionnaireAnswerGrammarParser.ValuecheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#valuecheck}.
	 * @param ctx the parse tree
	 */
	void exitValuecheck(QuestionnaireAnswerGrammarParser.ValuecheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code processExtraInfo}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#extrainfo}.
	 * @param ctx the parse tree
	 */
	void enterProcessExtraInfo(QuestionnaireAnswerGrammarParser.ProcessExtraInfoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code processExtraInfo}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#extrainfo}.
	 * @param ctx the parse tree
	 */
	void exitProcessExtraInfo(QuestionnaireAnswerGrammarParser.ProcessExtraInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(QuestionnaireAnswerGrammarParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(QuestionnaireAnswerGrammarParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#response}.
	 * @param ctx the parse tree
	 */
	void enterResponse(QuestionnaireAnswerGrammarParser.ResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#response}.
	 * @param ctx the parse tree
	 */
	void exitResponse(QuestionnaireAnswerGrammarParser.ResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#responsechoice}.
	 * @param ctx the parse tree
	 */
	void enterResponsechoice(QuestionnaireAnswerGrammarParser.ResponsechoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#responsechoice}.
	 * @param ctx the parse tree
	 */
	void exitResponsechoice(QuestionnaireAnswerGrammarParser.ResponsechoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#responsescaling}.
	 * @param ctx the parse tree
	 */
	void enterResponsescaling(QuestionnaireAnswerGrammarParser.ResponsescalingContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#responsescaling}.
	 * @param ctx the parse tree
	 */
	void exitResponsescaling(QuestionnaireAnswerGrammarParser.ResponsescalingContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#freetext}.
	 * @param ctx the parse tree
	 */
	void enterFreetext(QuestionnaireAnswerGrammarParser.FreetextContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#freetext}.
	 * @param ctx the parse tree
	 */
	void exitFreetext(QuestionnaireAnswerGrammarParser.FreetextContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#limitchar}.
	 * @param ctx the parse tree
	 */
	void enterLimitchar(QuestionnaireAnswerGrammarParser.LimitcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#limitchar}.
	 * @param ctx the parse tree
	 */
	void exitLimitchar(QuestionnaireAnswerGrammarParser.LimitcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#limitcharline}.
	 * @param ctx the parse tree
	 */
	void enterLimitcharline(QuestionnaireAnswerGrammarParser.LimitcharlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#limitcharline}.
	 * @param ctx the parse tree
	 */
	void exitLimitcharline(QuestionnaireAnswerGrammarParser.LimitcharlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(QuestionnaireAnswerGrammarParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(QuestionnaireAnswerGrammarParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#singlechoice}.
	 * @param ctx the parse tree
	 */
	void enterSinglechoice(QuestionnaireAnswerGrammarParser.SinglechoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#singlechoice}.
	 * @param ctx the parse tree
	 */
	void exitSinglechoice(QuestionnaireAnswerGrammarParser.SinglechoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#singlechoiceinput}.
	 * @param ctx the parse tree
	 */
	void enterSinglechoiceinput(QuestionnaireAnswerGrammarParser.SinglechoiceinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#singlechoiceinput}.
	 * @param ctx the parse tree
	 */
	void exitSinglechoiceinput(QuestionnaireAnswerGrammarParser.SinglechoiceinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#inputoption}.
	 * @param ctx the parse tree
	 */
	void enterInputoption(QuestionnaireAnswerGrammarParser.InputoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#inputoption}.
	 * @param ctx the parse tree
	 */
	void exitInputoption(QuestionnaireAnswerGrammarParser.InputoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#multiplechoice}.
	 * @param ctx the parse tree
	 */
	void enterMultiplechoice(QuestionnaireAnswerGrammarParser.MultiplechoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#multiplechoice}.
	 * @param ctx the parse tree
	 */
	void exitMultiplechoice(QuestionnaireAnswerGrammarParser.MultiplechoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#multiplechoiceinput}.
	 * @param ctx the parse tree
	 */
	void enterMultiplechoiceinput(QuestionnaireAnswerGrammarParser.MultiplechoiceinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#multiplechoiceinput}.
	 * @param ctx the parse tree
	 */
	void exitMultiplechoiceinput(QuestionnaireAnswerGrammarParser.MultiplechoiceinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#sorting}.
	 * @param ctx the parse tree
	 */
	void enterSorting(QuestionnaireAnswerGrammarParser.SortingContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#sorting}.
	 * @param ctx the parse tree
	 */
	void exitSorting(QuestionnaireAnswerGrammarParser.SortingContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#scaling}.
	 * @param ctx the parse tree
	 */
	void enterScaling(QuestionnaireAnswerGrammarParser.ScalingContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#scaling}.
	 * @param ctx the parse tree
	 */
	void exitScaling(QuestionnaireAnswerGrammarParser.ScalingContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionnaireAnswerGrammarParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(QuestionnaireAnswerGrammarParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(QuestionnaireAnswerGrammarParser.ScaleContext ctx);
}