package pl.sages.vending;

// Coin jest typu enum - wyliczeniowy typ, który ma z góry ustalną
// liczbę obiektów
public enum Coin {

    // to są dostępne obiekty i tylko te,
    // nie możemy stworzyć więcej
    FIVE_ZLOTY(500),
    TWO_ZLOTY(200),
    ONE_ZLOTY(100),
    FIFTY_GROSZY(50),
    TWENTY_GROSZY(20),
    TEN_GROSZY(10);

    // zabezpieczenie przed tym, aby nikt nie zmienił wartości
    // chociaż i tak nie ma settera, więc nikt z zewnątrz (spoza klasy)
    // nie może zmienić wartości tego pola
    private final int value;

    // konstruktor w enum jest zawsze prywatny - nie możemy go wywołać poza klasą
    // Idea podpowiada, że modyfikator private jest tutaj zbędny
    private Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //anotacja @Override zapewnia, że nadpiszemy metodę z klasy rodzica
    // w tym wypadku jest to klasa Object
    // override "pilnuje" aby metoda została nadpisana (jeśli zrobimy literówkę
    // w nazwie metody to dostaniemy błąd, bez anotacji niestety nie)
    @Override
    public String toString() {
        return "Coin=" + (value/100 + "." + value%100);
    }
}
