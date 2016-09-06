/**
 * Created by cameronkent on 31/08/2016.
 */
public class DemoCandles {

    public static void main(String[] args) {

//        Candle one = new Candle();
//        one.setColor(one.getColor());
//        one.setHeight(one.getHeight());
//        one.getPrice(one.height);
//
//        System.out.println("Candle One:\n" + one.color + "\n" + one.height + "inches \n $" + one.price);

        ScentedCandle two = new ScentedCandle();
        two.setColor(two.getColor());
        two.setHeight(two.getHeight());
        two.price = two.getPrice(two.height);

        System.out.println("Candle Two:\n" + two.color + "\n" + two.height + " inches \n $" + two.price);
    }
}
