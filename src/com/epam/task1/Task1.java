package com.epam.task1;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String newLine = getUniqueSymbols(line);
        System.out.print("Уникальные символы строки: " + newLine);
    }
    public static  String getUniqueSymbols (String line){
        String result = "";
        for (int i = 0; i < line.length(); i++){
            if (!result.contains(String.valueOf(line.charAt(i)))){
                result += String.valueOf(line.charAt(i));
            }
        }
        return result;
    }
}
