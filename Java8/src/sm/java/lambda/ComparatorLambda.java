package sm.java.lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {
//        Comparator<String> stringComparator = (String o1, String o2) -> Integer.compare(o1.length(),o2.length());
        Comparator<String> stringComparator = (o1, o2) -> Integer.compare(o1.length(),o2.length());
        List<String> strList = Arrays.asList("**","***","****","*");
        Collections.sort(strList,stringComparator);
        strList.forEach(System.out::println);
    }
}
