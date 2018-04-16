package pattern.generative.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance ();
        System.out.println (singleton.hashCode ());
        singleton = Singleton.getInstance ();
        System.out.println (singleton.hashCode ());
    }
}
