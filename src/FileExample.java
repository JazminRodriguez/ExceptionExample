import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileExample
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String fileName;
        FileReader file;

        System.out.println("Enter a filename: ");
        fileName = stdIn.nextLine();
        try {
            file = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
            //e.printStackTrace();
        }
    }

}
