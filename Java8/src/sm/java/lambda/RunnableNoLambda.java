package sm.java.lambda;

import java.io.File;
import java.io.FileFilter;

public class RunnableNoLambda {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i < 10 ; i++) {
                    System.out.println("Hello From Lambda World" + Thread.currentThread().getName());
                }
            }
        };

        Thread  t = new Thread(runnable);
        t.start();
    }
}
