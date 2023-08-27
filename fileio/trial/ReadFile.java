package trial;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.readAccount("\"/home/user/IdeaProjects/javaLingua/fileio/account/Account.java\"");

    }
    public String readAccount(String accFileLocation){
        accFileLocation = "/home/user/IdeaProjects/javaLingua/fileio/account/Account.java";
        String bankFileLocation = "/home/user/IdeaProjects/javaLingua/fileio/account/Bank.java";

        Path accPath = Path.of(accFileLocation);
        Path bankPath = Path.of(bankFileLocation);

        String joinAndConvertToString = null;

        try(BufferedReader reader = Files.newBufferedReader(accPath);){
            Stream<String> accReadContent = reader.lines();
            joinAndConvertToString = accReadContent.collect(Collectors.joining());
            System.out.println(accReadContent);
            System.out.println(joinAndConvertToString);

        }catch(IOException e){
            e.printStackTrace();
        }
        return joinAndConvertToString;
    }

}
