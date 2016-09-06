/**
 * Created by cameronkent on 31/08/2016.
 */
public class ScentedCandle extends Candle {

    Double scentPrice;

    @Override
    public Double getPrice(Double h) {
        return scentPrice = (3 * h);
    }
}
