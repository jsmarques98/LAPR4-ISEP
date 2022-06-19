package eapli.base.questionnairemanagement.validation;


import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class EvalVisitor extends QuestionnaireGrammarBaseVisitor<Integer> {
    private boolean hasErrors = false;
    private StringBuilder errors = new StringBuilder();

    private Set<String> sectionIds = new HashSet<>();
    private Set<String> questionIds = new HashSet<>();
    private QuestionnaireGrammarEntity formularioEntity = new QuestionnaireGrammarEntity();

    @Override
    public Integer visitGenerateHeader( QuestionnaireGrammarParser.GenerateHeaderContext ctx) {
        String id = ctx.id().IDVALUE().getText();
        String title = ctx.title().STRING().getText();//podemos ir buscar a regra e o seu valor ou entao o child como na de baixo
        String welmsg = ctx.welmsg().getChild(1).getText();
        this.formularioEntity.setId(id);
        this.formularioEntity.setTitle(title);
        this.formularioEntity.setWelmsg(welmsg);
        return super.visitGenerateHeader(ctx);
    }

    @Override
    public Integer visitSid(QuestionnaireGrammarParser.SidContext ctx) {
        if (this.sectionIds.contains(ctx.NUMBER().getText())) {
            this.hasErrors = true;
            this.errors.append(String.format("Repeated Section ID -> %s%n", ctx.NUMBER().getText()));
        } else {
            this.sectionIds.add(ctx.NUMBER().getText());
        }
        return super.visitSid(ctx);
    }

    @Override
    public Integer visitQid(QuestionnaireGrammarParser.QidContext ctx) {
        if(this.questionIds.contains(ctx.NUMBER().getText())){
            this.hasErrors = true;
            this.errors.append(String.format("Repeated Question ID -> %s%n", ctx.NUMBER().getText()));
        } else {
            this.questionIds.add(ctx.NUMBER().getText());
        }
        return super.visitQid(ctx);
    }

    @Override
    public Integer visitQuestion(QuestionnaireGrammarParser.QuestionContext ctx) {
        String questionId = ctx.qid().NUMBER().getText();
        String questionType = null;
        if(ctx.type().getChild(1).getChild(0) instanceof TerminalNode){
            questionType = ctx.type().getChild(1).getChild(0).getText();
        }else{
            questionType = ctx.type().getChild(1).getChild(0).getChild(0).getText();
        }
        this.formularioEntity.addQuestionType(questionId, questionType);
        return super.visitQuestion(ctx);
    }

    @Override
    public Integer visitProcessExtraInfo(QuestionnaireGrammarParser.ProcessExtraInfoContext ctx) {
        String questionNumber = null;
        if(ctx.getParent().getParent().getParent().getChild(0).getChild(1) == null){
            questionNumber = ctx.getParent().getParent().getParent().getParent().getChild(0).getChild(1).getText();
        }else{
            questionNumber = ctx.getParent().getParent().getParent().getChild(0).getChild(1).getText();
        }

        List<String> possibleOptions = new ArrayList<>();
        ctx.option().forEach(option->{
            possibleOptions.add(option.OPTIONCHOICE().getText());
        });
        this.formularioEntity.addQuestionPossibleOptions(questionNumber, possibleOptions);
        return super.visitProcessExtraInfo(ctx);
    }

    @Override
    public Integer visitScaling(QuestionnaireGrammarParser.ScalingContext ctx) {
        String min = ctx.scale().NUMBER(0).getText();
        String max = ctx.scale().NUMBER(1).getText();
        String questionNumber = ctx.getParent().getParent().getChild(0).getChild(1).getText();
        this.formularioEntity.addQuestionScale(questionNumber, Arrays.asList(min,max));
        return super.visitScaling(ctx);
    }

    public boolean getHasErrors() {
        return this.hasErrors;
    }

    public String getErrorsString(){
        return this.errors.toString();
    }

    public QuestionnaireGrammarEntity getFormularioEntity() {
        return formularioEntity;
    }
}
