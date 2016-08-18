package com.company;

/**
 * Created by cameronkent on 18/08/2016.
 */
public class NumbersDemo {

    public static void main(String[] args) {

        int numOne = 23;
        int numTwo = 86;

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
