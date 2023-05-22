public enum MbtiQuestion {

    QUESTION1('A', """
            1. How would you rate your personality?
            a. Introverted
            b. Extroverted
            """),
    QUESTION2('B', """
            2. Which of this best describes you?
            a. Makes list of things you need  before hand
            b. Rely on memory
            """),
    QUESTION3('B', """
            3. When things aren't in the manners they should, would you rather:
            a. Accept things the way they are!
            b. Unsatisfied about how things are!
            """),
    QUESTION4('A', """
            4. Would you rather say, you are the type, that:
            a.  is skeptical
            b.  accept things the way they are
            """),
    QUESTION5('A', """
            5. Would you rather base:
            a. Morality on justice
            b. Morality on compassion.
            """),
    QUESTION6('B', """
            6. Would you say:
            a. You are bored by time alone
            b. Needs time alone
            """),
    QUESTION7('A', """
            7. Would you say you are the type that:
            a. Keeps a clean room
            b. Just put stuffs everywhere
            """),
    QUESTION8('A', """
            8. Would you call yourself
            a. Optimistic
            b. Like to give up upon facing challenge
            """),
    QUESTION9('A', """
            9. Would you say:
            a. Robotics is an insult
            b. You strive to hav ea mechanical mind.
            """),
    QUESTION10('B', """
            10. Would you rather:
            a. work in group
            b. work alone.
            """),
    QUESTION11('B', """
            11. Would you rather say, you are focused:
            a. focused  on  the future.
            b. focused on the present.
            """),
    QUESTION12('A', """
            12. Do you think you:
            a. stand out
            b. fits in
            """),
    QUESTION13('B', """
            13. Do you:
            a. want the big picture
            b. wants the details 
            """),
    QUESTION14('B', """
            14. Would you rather:
            a. improvise
            b. prepare
            """),
    QUESTION15('A', """
            15. What best describes you?
            a. Theoretical
            b. Empirical
            """),
    QUESTION16('B', """
            16. what best describes you?
            a. Play Hard
            b. Works hard
            """),
    QUESTION17('B', """
            17. What would best describe you as regards emotions?
            a. Uncomfortable with emotions?
            b. Values emotions
            """),
    QUESTION18('A', """
            18. What would you say you are rather more concerned about?
            a. likes to know why?
            b. Likes to know who, what, when!
            """),
    QUESTION19('A', """
            19. Which of this describes you?
            a. Likes to perform in front of other people
            b. Avoids public speaking.
            """),
    QUESTION20('B', """
            20. Would you rather want
            a. People's love
            b. People's respect.
            """);

    private final String question;
    private final char answer;

    MbtiQuestion(char answer, String question){
        this.answer = answer;
        this.question = question;
    }

    public char getAnswer(){
        return answer;
    }
    public String getQuestion(){
        return question;
    }

  }
