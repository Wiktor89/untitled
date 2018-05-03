package pattern.generative.factory_method;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod () {
        return new ConcreteProductB ();
    }
}
