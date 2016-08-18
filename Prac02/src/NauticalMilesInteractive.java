import java.util.Scanner;

/**
 * Created by cameronkent on 11/08/2016.
 */
public class NauticalMilesInteractive {
    public static void main(String[] args) {
        double KMINNM = 1.852;
        double MINNM = 1.150779;

        int NauticalMiles;
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Nautical Miles.");
        NauticalMiles = user_input.nextInt();

        double CalcKM = NauticalMiles / KMINNM;
        double CalcMiles = NauticalMiles / MINNM;

        System.out.println(NauticalMiles + "Nautical Miles is " + CalcKM + " Km and " + CalcMiles + " Miles");
    }
}
