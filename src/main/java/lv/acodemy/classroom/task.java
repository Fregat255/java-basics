package lv.acodemy.classroom;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Проверка на положительное число
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Number is positive.");
        }

        // Проверка на четность/нечетность числа
        System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();
        if (number2 % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }

        // Проверка температуры
        System.out.print("Enter the temperature in Celsius: ");
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println("Freezing cold!");
        } else if (temperature >= 0 && temperature <= 15) {
            System.out.println("Chilly weather.");
        } else if (temperature > 15 && temperature <= 25) {
            System.out.println("Comfortable temperature.");
        } else if (temperature > 25) {
            System.out.println("Hot weather!");
        }

        // Проверка на високосный год
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        // Проверка на пустую строку //I am not sure but that
        String str = "";
        if (str.equals("")) {
            System.out.println("String is empty.");
        } else {
            System.out.println("String is not empty.");
        }


        }


    }



