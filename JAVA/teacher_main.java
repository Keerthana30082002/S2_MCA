import java.util.*;
class Person 
{
    String name,address;
    char gender;
    int age;
    Scanner sc=new Scanner(System.in);
    Person(int x)
    {
        System.out.println("\t\t Enter Teacher "+x+" Details");
        System.out.print("Enter name: ");
        name=sc.next();
        System.out.print("Enter gender: ");
        gender=sc.next().charAt(0);
        System.out.print("Enter Address: ");
        address=sc.next();
        System.out.print("Enter Age: ");
        age=sc.nextInt();
    }
}
class Employee extends Person{
    int Empid;
    String company_name,qualification;
    double salary;
    Scanner sc=new Scanner(System.in);
    Employee(int x)
    {
        super(x);
        System.out.print("Enter Employee ID: ");
        Empid=sc.nextInt();
        System.out.print("Enter company name: ");
        company_name=sc.next();
        System.out.print("Enter Qualification: ");
        qualification=sc.next();
        System.out.print("Enter Salary: ");
        salary=sc.nextDouble();
    }
}
class Teacher extends Employee{
    String subject,dept;
    int Teacherid;
    Scanner sc=new Scanner(System.in);
    Teacher(int x)
    {
        super(x);
        System.out.print("Enter Subject: ");
        subject=sc.next();
        System.out.print("Enter Department: ");
        dept=sc.next();
        System.out.print("Enter Teacher ID: ");
        Teacherid=sc.nextInt();
    }
    void display(int j)
    {
        System.out.println("\t\t Teacher "+j +" Details");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Employee ID: "+Empid);
        System.out.println("Company Name: "+company_name);
        System.out.println("Qualification: "+qualification);
        System.out.println("Salary: "+salary);
        System.out.println("Subject: "+subject);
        System.out.println("Department: "+dept);
        System.out.println("Teacher ID: "+Teacherid);
    }
}
class teacher_main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of Teachers: ");
        int n=sc.nextInt();
        Teacher t[]=new Teacher[n];
        for(int i=0;i<n;i++)
            t[i]=new Teacher(i+1);
        for(int i=0;i<n;i++)
            t[i].display(i+1);
    }
}