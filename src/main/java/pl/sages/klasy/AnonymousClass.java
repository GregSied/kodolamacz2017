package pl.sages.klasy;

import java.util.Date;

public class AnonymousClass {

    public static void main(String[] args) {
        Pet pet = new Pet("Anonimowy") {

            @Override
            public void voice() {
                System.out.println("Jestem anonimowym zwierzakiem");
            }
        };

        pet.voice();

        Dog anonimowyPies = new Dog("Reks") {
            @Override
            public void voice() {
                System.out.println("Ja jestem super pies");
                super.voice();
                superDog();
            }

            public void superDog(){

            }

        };
        // gdybym chciał wywołać metodę superDog to musiałbym przerzutować
        // klasę Dog na moją klasę anonimową, ale jak to zrobić
        // skoro ona nie ma nazwy? nie da się
        // anonimowyPies.superDog();
        Dog zwykłyPies = new Dog("Zwykły");
        anonimowyPies.voice();
        zwykłyPies.voice();
    }

}
