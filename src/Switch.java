public class Switch {
    public static void main(String[] args){
        char alphabet = 'A';
        switch(alphabet){
            case 'A':
                System.out.println("Printed out an Alphabet A");
                break;
            case 'B':
                System.out.println("Printed out an Alphabet B");
                break;
            case 'C': case 'D':case 'E':
                System.out.println("Printed out either C, D or E");
                break;
            default:
                System.out.println("Printed out not A. B, C");
                break;
        }
        System.out.println(calculate(4, 2, '-'));
        System.out.println(calculate(7, 2, '+'));
        System.out.println(calculate(3, 6, '/'));
    }

    //Curate a method that takes 3 parameters, 2 operands and one operator to carry out simple Maths

    public static int calculate(int firstOperand, int secondOperand, char operator){
        int result = 0;
        if(operator=='+'){
            result = firstOperand + secondOperand;
        }
        else if(operator == '-'){
            if(secondOperand >= firstOperand){
                result = secondOperand - firstOperand;
            }
            else{
                result = firstOperand - secondOperand;
            }
        }
        else if(operator == '/'){
            if(secondOperand>=firstOperand){
                result = secondOperand/firstOperand;
            }
        } else if (operator == '*') {
            result = secondOperand * firstOperand;
        }
        else if(operator == '%'){
            if(secondOperand >= firstOperand){
                result = secondOperand % firstOperand;
            }
            else{
                result = firstOperand % secondOperand;
            }
        }
        return result;
    }
}
