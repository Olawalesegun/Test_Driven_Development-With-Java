import java.util.Scanner;
public class ChristmasSong{
    public static void main(String[] args){
        playChristmasSong();
    }
    public static void playChristmasSong(){
        Scanner userInput = new Scanner(System.in);
        int iteratingValue;
        System.out.println("Enter a number to print the Christmas Song");
        iteratingValue = userInput.nextInt();
        switch(iteratingValue){
            case 1 -> System.out.println("On the first day of Christmas my true love sent to me");
            case 2 -> System.out.println("On the second day of Christmas my true love sent to me");
            case 3 -> System.out.println("On the third day of Christmas my true love sent to me");
            case 4 -> System.out.println("On the fourth day of Christmas my true love sent to me");
            case 5 -> System.out.println("On the fifth day of Christmas my true love sent to me");
            case 6 -> System.out.println("On the sixth day of Christmas my true love sent to me");
            case 7 -> System.out.println("On the seventh day of Christmas my true love sent to me");
            case 8 -> System.out.println("On the eighth day of Christmas my true love sent to me");
            case 9 -> System.out.println("On the ninth day of Christmas my true love sent to me");
            case 10 -> System.out.println("On the tenth day of Christmas my true love sent to me");
            case 11 -> System.out.println("On the eleventh day of Christmas my true love sent to me");
            case 12 -> System.out.println("On the twelfth day of Christmas my true love sent to me");
        }
        while(iteratingValue>=1){
            switch(iteratingValue){
                case 12 -> System.out.println("12 Drummers Drumming");
                case 11 -> System.out.println("11 Pipers Piping");
                case 10 -> System.out.println("10 Lords a Leaping");
                case 9 -> System.out.println("9 Ladies Dancing");
                case 8 -> System.out.println("8 Maids a Milking");
                case 7 -> System.out.println("7 Swans a Swimming");
                case 6 -> System.out.println("6 Geese a Laying");
                case 5 -> System.out.println("5 Golden Rings");
                case 4 -> System.out.println("4 Calling Birds");
                case 3 -> System.out.println("3 French Hens");
                case 2 -> System.out.println("2 Turtle Doves");
                case 1 -> System.out.println("and a Partridge in a Pear Tree");
            }
            iteratingValue--;
        }
//        System.out.println("""
//                    To stop this loop enter any character other than an int datatype " +
//                    TO CONTINUE, ENTER An int
//                    """);
//        iteratingValue = userInput.nextInt();
    }
}

