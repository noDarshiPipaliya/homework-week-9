package javaprogrammes;

import java.util.Scanner;

public class Marksheet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("marksheet");
        System.out.println("name :");
        System.out.println("roll no.  :");

        System.out.println("enter English marks:");
        int English = s.nextInt();
        System.out.println("enter Maths marks:");
        int Maths = s.nextInt();
        System.out.println("enter Sience marks:");
        int Science = s.nextInt();

        int total = 100;
        System.out.println("total marks" + total);
        int obtain;
        obtain = English + Maths + Science;
        System.out.println("obtain marks" + obtain);
        int percentage;
        percentage = (obtain * 100) / 100;

        while (10 < obtain) {

            if (percentage >= 80) {
                System.out.println("Grade A+");
            } else if (percentage >= 60) {
                System.out.println("Grade A");
            } else if (percentage >= 50) {
                System.out.println("Grade B");
            } else if (percentage >= 35) {
                System.out.println("Grade C");
            } else
                System.out.println("fail");

            System.out.println("---------------------------------");
            System.out.println("|         marksheet               |");
            System.out.println("|--------------------------------|");
            System.out.println("name    :                        |");
            System.out.println(" roll no  :                     |");
            System.out.println("|--------------------------------|");
            System.out.println("| subjects      :        marks   |");
            System.out.println("maths " + Maths);
            System.out.println(" science " + Science);
            System.out.println("English" + English);
            System.out.println("|------------------------------|");
            System.out.println("|TOtal " + total);
            System.out.println("|--------------------------------|");
            System.out.println("precentage" + percentage);
            System.out.println("result           :            ");
            System.out.println("grade            :");
            System.out.println("|-------------------------------|");


        }
    }


}





