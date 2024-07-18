import java.util.*;
class sort_string
{
    Scanner sc=new Scanner(System.in);
    int size,i,j;
    String s[];
    sort_string()
    {
        System.out.print("Enter no of Strings: ");
        size=sc.nextInt();
        s=new String[size];
        System.out.print("Enter "+size+" Strings: ");
        for(i=0;i<size;i++)
            s[i]=sc.next();
    }
    void sort()
    {
        for(i=0;i<size;i++)
            for(j=0;j<size-i-1;j++)
                if(s[j].compareToIgnoreCase(s[j+1])>0)
                {
                    String temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
    }
    void display()
    {
        for(i=0;i<size;i++)
            System.out.print(s[i]+" ");

    }
}
public class sort_main
{
    public static void main(String args[])
    {
        sort_string s1=new sort_string();
        System.out.print("Original String array : ");
        s1.display();
        s1.sort();
        System.out.print("\nSorted String array: ");
        s1.display();

    }
}