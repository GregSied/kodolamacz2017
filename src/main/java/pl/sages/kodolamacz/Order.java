package pl.sages.kodolamacz;

import pl.sages.klasy.Article;

public class Order {

    int currentArticle = 0;
    Article[] articles;
    int[] counters;
    int[] discounts;

    public Order() {
        this.articles = new Article[10];
        this.counters = new int[10];
        this.discounts = new int[10];
    }

    // zły przykład, bo duplikacja koud
//    public void addArticle(Article article){
//        articles[currentArticle] = article;
//        counters[currentArticle] = 1;
//        currentArticle++;
//    }

    public void addArticle(Article article){
        addArticle(article, 1);
    }

    public void addArticle(Article article, int counter){
        addArticle(article, counter, 0);
    }


    public void addArticleWithDiscount(Article article, int discout){
        addArticle(article, 1, 0);
    }

    public void addArticle(Article article, int counter, int discount){
        articles[currentArticle] = article;
        counters[currentArticle] = counter;
        discounts[currentArticle] = discount;
        currentArticle++;
    }

    public int getTotalPrice(){
        int sum = 0;
        for (int i = 0; i < currentArticle; i++) {
            Article article = articles[i];
            // mnożymy cenę każdego artykułu i mnożymy przez liczność
            sum += article.getPrice() * counters[i];
        }
        // dodajemy 1000 groszy == 10zł kosztu dostawy
        sum += 1000;
        return sum;
    }
}
