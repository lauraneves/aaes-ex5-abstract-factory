package src;

public class DepositFactory implements TransactionFactory {
    @Override
    public Transaction createTransaction() {
        return new DepositTransaction();
    }
}
