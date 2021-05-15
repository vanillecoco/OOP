class Stationery extends DeskItems {
    private String color;
    private int size;
    private String brand;
    private String name;

    public Stationery() {
    };

    public Stationery(String color, int size, String brand, String name) {
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.name = name;
    }

    String introduction() {
        return "This is one of my stationery";
    }

    public void functions() {
        System.out.println("for study");
    }

    // encapsulation
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

}
