package pattern.generative.builder;

public class MersedesBuilderImpl extends CarBuilder {


    @Override
    void brend () {
        car.setBrend ("Mersedes");
    }

    @Override
    void power () {
        car.setPower ("500");
    }
}
