package pl.sages.klasy;

// słówko final zabrania dziedziczenia
public final class Parrot extends Bird {
    public Parrot(String name) {
        super(name, "kolorowa");
    }

    @Override
    public void fly() {
        System.out.println("fruuuu");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println(this.getName()+" chce krakersa");
        super.voice();
    }

    public static void main(String[] args) {
        Parrot polly = new Parrot("Polly");
        polly.voice();
        polly.fly();
        Bird bird = new Parrot("Ara");
        bird.fly();
        // klasa Pet jest zbyt ogólnym "uchwytem" na zmienną
        // więc nie potrafi latać (mimo że klasa Parrot potrafi)
        Pet pet = new Parrot("Ara");
        // pet.fly(); nie działa
        // JA WIEM że to jest papuga
        // jeśli nie jest - błąd w czasie wykonania programu
        ((Parrot) pet).fly();
    }
}

// nie możemy dziedziczyć po finalnej klasie Parrot
//final class BigParrot extends Parrot{
//
//    public BigParrot(String name) {
//        super(name);
//    }
//}
