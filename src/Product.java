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

