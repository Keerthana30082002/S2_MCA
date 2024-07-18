import java.util.*;
class shape_area
{
    void area(double r)
    {
        System.out.println("Area of circle: "+String.format("%.2f",3.14*r*r));
    }
    void area(float s)
    {
        System.out.println("Area of Square: "+(s*s));
    }
    void area(double l,double b)
    {
        System.out.println("Area of Rectangle: "+(l*b));
    }
    void area(float b,float h)
    {
        System.out.println("Area of Triangle: "+(0.5*b*h));
    }

}
class overloading
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        shape_area s=new shape_area();
        System.out.print("Enter the radius of circle: ");
        double r=sc.nextDouble();
        s.area(r);
        System.out.print("Enter the length of side of square: ");
        float side=sc.nextFloat();
        s.area(side);
        System.out.print("Enter the length and breadth of Rectangle: ");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        s.area(l,b);
        System.out.print("Enter the breadth and height of Triangle: ");
        float br=sc.nextFloat();
        float h=sc.nextFloat();
        s.area(br,h);
        
    }
}