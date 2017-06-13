package pl.sages.vehicle;

import pl.sages.kodolamacz.Person;

import java.util.Date;

public class Car {

    /**
     * liczba biegów
     * @author Bartek
     */
    public int gears = 4; // komentarz na koncu linii
    // int gear - ten kod nie dziala
    // marka i model auta
    public String model;
    private int seat;

    public static void main(String[] args) {
        Bike bike = new Bike();
        //bike.gears;
        Person person = new Person(false);
        person.setPersonAgeOf(12);
        if(person.isAdult()){
            System.out.println("Pełnoletni");
        }
        person.setPersonAgeOf(55);
        person.birthday();
    }

}
