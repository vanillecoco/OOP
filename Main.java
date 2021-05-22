public class Main {

    public static void main(String[] args) {
        // Car myCar = new Car(1988, "bmw", "black", 4 , 2);
        Car myCar2 = new Car();

        // System.out.println(myCar2.numberOfSeat);
        System.out.println("my car has " + Car.numberOfSeat + "seats");
        // throgh the Car object myCar2
        System.out.println("my car has " + myCar2.getNumberOfSeat() + "seats");
    }

}
