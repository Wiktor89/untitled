package pattern.adapter;

public class Java implements Developer {

    private String name;

    public Java(String name) {
        this.name = name;
    }

    @Override
    public void writeCode() {
        System.out.println ("Java.writeCode");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Java{" +
                "name='" + name + '\'' +
                '}';
    }
}
