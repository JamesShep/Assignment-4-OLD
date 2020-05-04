package com.coderscampus.assignment4;

import java.util.Scanner;

public class CustomListApplication {

    public static void main(String[] args) {

        CustomList<Integer> numberArray = new CustomArrayList<>();

        int inputNumber;
        int i;

        System.out.println("Enter a number to populate a list: ");
        // I know it's not much, but this was actually the first time I fully
        // remembered how to implement a Scanner object. Normally I trip somewhere, idk why
        Scanner input = new Scanner(System.in);
        inputNumber = input.nextInt();

        for (i = 0; i <= inputNumber; i++) {
            numberArray.add(i);
        }

        for (i = 0; i < numberArray.getSize(); i++) {
            System.out.println(numberArray.get(i));
        }
    }
}
