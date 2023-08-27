package classw;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriteJsonFile {

    public static void main(String[] args) {
        String fileLocation = "/home/user/Documents/classwork";
        //Path pth = Paths.get(fileLocation);
//        String jsonContent = ""
        Path pth0 = Path.of(fileLocation);
        try {
            Path filePath = Files.createTempFile(pth0, "JsonFile", ".json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            BufferedWriter jsonWriter = Files.newBufferedWriter(filePath);
            jsonWriter.write(input);
           /* BufferedReader reader = Files.newBufferedReader(pth0);
            BufferedWriter writer = Files.newBufferedWriter(pth0);*/
           /* reader.lines()
                            .forEach(System.out::println);*/
            jsonWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
        /*finally {
            jsonWriter.close();
        }*/

        try {
            File myObj = new File("JsonFile.json");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
