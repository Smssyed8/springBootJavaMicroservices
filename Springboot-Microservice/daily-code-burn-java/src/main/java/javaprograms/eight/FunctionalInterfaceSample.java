package javaprograms.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface FunctionalInterfaceSample {
    void add(int x);
    default void printNum(int x){
        System.out.println("value = " +x);
    }
}


class Test {
    public static void main(String args[]){
        FunctionalInterfaceSample fun = (int x) -> System.out.println(2 * x);
        fun.add(5);

        List<Integer> strList = new ArrayList<Integer>();
        strList.add(2);
        strList.add(1);

        strList.forEach(
                n -> {
                    //System.out.println("value of arraylist = " +n);
                    if(n % 2 == 0) System.out.print("value of %" +n);
                }

        );

        List<Integer> filtered = strList.stream()
                .filter(e -> e == e % 2)
                .collect(Collectors.toList());
        filtered.forEach(n -> System.out.print("value of filtered" +n));
    }
}
