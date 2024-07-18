import java.util.Scanner;
class Addition
{
    public static void main(String args[])
        {
            int r1,c1,r2,c2,i,j;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no of rows and columns of first matrix: ");
            r1=sc.nextInt();
            c1=sc.nextInt();
            int a1[][]=new int[r1][c1];
            System.out.println("Enter the elements of first matrix: ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    a1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the no of rows and columns of second matrix:  ");
            r2=sc.nextInt();
            c2=sc.nextInt();
            if(r1!=r2 && c1!=c2)
                System.out.println("Matrix addition is not possible!!!");
            int a2[][]=new int[r2][c2];
            System.out.println("Enter the elements of the second matrix: ");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    a2[i][j]=sc.nextInt();
                }
            }
            System.out.println("First matrix is: ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.print(a1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Second matrix is: ");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(a2[i][j]+" ");
                }
                System.out.println();
            }
            int sum[][]=new int[r1][c1];
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    sum[i][j]=a1[i][j]+a2[i][j];
                }
            }
            System.out.println("Matrix after addition: ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
}