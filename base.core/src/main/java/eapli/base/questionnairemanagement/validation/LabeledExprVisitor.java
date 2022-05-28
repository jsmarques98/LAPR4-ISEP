// Generated from C:/Users/joser/OneDrive/Ambiente de Trabalho/Projeto1/lei21_22_s4_2di_02/base.core/src/main/java/eapli/base/questionnairemanagement/validation\LabeledExpr.g4 by ANTLR 4.10.1
package eapli.base.questionnairemanagement.validation;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionnarie1}
	 * labeled alternative in {@link LabeledExprParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionnarie1(LabeledExprParser.Questionnarie1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code questionnarie2}
	 * labeled alternative in {@link LabeledExprParser#start1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionnarie2(LabeledExprParser.Questionnarie2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LabeledExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(LabeledExprParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#welcomeMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWelcomeMessage(LabeledExprParser.WelcomeMessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#finalMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalMessage(LabeledExprParser.FinalMessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(LabeledExprParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionnarie3}
	 * labeled alternative in {@link LabeledExprParser#start2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionnarie3(LabeledExprParser.Questionnarie3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code questionnarie4}
	 * labeled alternative in {@link LabeledExprParser#start3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionnarie4(LabeledExprParser.Questionnarie4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code questionnarie5}
	 * labeled alternative in {@link LabeledExprParser#start4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionnarie5(LabeledExprParser.Questionnarie5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code questionnarie6}
	 * labeled alternative in {@link LabeledExprParser#start5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionnarie6(LabeledExprParser.Questionnarie6Context ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#sID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSID(LabeledExprParser.SIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#sTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTitle(LabeledExprParser.STitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#sDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSDescription(LabeledExprParser.SDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#sObligatoriness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSObligatoriness(LabeledExprParser.SObligatorinessContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#sCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCondition(LabeledExprParser.SConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#sRepeatability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSRepeatability(LabeledExprParser.SRepeatabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(LabeledExprParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionnarie7}
	 * labeled alternative in {@link LabeledExprParser#start6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionnarie7(LabeledExprParser.Questionnarie7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code questionnarie8}
	 * labeled alternative in {@link LabeledExprParser#start7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionnarie8(LabeledExprParser.Questionnarie8Context ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#qId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQId(LabeledExprParser.QIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#qText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQText(LabeledExprParser.QTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(LabeledExprParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#qType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQType(LabeledExprParser.QTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#qObligatoriness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQObligatoriness(LabeledExprParser.QObligatorinessContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#qCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQCondition(LabeledExprParser.QConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#extraInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraInfo(LabeledExprParser.ExtraInfoContext ctx);
}