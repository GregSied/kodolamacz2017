package pl.sages.klasy;

public class VoiceOfPoland {

    public static void sing(Pet pet){
        pet.voice();
    }

    public static void sing(Dog dog){
        System.out.println("Teraz śpiewa pies");
        dog.voice();
        System.out.println("Pies skończył śpiewać");
    }

    public static void main(String[] args) {

        Dog reks = new Dog("Reks");
        Cat mruczek = new Cat("Mruczek");
        Pet azor = new Dog("Azor");

        // to działa, bo zarówno pies jak i kot są zwięrzętami
        // bo obie klasy Dog i Cat dziedziczą po Pet
        sing(reks);
        sing(mruczek);
        System.out.println("Azor");
        sing(azor);
        System.out.println("azor");
        // zostanie wykonana metoda voice z klasy Pet czy Dog/Cat ?
        // czy dwa razy będzie "daj głos" i czy będzie "hau hau"/"miau"
        // POLIMORFIZM
        // uruchamiana jest metoda aktualnego obiektu

        // pongo zakłada że jest to ZWIERZE
        Pet pongo = new Dog("Pongo");
        pongo.voice();
        // aport nie zadziała, bo my wiemy że to jest tylko zwierze

        //pongo.aport();
        Dog czika = new Dog("Czika");
        // tu działa, bo zmienna jest typu Dog
        czika.aport();
        pongo = new Cat("aa");
        pongo.voice();
        // zrobić rzutowanie na konkretny typ
        // i wtedy mam dostęp do metod z klasy kota
        // to działa, bo chwilę wcześniej powiedzieliśmy że pongo ma być kotem
        Cat mruczus = (Cat) pongo;
        System.out.println("Mruczusiu zamrucz");
        mruczus.mrucz();

        // a tutaj deklaruję zwierzę jako PSA
        Pet pet = new Dog("Azor");
        // a później próbuję go traktować jak KOTA
        ((Cat) pet).mrucz();
        // kompilator zwraca błąd - nie mogę przypisać psa na kota
        // Cat cat = new Dog("Azor");
        // nawet się broni przed rzutowaniem
        //Cat cat = (Cat) new Dog("Azor");

    }

}
