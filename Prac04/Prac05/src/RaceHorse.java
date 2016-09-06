import java.util.Scanner;

/**
 * Created by cameronkent on 31/08/2016.
 */
public class RaceHorse extends Horse {

    int races;

    public void setRaces (int r) { races = r; }

    public int getRaces() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter races completed: ");
        int races = userInput.nextInt();
        return races;
    }

}
