package pattern.generative.builder;

/**
 * Created by Wiktor on 03.05.2018.
 */
public class SubaruBuilderImpl extends CarBuilder {

    @Override
    void brend () {
        car.setBrend ("Impreza");
    }

    @Override
    void power () {
        car.setPower ("500");
    }
}
