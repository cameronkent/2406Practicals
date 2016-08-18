package com.company;

import javax.swing.*;

/**
 * Created by cameronkent on 18/08/2016.
 */
public class Percentages2 {

    public static void main(String[] args) {

        double numOne = Double.parseDouble(JOptionPane.showInputDialog("Enter first double:"));
        double numTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter second double:"));

        computePercentage(numOne, numTwo);

        computePercentage(numTwo, numOne);

    }

    public static void computePercentage(double firstNum, double secondNum) {


        double percentage = ( (firstNum / secondNum) * 100);

        JOptionPane.showMessageDialog(null, firstNum + " is " + percentage + "% of " + secondNum);
    }
}
