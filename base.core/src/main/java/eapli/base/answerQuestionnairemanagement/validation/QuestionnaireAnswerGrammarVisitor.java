// Generated from C:/Users/joser/OneDrive/Ambiente de Trabalho/Projeto/lei21_22_s4_2di_02/base.core/src/main/java/eapli/base/answerQuestionnairemanagement/validation\QuestionnaireAnswerGrammar.g4 by ANTLR 4.10.1
package eapli.base.answerQuestionnairemanagement.validation;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuestionnaireAnswerGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuestionnaireAnswerGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(QuestionnaireAnswerGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(QuestionnaireAnswerGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generateHeader}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerateHeader(QuestionnaireAnswerGrammarParser.GenerateHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QuestionnaireAnswerGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(QuestionnaireAnswerGrammarParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#welmsg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWelmsg(QuestionnaireAnswerGrammarParser.WelmsgContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#endmsg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndmsg(QuestionnaireAnswerGrammarParser.EndmsgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verifySection}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifySection(QuestionnaireAnswerGrammarParser.VerifySectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#sid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSid(QuestionnaireAnswerGrammarParser.SidContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#descr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescr(QuestionnaireAnswerGrammarParser.DescrContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#obligat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObligat(QuestionnaireAnswerGrammarParser.ObligatContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#rep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep(QuestionnaireAnswerGrammarParser.RepContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(QuestionnaireAnswerGrammarParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(QuestionnaireAnswerGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(QuestionnaireAnswerGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#qid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQid(QuestionnaireAnswerGrammarParser.QidContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#question_ask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_ask(QuestionnaireAnswerGrammarParser.Question_askContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(QuestionnaireAnswerGrammarParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verifyFreeText}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifyFreeText(QuestionnaireAnswerGrammarParser.VerifyFreeTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verifyNumeric}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifyNumeric(QuestionnaireAnswerGrammarParser.VerifyNumericContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verifySingleChoice}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifySingleChoice(QuestionnaireAnswerGrammarParser.VerifySingleChoiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verifySingleChoiceInput}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifySingleChoiceInput(QuestionnaireAnswerGrammarParser.VerifySingleChoiceInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verifyMultipleChoice}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifyMultipleChoice(QuestionnaireAnswerGrammarParser.VerifyMultipleChoiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verifyMultipleChoiceInput}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifyMultipleChoiceInput(QuestionnaireAnswerGrammarParser.VerifyMultipleChoiceInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verifySorting}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifySorting(QuestionnaireAnswerGrammarParser.VerifySortingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verifyScaling}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifyScaling(QuestionnaireAnswerGrammarParser.VerifyScalingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#responseinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponseinput(QuestionnaireAnswerGrammarParser.ResponseinputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#valuecheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuecheck(QuestionnaireAnswerGrammarParser.ValuecheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code processExtraInfo}
	 * labeled alternative in {@link QuestionnaireAnswerGrammarParser#extrainfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessExtraInfo(QuestionnaireAnswerGrammarParser.ProcessExtraInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(QuestionnaireAnswerGrammarParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#response}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponse(QuestionnaireAnswerGrammarParser.ResponseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#responsechoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponsechoice(QuestionnaireAnswerGrammarParser.ResponsechoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#responsescaling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponsescaling(QuestionnaireAnswerGrammarParser.ResponsescalingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#freetext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreetext(QuestionnaireAnswerGrammarParser.FreetextContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#limitchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitchar(QuestionnaireAnswerGrammarParser.LimitcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#limitcharline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitcharline(QuestionnaireAnswerGrammarParser.LimitcharlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(QuestionnaireAnswerGrammarParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#singlechoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglechoice(QuestionnaireAnswerGrammarParser.SinglechoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#singlechoiceinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglechoiceinput(QuestionnaireAnswerGrammarParser.SinglechoiceinputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#inputoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputoption(QuestionnaireAnswerGrammarParser.InputoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#multiplechoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplechoice(QuestionnaireAnswerGrammarParser.MultiplechoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#multiplechoiceinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplechoiceinput(QuestionnaireAnswerGrammarParser.MultiplechoiceinputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#sorting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSorting(QuestionnaireAnswerGrammarParser.SortingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#scaling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaling(QuestionnaireAnswerGrammarParser.ScalingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireAnswerGrammarParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(QuestionnaireAnswerGrammarParser.ScaleContext ctx);
}