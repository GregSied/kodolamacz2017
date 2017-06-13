package pl.sages.klasy;

public class Book extends Article {

    private String author;
    private int year;

    public Book(){
        super();
    }

    // konstruktor kopiujący
    public Book(Book other) {
        this.author = other.author;
        this.year = other.year;
    }

    public Book(String name, String description, int price, String author, int year) {
        // wywołanie konstruktora klasy Article
        super(name, description, price);
        this.author = author;
        this.year = year;
        // to pole jest widzialne, bo jest protected
        this.name = "Książka";
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        // nie mogę modyfikować roku
        //year++;
        printChange("year");
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", year=" + year +
                " " + super.toString();
    }

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);
        book.setYear(2017);
    }
}
