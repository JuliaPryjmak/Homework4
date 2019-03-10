package com.epam.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String newNumber = getBinaryNumber(number);
        System.out.println("Двоичное представление числа: " + newNumber);
    }

    public static String getBinaryNumber (int number){
        String result = "";
        final int CONST = 2;
        while (number > 0) {
            result = ((number % CONST) == 0 ? "0" : "1") + result;
            number = number / CONST;
        }
        return result;
    }
}
