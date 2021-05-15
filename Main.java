public class Main {
    public static void main(String[] args) {
        // Car car1 = new Car("GMC", "TERRAIN", "BLACK", 40, 4, 4, "blutooth",
        // "2021-02-01", 2, false);

        // System.out.println(car1.brand);
        // String car1Brand = car1.brand;
        // car1.ToGetBrand(car1.brand);

        // car1.toGetWarranty(10);

        Stationery stan1 = new Stationery("black", 5, "3M", "tape");
        // encapsulation
        System.out.println(stan1.getBrand());

        // abstraction
        System.out.println(stan1.introduction());
        stan1.functions();

        // ploymorphism
        Stationery stan2 = new Pencil("black", 15, "whiteman", "pencil");
        System.out.println(stan2.getColor());
        System.out.println(stan2.introduction());
        stan2.functions();

        Pencil[] pencils = new Pencil[20];
        for (int i = 0; i < pencils.length; i++) {
            pencils[i] = new Pencil("black", 15, "whiteman", "pencil " + i);
            System.out.println(pencils[i].toString());
        }

    }
}
