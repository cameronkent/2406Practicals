package com.company;

/**
 * Created by cameronkent on 18/08/2016.
 */
public class Percentages {

    public static void main(String[] args) {

        double numOne = 2.0d;
        double numTwo = 5.0d;

        computePercentage(numOne, numTwo);

        computePercentage(numTwo, numOne);

    }

    public static void computePercentage(double firstNum, double secondNum) {


        double percentage = ( (firstNum / secondNum) * 100);

        System.out.println(firstNum + " is " + percentage + "% of " + secondNum);
    }
}
