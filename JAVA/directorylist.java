import java.io.File;
import java.util.Scanner;
public class directorylist 
{
    static void listFilesAndDirectories(File directory)
    {
        File[] filelist=directory.listFiles();
        if(filelist!=null)
        {
            for(File file:filelist)
            {
                System.out.println(file.getName());
                if(file.isDirectory())
                {
                    listFilesAndDirectories(file);
                }
            }
        }
    }
    static void searchFile(File directory, String filename) {
    File[] fileList = directory.listFiles();
    if (fileList != null) {
        for (File file : fileList) {
            if (file.isFile() && file.getName().equals(filename)) {
                System.out.println("File found at: " + file.getAbsolutePath());
                return;
            } else if (file.isDirectory()) {
                searchFile(file, filename); 
            }
        }
    }
    System.out.println("File '" + filename + "' not found.");
}

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String directoryPath = sc.nextLine();
        File directory=new File(directoryPath);
        if(directory.exists() && directory.isDirectory())
        {
            System.out.println("Files and directories in the specified directory: ");
            listFilesAndDirectories(directory);
            System.out.print("\nEnter the file name to search: ");
            String fileName = sc.nextLine();
            System.out.println("Searching for file '" + fileName + "'...");
            searchFile(directory, fileName);
        }
         else {
        System.out.println("Invalid directory path.");
        }
        sc.close();
        }
}