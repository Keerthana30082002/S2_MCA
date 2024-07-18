import java.util.Scanner;
class Complex 
{
    double real,img;
    public Complex(double real,double img)
    {
        this.real=real;
        this.img=img;
    }
    public static Complex add(Complex c1,Complex c2)
    {
        Complex c3=new Complex(0,0);
        c3.real=c1.real+c2.real;
        c3.img=c1.img+c2.img;
        return c3;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real part of first complex number: ");
        double real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of first complex number: ");
        double img1 = sc.nextDouble();

        System.out.println("Enter the real part of second complex number: ");
        double real2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of second complex number: ");
        double img2 = sc.nextDouble();

        Complex c1=new Complex(real1,img1);
        Complex c2=new Complex(real2,img2);
        System.out.println("First Complex Number: " +c1.real+" + "+c1.img+"i");
        System.out.println("Second Complex Number: " +c2.real+" + "+c2.img+"i");
        Complex c3=add(c1,c2);
        System.out.println("Sum of 2 Complex Numbers : "+c3.real+" + "+c3.img+"i");
    }
}
