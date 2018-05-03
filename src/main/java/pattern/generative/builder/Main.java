package pattern.generative.builder;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<String, CarBuilder> map;

    static {
        map = new HashMap<> ();
        map.put ("Mersedes", new MersedesBuilderImpl ());
        map.put ("Mazzeraty", new MazzeratyBuilderImpl ());
        map.put ("Subaru", new SubaruBuilderImpl ());
    }

    public static void main (String[] args) {
        Waiter waiter = new Waiter ();
        waiter.setCarBuilder (map.get (args.length > 0 ? args[0] : "Mersedes"));
        waiter.constructCar ();
        Car car = waiter.getProductCar ();
        System.out.println (car.toString ());
    }
}
