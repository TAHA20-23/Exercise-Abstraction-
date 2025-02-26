// Movie class inherits from Product
public class Movie extends Product {
    private String director;

    // Default constructor
    public Movie() {
        super();
        this.director = "";
    }

    // Parameterized constructor
    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    // Getter & Setter for director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Implementing the discount method
    @Override
    public double getDiscount() {
        return getPrice() * 0.15; // 15% discount on movies
    }
}