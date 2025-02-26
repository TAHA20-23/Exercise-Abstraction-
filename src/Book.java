// Book class inherits from Product
public class Book extends Product {
    private String author;

    // Default constructor
    public Book() {
        super();
        this.author ="";
    }

    // Parameterized constructor
    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    // Getter & Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Implementing the discount method
    @Override
    public double getDiscount() {
        return getPrice() * 0.25; // 10% discount on books
    }
}