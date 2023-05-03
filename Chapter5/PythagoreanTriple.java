import java.util.Scanner;

public class PythagoreanTriple {
   /* (Pythagorean Triples) A right triangle can have sides whose lengths are all integers. The set
    of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple.
    The lengths of the three sides must satisfy the relationship that the sum of the squares of two of the
    sides is equal to the square of the hypotenuse. Write an application that displays a table of the
    Pythagorean triples for side1, side2 and the hypotenuse, all no larger than 500. Use a triple-nested
    for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll
    learn in more advanced computer-science courses that for many interesting problems there’s no
    known algorithmic approach other than using sheer brute force.*/

    public static void main(String[] args) {
        PythagoreanTriple pyth = new PythagoreanTriple();
        pyth.calcHypothenus();
    }
    public void calcHypothenus(){
        double oneSide = Math.pow(7, 2);
        double secondSide = Math.pow(9, 2);
        double hypothenus = oneSide + secondSide;
       /* double result = Math.ceil(Math.sqrt(hypothenus));
        double result = Math.sqrt(hypothenus);*/
       // System.out.println(result);
        int cantBeLargerThan = 500;
        Scanner userinput = new Scanner(System.in);
        int side1;
        int side2;
        int hypothenuss = 0;
        for(int count = 1; count<=cantBeLargerThan; count++){
            System.out.println("Enter a value for the length of the first side of the Right Triangle");
            side1 = userinput.nextInt();
            for(int count2 = 1; count2<cantBeLargerThan; count2++){
                System.out.println("Enter a number for the length of the second side of the left Triangle");
                side2 = userinput.nextInt();
                for(int count3 = 1; count3<cantBeLargerThan; count3++){
                    if((side1 <= cantBeLargerThan) && (side2 <= 500)){
                        hypothenuss = (int) ((int) Math.pow(side1, 2) + Math.pow(side2, 2));
                        hypothenuss = (int)Math.sqrt(hypothenuss);
                        System.out.println("The result for the hypothenuss is: " + hypothenuss);
                        side2 = (int) ((int)Math.pow(hypothenuss, 2) - Math.pow(side1, 2));
                        side2 = (int) Math.sqrt(side2);
                        System.out.println("The reversed result for side2 is " + side2);
                        side1 = (int) ((int) Math.pow(hypothenuss, 2) - Math.pow(side2, 2));
                        side1 = (int) Math.sqrt(side1);
                        System.out.println("The revered value for side1 is: "+ side1);
                    }
                    else{
                        System.out.println("You have entered a value greater than the required amount");
                    }
                }
            }
        }
    }
}
