package pattern.generative.prototype;

public class Main {

    public static void main(String[] args) {
        Prototype prototype1 = new Prototype1 ();
        System.out.println (prototype1.hashCode ());
        prototype1 = new Prototype1 ();
        System.out.println (prototype1.hashCode ());
    }
}
