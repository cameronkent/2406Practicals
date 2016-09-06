import java.util.Scanner;

/**
 * Created by cameronkent on 1/09/2016.
 */
public class PetSold extends ItemSold {

    boolean vaccinated;
    boolean neutered;
    boolean housebroken;

    public boolean getVaccinated() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Is pet vaccinated? y / n :");
        char result = user_input.next().charAt(0);
        if (result == 'y' || result == 'Y') { return true; }
        else return false;
    }
    public void setVaccinated (boolean v) { vaccinated = v;}

    public boolean getNeutered() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Is pet neutered? y / n :");
        char result = user_input.next().charAt(0);
        if (result == 'y' || result == 'Y') { return true; }
        else return false;
    }
    public void setNeutered (boolean v) { neutered = v;}

    public boolean getHousebroken() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Is pet housebroken? y / n :");
        char result = user_input.next().charAt(0);
        if (result == 'y' || result == 'Y') { return true; }
        else return false;
    }
    public void setHouseBroken (boolean v) { housebroken = v;}
}
