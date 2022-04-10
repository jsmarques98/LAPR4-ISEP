# AGGREGATE QUESTIONNAIRE

## 1. Technical decisions

###1.1 Aggregate

- We create "Aggregate Questionnaire" because it will be needed to create and manage questionnaires.


- Also, because of consistent: if we keep "Questionnaire" inside another aggregate like "Aggregate Order" and if we needed to delete some orders, we will have to delete questionnaires too.


###1.2 Entities
###Product
We consider that "Questionnaire" should be an entity because:
- It has a unique identifier (Id), and it is always unique because we won't have
two exactly the same questionnaires even if they have the same properties


- It will be needed to manage and create questionnaires in our application.


We consider that "Question" should be an entity because:
- It has a unique identifier (questionId), and it is always unique because we won't have
two exactly the same questions


- It will be needed to manage and create questions in our application.


We consider that "QuestionNumeric", "QuestionScailingOptions", "QuestionFreeText", "QuestionSortingOptions", "QuestionSingleChoice", "QuestionMultipleChoiceWithInputValue" and "QuestionMultipleCoice" should all be considered entitities because:

- All of them are derived by inheritance of the entity "Question"


- It will be needed to manage and create all of these type of questions in our application.


We consider that "Section" should be an entity because:
- It has a unique identifier (sectionId), and it is always unique because we won't have
two exactly the same customers


- It will be needed to manage and create sections in our application.


We consider that "Answer" should be an entity because:
- It has a unique identifier (answerId), and it is always unique because even if we have
two exactly same answers, it will be from different customers


- It will be needed to manage answers in our application.


We consider that "AnswerNumeric", "AnswerScailingOptions", "AnswerFreeText", "AnswerSortingOptions", "AnswerSingleChoice", "AnswerMultipleChoiceWithInputValue" and "AnswerMultipleCoice" should all be considered entitities because:

- All of them are derived by inheritance of the entity "Answer"


- It will be needed to manage all of these type of answer in our application.


We consider that "Notification" should be an entity because:
- It refers to a unique customer (customerId), and it is always unique because we won't have two exactly the same customers id


- It will be needed to manage and create notifications in our application.




###1.3 Value objects

###idQuestionnaire

We consider that "idQuestionnaire" should be a value object because:

- It classifies the entity "Questionnaire".


- It may follow some construction rules.

###Title
We consider that "Title" should be a value object because:

- It classifies the entity "Questionnaire" and the entity "Section".


- It may follow some construction rules.

###Message
We consider that "Message" should be a value object because:

- It classifies the entity "Questionnaire".


- It may follow some construction rules.


###Description
We consider that "Description" should be a value object because:

- It classifies the entity "Section".


- It may follow some construction rules.

###Repeatability
We consider that "Repeatability" should be a value object because:

- It classifies the entity "Section".


###Obligatoriness
We consider that "Obligatoriness" should be a value object because:

- It classifies the entity "Section".


###Scale
We consider that "Scale" should be a value object because:

- It classifies the entity "QuestionScailingOptions".

###subQuestion
We consider that "subQuestion" should be a value object because:

- It classifies the entity "QuestionScailingOptions".


###maxQuestion
We consider that "maxQuestion" should be a value object because:

- It classifies the entity "QuestionMultipleCoice" and "QuestionMultipleChoiceWithInputValue".
