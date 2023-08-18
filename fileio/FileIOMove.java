import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileIOMove {

    public static void main(String[] args) {

        String origin = "/home/user/Downloads/Semicolonn/sulti-wallet/NewRecord.java";
        String destination = "/home/user/Documents";
        Path source = Path.of(origin);
        Path dest = Paths.get(destination);
        try {
            Files.move(source, dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}
