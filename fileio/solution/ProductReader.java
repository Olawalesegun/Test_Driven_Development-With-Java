package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductReader {

    public static String readProducts(){
        String location = "/home/user/IdeaProjects/javaLingua/fileio/solution/products.json";
        Path path = Path.of(location);

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            //reading the files content using lines()
            Stream<String> content = reader.lines();
            String fileCollected =  content.collect(Collectors.joining());
            return fileCollected;
            //printing the files content using forEach(...)
            //content.forEach(System.out::println);
            /*reader.readLine()
                    .forEach(System.out::println);
                    )
                   // .collect(Collectors.joining());*/
            // readLines read the first lines in a file, while reader.lines reads all lines
        }catch(IOException exception){
           return "ERROR "+exception.getMessage();
        }
    }

    public static void updateProduct(int productId, String patch) {
        String products = readProducts();
        String[] tokens = products.split("},");
        String tokenToUpdate = "\"id\": "+productId;
        for (int index = 0; index < tokens.length; index++) {
            if(tokens[index].contains(tokenToUpdate)){
                tokens[index] =patch;
            }
        }
        String updatedProductList = String.join("},", tokens);
        /*String updatedProductList = Arrays.stream(tokens)
                .collect(Collectors.joining("},", "","]"));*/
        System.out.println(updatedProductList);
        saveProducts(updatedProductList);
        CharSequence name = new StringBuilder();
        //saveProducts(updatedProductList.trim());
    }

    public static void saveProducts(String products){
        String location = "/home/user/IdeaProjects/javaLingua/fileio/solution/products.json";
        Path path = Path.of(location);

        try(OutputStream outputStream = Files.newOutputStream(path)){
            byte[] content = products.getBytes();
            outputStream.write(content);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            //throw new RuntimeException(e);
        }
    }
}
