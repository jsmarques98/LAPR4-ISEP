grammar QuestionnaireAnswerGrammar;

prog: start+;
start : header section+ endmsg;
header : id title welmsg? #generateHeader;
id:   ('ID:') IDVALUE NEWLINE;
title:('TITLE:') STRING NEWLINE;
welmsg: ('WELCOME MENSAGE:') (STRING|STRING_ML) NEWLINE;
endmsg:  ('END MENSAGE:') (STRING|STRING_ML) NEWLINE;

section: sid title descr obligat rep? question+ #verifySection;
sid: 'SECTION ID:' NUMBER NEWLINE;
descr: 'DESCRIPTION:' (STRING|STRING_ML) NEWLINE;
obligat: 'OBLIGATORINESS:' (MANDATORY|OPTIONAL) NEWLINE
       | 'OBLIGATORINESS:' condicional NEWLINE;
rep: REP NUMBER+ VALUE (STRING+|NUMBER+) NEWLINE; //to repeat the questions numbers defined in number if any value is prensent
OBLIGAT:'OBLIGAT:';
MANDATORY: 'MANDATORY' ;
OPTIONAL: 'OPTIONAL' ;
condicional: CONDITIONAL condition;
condition: CONDITION 'QUESTION ID:' NUMBER VALUE OPTIONCHOICE;
CONDITIONAL: 'CONDITIONAL';
CONDITION: 'CONDITION:';
REP:'REP:';

question: qid question_ask obligat type
        | qid question_ask instructions obligat type;
qid:'QUESTION ID:' NUMBER NEWLINE;
question_ask: QUESTION STRING NEWLINE;
instructions: 'INTRUCTIONS:' (STRING|STRING_ML) NEWLINE;
QUESTION: 'QUESTION:';

type: TYPE freetext response? #verifyFreeText
    | TYPE numeric response? #verifyNumeric
    | TYPE singlechoice responsechoice? #verifySingleChoice
    | TYPE singlechoiceinput responsechoice? responseinput? #verifySingleChoiceInput
    | TYPE multiplechoice responsechoice? #verifyMultipleChoice
    | TYPE multiplechoiceinput responsechoice? responseinput? #verifyMultipleChoiceInput
    | TYPE sorting responsechoice? #verifySorting
    | TYPE scaling responsescaling? #verifyScaling
    ;
responseinput: RESPONSEINPUT STRING NEWLINE;
RESPONSEINPUT:'RESPONSEINPUT:';

TYPE:'TYPE:';
valuecheck: VALUECHECK OPTIONCHOICE NEWLINE;
VALUECHECK: 'VALUECHECK:';
extrainfo: EXTRAINFO (STRING|STRING_ML) NEWLINE option option+ #processExtraInfo;
EXTRAINFO:'EXTRAINFO:';
option: OPTION OPTIONCHOICE NEWLINE descr NEWLINE?;
OPTION: 'OPTION:';
OPTIONCHOICE:[A-Z];
VALUE: 'VALUE:';
response: RESPONSE (STRING|STRING_ML|NUMBER|DECIMALNUMBER) NEWLINE;
responsechoice: RESPONSE (OPTIONCHOICE|MULTIPLEOPTIONCHOICE) NEWLINE;
responsescaling: RESPONSE OPTIONSCALING NEWLINE;
MULTIPLEOPTIONCHOICE: OPTIONCHOICE (';'OPTIONCHOICE)+;
OPTIONSCALING:[A-Z]'-'[0-9] (';'[A-Z]'-'[0-9])+;
RESPONSE: 'RESPONSE:';

//FREETEXT
freetext: FREETEXT limitchar NEWLINE
        | FREETEXT limitcharline NEWLINE
        | FREETEXT NEWLINE;

limitchar: LIMITCHAR NUMBER;
limitcharline: LIMITCHARLINE NUMBER;
FREETEXT:'FREETEXT';
LIMITCHAR:'LIMITCHAR:';
LIMITCHARLINE:'LIMITCHARLINE:';
//END FREETEXT

//NUMERIC
numeric:  valuecheck? NUMERIC NEWLINE
       |  valuecheck? DECIMAL NEWLINE;
DECIMAL: 'DECIMAL';
NUMERIC: 'NUMERIC';
//END NUMERIC

//SINGLECHOICE
singlechoice: SINGLECHOICE NEWLINE valuecheck? extrainfo;
SINGLECHOICE:'SINGLECHOICE';
//END SINGLECHOICE

//SINGLECHOICEINPUT
singlechoiceinput: singlechoice valuecheck? inputoption;
inputoption:INPUTOPTION OPTIONCHOICE NEWLINE valuecheck?;
INPUTOPTION:'INPUTOPTION:';
//END SINGLECHOICEINPUT

//MULTIPLECHOICE
multiplechoice: MULTIPLECHOICE NEWLINE valuecheck? extrainfo;
MULTIPLECHOICE:'MULTIPLECHOICE';
//END MULTIPLECHOICE

//MULTIPLECHOICEINPUT
multiplechoiceinput: multiplechoice valuecheck? inputoption;
//END MULTIPLECHOICEINPUT

//SORTING
sorting: SORTING NEWLINE extrainfo;
SORTING:'SORTING';
//END SORTING


//SCALING
scaling: SCALING NEWLINE scale NEWLINE extrainfo;
scale:SCALE NUMBER '-' NUMBER; //the number in scale defines the type of scale first less last greater
SCALING:'SCALING';
SCALE:'SCALE:';
//END SCALING


IDVALUE:([a-zA-Z][0-9]*('-'[0-9]+)?)+;



NUMBER:[0-9]+;
DECIMALNUMBER:[0-9]+[.,][0-9]+;



STRING: '"'~[\n"]*'"';
STRING_ML: '"'~(["])*'"';



//generics
WS: [ \t\r]+ -> skip;
NEWLINE: [\n];
