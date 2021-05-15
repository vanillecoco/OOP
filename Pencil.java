
//inheritance
class Pencil extends Stationery {

    public Pencil(String color, int size, String brand, String name) {
        super.setColor(color);
        super.setSize(size);
        super.setBrand(brand);
        super.setName(name);
    }

    String introduction() {
        return "It is pencil.";
    }

    public void functions() {
        System.out.println("for writing");
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getBrand() + " " + this.getName();
    }

}