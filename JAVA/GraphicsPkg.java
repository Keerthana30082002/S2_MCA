import java.util.Scanner;
import Graphics.*;

public class GraphicsPkg {
    public static void main(String[] args) {
        double ra, l, b, h;
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        ra = sc.nextDouble();
        Graphics.Circle c = new Graphics.Circle(ra);   
        System.out.println("Area of circle: " + String.format("%.2f", c.area()));

        // Rectangle
        System.out.print("Enter length and breadth of rectangle: ");
        l = sc.nextDouble();
        b = sc.nextDouble();
        Graphics.Rectangle r = new Graphics.Rectangle(l, b);
        System.out.println("Area of rectangle: " + String.format("%.2f", r.area()));

        // Square
        System.out.print("Enter side of square: ");
        l = sc.nextDouble();
        Graphics.Square s = new Graphics.Square(l);
        System.out.println("Area of square: " + String.format("%.2f", s.area()));

        // Triangle
        System.out.print("Enter base and height of triangle: ");
        b = sc.nextDouble();
        h = sc.nextDouble();
        Graphics.Triangle t = new Graphics.Triangle(b, h);
        System.out.println("Area of triangle: " + String.format("%.2f", t.area()));
        
    }
}
