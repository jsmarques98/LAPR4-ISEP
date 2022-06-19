package eapli.base.answerQuestionnairemanagement.application;

import eapli.base.answerQuestionnairemanagement.domain.AnswerQuestionaire;
import eapli.base.answerQuestionnairemanagement.repositories.AnswerQuestionaireRepository;
import eapli.base.answerQuestionnairemanagement.validation.QuestionnaireAnswerGrammarLexer;
import eapli.base.answerQuestionnairemanagement.validation.QuestionnaireAnswerGrammarParser;
import eapli.base.answerQuestionnairemanagement.validation.a.DescriptiveErrorListener;
import eapli.base.answerQuestionnairemanagement.validation.a.ResponseEntity;
import eapli.base.answerQuestionnairemanagement.validation.a.ResponseVisitor;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.base.questionnairemanagement.validation.EvalVisitor;
import eapli.base.questionnairemanagement.validation.QuestionnaireGrammarEntity;
import eapli.base.questionnairemanagement.validation.QuestionnaireGrammarLexer;
import eapli.base.questionnairemanagement.validation.QuestionnaireGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StatisticalReport {
    private static QuestionnaireGrammarEntity questionnaireGrammarEntity;
    private static List<ResponseEntity> responseEntities = new ArrayList<>();
    private static List<AnswerQuestionaire> answerQuestionaireList = new ArrayList<>();
    private AnswerQuestionaireRepository answerQuestionaireRepository;

    public StatisticalReport() throws IOException {

        answerQuestionaireRepository = PersistenceContext.repositories().answerQuestionaire();
    }

    public Iterable<Questionnaire> findAllQuestionnaire(){
        return PersistenceContext.repositories().questionnaire().findAll();
    }

    public void aa(Questionnaire questionnaire) throws IOException {

        questionnaire("questionnaire", questionnaire.questionnaire());

        parseSurvey("questionnaire");

        answerQuestionaireList = answerQuestionaireRepository.findByQuestionnaire(questionnaire);

        verifyResponses();
        for (int i = 0; i < answerQuestionaireList.size(); i++) {
            deleteAuxFile(String.valueOf(i));
        }
        deleteAuxFile("questionnaire");
    }

    public boolean questionnaire(String name, String q) {
        File file;
        try {
            file = new File("base.core/src/main/resources/" + name + ".txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(q);
            printWriter.write("\n");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean deleteAuxFile(String name) {
        File file = new File("base.core/src/main/resources/" + name + ".txt");
        if (file.delete())
            return true;
        return false;
    }


    public static void parseSurvey(String name) throws IOException {
        QuestionnaireGrammarLexer lexer = new QuestionnaireGrammarLexer(CharStreams.fromFileName("base.core/src/main/resources/" + name + ".txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuestionnaireGrammarParser parser = new QuestionnaireGrammarParser(tokens);
        parser.addErrorListener(DescriptiveErrorListener.INSTANCE);
        String survey = "";
        EvalVisitor eval = null;
        try {
            ParseTree tree = parser.prog();// parse -> the method prog is the same where the grammar starts
            survey = tree.toStringTree(parser);
            eval = new EvalVisitor();
            eval.visit(tree);
            if (eval.getHasErrors()) {
                System.out.println(eval.getErrorsString());
            }
        } catch (ParseCancellationException e) {
            e.printStackTrace();
        }
        assert eval != null;
        questionnaireGrammarEntity = eval.getFormularioEntity();
        //System.out.println(survey);
    }

    public void verifyResponses() throws IOException, ParseCancellationException {
        for (int i = 0; i < answerQuestionaireList.size(); i++) {

            questionnaire(String.valueOf(i), answerQuestionaireList.get(i).answerQuestionaire());

            QuestionnaireAnswerGrammarLexer lexer = new QuestionnaireAnswerGrammarLexer(CharStreams.fromFileName("base.core/src/main/resources/" + String.valueOf(i) + ".txt"));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            QuestionnaireAnswerGrammarParser parser = new QuestionnaireAnswerGrammarParser(tokens);

            parser.addErrorListener(DescriptiveErrorListener.INSTANCE);

            try {
                ParseTree tree = parser.prog();// parse -> the method prog is the same where the grammar starts
                ResponseVisitor responseVisitor = new ResponseVisitor();
                responseVisitor.visit(tree);
                ResponseEntity response = responseVisitor.getResponseEntity();
                responseEntities.add(response);
            } catch (ParseCancellationException | NullPointerException e) {
                System.out.println(e.getMessage());
                throw e;
            }
        }
        processResponses();
    }


    private static void processResponses() {
        System.out.println("Total responses: " + responseEntities.size());
        System.out.println(questionnaireGrammarEntity.getQuestionTypes());
        questionnaireGrammarEntity.getQuestionTypes().forEach((questionId, type) -> {
            switch (type) {
                case "SINGLECHOICE":
                    System.out.println("Values for question " + questionId + " of type singlechoice:");
                    HashMap<String, Integer> result = new HashMap<>();
                    questionnaireGrammarEntity.getPossibleOptions().get(questionId).forEach(option -> {
                        result.put(option, 0);
                    });
                    AtomicInteger counter = new AtomicInteger();
                    responseEntities.forEach(response -> {
                        counter.getAndIncrement();
                        String optionSelected = response.getSimpleResponse().get(questionId);
                        Integer actualValue = result.get(optionSelected);
                        result.put(optionSelected, actualValue + 1);
                    });
                    result.forEach((option, value) -> {
                        System.out.printf("The option " + option + " has %.2f%% \n", ((float) value / counter.get()) * 100);
                    });
                    break;
                case "MULTIPLECHOICE":
                    System.out.println("Values for question " + questionId + " of type multiplechoice:");
                    HashMap<String, Integer> result2 = new HashMap<>();
                    questionnaireGrammarEntity.getPossibleOptions().get(questionId).forEach(option -> {
                        result2.put(option, 0);
                    });
                    AtomicInteger counter2 = new AtomicInteger(0);
                    responseEntities.forEach(response -> {
                        if (response.getMultipleResponse().containsKey(questionId)) {
                            counter2.getAndIncrement();
                            response.getMultipleResponse().get(questionId).forEach(optionSelected -> {
                                Integer actualValue = result2.get(optionSelected);
                                result2.put(optionSelected, actualValue + 1);
                            });
                        }
                    });
                    result2.forEach((option, value) -> {
                        if (counter2.get() != 0) {
                            System.out.printf("The option " + option + " has %.2f%% \n", ((float) value / counter2.get()) * 100);
                        }
                    });
                    break;
                case "SORTING":
                    System.out.println("Values for question " + questionId + " of type sorting:");
                    HashMap<String, Integer> result3 = new HashMap<>();
                    AtomicInteger counter3 = new AtomicInteger();
                    responseEntities.forEach(response -> {
                        counter3.getAndIncrement();
                        String sortedOptions = String.join(";", response.getSortingResponse().get(questionId));
                        if (result3.containsKey(sortedOptions)) {
                            Integer actualValue = result3.get(sortedOptions);
                            result3.put(sortedOptions, actualValue + 1);
                        } else {
                            result3.put(sortedOptions, 1);
                        }
                    });
                    result3.forEach((option, value) -> {
                        System.out.printf("The sorting " + option + " has %.2f%% \n", ((float) value / counter3.get()) * 100);
                    });
                    break;
                case "SCALING":
                    System.out.println("Values for question " + questionId + " of type scaling:");
                    String min = questionnaireGrammarEntity.getQuestionScale().get(questionId).get(0);
                    String max = questionnaireGrammarEntity.getQuestionScale().get(questionId).get(1);
                    HashMap<String, HashMap<String, Integer>> result4 = new HashMap<>();
                    for (int i = Integer.parseInt(min); i <= Integer.parseInt(max); i++) {
                        HashMap<String, Integer> options = new HashMap<>();
                        for (String op : questionnaireGrammarEntity.getPossibleOptions().get(questionId)) {
                            options.put(op, 0);
                            result4.put(String.valueOf(i), options);
                        }
                    }
                    AtomicInteger counter4 = new AtomicInteger(0);
                    responseEntities.forEach(response -> {
                        if (response.getScalingResponse().containsKey(questionId)) {
                            counter4.getAndIncrement();
                            response.getScalingResponse().get(questionId).forEach(optionScaled -> {
                                String scaleNumber = optionScaled.split("-")[1];
                                String scaleOption = optionScaled.split("-")[0];
                                Integer actualValue = result4.get(scaleNumber).get(scaleOption);
                                result4.get(scaleNumber).put(scaleOption, actualValue + 1);
                            });
                        }

                    });
                    result4.forEach((scaleNumber, options) -> {
                        if (counter4.get() != 0) {
                            System.out.print(scaleNumber + " - ");
                            options.forEach((op, value) -> {
                                System.out.printf("The option " + op + " has the value: %.2f%%", ((float) value / counter4.get()) * 100);
                            });
                            System.out.println();
                        }
                    });
                    break;
            }
        });
    }
}
