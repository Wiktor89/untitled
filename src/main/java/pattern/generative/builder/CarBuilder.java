package pattern.generative.builder;

public abstract class CarBuilder {

    protected Car car;

    public Car getCar () {
        return car;
    }

    public void createCra () {
        car = new Car ();
    }

    abstract void brend ();

    abstract void power ();
}
