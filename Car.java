import jdk.dynalink.beans.StaticClass;

public class Car {
    private int modelYear;
    private String modelName;
    private String color;
    static int numberOfWheels;
    static int numberOfSeat = 4;

    public Car() {
    }

    public Car(String s1, String color) {
        this.modelName = s1;
        this.color = color;
    }

    public Car(int modelYear, String modelName, String color, int wheel, int seat) {
        this.modelYear = modelYear;
        this.modelName = modelName;
        this.color = color;
        numberOfWheels = wheel;
        numberOfSeat = seat;

    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getNumberOfWheels() {
        return numberOfWheels;
    }

    public static void setNumberOfWheels(int numberOfWheels) {
        Car.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

}