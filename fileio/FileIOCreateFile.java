import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIOCreateFile {

    public static void main(String[] args) {
        String location3 = "/home/user/Downloads/Semicolonn/sulti-wallet";
        Path path3 = Path.of(location3);
        try{
            Files.createTempFile(path3, "out", ".txt");
            //Path filePath = Files.createFile(path3);
        }catch(IOException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}
