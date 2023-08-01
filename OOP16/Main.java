package OOP16;

public class Main {
    public static void main(String[] args) {
        Car Mercedes_SL280_PAGODA = new Car(1971, "Mercedes_SL280_PAGODA", "black");
        Car BMW_M5 = new Car(2006, "BMW_M5", "black");
        Car Mazda_MX5 = new Car("Mazda_MX5", "mica_blue");
        Car MLS_430 = new Car("MLS_430");
        Car Toyota_MR2 = new Car("Toyota_MR2", "super_white");

        System.out.println(Mercedes_SL280_PAGODA + "\n" + BMW_M5 + "\n" + Mazda_MX5 + "\n" + MLS_430 + "\n" + Toyota_MR2);
    }
}
