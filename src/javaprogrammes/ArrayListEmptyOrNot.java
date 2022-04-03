package javaprogrammes;

import java.util.ArrayList;

public class ArrayListEmptyOrNot {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("Queens park");
        name.add("Green park");
        name.add("Baker street");
        name.add("Angel");

        System.out.println(name.isEmpty());


    }

}
