import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIoWritingIntoFile {

    public static void main(String[] args) {
        String content = """
            import java.math.BigInteger;
            
            public class NewRecord{
                private BigInteger balance;
                private String name;
                public NewRecord(String name, BigInteger balance){
                    this.name = name;
                    this.balance = balance;
                }
                public void getName(){
                    return name;
                }
                public static void main(String[] args){
                    NewRecord newR = NewRecord("Shigo Tulamania", 40_000);
                    System.out.println("Hello " + getName);
                }
            }
            """;

        String location4 = "/home/user/Downloads/Semicolonn/sulti-wallet";
        Path path5 = Path.of(location4);
        try{
            Path filePath = Files.createTempFile(path5, "NewRecord", ".java");
            BufferedWriter writer = Files.newBufferedWriter(filePath);
            writer.write(content);
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}
