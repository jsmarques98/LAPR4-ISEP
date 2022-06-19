// Generated from C:/Users/joser/OneDrive/Ambiente de Trabalho/Projeto/lei21_22_s4_2di_02/base.core/src/main/java/eapli/base/questionnairemanagement/validation\QuestionnaireGrammar.g4 by ANTLR 4.10.1
package eapli.base.questionnairemanagement.validation;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuestionnaireGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuestionnaireGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(QuestionnaireGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(QuestionnaireGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generateHeader}
	 * labeled alternative in {@link QuestionnaireGrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerateHeader(QuestionnaireGrammarParser.GenerateHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QuestionnaireGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(QuestionnaireGrammarParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#welmsg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWelmsg(QuestionnaireGrammarParser.WelmsgContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#endmsg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndmsg(QuestionnaireGrammarParser.EndmsgContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(QuestionnaireGrammarParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#sid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSid(QuestionnaireGrammarParser.SidContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#descr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescr(QuestionnaireGrammarParser.DescrContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#obligat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObligat(QuestionnaireGrammarParser.ObligatContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#rep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep(QuestionnaireGrammarParser.RepContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(QuestionnaireGrammarParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(QuestionnaireGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(QuestionnaireGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#qid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQid(QuestionnaireGrammarParser.QidContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#question_ask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_ask(QuestionnaireGrammarParser.Question_askContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(QuestionnaireGrammarParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QuestionnaireGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#valuecheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuecheck(QuestionnaireGrammarParser.ValuecheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code processExtraInfo}
	 * labeled alternative in {@link QuestionnaireGrammarParser#extrainfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessExtraInfo(QuestionnaireGrammarParser.ProcessExtraInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(QuestionnaireGrammarParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#freetext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreetext(QuestionnaireGrammarParser.FreetextContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#limitchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitchar(QuestionnaireGrammarParser.LimitcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#limitcharline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitcharline(QuestionnaireGrammarParser.LimitcharlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(QuestionnaireGrammarParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#singlechoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglechoice(QuestionnaireGrammarParser.SinglechoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#singlechoiceinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglechoiceinput(QuestionnaireGrammarParser.SinglechoiceinputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#inputoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputoption(QuestionnaireGrammarParser.InputoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#multiplechoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplechoice(QuestionnaireGrammarParser.MultiplechoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#multiplechoiceinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplechoiceinput(QuestionnaireGrammarParser.MultiplechoiceinputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#sorting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSorting(QuestionnaireGrammarParser.SortingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#scaling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaling(QuestionnaireGrammarParser.ScalingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionnaireGrammarParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(QuestionnaireGrammarParser.ScaleContext ctx);
}