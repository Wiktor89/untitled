package pattern.adapter;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class JavaMain {
    public static void main(String[] args) {
        List<Integer> count = new ArrayList<> ();
        for (int i = 0; i < 10_000_000; i++) {
            count.add (i);
        }
        long start = System.currentTimeMillis ();
        count.stream ().filter (integer -> integer == 9999999).collect (toCollection(ArrayList::new))
                .forEach (System.out:: println);
        long result = System.currentTimeMillis () - start;
        System.out.println (result);
    }
}
