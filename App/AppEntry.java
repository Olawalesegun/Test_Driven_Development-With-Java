import java.util.Scanner;
public class AppEntry {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, Either 1, 2, 3, 4");
        boolean hasNext = input.hasNextInt();
        int userEntry;
        while(hasNext){
            userEntry = input.nextInt();
            switch(userEntry) {
                case 1 -> System.out.println("For English");
                case 2 -> System.out.println("For Yoruba");
                case 3 -> System.out.println("For Igbo");
                case 4 -> System.out.println("For Hausa");
            }
            System.out.println("To quit this enter exit");
            hasNext = input.hasNextBoolean();
        }
    }
}
