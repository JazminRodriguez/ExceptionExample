import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld
{
        public static int getIntFromUser()
        {
            boolean valida = true;
            Scanner stdlin = new Scanner(System.in);
            int num = 0;

            do{
                try {
                    System.out.println("Enter an Integer");
                    num = stdlin.nextInt();
                    valida = false;

                } catch (InputMismatchException imax) {
                    System.out.println("Null");
                    stdlin.next();
                }
            }while(valida);
            return num;
        }

        public static void main(String[] args)
        {
            int age = getIntFromUser();
            System.out.println("Age is: " + age);
        }
}
