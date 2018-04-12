package pattern.builder;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public Pizza getPizza() {
        return pizzaBuilder.getPizza ();
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void construcorPizza() {
        pizzaBuilder.createPizza ();
        pizzaBuilder.buildDough ();
        pizzaBuilder.buildSauce ();
        pizzaBuilder.buildTopping ();
    }
}
