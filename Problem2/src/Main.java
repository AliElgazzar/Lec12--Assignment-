import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AmountExceedBalance {
        CustomerAccount customer1 = new CustomerAccount("Samy", "123456", 150);
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("\t\tWelcome our customer for Withdraw Service ");

            System.out.println("Please enter the amount you would like to withdraw: ");
            double amount = scan.nextDouble();
            customer1.withdraw(amount);
        } catch (AmountExceedBalance e) {
            System.out.print(e.getMessage());
        } catch (BalanceReachBelow100 e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }


    }
}