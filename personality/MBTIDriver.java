import java.util.Scanner;

public class MBTIDriver {
    public static void main(String[] args) {
        System.out.println("Enter your name to take the test: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        User user = new User(name);
        user.takeTest();
        System.out.println("PERSONALITY TRAIT SCORE");
        System.out.println(user.getPersonalityTrait());
    }
}