grammar QuestionnaireGrammar;  //grammars name

// Initial rule, the parsing starts here
prog: start|start1 ;

//a = ID(mandatory)
//b = Title(mandatory)
//c = Welcome Message(optional)
//d = Sections(mandatory)
//e = Final Message

start: a=id NEWLINE b=title NEWLINE c=welcomeMessage NEWLINE d=section NEWLINE e=finalMessage NEWLINE # questionnarie1 //accepts with all the fields
    ;

start1: a=id NEWLINE b=title NEWLINE d=section NEWLINE e=finalMessage NEWLINE # questionnarie2 //without welcome message
;

id: 'ID: '(ALPHANUMERIC)+ ; // accepts letters and numbers and it's mandatory

title: ('Title: ' | 'TITLE: ') (DESCRIPTION | WS | SIGNALS)+ ; // only accepts letters and it's mandatory

welcomeMessage: ('Welcome Message: ' | 'WelcomeMessage: ') (DESCRIPTION | WS | SIGNALS)+ ; //  only accepts letters and it's optional

finalMessage: ('Final Message: ' | 'FinalMessage: ') (DESCRIPTION | WS | SIGNALS)+ ; // only accepts letters and it's optional

section: (start2|start3|start4|start5)+ ;

//a = ID(mandatory)
//b = Title(mandatory)
//c = Description(optional)
//d = Obligatoriness(mandatory)
//e = Repeatability(optional)
//f = Content(mandatory)

start2: (NEWLINE a=sID NEWLINE b=sTitle NEWLINE c=sDescription NEWLINE d=sObligatoriness NEWLINE e=sRepeatability NEWLINE f=question NEWLINE) # questionnarie3 // every options
    ;

start3: (NEWLINE a=sID NEWLINE b=sTitle NEWLINE c=sDescription NEWLINE d=sObligatoriness NEWLINE f=question NEWLINE) # questionnarie4 //sectionRepeatability optional
    ;

start4: (NEWLINE a=sID NEWLINE b=sTitle NEWLINE d=sObligatoriness NEWLINE e=sRepeatability NEWLINE f=question NEWLINE) # questionnarie5 //sectionDescription optional
    ;

start5: (NEWLINE a=sID NEWLINE b=sTitle NEWLINE d=sObligatoriness NEWLINE f=question NEWLINE) # questionnarie6 //sectionDescription e sectionRepeatability optional
    ;

sID: ('Section ID: ' | 'SectionID: ') (NUMBERS)+ ; // only accepts numbers
sTitle : ('Section Title: ' | 'SectionTitle: ') (DESCRIPTION | WS | SIGNALS)+ ; // only accepts letters
sDescription : ('Section Description: ' | 'SectionDescription: ') (DESCRIPTION | WS | SIGNALS)+ ; // only accepts letters

sObligatoriness : ('Section Obligatoriness: ' | 'SectionObligatoriness: ') (MANDATORY | OPTIONAL | sCondition)+ ;

sCondition: ('Condition Dependent: ' | 'ConditionDependent: ') (DESCRIPTION | WS | SIGNALS)+ ;

sRepeatability : ('Section Repeatability: '| 'SectionRepeatibility: ') (NUMBERS)+ ;

question: (start6|start7)+ ;

//a = ID(mandatory)
//b = Question(mandatory)
//c = Instruction(optional)
//d = Type(mandatory)
//e = Obligatoriness(mandatory)
//f = Extra Info(mandatory)

start6: (NEWLINE a=qId NEWLINE b=qText NEWLINE c=instruction NEWLINE d=qType NEWLINE e=qObligatoriness NEWLINE f=extraInfo NEWLINE) # questionnarie7 // mandatory to have a section
    ;

start7: (NEWLINE a=qId NEWLINE b=qText NEWLINE d=qType NEWLINE e=qObligatoriness NEWLINE f=extraInfo NEWLINE) # questionnarie8 //instruction optional
    ;

qId: ('Question ID: ' | 'QuestionID: ') (NUMBERS)+ ; // only accepts numbers
qText: ('Question Text: ' | 'QuestionText: ') (DESCRIPTION | WS | SIGNALS)+ ; // only accepts letters
instruction: 'Instruction: '(DESCRIPTION | WS | SIGNALS)+ ; // only accepts letters

qType: ('Type: ' | 'TYPE: ') (FREETEXT | NUMERIC | SINGLECHOICE | SINGLECHOICE_WITH_INPUT  | MULTIPLECHOICE | MULTIPLECHOICE_WITH_INPUT | SORTING_OPTIONS | SCALING_OPTIONS)+ ;

qObligatoriness: ('Question Obligatoriness: ' | 'QuestionObligatoriness: ') (MANDATORY | OPTIONAL | qCondition)+ ;

qCondition: ('Condition Dependent: ' | 'ConditionDependent: ')(DESCRIPTION | WS | SIGNALS)+ ;

extraInfo: ('Extra Info: ' | 'ExtraInfo: ') (DESCRIPTION | WS | SIGNALS)+ ; // only accepts letters and it's not mandatory


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// lexer rule

FREETEXT: ('Freetext'| 'FREETEXT' | 'FreeText') ;
NUMERIC: ('Numeric' | 'NUMERIC') ;
SINGLECHOICE: ('Single-choice' | 'SingleChoice' | 'Singlechoice') ;
SINGLECHOICE_WITH_INPUT: ('Single-choice with input' |  'SingleChoice with input' |  'Singlechoice with input') ;
MULTIPLECHOICE: ('Multiple-choice' | 'MultipleChoice' | 'Multiplechoice') ;
MULTIPLECHOICE_WITH_INPUT: ('Multiple-choice with input' | 'MultipleChoice with input' | 'Multiplechoice with input') ;
SORTING_OPTIONS: ('Sorting options' | 'SortingOptions' | 'Sortingoptions') ;
SCALING_OPTIONS: ('Scaling options' | 'ScalingOptions' | 'Scalingoptions') ;

MANDATORY: ('Mandatory' | 'MANDATORY') ;
OPTIONAL: ('Optional' | 'OPTIONAL') ;
CONDITION_DEPENDENT: ('Condition dependent' | 'ConditionDependent') ;

DESCRIPTION: [a-zA-Z]+  ; // only letters

SIGNALS: [!] | [?] | [,] | [.]+ ; // only accepts signals

LOWERCASE: [a-z]+ ; // only accepts lowercase letters
UPPERCASE: [A-Z]+ ; // only accepts capslock letters
NUMBERS: [0-9]+ ; // only accepts numbers

NEWLINE:'\r'? '\n' ;  // returns the end of the line to end the expression

WS : [ \t]+ ; //TAB

ALPHANUMERIC: ([a-zA-Z0-9] | [-])+ ; // only accepts letters, numbers and signs