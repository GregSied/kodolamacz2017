package pl.sages.kodolamacz;

public class Employee {

    static int count = 0;
    // pracownik ma imie i juz go nie moze zmienić
    final String name;

    public Employee(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        int iluPracownikow = 0;
        String zmienna = "lokalna";
        String name = "Bartek";
        // pusty, nieistniejacy obiekt
        // wywolanie name na nim da błąd
        // nie został tutaj stworzony żaden pracownik
        Employee pusty = null;
        Employee mietek = new Employee("Mieczysław");

        int count = Employee.count;

        Employee bartek = new Employee(name);

        Employee stefan = new Employee("Stefan");
        System.out.println(Employee.count);
    }

}
