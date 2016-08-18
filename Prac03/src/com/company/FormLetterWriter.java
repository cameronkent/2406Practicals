package com.company;

import javax.swing.*;

/**
 * Created by cameronkent on 18/08/2016.
 */
public class FormLetterWriter {

    public static void displaySalutation(String lastName) {

        JOptionPane.showMessageDialog(null, "Dear Mr. or Ms. " + lastName);

    }

    public static void displaySalutation(String firstName, String lastName) {

        JOptionPane.showMessageDialog(null, "Dear " + firstName + " " + lastName + ". \nThank you for your recent order.");
    }

    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog("Enter first name: ");
        String lastName = JOptionPane.showInputDialog("Enter last name: ");

        displaySalutation(lastName);

        displaySalutation(firstName, lastName);
    }

}
