import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Assets> assets = new ArrayList<>();

        Vehicle car = new Vehicle("Gremlin", "2025-10-04", BigDecimal.valueOf(120) ,"Nissan 280zx", 1986, 200_000);

        assets.add(car);

        House house = new House("Studio", "2021-01-01", BigDecimal.valueOf(500_000),"200 Ozone Pk",3, 500, 0 );
        assets.add(house);

        BigDecimal netWorth = BigDecimal.ZERO;
        for(Assets a : assets){
            netWorth = netWorth.add(a.getValue());
        }
    }
}
