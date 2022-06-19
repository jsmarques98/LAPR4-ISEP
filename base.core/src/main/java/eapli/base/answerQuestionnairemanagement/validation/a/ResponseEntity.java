package eapli.base.answerQuestionnairemanagement.validation.a;

import java.util.HashMap;
import java.util.List;

public class ResponseEntity {

    private String formId;
    private HashMap<String, String> simpleResponse = new HashMap<>();
    private HashMap<String, List<String>> multipleResponse = new HashMap<>();
    private HashMap<String, String> inputResponse = new HashMap<>();
    private HashMap<String, List<String>> sortingResponse = new HashMap<>();
    private HashMap<String, List<String>> scalingResponse = new HashMap<>();

    public ResponseEntity(String formId) {
        this.formId = formId;
    }

    public String getFormId() {
        return this.formId;
    }

    public HashMap<String, String> getSimpleResponse() {
        return this.simpleResponse;
    }

    public HashMap<String, List<String>> getMultipleResponse() {
        return this.multipleResponse;
    }

    public HashMap<String, List<String>> getSortingResponse() {
        return this.sortingResponse;
    }

    public HashMap<String, String> getInaputResponse() {
        return this.inputResponse;
    }

    public HashMap<String, List<String>> getScalingResponse() {
        return scalingResponse;
    }

    public void addSimpleResponse(String questionId, String response) {
        this.simpleResponse.put(questionId, response);
    }

    public void addMultipleResponse(String questionId, List<String> response) {
        this.multipleResponse.put(questionId, response);
    }

    public void addSortingResponse(String questionId, List<String> response) {
        this.sortingResponse.put(questionId, response);
    }

    public void addInputResponse(String questionId, String response){
        this.inputResponse.put(questionId, response);
    }

    public void addScalingResponse(String questionId, List<String> response){
        this.scalingResponse.put(questionId, response);
    }
}
