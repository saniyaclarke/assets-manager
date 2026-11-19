import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        Vehicle car1 = new Vehicle("Gremlin", "2025-10-04", BigDecimal.valueOf(120_000) ,"Nissan 280zx", 1986, 200_000);
        Vehicle car2 = new Vehicle("Coupe", "2023-08-06", BigDecimal.valueOf(50_000), "Honda Civic", 2016, 2500 );

        House house1 = new House("Studio", "2021-01-01", BigDecimal.valueOf(500_000),"200 Ozone Pk",3, 500, 0 );
        House house2 = new House("2FL", "2023-02-06", BigDecimal.valueOf(300_000),"200 Wonderland Rd",2, 1000, 1 );

        assets.add(car1);
        assets.add(car2);

        assets.add(house1);
        assets.add(house2);

        for(Asset a : assets){
            System.out.println(a.getDescription());
            System.out.println(a.getDateAcquired());
            System.out.println(a.getOriginalCost());
            System.out.println(a.getValue());

            if(a instanceof Vehicle){
                Vehicle vehicle = (Vehicle) a;
                System.out.println(vehicle.getYear() + " " + vehicle.getMakeModel());

            }
            else if(a instanceof House){
                House house = (House) a;
                System.out.println(house.getAddress());

            }
        }
    }
}
