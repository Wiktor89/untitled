package pattern.proxy;

public class MainProxy {
    public static void main(String[] args) {
        IMath math = new MathProxy ();
        System.out.println (math.add (3, 4));
    }
}
