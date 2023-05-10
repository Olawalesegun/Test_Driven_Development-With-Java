public class CommandLineArgument {

    public static void main(String[] args){
        //runs as a command line argument;
        commandLineArgs();
    }
    public static void commandLineArgs(String... number){
        int num1 = Integer.parseInt(number[0]);
        int num2 = Integer.parseInt(number[1]);
        System.out.println(num1);
        System.out.println(num2);

    }
}
