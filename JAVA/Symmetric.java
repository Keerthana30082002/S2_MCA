import java.util.Scanner;
class Symmetric
{
    public static void main(String args[])
    {
        int r,c,i,j,flag=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        r=sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the elements of the matrix: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        if(r!=c)
            System.out.println("Matrix should be square matrix");
        else 
        {
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    if(a[i][j]!=a[j][i])
                    {
                        flag=0;
                        break;
                    }
                }
            }
        }
        if(flag==1)
        System.out.println("Symmetric");
        else
        System.out.println("Not Symmetric");
    }
}