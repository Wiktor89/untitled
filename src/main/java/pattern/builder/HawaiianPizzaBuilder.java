package pattern.builder;

public class HawaiianPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildDough() {
        pizza.setDough ("слоенное");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce ("Майонез");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping ("Помидоры колбаса");
    }
}
