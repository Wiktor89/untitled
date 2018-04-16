package pattern.generative.builder;

public class Waiter {

    private CarBuilder carBuilder;

    public void setCarBuilder (CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getProductCar () {
        return carBuilder.getCar ();
    }

    public void constructCar () {
        carBuilder.createCra ();
        carBuilder.brend ();
        carBuilder.power ();
    }
}
