package javaprogrammes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HashSet {

    public static void main(String[] args) {
        Set<Integer> numbers = new java.util.HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println("numbers :" + numbers);

        boolean isRemoved = numbers.remove(10);
        System.out.println("After remove 10 :" + numbers);

        List<Integer> perfectSqures = new ArrayList<>();
        perfectSqures.add(4);
        perfectSqures.add(7);
        perfectSqures.add(8);

        numbers.removeIf(num -> num % 2 == 0);
        System.out.println("After removeIf() => " + numbers);


    }

}
