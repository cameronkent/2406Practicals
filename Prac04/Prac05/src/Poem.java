import java.util.Scanner;

/**
 * Created by cameronkent on 1/09/2016.
 */
public class Poem {

    String poemName;
    int poemLines;

    public Poem () {}

    public Poem (String poemName, int poemLines) {
        this.poemName = poemName;
        this.poemLines = poemLines;
    }

    public String getPoemName() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Poem title: ");
        return user_input.next();
    }

    public int getPoemLines() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Poem lines: ");
        return user_input.nextInt();
    }
}
