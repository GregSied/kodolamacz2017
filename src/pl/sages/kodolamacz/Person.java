package pl.sages.kodolamacz;

import pl.sages.vehicle.Bike;

import java.util.Date;

public class Person {

    private int ageOf;
    private int personAge;
    private Date birthDate = new Date();
    private String country;
    private char letter;
    private double money;
    private byte small;
    private final boolean isMale;
    enum Gender {
        MALE, FEMALE, UNKNOWN;
    }

    private ClientType type = ClientType.VIP;

    enum ClientType{
        VIP, SUPERVIP, BLOCKED, AAA, BBB, CC;
    }

    // teraz nie wiem co oznacza true ?
    private boolean gender;

    public Person(boolean isMale) {
        this.isMale = isMale;
    }

    public Person(boolean isMale, int age, double money) {
        this.isMale = isMale;
        this.age = age;
        this.money = money;
    }

    public boolean isAdult(){
        return age >= 18;
    }

    public void birthday(){
        this.age++;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {

        int age = 30;

        Person person = new Person(true);
        person.age = 21;
        person.age = person.age + 1;
        person.age++;
        System.out.println(person.age >= 18);
        person.letter = 'a';
        person.country = "Polska";
        person.money = 105.20;
        person.money = 10;
        person.small = 10;
        // zmiana typow jest po cichu bo sie miesci
        person.money = person.small;
        // musimy wymusic bo jest zmiana z wiekszego na mniejszy
        person.small = (byte) person.money;

        // nie mozemy zmienic wartosci finalnej
        //person.isMale = true;

        // uwaga na cudzyslow
        //person.letter = "a";
        //person.country = 'a';

        Bike bike = new Bike();
        //bike.gears;

    }
}
