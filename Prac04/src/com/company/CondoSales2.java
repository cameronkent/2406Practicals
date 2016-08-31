package com.company;

import javax.swing.*;

/**
 * Created by cameronkent on 25/08/2016.
 */
public class CondoSales2 {


    public static void main(String[] args) {

        int parkPrice = 150000;
        int golfPrice = 170000;
        int lakePrice = 210000;
        int nullPrice = 0;
        int hasGarage = 5000;

        String parkView = "Park View condos are $";
        String golfView = "Golf Course view condos are $";
        String lakeView = "Lake View condos are $";

        int condoNum = Integer.parseInt(JOptionPane.showInputDialog("Choose your condo view: " +
                "\n 1. Park view \n 2. Golf course view \n 3. Lake view \n Enter choice:"));

        int parkingOption = Integer.parseInt(JOptionPane.showInputDialog("Choose a parking option:" +
                "\n 1. Garage \n 2. Parking space \n Enter choice:"));

        if (parkingOption == 1) switch (condoNum) {
            case 1:
                JOptionPane.showMessageDialog(null, parkView + (parkPrice + hasGarage));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, golfView + (golfPrice + hasGarage));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, lakeView + (lakePrice + hasGarage));
                break;
            default:
                JOptionPane.showMessageDialog(null, nullPrice);

        }

        else {
            switch (condoNum) {
                case 1:
                    JOptionPane.showMessageDialog(null, parkView + parkPrice);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, golfView + golfPrice);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, lakeView + lakePrice);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, nullPrice);

            }
        }
    }
}