public class MBTI {
    private String[] questions;
    private String[] responses;


    public MBTI() {
        questions = new String[20];
        questions[0] = "1. {A} expend energy, enjoy groups. {B}. conserve energy, enjoy one-on-one";
        questions[1] = "2. {A}. Interpret literally, {B}. look for meaning and possibilities";
        questions[2] = "3. {A}. logical, thinking, questioning, {B}. empathetic, feeling, accommodating";
        questions[3] = "4. {A}. organized, orderly. {B}.flexible, adaptable";
        questions[4] = "5. {A} more outgoing, think out loud, {B}.   more reserved, think to yourself";
        questions[5] = "6. {A}. practical, realistic, experiential {B}. imaginative, innovative,   theoretical";
        questions[6] = "7. {A}. candid, straight forward, frank. {B}. tactful,   kind, encouraging";
        questions[7] = "8. {A}. plan, schedule, {B}. unplanned, spontaneous";
        questions[8] = "9. {A}. seek many tasks, public activities, interaction with others. {B}seek private, solitary activities with quiet to concentrate";
        questions[9] = "10. {A} standard, usual, conventional. {B}  different, novel, unique";
        questions[10] = "11. {A}. firm, tend to criticize. {B}   hold the line gentle, tend to appreciate, conciliate";
        questions[11] = "12. {A} regulated, structured. {B} easy-going, live and let live";
        questions[12] = "13. {A} external, communicative, express yourself., {B}. internal, reticent, keep to yourself";
        questions[13] = "14. {A}  focus on here-and-now. {B} Look to the future, global perspective,big picture";
        questions[14] = "15. {A} tough-minded, just. {B} gender-hebrted, merciful";
        questions[15] = "16. {A} preparation, plan ahead,{B} go with the flow, adapt as you go";
        questions[16] = "17. {A} active, initiate. {B}reflective, deliberate";
        questions[17] = "18. {A} facts, things, what is., {B}ideas, dreams, what could be, philosophical";
        questions[18] = "19. {A} matter of fact, issue-oriented. {B} sensitive, people-oriented, compassionate";
        questions[19] = "20. {A} sensitive, people-oriented, compassionate {B} sensitive, people-oriented, compassionate";

    }


    public String[] getResponses() {
        return responses;
    }

    public void acceptResponses(String response) {

        responses = new String[20];
        saveResponses(response);
    }

    private void saveResponses(String response) {
        for (int count = 0; count < responses.length; count++) {
            responses[count] = response;}
    }

    public String determineIntrovertOrEntrovertPersonalityTrait() {
        int introvert = 0;
        int extrovert = 0;
        for (int count = 0; count < responses.length; count+=4) {
            if (responses[count] == "A") {
                extrovert++;
            } else {
                introvert++;
            }
        }System.out.println("INTROVERT OR EXTROVERT TEST SCORE");
        System.out.println("Number of A selected " + introvert);
        System.out.println("Number of B selected " + extrovert);
        if (introvert > extrovert) {
            return "Introvert";
        } else {
            return "Extrovert";
        }
    }

    public String determineIntuitiveOrSensingPersonalityTrait () {
        int sensing = 0;
        int intuitive = 0;
        for (int count = 1; count < responses.length; count+=4) {
            if (responses[count] == "A") {
                sensing++;
            } else {
                intuitive++;
            }
        }
        System.out.println("SENSING OR INTUITIVETEST SCORE");
        System.out.println("Number of A selected " + sensing);
        System.out.println("Number of B selected " + intuitive);
        if (sensing > intuitive) {
            return "Sensing";
        } else {
            return "Intuitive";
        }
    }

    public String determinePersonalityTrait() {
        return determineJudgingOrPerceptivePersonalityTrait() + "\n" + determineIntrovertOrEntrovertPersonalityTrait() + "\n" +
                determineIntuitiveOrSensingPersonalityTrait() + "\n" + determineThinkingOrFeelingPersonalityTrait();
    }

    public String determineThinkingOrFeelingPersonalityTrait () {
        int thinking = 0;
        int feeling = 0;
        for (int count = 2; count < responses.length; count+=4) {
            if (responses[count].equals("A")) {
                thinking=thinking+1;
            }  if (responses[count].equals("B")){
                feeling=feeling+1;
            }
        }
        System.out.println("THINKING OR FEELING TEST SCORE");
        System.out.println("Number of A selected " + thinking);
        System.out.println("Number of B selected " + feeling);
        if (thinking > feeling) {
            return "Thinking";
        } else {
            return "Feeling";
        }
    }


    public String determineJudgingOrPerceptivePersonalityTrait () {
        int judging = 0;
        int perceptive = 0;
        for (int count = 3; count < responses.length; count+=4) {
            if (responses[count] == "A") {
                judging++;
            } else {
                perceptive++;
            }
        }
        System.out.println("JUDGING OR PERCEPTIVE TEST SCORE");
        System.out.println("Number of A selected " + judging);
        System.out.println("Number of B selected " + perceptive);
        if (judging > perceptive) {
            return "Perceptive";
        } else {
            return "Judging";
        }
    }

    public String[] getQuestions() {
        return questions;
    }
}