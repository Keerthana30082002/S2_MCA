import java.util.*;
class Employee 
{
    Scanner sc=new Scanner(System.in);
    int eNo;
    String eName;
    double eSalary;
    Employee(int n)
    {
        System.out.println("\t\tEnter Details for Employee "+n);
        System.out.print("Enter employee number: ");
        eNo=sc.nextInt();
        System.out.print("Enter employee name: ");
        eName=sc.next();
        System.out.print("Enter employee salary: ");
        eSalary=sc.nextDouble();
    }
}
class array_objects
{
    public static void main(String args[])
    {
        int n,i,num,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        n=sc.nextInt();
        Employee e[]=new Employee[n];
        for(i=0;i<n;i++)
        {
            e[i]=new Employee(i+1);
        }
        System.out.print("\nEnter Employee Number to Search: ");
        num=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(e[i].eNo==num)
            {
                System.out.println("Employee Name: "+e[i].eName+"\nSalary: "+e[i].eSalary);
                c=1;
            }
        }
        if(c==0)
            System.out.println("Employee Not Registered!!!");
    }
}