package com.company;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the sequence of numbers, please.");
        String input = scanner.nextLine();
        String[] inputStr = input.split(" ");
        ArrayList<Integer> inputList = new ArrayList<>();
        for ( String num : inputStr) {
            inputList.add(Integer.valueOf(num));
        }
        System.out.println("Input the number for comparison, please.");
        int comp = scanner.nextInt();
        int min = Math.abs(inputList.get(0) - comp);
        for (int i = 0; i < inputList.size(); i++) {
            if (Math.abs(inputList.get(i) - comp) < min) {
                min = Math.abs(inputList.get(i) - comp);
            }
        }
        ArrayList<Integer> result = new ArrayList<>(1);
        for (int i = 0; i < inputList.size(); i++) {
            if (Math.abs(inputList.get(i) - comp) == min) {
                result.add(inputList.get(i));
            }
        }

        int max = 0;
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) > max) {
                result.add(inputList.get(i));
                max = inputList.get(i);
                result.remove(i);
            }
        }
        for ( Integer value : result) {
            System.out.print(value);
        }
    }
}
