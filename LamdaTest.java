import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class LamdaTest {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Guava");
        fruits.add("Lemon");
        fruits.add("Watermelon");
        fruits.add("starfruit");
        fruits.add("fig");

        // a. iterator
        Iterator<String> putting = fruits.iterator();
        while (putting.hasNext()) {
            System.out.print(putting.next() + " ");
        }

        System.out.println();

        // b. Lambda
        Consumer<String> method = (n) -> {
            System.out.print(n + " ");
        };
        fruits.forEach(method);
        System.out.println();

        Map<String, String> countries = new HashMap<>();
        countries.put("Canada", "English");
        countries.put("Korea", "Korean");
        countries.put("Usa", "English");

        // a
        Set<String> keys = countries.keySet();
        // print all the keys
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println();
        // b
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println("Country: " + k + ", Language: " + v);
        }
        System.out.println();

        // c
        countries.forEach((K, V) -> System.out.println(K + ", language : " + V));
    }

}