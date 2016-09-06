import java.util.Scanner;

/**
 * Created by cameronkent on 31/08/2016.
 */
public class Candle {

    String color;
    Double height;
    Double price;

    public String getColor() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Candle Color:");
        return color = user_input.next();
    }
    public void setColor(String c) {color = c; };

    public Double getHeight() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Candle height in inches:");
        return height = user_input.nextDouble();
    }
    public void setHeight(Double h) {height = h; }

    public Double getPrice(Double h) {
        return price = 2 * h;
    }
}
