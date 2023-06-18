package lv.acodemy.classroom;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for;foreach;do while;while;
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }
        String[] fruits = {"apple", "mango", "banana"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
            if (fruits[i].equals("mango")) {
                System.out.println("I found kiwi");
                break;

            }
        }
        //enhanced for
        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit);
        }
        // Print the numbers from 20 to 40
        for (int i = 20; i <= 40; i++) {
            System.out.println(i);
        }
        // calculate the sum of all even numbers between 1 and 100

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println("Sum of even numbers : " + sum);

        // Print the multiplication table of a given number
        //6;
        int number = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * number + " ");

        }
        // WHILE LOOP

        int i = 10;
        while (i > 0) {
            System.out.println("Hello World!");
            i--;
        }
        int j = 0;
        while (j < 10) {
            System.out.println("Hello World!");
            j++;
        }
        int k = 0;
        do {
            System.out.println("Hello world");
            k++;
        } while (k < 10);

        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(5);
        boolean isGuessed = false;
        while (!isGuessed) {
            System.out.println("please enter number I guessed");
            int inputnumber = myScanner.nextInt();
            if (randomNumber == inputnumber) {
                System.out.println("You guessed the number ");
                isGuessed = true;
            } else {
                System.out.println("Try again");
            }
        }

        // TODO: Add count : Limit guess with 3 times ;

        String name = "Katrine" ;
        String reversed = "" ;
        for (int l = name.length() - 1; l >= 0 ; l--) {
            reversed = reversed + name.charAt(l);



}
    }
}







