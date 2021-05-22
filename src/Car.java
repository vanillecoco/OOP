package src;

public class Car {
    String brand;
    String name;
    String color;
    int size;
    int capacity;
    int numberOfDoors;
    String option;
    String release_date;
    int warranty;
    boolean promo;

    public Car(String brand, String name, String color, int size, int capacity, int numberOfDoors, String option,
            String release_date, int warranty, boolean promo) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.size = size;
        this.capacity = capacity;
        this.numberOfDoors = numberOfDoors;
        this.option = option;
        this.release_date = release_date;
        this.warranty = warranty;
        this.promo = promo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public boolean isPromo() {
        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    public void toGetWarranty(int warranty) {
        System.out.println("warranty is" + warranty);
    }

    public void ToGetBrand(String brand) {
        System.out.println("brand is" + brand);
    }

    public void ToGetPromo(boolean promo) {
        if (promo == true) {
            System.out.println("It is promo item");
        } else {
            System.out.println("It is not promo item");
        }

    }

}
