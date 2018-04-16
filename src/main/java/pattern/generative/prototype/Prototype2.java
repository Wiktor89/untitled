package pattern.generative.prototype;

public class Prototype2 implements Prototype {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Prototype2 ();
    }
}
