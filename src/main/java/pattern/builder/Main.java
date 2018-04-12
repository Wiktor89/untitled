package pattern.builder;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter ();
        PizzaBuilder pizzaBuilder = new HawaiianPizzaBuilder ();
        waiter.setPizzaBuilder (pizzaBuilder);
        waiter.construcorPizza ();
        System.out.println (waiter.getPizza ().toString ());

    }
}
