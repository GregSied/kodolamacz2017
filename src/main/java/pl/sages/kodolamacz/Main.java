package pl.sages.kodolamacz;

import pl.sages.vehicle.Bike;
import pl.sages.vehicle.Car;
import static pl.sages.kodolamacz.Employee.MINMUM_WAGE;

public class Main {

    public static void main(String[] args) {
        // bez import statycznego:
        int minmumWage = Employee.MINMUM_WAGE;
        // z importem:
        int minmumWageStatic = MINMUM_WAGE;

        // kolejny komentarz
        System.out.println("Hello World!");
        Car audi = new Car();
        Bike myBike = new Bike();
        audi.model = "Q7";
        System.out.println( audi.model );
        audi.model = "Q5";

        System.out.println("Model tego auta to:");
        System.out.println( audi.model );
        System.out.println("A liczba biegów" + audi.gears);

        Person kobieta = new Person(false, 20, 30);
        kobieta.isAdult();
        kobieta.isAdult();
        System.out.println();
    }
}
