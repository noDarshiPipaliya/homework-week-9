package javaprogrammes;

import java.util.List;

public class ArrayList<S> {

    public static void main(String[] args) {

        List<String> myList = new java.util.ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");


        for (int i = 0; i < myList.size(); i++) {

            System.out.println(myList.get(i));
        }

    }
}














