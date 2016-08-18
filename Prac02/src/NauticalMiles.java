

/**
 * Created by cameronkent on 11/08/2016.
 */
public class NauticalMiles {

    public static void main(String[] args) {
        double KMINNM = 1.852;
        double MINNM = 1.150779;

        int NauticalMiles = 37;

        double CalcKM = NauticalMiles / KMINNM;
        double CalcMiles = NauticalMiles / MINNM;

        System.out.println(NauticalMiles + "Nautical Miles is " + CalcKM + "Km and " + CalcMiles + "Miles");

    }
}
