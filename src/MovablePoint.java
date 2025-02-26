// MovablePoint class implements the Movable interface
public class MovablePoint implements Movable {
    // Variables to store coordinates and speed
    private int x, y;
    private int xSpeed, ySpeed;

    // Constructor to initialize the point's position and speed
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // moveUp method: Increases the y-coordinate by ySpeed
    @Override
    public void moveUp() {
        y += ySpeed;
    }

    // moveDown method: Decreases the y-coordinate by ySpeed
    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    // moveLeft method: Decreases the x-coordinate by xSpeed
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    // moveRight method: Increases the x-coordinate by xSpeed
    @Override
    public void moveRight() {
        x += xSpeed;
    }

    // Method to print the current position of the point
    public void printPosition() {
        System.out.println("Current Position: (" + x + ", " + y + ")");
    }
}