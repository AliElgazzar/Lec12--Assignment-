
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number in range [0,100]");

        try {
            int number = num.nextInt();
            if (number < 0 || number > 100) {
                throw new UnsupportedOperationException("Number not in range [0, 100]");
            }
            System.out.println("The number is: " + number);
        } catch (InputMismatchException e) {             // nextInt() has a exception built in it so dont need trow

            System.out.println("Please enter only number not ");

        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } finally {
            num.close();
        }

    }
}