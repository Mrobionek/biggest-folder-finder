import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        String folderPath = "/Users/marinarobionek/Desktop/Обучение";
        File file = new File(folderPath);

        FolderSizeCalculator calculator = new FolderSizeCalculator(file);

        ForkJoinPool pool = new ForkJoinPool();
        long size = pool.invoke(calculator);
        System.out.println(size);
    }
}
