public class Main {
    public static void main(String[] args) {

        //Q1/
        System.out.println("Q1/\n");
        // Create a Book object using the parameterized constructor
        Book book1 = new Book("Java ", 15.99, "F. Scott Fitzgerald");
        System.out.println("Book Name: " + book1.getName());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: RS " + book1.getPrice());
        System.out.println("Discount: RS " + book1.getDiscount());
        System.out.println();

        System.out.println("------------------");

        // Create another Book object using the default constructor and set values
        Book book2 = new Book();
        book2.setName("1990");
        book2.setPrice(13.50);
        book2.setAuthor("George Orwell");
        System.out.println("Book Name: " + book2.getName());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Price: RS " + book2.getPrice());
        System.out.println("Discount: RS " + book2.getDiscount());
        System.out.println();

        System.out.println("------------------");

        // Create a Movie object using the parameterized constructor
        Movie movie1 = new Movie("Inception", 19.98, "Christopher Nolan");
        System.out.println("Movie Name: " + movie1.getName());
        System.out.println("Director: " + movie1.getDirector());
        System.out.println("Price: RS " + movie1.getPrice());
        System.out.println("Discount: RS " + movie1.getDiscount());
        System.out.println();

        System.out.println("------------------");

        // Create another Movie object using the default constructor and set values
        Movie movie2 = new Movie();
        movie2.setName("The Matrix");
        movie2.setPrice(16.89);
        movie2.setDirector("The Wachowskis");
        System.out.println("Movie Name: " + movie2.getName());
        System.out.println("Director: " + movie2.getDirector());
        System.out.println("Price: RS " + movie2.getPrice());
        System.out.println("Discount: RS " + movie2.getDiscount());


        System.out.println("\n===================");


    //Q2/

        System.out.println("\nQ2/ \n");
        // Creating a MovablePoint object with initial position (0,0) and speed (2,3)
        MovablePoint point = new MovablePoint(2, 0, 2, 3);

        // Printing the initial position
        System.out.println("Initial Position:");
        point.printPosition();

        // Moving the point in all directions and printing the updated position
        point.moveUp();
        System.out.println("After moveUp:");
        point.printPosition();

        point.moveRight();
        System.out.println("After moveRight:");
        point.printPosition();

        point.moveDown();
        System.out.println("After moveDown:");
        point.printPosition();

        point.moveLeft();
        System.out.println("After moveLeft:");
        point.printPosition();

    }
}