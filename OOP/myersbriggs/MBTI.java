import java.util.Scanner;
public class MBTI {

    /*MbtiQuestion[] mbtiQ;
    String[] collectQuestion = new String[mbtiQ.length];*/
    private final String moreThanCharacterErrorMessage =  "Hey Mate, you have entered more than the required Character";
    Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        MBTI mb = new MBTI();
        mb.solveQuestion1();
        mb.solveQuestion2();
        mb.solveQuestion3();
        mb.solveQuestion4();
        mb.solveQuestion5();
    }
    public void solveQuestion1() {
        System.out.println("This is the first question to your personality test, you can only pick A or B");
        System.out.println(MbtiQuestion.QUESTION1.getQuestion());
        System.out.print("Select your answer: ");
        String answer1 = userInput.nextLine();
        char newAns1 = ' ';
        if (answer1.length() == String.valueOf(MbtiQuestion.QUESTION1.getAnswer()).length()) newAns1 = answer1.charAt(0);
        else System.out.println(moreThanCharacterErrorMessage);
        if (newAns1 == MbtiQuestion.QUESTION1.getAnswer()) System.out.println("You are Introverted");
        else System.out.println("You are an extrovert");

    }
    public void solveQuestion2(){
        System.out.println("This is the second question to your personality test, kindly pick A or B");
        System.out.println(MbtiQuestion.QUESTION2.getQuestion());
        System.out.print("Select your answer: ");
        String answer2 = userInput.nextLine();
        char newAns2 = ' ';
        if(answer2.length() == String.valueOf(MbtiQuestion.QUESTION2.getAnswer()).length()) newAns2 = answer2.charAt(0);
        else System.out.println(moreThanCharacterErrorMessage);
        if(newAns2 == MbtiQuestion.QUESTION2.getAnswer()) System.out.println("You are classified as spontaneous and intuitive");
        else System.out.println("You are classified to be organized and methodical in their approach");
    }
    public void solveQuestion3(){
        System.out.println("This is third question for your personality test, Kindly Pick A or B");
        System.out.println(MbtiQuestion.QUESTION3.getQuestion());
        System.out.print("Select your answer: ");
        String answer3 = userInput.nextLine();
        char newsAns3 = ' ';
        if(answer3.length() == String.valueOf(MbtiQuestion.QUESTION3.getAnswer()).length()){
            newsAns3 = answer3.charAt(0);
        } else System.out.println(moreThanCharacterErrorMessage);
        if(newsAns3 == MbtiQuestion.QUESTION3.getAnswer())
            System.out.println("""
                This shows you are more inclined to express dissatisfaction or discontent with a situation, 
                which means you are more motivated to take action to address and improve the situation, 
                rather than passively accepting things as they are.
                """);
        else System.out.println("""
                This shows you accept things the way they are! You would be more inclined to embrace the current state 
                of affairs and choose not to challenge or change it. You may have a more accepting or contented attitude 
                towards the situation, even if it deviates from your expectations or preferences.
                """);
    }
    public void solveQuestion4(){
        System.out.println("This is the Fourth Question for your personality test, Kindly Pick A or B");
        System.out.println(MbtiQuestion.QUESTION4.getQuestion());
        System.out.print("Select your answer: ");
        String answer4 = userInput.nextLine();
        char newAns4 = ' ';
        if(answer4.length() == String.valueOf(MbtiQuestion.QUESTION4.getAnswer()).length()) newAns4 = answer4.charAt(0);
        else System.out.println(moreThanCharacterErrorMessage);
        if(newAns4 == MbtiQuestion.QUESTION4.getAnswer())
            System.out.println("""
                    This personality trait aligns more with a Perceiving preference, 
                    indicating a tendency to stay open-ended, adaptable, 
                    and flexible.
                    """);
        else System.out.println("""
                This personality trait accept things the way they are and aligns more with a Judging preference, 
                indicating a preference for structure, organization, and closure.
                """);
    }
    public void solveQuestion5(){
        System.out.println("This is the Fifth Question for your personality test, Kindly Pick A or B");
        System.out.println(MbtiQuestion.QUESTION5.getQuestion());
        System.out.print("Select your answer: ");
        String answer5 = userInput.nextLine();
        char newAns5 = ' ';
        if(answer5.length() == String.valueOf(MbtiQuestion.QUESTION5.getAnswer()).length()) newAns5 = answer5.charAt(0);
        else System.out.println(moreThanCharacterErrorMessage);
        if(newAns5 == MbtiQuestion.QUESTION5.getAnswer())
            System.out.println("""
                    This personality trait shows you prioritize fairness, equity, and adherence to rules and principles 
                    in determining what is morally right or wrong. Your moral judgments would likely be guided by concepts 
                    such as rights, equality, and impartiality.
                    """);
        else System.out.println("""
                    This personality trait shows that you prefer to base morality on compassion, it means you prioritize empathy, 
                    kindness, and consideration for others' well-being in determining what is morally right or wrong. 
                    Your moral judgments would likely be guided by the desire to alleviate suffering, promote kindness, 
                    and show compassion towards others.
                    """);
    }


    /*for(MbtiQuestion value: MbtiQuestion.QUESTION1.values()){
        System.out.println(value.getQuestion());
    }*/
    /*for(MbtiQuestion ques: MbtiQuestion.values()){
        for(MbtiQuestion value: ques.getQuestion())
    }*/
   /* for(int count = 0; count<mbtiQ.length; count++){
        collectQuestion[count] = MbtiQuestion.;
    }
    System.out.println(MbtiQuestion.QUESTION1.getQuestion());*/

    /*int loopThroughMBT = 0;
    for(int loopThroughMBT = 0; loopThroughMBT<mbtiQ.length; loopThroughMBT++){
        for(int countThroughFirstLoop = 1; countThroughFirstLoop=1; countThroughFirstLoop++ )
   }
    System.out.println;
    *//*for(MbtiQuestion mbti: mbtiQ){
        for(String ques: mbti.getQuestion()){

        }
    }*/
/*
    char[] answersFromUsers = new char[mbtiQ.values().length];
    public void setQuestion1(){
        mbtiQ.QUESTION1.valueOf(question);
    }

    public void getQuestion1(){
        return mbtiQ.QUESTION1.valueOf(questi);
    }*/
}
