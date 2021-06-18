import java.util.Scanner;
import java.util.Scanner.*;

public class Test {

    public static void main(String[] args) {
        // Phone p1 = new Phone("Apple", 10, "gold");
        // System.out.println(p1.getColor());

        // p1.setColor("black");

        // System.out.println("p1's color is " + p1.getColor());

        Phone p2 = new Phone();

        Scanner s = new Scanner(System.in);
        System.out.println("which brand?");
        String brand = s.nextLine();
        p2.setBrand(brand);
        System.out.println("what size?");
        int size = s.nextInt();
        p2.setSize(size);
        System.out.println("how's color?");
        String color = s.nextLine();
        p2.setColor(color);

        System.out.println(p2.getBrand() + p2.getSize() + p2.getColor());

    }

}
