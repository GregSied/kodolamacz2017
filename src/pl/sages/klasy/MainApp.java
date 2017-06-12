package pl.sages.klasy;

public class MainApp {

    public static void main(String[] args) {
        System.out.println(0.1+0.1+0.1 - 3.0/10);

        Article mleko = new Article("Mleko", "Mleko UHT 2%", 250);
        Article maka = new Article("Mąka", "Pszenna", 199);

        System.out.println(Article.counter);

        System.out.println(mleko.toString());
        // to i tak wywoła toString() na przekazanym obiekcie
        System.out.println(mleko);
        System.out.println(maka);

        int i = 0;
        while((i++) < 10){

        }

        while(i < 10){
            i++;
        }
    }

}
