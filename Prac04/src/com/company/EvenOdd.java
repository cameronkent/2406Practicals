package com.company;

import javax.swing.*;

/**
 * Created by cameronkent on 25/08/2016.
 */
public class EvenOdd {
    public static void main(String[] args) {

        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));

        if (userNumber % 2 == 0) {
            JOptionPane.showMessageDialog(null, userNumber + " is an even number.");
        }
        else {
            JOptionPane.showMessageDialog(null, userNumber + " is an odd number.");
        }
    }

}
