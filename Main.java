public class Main {

    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.setColor("black");

        System.out.println("p1's color is " + p1.getColor());

        // // Car myCar = new Car(1988, "bmw", "black", 4 , 2);
        // Car myCar2 = new Car();

        // // System.out.println(myCar2.numberOfSeat);
        // // access static value directly
        // System.out.println("my car has " + Car.numberOfSeat + "seats");
        // // throgh the Car object myCar2
        // System.out.println("my car has " + myCar2.getNumberOfSeat() + "seats");

        // Car myCar3 = new Car("bmw", "black");
        // System.out.println("My car is" + myCar3.getModelName() + " and color is " +
        // myCar3.getColor());

        // Coffee c1 = new Coffee("latte", 3);
        // System.out.println("I have " + c1.getNumber() + " bottles of " +
        // c1.getType());

    }

}
