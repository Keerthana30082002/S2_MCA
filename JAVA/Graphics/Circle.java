package Graphics;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return 3.14 * radius * radius;
    }
}
