package com.company;

import java.util.Scanner;

/**
 * Created by cameronkent on 18/08/2016.
 */
public class NumbersDemo2 {

    public static void main(String[] args) {

        Scanner  one = new Scanner(System.in);
        System.out.println("Enter first number:");
        int numOne = one.nextInt();

        Scanner  two = new Scanner(System.in);
        System.out.println("Enter second number:");
        int numTwo = two.nextInt();


        displayTwiceTheNumber(numOne);
        displayNumberPlusFive(numOne);
        displayNumberSquared(numOne);

        displayTwiceTheNumber(numTwo);
        displayNumberPlusFive(numTwo);
        displayNumberSquared(numTwo);


    }

    public static void displayTwiceTheNumber(int num) {

        int total = num * 2;
        System.out.println("Twice " + num + " = " + total);

    }

    public static void displayNumberPlusFive(int num) {

        int total = num + 5;
        System.out.println(num + " + five = " + total);

    }

    public static void displayNumberSquared(int num) {

        double total = Math.pow(num, num);
        System.out.println("The square of " + num + " = " + total);

    }
}
