package practice;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ReturnInput {

    public static void main(String[] args) {
        String location = "/home/Downloads";
        Path pth = Paths.get(location);
        System.out.println(pth.getFileSystem());

    }
}
