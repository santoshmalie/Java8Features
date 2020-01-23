package sm.java.streams;

import sm.java.streams.model.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorExample {
    public static void main(String[] args) {
        List<Person> persons =  new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        CollectorExample.class.getResourceAsStream("people.txt")));
            Stream<String> stream = reader.lines();
        ){
            stream.map(line -> {
                String[] s = line.split(" ");
                Person p = new Person(s[0].trim(),Integer.parseInt(s[1]));
                persons.add(p);
                return p;
            }).forEach(System.out::println);
        }catch (IOException ioe) {
            System.out.println(ioe);
        }

        Stream<Person> stream = persons.stream();
        Optional<Person> opt = stream.filter(p -> p.getAge() >= 20)
                .min(Comparator.comparing(Person::getAge));
        System.out.println("Min with Filter   :" + opt);
        System.out.println("------------------------------------");
        Optional<Person> opt2  = persons.stream().max(Comparator.comparing(Person::getAge));
        System.out.println("Max No Filter  :" + opt2);

//        Collector Example: Person Grouped by Age
        Map<Integer,List<Person>> map =
                persons.stream().collect(
                        Collectors.groupingBy(
                                Person::getAge
                        )
                );
        System.out.println("------------------------------------");
        System.out.println("Group persons by age : "+  map);

//        Collector Example: Age and count
        Map<Integer,Long> map1 =
                persons.stream().collect(
                        Collectors.groupingBy(
                                Person::getAge,
                                Collectors.counting()
                        )
                );
        System.out.println("------------------------------------");
        System.out.println("Count by age : "+  map1);
// Collector Example: group by age but return the name
        Map<Integer, List<String>> map2 =
                persons.stream().collect(
                        Collectors.groupingBy(
                                Person::getAge,
                                Collectors.mapping(
                                        Person::getName,
                                        Collectors.toList()
                                )
                        )
                );
        System.out.println("Person name group by Age " + map2);
        // Collector Example: group by age but return the name
        Map<Integer, Set<String>> map3 =
                persons.stream().collect(
                        Collectors.groupingBy(
                                Person::getAge,
                                Collectors.mapping(
                                        Person::getName,
                                        Collectors.toCollection(TreeSet::new)
                                )
                        )
                );
        System.out.println("Person name group by Age  and collected in set :" + map3);

    }
}
