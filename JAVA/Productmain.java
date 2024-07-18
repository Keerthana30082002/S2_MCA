import java.util.Scanner;
class Product 
{
    int pcode;
    String pname;
    double price;

    public void readdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product code: ");
        this.pcode=sc.nextInt();
        System.out.println("Enter the product name: ");
        this.pname=sc.next();
        System.out.println("Enter the product price: ");
        this.price=sc.nextDouble();


    }
}
public class Productmain
{
    public static void main(String args[])
    {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        p1.readdata();
        p2.readdata();
        p3.readdata();
        if(p1.price<p2.price && p1.price<p3.price)
        System.out.println("The product with lowest price is "+p1.pname+" and the price is "+p1.price);

        else if(p2.price<p3.price)
        System.out.println("The product with lowest price is "+p2.pname+" and the price is "+p2.price);
        
        else
        System.out.println("The product with lowest price is "+p3.pname+" and the price is "+p3.price);
        
    }
}