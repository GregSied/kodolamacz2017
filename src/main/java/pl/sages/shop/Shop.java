package pl.sages.shop;

import pl.sages.klasy.Article;
import pl.sages.kodolamacz.Employee;

import java.util.*;

public class Shop {

    String address;
    String[] products = generateProducts();
    int[] quantities = {5, 10};
    List<Employee> employeeList = new ArrayList<>();
    Map<Article, Integer> articleMap = new HashMap<>();

    public Shop(String address) {
        this.address = address;
    }

    public void addEmployee(String name){
        Employee employee = new Employee(name);
        employeeList.add(employee);
    }

    public void addEmployeeShort(String name){
        addEmployee(new Employee(name));
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public boolean hasEmployee(String name){
        return hasEmployee(new Employee(name));
    }

    public boolean hasEmployee(Employee employee){
        return employeeList.contains(employee);
    }

    public void addArticle(String articleName, int count){
        Article article = new Article(articleName, 100);
        articleMap.put(article, count);
    }

    public void addArticle(Article article, int count){
        articleMap.put(article, count);
    }

    public int articleCount(Article article){
        // sprawdzam czy mój artykuł jest w sklepie
        // aby uniknąć null pointer exception
        if(articleMap.containsKey(article)){
            return articleMap.get(article);
        }else{
            return 0;
        }
        // w javie 8 można już zrobić takie rzeczy:
        // articleMap.getOrDefault(article, 0);
    }

    public void swapCounters(Article article1, Article article2){
        int count1 = articleCount(article1);
        int count2 = articleCount(article2);
        articleMap.put(article1, count2);
        articleMap.put(article2, count1);
    }

    private String[] generateProducts(){
        String[] p ={"Mleko", "Pepsi"};
        return p;
    }

    void accept(Order order){
        // jak wchodzi zamówienie to na podstawie liczności z zamówienia
        // chcemy zaktualizować stan magazynowy w sklepie (tab quantities)
    }

    public static void main(String[] args) {
        Shop shop = new Shop("Marszałkowska 18");
        int[] orderQuantities = {20, 50};
        Order order = new Order(orderQuantities);

        shop.accept(order);

        if(shop.quantities[0] == 25){
            System.out.println("Mleko zostało przyjęte");
        }else{
            System.out.println("Mleko nie zostało przyjęte");
        }

        shop.addEmployee("Mietek");
        System.out.println(shop.hasEmployee("Mietek"));

        Article mleko = new Article("Mleko", 100);
        shop.addArticle(mleko, 50);
        Article kawa = new Article("Kawa", 550);
        shop.addArticle(kawa, 10);

        System.out.println("Mamy "+
                shop.articleCount(mleko) + " kartonów mleka");

        Article batonik = new Article("Batonik", 99);
        System.out.println("Mamy "+ shop.articleCount(batonik) +
                " batoników");
        System.out.println(shop.articleMap);
        shop.swapCounters(new Article("Mleko", 200),
                kawa);
        System.out.println(shop.articleMap);


    }

}
