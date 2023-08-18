import java.nio.file.Path;

public class fileIoNormalizer {

    public static void main(String[] args) {
        String location2 = "/a/b/c/../d/e";
        Path p = Path.of(location2);
        System.out.println(p.normalize());
        /*Path path2 = Paths.get(location2);     THis does the same thing as Path.of
        System.out.println(path2.normalize());*/

    }
}
