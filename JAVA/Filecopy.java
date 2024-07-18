import java.io.*;
class filecopy
{
    public static void main(String args[])
    {
        String sourcefile="source.txt";
        String destinationfile="destination.txt";
        try 
        {
            BufferedReader sourceReader=new BufferedReader(new FileReader(sourcefile));
            BufferedWriter destinationWriter=new BufferedWriter(new FileWriter(destinationfile));
            String line;
            while((line=sourceReader.readLine())!=null)
            {
                destinationWriter.write(line);
                destinationWriter.newLine();
            }
            sourceReader.close();
            destinationWriter.close();
            System.out.println("File copied Successfully!");

        }
        catch(IOException e)
        {
            System.err.println("Error copying the file: "+e.getMessage());
        }
    }
}