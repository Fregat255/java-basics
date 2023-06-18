package lv.acodemy.classroom;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;

public class Arrayslfs {
    private static Random scanner;

    public static void main(String[] args) {
        //Array
        int[] numbers = {1, 5, 9, 10, 20, 30, 50};
        System.out.println(numbers[3]);

        int[] ages = new int[10];
        ages[0] = 18;
        ages[3] = 24;
        System.out.println(Arrays.toString(ages));

        //String array
        String[] names = {"John", "Andrew", "Mary", "Angelica"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]); // print Angelica

        //Logical Statements
        if (5 < 10)
            System.out.println("Yes,this is correct!");
        boolean isSummer = true;
        if (isSummer)
            System.out.println("Yes,this is summer and its quite hot in here");

        int x = 10;
        if (x > 0)
            System.out.println("Number is positive" + x);
        if (x < 0)
            System.out.println("Number is negative:" + x);

        if (x % 2 == 0)
            System.out.println("This number can be divided:" + x);

        if (x > 8)
            System.out.println("The number is positive.");
        else if (x < 8)
            System.out.println("The number is negative.");
        else
            System.out.println("The number is zero.");

        boolean isWinter = false;
        boolean isAutumn = false;

        if (isSummer)
            System.out.println("Right, this is summer!");
        else if (isWinter)
            System.out.println("Right, this is winter!");
        else if (isAutumn)
            System.out.println("Right, this is autumn!");
        else
            System.out.println("Not sure, but it can be spring !");

        int grade = 5;
        if (grade == 1) {
            System.out.println("Unsatisfactory");
        } else if (grade == 4) {
            System.out.println("Almost satisfactory");
        } else if (grade == 5) {
            System.out.println("Satisfactory");
        } else if (grade == 6) {
            System.out.println("Almost good ");
        } else if (grade == 7) {
            System.out.println("Good ");
        } else if (grade == 8) {
            System.out.println("Very Good ");
        } else if (grade == 9) {
            System.out.println("Excellent ");
        } else if (grade == 10) {
            System.out.println("With distinction ");
        } else {
            System.out.println("Incorrected grade");
        }


        int angle = 200;
        if (angle > 0 && angle < 90) {
            System.out.println("Acute angle");
        } else if (angle == 90) {
            System.out.println("Right angle");
        } else if (angle > 90 && angle < 100) {
            System.out.println("obtuse ang");
        } else if (angle == 180) {
            System.out.println("Straight");
        } else {
            System.out.println("Not exist ");


            int[] numberArray = {5,7,10};
            numbers[0] = 5 ;
            numbers[1] = 7;
            numbers[2] = 10;
            System.out.println(Arrays.toString(numbers));


        }

    }
}








