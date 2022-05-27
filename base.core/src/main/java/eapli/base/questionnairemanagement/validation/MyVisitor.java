package eapli.base.questionnairemanagement.validation;

import eapli.base.questionnairemanagement.validation.LabeledExprBaseVisitor;
import eapli.base.questionnairemanagement.validation.LabeledExprParser;

public class MyVisitor extends LabeledExprBaseVisitor<Object> {

    @Override public Object visitQuestionnarie1(LabeledExprParser.Questionnarie1Context ctx) {
        System.out.println("Success Questionnarie1!");
        return visitChildren(ctx); }

    @Override public Object visitQuestionnarie2(LabeledExprParser.Questionnarie2Context ctx) {
        System.out.println("Success Questionnarie2!");
        return visitChildren(ctx); }

    @Override public Object visitQuestionnarie3(LabeledExprParser.Questionnarie3Context ctx) {
        System.out.println("Success Questionnarie3!");
        return visitChildren(ctx); }

    @Override public Object visitQuestionnarie4(LabeledExprParser.Questionnarie4Context ctx) {
        System.out.println("Success Questionnarie4!");
        return visitChildren(ctx); }

    @Override public Object visitId(LabeledExprParser.IdContext ctx) {
        return visitChildren(ctx); }

    @Override public Object visitTitle(LabeledExprParser.TitleContext ctx) {
        return visitChildren(ctx); }

    @Override public Object visitWelcomeMessage(LabeledExprParser.WelcomeMessageContext ctx) {
        return visitChildren(ctx); }

    @Override public Object visitFinalMessage(LabeledExprParser.FinalMessageContext ctx) {
        return visitChildren(ctx); }

    @Override public Object visitSection(LabeledExprParser.SectionContext ctx) {
        return visitChildren(ctx); }

    @Override public Object visitQuestionnarie5(LabeledExprParser.Questionnarie5Context ctx) {
        return visitChildren(ctx); }

    @Override public Object visitQuestionnarie6(LabeledExprParser.Questionnarie6Context ctx) {
        return visitChildren(ctx); }


    @Override public Object visitQuestion(LabeledExprParser.QuestionContext ctx) {
        return visitChildren(ctx); }

    @Override public Object visitQuestionnarie11(LabeledExprParser.Questionnarie11Context ctx) {
        return visitChildren(ctx); }

    @Override public Object visitQuestionnarie12(LabeledExprParser.Questionnarie12Context ctx) {
        return visitChildren(ctx); }


    @Override public Object visitExtraInfo(LabeledExprParser.ExtraInfoContext ctx) {
        return visitChildren(ctx); }
}