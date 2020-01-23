package sm.java.lambda;

import java.sql.Struct;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorNoLambda {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        };
        List<String> strList = Arrays.asList("**","***","****","*");
        Collections.sort(strList,stringComparator);
        for (String s: strList) {
            System.out.println(s);
        }

    }
}
