package sm.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinal {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one","two","three","four");
        Predicate<String> p1 =  Predicate.isEqual("two");
        Predicate<String> p2 =  Predicate.isEqual("three");
        List<String> list = new ArrayList<>();
// PEEK is an intermediary operation and it doesn't return anything
// Stream doesn't triggers data processing only with intermediary operations
// So in following code peek won't print anything or won't add anything

//        stream.peek(System.out::println)
//                .filter(p1.or(p2))
//                .peek(list::add);

//        System.out.println("Done with intermediary operations");

//   In following stream operations foreach works as final operation as it doesn't return anything and
//   it will trigger data processing in streams
//        stream has already been operated upon or closed
        stream.peek(System.out::println)
                .filter(p1.or(p2))
                .forEach(list::add);
        System.out.println("Done with final operations");
        System.out.println("List size = " + list.size());

    }

}
