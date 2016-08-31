package com.company;

import javax.swing.*;

/**
 * Created by cameronkent on 25/08/2016.
 */
public class CondoSales {


    public static void main(String[] args) {

        int parkPrice = 150000;
        int golfPrice = 170000;
        int lakePrice = 210000;
        int nullPrice = 0;

        String parkView = "Park View condos are $";
        String golfView = "Golf Course view condos are $";
        String lakeView = "Lake View condos are $";

        int condoNum = Integer.parseInt(JOptionPane.showInputDialog("Choose your condo view: " +
                "\n 1. Park view \n 2. Golf course view \n 3. Lake view \n Enter number:"));

        switch (condoNum) {
            case 1: JOptionPane.showMessageDialog(null, parkView + parkPrice);
                break;
            case 2: JOptionPane.showMessageDialog(null, golfView + golfPrice);
                break;
            case 3: JOptionPane.showMessageDialog(null, lakeView + lakePrice);
                break;
            default: JOptionPane.showMessageDialog(null, nullPrice);
        }
    }
}
