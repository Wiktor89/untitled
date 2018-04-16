package pattern.generative.builder;

public class MazzeratyBuilderImpl extends CarBuilder {

    @Override
    void brend () {
        car.setBrend ("Mazzeraty");
    }

    @Override
    void power () {
        car.setPower ("1000");
    }
}
