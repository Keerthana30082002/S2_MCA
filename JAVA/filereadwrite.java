import java.io.*;
public class filereadwrite 
{
    public static void main(String args[])
    {
        String filename="myFile.txt";
        try 
        {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the content to write to the file: ");
            String content=reader.readLine();
            FileWriter writer=new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("Content written to: "+filename);

        }
        catch(IOException e)
        {
            System.out.println("Error writing to the file: "+e.getMessage());
        }
        try 
        {
            FileReader reader=new FileReader(filename);
            BufferedReader b=new BufferedReader(reader);
            String line;
            System.out.println("Contents read from "+filename+" :");
            while((line=b.readLine())!=null)
            {
                System.out.println(line);
            }
            b.close();
        }
        catch(IOException e)
        {
            System.err.println("Error reading from the file: "+e.getMessage());
        }
    }
}