package src;

public class WithdrawFactory implements TransactionFactory {
    @Override
    public Transaction createTransaction() {
        return new WithdrawTransaction();
    }
}