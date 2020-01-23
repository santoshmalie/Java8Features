package sm.java.lambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterNoLambda {
    public static void main(String[] args) {
        FileFilter filterFile = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        };

        File dir = new File("A:/tmp");
        File[] javaFiles = dir.listFiles(filterFile);
    }
}
