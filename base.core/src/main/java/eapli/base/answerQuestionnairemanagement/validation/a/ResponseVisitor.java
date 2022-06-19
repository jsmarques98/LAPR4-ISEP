package eapli.base.answerQuestionnairemanagement.validation.a;

import eapli.base.answerQuestionnairemanagement.validation.QuestionnaireAnswerGrammarBaseVisitor;
import eapli.base.answerQuestionnairemanagement.validation.QuestionnaireAnswerGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class ResponseVisitor extends QuestionnaireAnswerGrammarBaseVisitor<Integer> {

    private final Set<String> mandatorySections = new HashSet<>();
    private final Set<String> mandatoryQuestions = new HashSet<>();

    private ResponseEntity responseEntity;

    private String getQuestionNumber(QuestionnaireAnswerGrammarParser.TypeContext ctx){
        ParserRuleContext questionContext = ctx.getParent();
        QuestionnaireAnswerGrammarParser.QuestionContext question = (QuestionnaireAnswerGrammarParser.QuestionContext) questionContext;
        return question.qid().NUMBER().getText();
    }

    @Override
    public Integer visitId(QuestionnaireAnswerGrammarParser.IdContext ctx) {
        this.responseEntity = new ResponseEntity(ctx.IDVALUE().getText());
        return super.visitId(ctx);
    }

    @Override
    public Integer visitVerifySection(QuestionnaireAnswerGrammarParser.VerifySectionContext ctx) {
        boolean sectionMandatory=false;
        if(ctx.obligat().condicional() !=null){
            String qNumberToVerify = ctx.obligat().condicional().condition().NUMBER().getText();
            String valueCheck;
            if(ctx.obligat().condicional().condition().OPTIONCHOICE() !=null){
                valueCheck = ctx.obligat().condicional().condition().OPTIONCHOICE().getText();
            }
            //TODO sectionMandatory if com valueCheck
        }else{
            sectionMandatory = ctx.obligat().MANDATORY()!=null;
        }
        if(sectionMandatory){
            this.mandatorySections.add(ctx.sid().NUMBER().getText());
        }
        return super.visitVerifySection(ctx);
    }

    @Override
    public Integer visitQuestion(QuestionnaireAnswerGrammarParser.QuestionContext ctx) {
        boolean questionMandatory = false;
        if(ctx.obligat().condicional() !=null){
            String qNumberToVerify = ctx.obligat().condicional().condition().NUMBER().getText();
            String valueCheck= null;
            if(ctx.obligat().condicional().condition().OPTIONCHOICE() !=null){
                valueCheck = ctx.obligat().condicional().condition().OPTIONCHOICE().getText();
            }
            if(valueCheck !=null && (this.responseEntity.getSimpleResponse().get(qNumberToVerify) != null && this.responseEntity.getSimpleResponse().get(qNumberToVerify).equals(valueCheck)) ||
                    (this.responseEntity.getMultipleResponse().get(qNumberToVerify) !=null && this.responseEntity.getMultipleResponse().get(qNumberToVerify).contains(valueCheck))){
                questionMandatory = true;
            }
        }else{
            questionMandatory = ctx.obligat().MANDATORY()!=null;
        }
        if(questionMandatory){
            this.mandatoryQuestions.add(ctx.qid().NUMBER().getText());
        }
        return super.visitQuestion(ctx);
    }

    @Override
    public Integer visitVerifyFreeText(QuestionnaireAnswerGrammarParser.VerifyFreeTextContext ctx) {
        String questionNumber = this.getQuestionNumber(ctx);

        if(this.mandatoryQuestions.contains(questionNumber)){
            if(ctx.response().STRING() == null && ctx.response().STRING_ML() == null){
                throw new IllegalArgumentException("response for question " + questionNumber + " is mandatory");
            }
            if(ctx.response().STRING() != null){
                this.responseEntity.addSimpleResponse(questionNumber, ctx.response().STRING().getText());
            }else{
                this.responseEntity.addSimpleResponse(questionNumber, ctx.response().STRING_ML().getText());
            }
        }else{
            if(ctx.response().STRING() != null){
                this.responseEntity.addSimpleResponse(questionNumber, ctx.response().STRING().getText());
            }
            if(ctx.response().STRING_ML() != null){
                this.responseEntity.addSimpleResponse(questionNumber, ctx.response().STRING_ML().getText());
            }
        }
        return super.visitVerifyFreeText(ctx);
    }

    @Override
    public Integer visitVerifyNumeric(QuestionnaireAnswerGrammarParser.VerifyNumericContext ctx) {
        String questionNumber = this.getQuestionNumber(ctx);
        if(this.mandatoryQuestions.contains(questionNumber)){
            if(ctx.response().NUMBER() == null && ctx.response().DECIMALNUMBER() == null){
                throw new IllegalArgumentException("response for question " + questionNumber + " is mandatory and must be a number");
            }
            if(ctx.response().NUMBER() != null){
                this.responseEntity.addSimpleResponse(questionNumber, ctx.response().NUMBER().getText());
            }else{
                this.responseEntity.addSimpleResponse(questionNumber, ctx.response().DECIMALNUMBER().getText());
            }
        }else{
            if(ctx.response().NUMBER() != null){
                this.responseEntity.addSimpleResponse(questionNumber, ctx.response().NUMBER().getText());
            }
            if(ctx.response().DECIMALNUMBER() != null){
                this.responseEntity.addSimpleResponse(questionNumber, ctx.response().DECIMALNUMBER().getText());
            }
        }
        return super.visitVerifyNumeric(ctx);
    }

    @Override
    public Integer visitVerifySingleChoice(QuestionnaireAnswerGrammarParser.VerifySingleChoiceContext ctx) {
        Set<String> possibleOptions = new HashSet<>();
        String questionNumber = this.getQuestionNumber(ctx);
        String selectedOption = null;
        if(ctx.responsechoice()!=null){
            selectedOption =ctx.responsechoice().OPTIONCHOICE().getText();
        }
        ctx.singlechoice().extrainfo().children.forEach(child->{
            if(child instanceof QuestionnaireAnswerGrammarParser.OptionContext){
                possibleOptions.add(((QuestionnaireAnswerGrammarParser.OptionContext) child).OPTIONCHOICE().getText());
            }
        });
        if(this.mandatoryQuestions.contains(questionNumber) && selectedOption == null){
            throw new IllegalArgumentException("response for question" + questionNumber + " is mandatory");
        }
        if(selectedOption !=null && !possibleOptions.contains(selectedOption)){
            throw new IllegalArgumentException("The option for question " + questionNumber + " is not possible");
        }
        if(selectedOption !=null){
            this.responseEntity.addSimpleResponse(questionNumber, selectedOption);
        }
        return super.visitVerifySingleChoice(ctx);
    }

    @Override
    public Integer visitVerifySingleChoiceInput(QuestionnaireAnswerGrammarParser.VerifySingleChoiceInputContext ctx) {
        Set<String> possibleOptions = new HashSet<>();
        String questionNumber = this.getQuestionNumber(ctx);
        String selectedOption = null;
        if(ctx.responsechoice()!=null){
            selectedOption =ctx.responsechoice().OPTIONCHOICE().getText();
        }
        ctx.singlechoiceinput().singlechoice().extrainfo().children.forEach(child->{
            if(child instanceof QuestionnaireAnswerGrammarParser.OptionContext){
                possibleOptions.add(((QuestionnaireAnswerGrammarParser.OptionContext) child).OPTIONCHOICE().getText());
            }
        });
        ctx.singlechoiceinput().inputoption();
        if(this.mandatoryQuestions.contains(questionNumber) && selectedOption == null){
            throw new IllegalArgumentException("response for question" + questionNumber + " is mandatory");
        }
        if(selectedOption !=null && !possibleOptions.contains(selectedOption)){
            throw new IllegalArgumentException("The option for question " + questionNumber + " is not possible");
        }
        String inputOptionValue = ctx.singlechoiceinput().inputoption().OPTIONCHOICE().getText();
        String responseInput = null;
        if(inputOptionValue.equals(selectedOption)){
            if(ctx.getChild(3) == null){
                throw new IllegalArgumentException("The selected option for question " + questionNumber + " must have a response input");
            }
            responseInput = ctx.getChild(3).getChild(1).getText();//child3 is responseinput adn child1 is the response
        }
        if(selectedOption !=null){
            this.responseEntity.addSimpleResponse(questionNumber, selectedOption);
            if(responseInput !=null){
                this.responseEntity.addInputResponse(questionNumber, responseInput);
            }
        }
        return super.visitVerifySingleChoiceInput(ctx);
    }

    @Override
    public Integer visitVerifyMultipleChoice(QuestionnaireAnswerGrammarParser.VerifyMultipleChoiceContext ctx) {
        Set<String> possibleOptions = new HashSet<>();
        String questionNumber = this.getQuestionNumber(ctx);
        List<String> selectedOptions = new ArrayList<>();
        if(ctx.responsechoice()!=null){
            String choices = ctx.responsechoice().MULTIPLEOPTIONCHOICE().getText();
            selectedOptions = Arrays.asList(choices.split(";"));
        }
        ctx.multiplechoice().extrainfo().children.forEach(child->{
            if(child instanceof QuestionnaireAnswerGrammarParser.OptionContext){
                possibleOptions.add(((QuestionnaireAnswerGrammarParser.OptionContext) child).OPTIONCHOICE().getText());
            }
        });
        if(this.mandatoryQuestions.contains(questionNumber) && selectedOptions.isEmpty()){
            throw new IllegalArgumentException("response for question" + questionNumber + " is mandatory");
        }
        if(!selectedOptions.isEmpty() && !possibleOptions.containsAll(selectedOptions)){
            throw new IllegalArgumentException("The options for question " + questionNumber + " are not possible");
        }
        if(!selectedOptions.isEmpty()){
            this.responseEntity.addMultipleResponse(questionNumber, selectedOptions);
        }
        return super.visitVerifyMultipleChoice(ctx);
    }

    @Override
    public Integer visitVerifyMultipleChoiceInput(QuestionnaireAnswerGrammarParser.VerifyMultipleChoiceInputContext ctx) {
        Set<String> possibleOptions = new HashSet<>();
        String questionNumber = this.getQuestionNumber(ctx);
        List<String> selectedOptions = new ArrayList<>();
        if(ctx.responsechoice()!=null){
            String choices = ctx.responsechoice().MULTIPLEOPTIONCHOICE().getText();
            selectedOptions = Arrays.asList(choices.split(";"));
        }
        ctx.multiplechoiceinput().multiplechoice().extrainfo().children.forEach(child->{
            if(child instanceof QuestionnaireAnswerGrammarParser.OptionContext){
                possibleOptions.add(((QuestionnaireAnswerGrammarParser.OptionContext) child).OPTIONCHOICE().getText());
            }
        });
        if(this.mandatoryQuestions.contains(questionNumber) && selectedOptions.isEmpty()){
            throw new IllegalArgumentException("response for question" + questionNumber + " is mandatory");
        }
        if(!selectedOptions.isEmpty() && !possibleOptions.containsAll(selectedOptions)){
            throw new IllegalArgumentException("The options for question " + questionNumber + " are not possible");
        }

        String inputOptionValue = ctx.multiplechoiceinput().inputoption().OPTIONCHOICE().getText();
        String responseInput = null;
        if(selectedOptions.contains(inputOptionValue)){
            if(ctx.getChild(3) == null){
                throw new IllegalArgumentException("A selected option for question " + questionNumber + " must have a response input");
            }
            responseInput = ctx.getChild(3).getChild(1).getText();//child3 is responseinput adn child1 is the response
        }

        if(!selectedOptions.isEmpty()){
            this.responseEntity.addMultipleResponse(questionNumber, selectedOptions);
            if(responseInput !=null){
                this.responseEntity.addInputResponse(questionNumber, responseInput);
            }
        }
        return super.visitVerifyMultipleChoiceInput(ctx);
    }

    @Override
    public Integer visitVerifySorting(QuestionnaireAnswerGrammarParser.VerifySortingContext ctx) {
        Set<String> possibleOptions = new HashSet<>();
        String questionNumber = this.getQuestionNumber(ctx);
        List<String> selectedOptions = new ArrayList<>();
        if(ctx.responsechoice()!=null){
            String choices = ctx.responsechoice().MULTIPLEOPTIONCHOICE().getText();
            selectedOptions = Arrays.asList(choices.split(";"));
        }
        ctx.sorting().extrainfo().children.forEach(child->{
            if(child instanceof QuestionnaireAnswerGrammarParser.OptionContext){
                possibleOptions.add(((QuestionnaireAnswerGrammarParser.OptionContext) child).OPTIONCHOICE().getText());
            }
        });
        if(this.mandatoryQuestions.contains(questionNumber) && selectedOptions.isEmpty()){
            throw new IllegalArgumentException("response for question" + questionNumber + " is mandatory");
        }
        if(!selectedOptions.isEmpty() && !possibleOptions.containsAll(selectedOptions)){
            throw new IllegalArgumentException("The options for question " + questionNumber + " are not possible");
        }
        if(selectedOptions.size() != possibleOptions.size()){
            throw new IllegalArgumentException("The options for question " + questionNumber + " must be all sorted");
        }
        if(!selectedOptions.isEmpty()){
            this.responseEntity.addSortingResponse(questionNumber, selectedOptions);
        }
        return super.visitVerifySorting(ctx);
    }

    @Override
    public Integer visitVerifyScaling(QuestionnaireAnswerGrammarParser.VerifyScalingContext ctx) {
        Set<String> possibleOptions = new HashSet<>();
        String questionNumber = this.getQuestionNumber(ctx);
        List<String> selectedOptions = new ArrayList<>();
        String min = ctx.scaling().scale().NUMBER(0).getText();
        String max = ctx.scaling().scale().NUMBER(1).getText();

        if(ctx.responsescaling()!=null){
            String choices = ctx.responsescaling().OPTIONSCALING().getText();
            selectedOptions = Arrays.asList(choices.split(";"));
        }
        ctx.scaling().extrainfo().children.forEach(child->{
            if(child instanceof QuestionnaireAnswerGrammarParser.OptionContext){
                possibleOptions.add(((QuestionnaireAnswerGrammarParser.OptionContext) child).OPTIONCHOICE().getText());
            }
        });

        if(this.mandatoryQuestions.contains(questionNumber) && selectedOptions.size() != possibleOptions.size()){
            throw new IllegalArgumentException("response for question" + questionNumber + " is mandatory");
        }
        if(selectedOptions.size() != possibleOptions.size() && ctx.responsescaling() != null){
            throw new IllegalArgumentException("The options for question " + questionNumber + " must be all scaled");
        }


        if(!selectedOptions.isEmpty()){
            selectedOptions.forEach(selected->{
                String scaleSelected = selected.split("-")[1];
                if(Integer.parseInt(scaleSelected) < Integer.parseInt(min) || Integer.parseInt(scaleSelected) > Integer.parseInt(max) ){
                    throw new IllegalArgumentException("The options for question " + questionNumber + " must be all scaled with correct range");
                }
            });
            this.responseEntity.addScalingResponse(questionNumber, selectedOptions);
        }
        return super.visitVerifyScaling(ctx);
    }

    @Override
    public Integer visitValuecheck(QuestionnaireAnswerGrammarParser.ValuecheckContext ctx) {
        return super.visitValuecheck(ctx);
    }

    public ResponseEntity getResponseEntity() {
        return this.responseEntity;
    }
}
