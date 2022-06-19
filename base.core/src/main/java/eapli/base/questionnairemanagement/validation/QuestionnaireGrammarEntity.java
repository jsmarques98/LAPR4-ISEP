package eapli.base.questionnairemanagement.validation;

import java.util.HashMap;
import java.util.List;

public class QuestionnaireGrammarEntity {
    private String id;
    private String title;
    private String welmsg;
    private HashMap<String, String> questionTypes = new HashMap<>();

    private HashMap<String, List<String>> possibleOptions = new HashMap<>();

    private HashMap<String, List<String>> questionScale = new HashMap<>();

    public QuestionnaireGrammarEntity() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWelmsg(String welmsg) {
        this.welmsg = welmsg;
    }

    public HashMap<String, String> getQuestionTypes() {
        return this.questionTypes;
    }

    public void addQuestionType(String questionId, String type){
        this.questionTypes.put(questionId, type);
    }

    public HashMap<String, List<String>> getPossibleOptions() {
        return this.possibleOptions;
    }

    public void addQuestionPossibleOptions(String questionId, List<String> options){
        this.possibleOptions.put(questionId, options);
    }

    public HashMap<String, List<String>> getQuestionScale() {
        return this.questionScale;
    }

    public void addQuestionScale(String questionId, List<String> scale){
        this.questionScale.put(questionId, scale);
    }

    @Override
    public String toString() {
        return "FormularioEntity{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", welmsg='" + welmsg + '\'' +
                '}';
    }
}
