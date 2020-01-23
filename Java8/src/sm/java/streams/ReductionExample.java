package sm.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
//Result should be perform operation of **reduce** operation on identity element and each element of stream
//If there is no element in an list then Identity element will be returned

//1 - reduce method performs addition with IdentityElement as 0
        Integer red = list.stream()
                .reduce(0, (i1,i2) -> i1 + i2);
        System.out.println("1 :  red = " + red);
//2 - reduce method performs addition with IdentityElement as 0 and method reference
        red = list.stream()
                .reduce(0, Integer::sum);
        System.out.println("2 :  red = " + red);

//3 - max operation can't have an identity element, result will be wrong as that element will be evaluated always
        red = list.stream()
                .reduce(0, Integer::max);
        System.out.println("3 :  max = " + red);
//4 - max operation can't have an identity element, so in absent of Identity element, reduce method causes compilation error
 // To avoid this Optional can be used, where output will be optional
         Optional<Integer> result = list.stream()
                .reduce(Integer::max);
        System.out.println("4 :  result = " + result);

    }
}
