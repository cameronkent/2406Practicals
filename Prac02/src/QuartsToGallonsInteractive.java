import javax.swing.*;
import java.util.Scanner;

/**
 * Created by cameronkent on 11/08/2016.
 */
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
//OBJECTIVE OUTPUT = 'A job that needs 18 quarts requires 4 gallons plus 2 quarts.'
        int QUARTS = 4;

        int QuartsNeeded;
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Quarts needed.");
        QuartsNeeded = user_input.nextInt();

        int CalcGallons = QuartsNeeded / QUARTS;
        //System.out.println(CalcGallons);
        int PartGallons = QuartsNeeded % QUARTS;
        //System.out.println(PartGallons);
        System.out.println("A job that needs " + QuartsNeeded + " quarts requires " + CalcGallons + " gallons plus " + PartGallons + " quarts.");
    }
}
