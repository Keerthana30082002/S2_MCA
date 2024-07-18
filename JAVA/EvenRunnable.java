import java.util.*;
class fibonacci implements Runnable 
{
    int n;
    fibonacci(int limit)
    {
        n=limit;
    }
    public void run()
    {
        int a=0,b=1,c,i;
        for(i=0;i<n;i++)
        {
            System.out.println("Fibonacci number : "+a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
class Even implements Runnable 
{
    int start,end,i;
    Even(int a,int b)
    {
        start=a;
        end=b;
    }
    public void run()
    {
        for(i=start;i<=end;i++)
        {
            if(i % 2==0)
                System.out.println("Even number: "+i);
        }
    }
}
public class EvenRunnable 
{
    public static void main(String args[])
    {
        int n,start,end;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of fibonacci numbers: ");
        n=sc.nextInt();
        System.out.print("Enter the start and end range for even numbers: ");
        start=sc.nextInt();
        end=sc.nextInt();
        Thread f=new Thread(new fibonacci(n));
        Thread e=new Thread(new Even(start,end));
        f.start();
        e.start();
    }
}