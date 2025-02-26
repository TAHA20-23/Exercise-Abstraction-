// Abstract class Product
public abstract class Product {
    private String name;
    private double price;

    // Default constructor
    public Product() {
        this.name = "";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter & Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to get the discount
    public abstract double getDiscount();
}

// لم نقم ساتعمال او اختبار الدوال التاليه:
//public void setName(String name)"from class Product"
//public void setPrice(double price) "from class Product"
//public Book()"from class Book"
//public void setAuthor(String author)"from class Book"
//public Movie()"from class Movie"
//public void setDirector(String director)"from class Movie"