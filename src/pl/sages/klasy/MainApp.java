package pl.sages.klasy;

import pl.sages.kodolamacz.FastOrder;
import pl.sages.kodolamacz.ForeignOrder;
import pl.sages.kodolamacz.Order;

public class MainApp {

    public static void main(String[] args) {
        System.out.println(0.1+0.1+0.1 - 3.0/10);

        Article mleko = new Article("Mleko", "Mleko UHT 2%", 250);
        Article maka = new Article("Mąka", "Pszenna", 199);

        Article bezOpisu = new Article("Pusty","",100);
        System.out.println(bezOpisu);

        // to nie działa bo metoda jest prywatna
        //bezOpisu.printChange("a");

        System.out.println(Article.counter);

        System.out.println(mleko.toString());
        // to i tak wywoła toString() na przekazanym obiekcie
        System.out.println(mleko);
        System.out.println(maka);

        mleko.setDescription("Mleko 3.2%");

        Order order = new ForeignOrder();
        order.addArticle(mleko, 2);
        order.addArticle(maka, 3);
        System.out.println("Total price foreign = "+order.getTotalPrice());


        Order order2 = new FastOrder();
        order.addArticle(mleko, 2);
        order.addArticle(maka, 3);
        System.out.println("Total price fast = "+order.getTotalPrice());

        Pet zwierze = new Pet("Zwierze");
        zwierze.voice();
        Dog reks = new Dog("Reks");
        reks.voice();
    }

}
