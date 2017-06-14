package pl.sages.klasy;

public class Article {

    static int counter = 0;

    // widoczne dla wszystkich
    public int id;
    // widoczne w pakiecie oraz dla klas, które dziedziczą
    // (niekoniecznie w tym samym pakiecie)
    protected String name;
    // domyślny - tylko w pakiecie
    String description = "Brak opisu.";
    // prywatny - tylko w klasie
    private int price;

    public Article() {
        this("",0);
        //odpali poniższy kontruktor, który odpali następny:
        // this("","",0);
    }

    public Article(String name, int price){
        this(name, "", price);

    }

    public Article(String name, String description, int price) {
        //counter++;
        // zmienna++ zwieksza wartosc zmiennej o 1
        // ++counter - prefixowy
        // counter++ - postfixowy
        // counter = counter + 1;

        this.id = ++counter;
        this.name = name;
        this.setDescription(description);
        this.price = price;
    }

    // jest protected więc klasa Book i Dvd widzą tę metodę
    protected void printChange(String value){
        System.out.println("Zmieniono wartość pola " + value);
    }

    // nazwa nie powinna się zmienić, więc mogę pobrać tylko
    public String getName() {
        return name;
    }

    // cenę mogę pobrać
    public int getPrice() {
        return price;
    }

    // zmienić jeśli będzie prmocja
    public void setPrice(int price) {
        printChange("price");
        if(price < 0){
            System.out.println("Cena nie może być ujemna");
        }else{
            this.price = price;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        printChange("description");
        if("".equals(description)){
            System.out.println("Nie można ustawić pustego opisu");
        }else{
            this.description = description;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (price != article.price) return false;
        return name != null ? name.equals(article.name) : article.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Artykuł sklepowy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + (price/100 + "." + price%100) +
                '}';
    }
}
