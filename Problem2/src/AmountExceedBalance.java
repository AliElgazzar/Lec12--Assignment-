public class AmountExceedBalance extends Exception {

    public AmountExceedBalance() {}
    public AmountExceedBalance(String message)
    {
        super(message);
    }
}
