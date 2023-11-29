import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String folderPath = "/Users/marinarobionek/Desktop/Обучение";
        File file = new File(folderPath);
        System.out.println(getFolderSize(file));
    }

    public static long getFolderSize(File folder) {
        if(folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        return sum = Arrays.stream(files)
                .mapToLong(f -> getFolderSize(f))
                .sum();
    }
}
