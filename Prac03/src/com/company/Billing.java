package com.company;

import javax.swing.*;

/**
 * Created by cameronkent on 18/08/2016.
 */
public class Billing {


    public static double computeBill(double itemPrice) {
        final double TAX = 0.08d;

        //double total = itemPrice * TAX;
        //return total;
        return itemPrice + (itemPrice * TAX);

    }

    public static double computeBill(double itemPrice, int itemQuantity) {
        final double TAX = 0.08d;

        double total = itemPrice * itemQuantity;
        return total + (total * TAX);

    }

    public static double computeBill(double itemPrice, int itemQuantity, int couponValue) {
        final double TAX = 0.08d;

        double total = (itemPrice * itemQuantity) - couponValue;
        return total + (total * TAX);

    }

    public static void main(String[] args) {

        //System.out.println(computeBill(20, 3));

        double itemPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter price of photo book in dollars:"));
        int itemQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity to order:"));
        int couponValue = Integer.parseInt(JOptionPane.showInputDialog("Enter value of discount coupon in dollars:"));

        JOptionPane.showMessageDialog(null, "The single price with tax is $" + computeBill(itemPrice));
        JOptionPane.showMessageDialog(null, "The total with tax is $" + computeBill(itemPrice, itemQuantity));
        JOptionPane.showMessageDialog(null, "The total with tax after discount is $" +computeBill(itemPrice, itemQuantity, couponValue));
    }

}
