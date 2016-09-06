import java.util.Scanner;

/**
 * Created by cameronkent on 31/08/2016.
 */

public class Horse {

    String name = "";
    String color = "";
    int birthYear;

    public void setName (String n) { name = n; }

    public String getName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Horse name: ");
        String name = userInput.next();
        return name;
    }

    public void setColor (String c) { color = c; }

    public String getColor() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Horse color: ");
        String color = userInput.next();
        return color;
    }

    public void setBirthYear (int y) { birthYear = y; }

    public int getBirthYear() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Year of birth: ");
        int birthYear = userInput.nextInt();
        return birthYear;
        }

}
