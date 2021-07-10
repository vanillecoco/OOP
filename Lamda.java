import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Lamda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(53);
        numbers.add(9);
        numbers.add(83);
        numbers.add(13);

        // iterator
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            Integer i = it.next();
            System.out.print(i + " ");
        }

        System.out.println();

        // consumer with Lambda expression
        Consumer<Integer> method = (n) -> {
            System.out.print(n + " ");
        };
        numbers.forEach(method);

        System.out.println();

        // Lambda
        numbers.forEach((n) -> {
            System.out.print(n + " ");
        });

        System.out.println();

        // printing list as a whole
        System.out.println(numbers);

    }
}