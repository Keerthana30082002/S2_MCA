import java.util.*;
class negative extends RuntimeException 
{
    negative(String s)
    {
        super(s);
    }
}
class Average 
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        n=sc.nextInt();
        int ar[]=new int[n];
        double sum=0;
        System.out.print("Enter "+n+" numbers: ");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            try 
            {
                if(ar[i]<0)
                    throw new negative("Neagative number is not allowed!!!");
                else 
                    sum+=ar[i];
            }
            catch(negative e)
            {
                System.out.println("\n"+e.getMessage());
                System.exit(0);
            }
        }
        System.out.println("Average: "+String.format("%.2f",(sum/n)));
    }
}