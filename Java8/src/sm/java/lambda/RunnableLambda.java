package sm.java.lambda;

public class RunnableLambda {
    public static void main(String[] args) {
       Runnable runnableLambda =  () -> {
           for (int i = 0 ; i < 10 ; i++) {
               System.out.println("Hello From Lambda World" + Thread.currentThread().getName());
           }
       } ;
        Thread  t = new Thread(runnableLambda);
        t.start();
    }
}
