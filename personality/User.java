import java.util.Scanner;

public class User extends MBTI{
    private String name;
    private String personalityTrait;


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalityTrait() {
        personalityTrait =  determinePersonalityTrait();
        return personalityTrait;
    }
    public void takeTest () {
        if (getName() != "") {
            responseCollation();
            System.out.println("HI " + getName() + "YOUR RESPONSES ARE: ");
            for (int count = 0; count < getQuestions().length; count++) {
                System.out.println(getQuestions()[count]);
                System.out.println(getResponses()[count]);
            }

        }
    }

    private void responseCollation() {
        int count = 0;
        while (count < getQuestions().length) {
            System.out.println(getQuestions()[count]);
            Scanner scanner = new Scanner(System.in);
            String resp = scanner.nextLine();
            if (resp == "A" || resp == "B") {
                acceptResponses(resp);
                count++;
            }
            else {
                System.out.println("EXPECTED A OR B");
            }
            System.out.println();
        }
    }
}