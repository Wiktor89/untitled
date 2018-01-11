package pattern.factory_method;

public class ConcreteCreatorA extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA ();

    }
}
