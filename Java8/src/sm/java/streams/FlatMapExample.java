package sm.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(2,4,6);
        List<Integer> list3 = Arrays.asList(3,5,7);
        List<List<Integer>> list  = Arrays.asList(list1,list2,list3);
        System.out.println(list);
//        Function<List<?>, Integer> function = l -> l.size();
        Function<List<?>, Integer> function = List::size;

// 1 -  Following code maps the function and prints size
        System.out.println("===============================================================================================");
        list.stream()
                .map(function)
                .forEach(System.out::println);

// 2 -  Following code maps each list into streams and return stream  and **map** method returns Stream object of each stream e.g.java.util.stream.ReferencePipeline$Head@511baa65
        System.out.println("===============================================================================================");
        Function<List<Integer>, Stream<Integer>> flatMapper = List::stream;
        list.stream()
                .map(flatMapper)
                .forEach(System.out::println);
// 3 -  Following code maps each list into streams and return stream  and **flatMap** method returns Stream object of each stream e.g.java.util.stream.ReferencePipeline$Head@511baa65
    System.out.println("===============================================================================================");
        list.stream()
                .flatMap(flatMapper)
                .forEach(System.out::println);
    }
}
