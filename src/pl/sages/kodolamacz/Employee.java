package pl.sages.kodolamacz;

import java.util.Date;

public class Employee {

    static final int MINMUM_WAGE = 2000;

    static int count = 0;
    // pracownik ma imie i juz go nie moze zmienić
    final MojString name;
    final String position;
    EmployeeType employeeType;
    int age;
    double salary;
    Double salaryBox;
    // nazwy zmiennych powinny pasowac do konwencji camelCase
    // początek z małej, a każde kolejne słowo z Wielkiej litery
    Date dateOfBirth;

    public Employee(String name) {
        this(name, "HR", 18, EmployeeType.HR);
    }

    public Employee(String name, String position, int age, EmployeeType employeeType) {
        this.name = new MojString(name);
        this.position = position;
        this.age = age;
        this.employeeType = employeeType;
    }

    void printEmployeeType(){
        if(employeeType == EmployeeType.DEV){
            System.out.println("programista");
        }else if(employeeType == EmployeeType.HR){
            System.out.println("Zasoby ludzkie");
        }else{
            System.out.println("Zwykły pracownik");
        }
    }

    void printEmployeeTypeSwitch(){
        switch (employeeType){
            case DEV:
                System.out.println("programista");
                break;
            case HR:
                System.out.println("Zasoby ludzkie");
                break;
            default:
                System.out.println("Zwykły pracownik");
                break;
        }
    }

//    void chooseRole(){
//        switch (type){
//            case ADMIN:
//                admineRole();
//            case MODEARTOR:
//                modRole();
//            case USER:
//
//        }
//    }

    // ta metoda zwraca liczbę rzeczywistą
    void printSalary(){
        System.out.println(getSalary());
    }

    double getSalary(){
        return calculateSalaryWithBonus(employeeType.bonus);
    }

    double calculateSalaryWithBonus(int bonus){
        return salary * (100 + bonus)/100;
    }
    // a ta nie zwraca nic

    public static void main(String[] args) {
        System.out.println();
        int iluPracownikow = 0;
        String zmienna = "lokalna";
        String name = "Bartek";
        // pusty, nieistniejacy obiekt
        // wywolanie name na nim da błąd
        // nie został tutaj stworzony żaden pracownik
        Employee pusty = null;
        Employee mietek = new Employee("Mieczysław", "HR", 18, EmployeeType.HR);
        System.out.println(mietek);
        Employee ania = new Employee("Ania");

        int count = Employee.count;

        Employee bartek = new Employee(name, "DEV", 25, EmployeeType.DEV);
        Employee bartek2 = new Employee("Bartek", "DEV", 26, EmployeeType.DEV);

        if(bartek.equals(bartek2)){
            System.out.println("Bartki są równe");
        }

        double salary = bartek.getSalary();
        // tego nie możemy nigdzie przypisać bo nic nie zwraca
        bartek.printSalary();
        bartek.printEmployeeTypeSwitch();

        bartek.age = 26;
        bartek.name.wypisz();

        Employee stefan = new Employee("Stefan", "Boss", 40, EmployeeType.CEO);
        System.out.println(Employee.count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return name != null ? name.equals(employee.name) : employee.name == null;
    }

}

enum EmployeeType {
    HR(0), DEV(10), CEO(50), MANAGER(15);

    int bonus;

    EmployeeType(int bonus) {
        this.bonus = bonus;
    }
}

class MojString{
    String text;

    public MojString(String text) {
        this.text = text;
    }

    public void wypisz(){
        System.out.println("Imię tego pracownika to " + text);
    }
}

// nazwa klasy też w stylu camelCase, ale pierwsza litera Wielka!
class EmployeeOfTheMonth {

}