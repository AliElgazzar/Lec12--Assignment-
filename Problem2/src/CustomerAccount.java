public class CustomerAccount {


    private String Cus_name;
    private String Acc_No;
    private double Balance;

    public CustomerAccount(String Cus_name, String Acc_No, double Balance) {
        this.Cus_name = Cus_name;
        this.Acc_No = Acc_No;
        this.Balance = Balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) throws AmountExceedBalance, BalanceReachBelow100 {
        if (amount > Balance) {
            throw new AmountExceedBalance("The amount you would like to withdraw exceeds your balance");
        }
        if (Balance - amount < 100) {
            throw new BalanceReachBelow100("your account balance is less than 100 ");
        }

            Balance -= amount;
            return true;


    }

    public String getCus_name() {
        return Cus_name;
    }

    public void setCus_name(String Cus_name) {
        this.Cus_name = Cus_name;

    }

    public String getAcc_No() {
        return Acc_No;
    }

    public void setAcc_No(String Acc_No) {
        this.Acc_No = Acc_No;
    }

    public double getBalance(){
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }
}
