import java.io.*;
class Numbers
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the input file path: ");
        String inputFile=reader.readLine();
        String evenFile="even.txt";
        String oddFile="odd.txt";
        BufferedReader fileReader=new BufferedReader(new FileReader(inputFile));
        BufferedWriter evenWriter=new BufferedWriter(new FileWriter(evenFile));
        BufferedWriter oddWriter=new BufferedWriter(new FileWriter(oddFile));
        String line;
        while((line=fileReader.readLine())!=null)
        {
            int number=Integer.parseInt(line);
            if(number % 2 == 0)
            {
                evenWriter.write(line);
                evenWriter.newLine();
            }
            else{
                oddWriter.write(line);
                oddWriter.newLine();
            }

        }
        System.out.println("Even and odd numbers seperated successfully");
        reader.close();
        fileReader.close();
        evenWriter.close();
        oddWriter.close();
    }
}
