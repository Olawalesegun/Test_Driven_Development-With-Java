package trial;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {

    ReadFile readFile = new ReadFile();
    public void writeFile(){
        String source = readFile.readAccount("/home/user/IdeaProjects/javaLingua/fileio/account/Account.java");
        String destination = "/home/user/IdeaProjects/javaLingua/fileio";
        Path destinationPath = Path.of(destination);
        try {
            Path fileCreatedPath = Files.createTempFile(destinationPath, "FileWritten", ".java");
            BufferedWriter writer = Files.newBufferedWriter(fileCreatedPath);
            writer.write(source);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
