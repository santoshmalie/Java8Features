package sm.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one","two","three","four","five");
        List<String> result = new ArrayList<>();
        Consumer<String> c1 = System.out::println;
        //Creating
        Consumer<String> c2 =  s1 -> result.add(s1);
        Consumer<String> c3 =  result::add;
        strings.forEach(c1.andThen(c2)); // Chaining the consumer
    }

}
