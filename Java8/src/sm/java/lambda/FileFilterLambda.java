package sm.java.lambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {
    public static void main(String[] args) {
        FileFilter filterFile = (File file) -> file.getName().endsWith(".java");
        File dir = new File("A:/tmp");
        File[] javaFiles = dir.listFiles(filterFile);
        for (File f : javaFiles) {
            System.out.println(f);
        }
    }
}
