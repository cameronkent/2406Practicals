package com.company;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created by cameronkent on 25/08/2016.
 */
public class AscendingAndDescending {

    public static void main(String[] args) {

        int[] userNumbers = new int[3];

        //get integers from user
        for(int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter integer " + (i + 1) + ":"));
        }

        //sort array
        Arrays.sort(userNumbers);

        JOptionPane.showMessageDialog(null, "Numbers ascending: " + Arrays.toString(userNumbers));


        //JOptionPane.showMessageDialog(null, "Numbers descending: " + Arrays.toString(userNumbers));
    }
}
