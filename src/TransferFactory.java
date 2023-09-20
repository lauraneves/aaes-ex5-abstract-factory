package src;

public class TransferFactory implements TransactionFactory {
    @Override
    public Transaction createTransaction() {
        return new TransferTransaction();
    }
}