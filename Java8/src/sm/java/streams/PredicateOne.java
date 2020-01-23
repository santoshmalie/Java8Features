package sm.java.streams;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateOne {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one","two","three","four");
        Consumer<String> c1 = System.out::println;
        Predicate<String> p1 = s1 -> s1.length() > 3;
        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");
        System.out.println("Simple predicate");
        stream.filter(p1).forEach(c1);
        System.out.println("Chained predicate");
        stream.filter(p2.or(p3)).forEach(c1);
    }
}
