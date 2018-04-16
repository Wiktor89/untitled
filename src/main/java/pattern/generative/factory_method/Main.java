package pattern.generative.factory_method;

public class Main {

    public static void main(String[] args) {
        Creator[] creators = {new ConcreteCreatorA (), new ConcreteCreatorB ()};
        for (Creator creator : creators) {
            System.out.println (creator.factoryMethod ().getClass ());
        }
    }
}
