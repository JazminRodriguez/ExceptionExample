import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileExample
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String fileName;
        File file;

        System.out.println("Enter a filename: ");
        fileName = stdIn.nextLine();
        file = new File(fileName);
        try {
            Scanner fileScanner = new Scanner(file);
            int total=0;
            while(fileScanner.hasNext())
            {
                int num = fileScanner.nextInt();
                total += num;
            }
            System.out.println(total);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + fileName);
        } catch (InputMismatchException im)
        {
            System.out.println("Input Mismatch");
        }
    }

}
