import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fileio1 {

    public static void main(String[] args) {
        // path => a/b/c
        String location = "~/user/home/Downloads";
        Path path = Paths.get(location);
        System.out.println(path.getFileSystem());
        System.out.println(path.getRoot());
        System.out.println("filename: "+path.getFileName());
        System.out.println("count "+path.getNameCount());
        System.out.println();

    }
}
