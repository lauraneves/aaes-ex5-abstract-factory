package src;

public class Main {
    public static void main(String[] args) {
        // Creates a deposit factory
        TransactionFactory depositFactory = new DepositFactory();

        //Creates a deposit transaction
        Transaction depositTransaction = depositFactory.createTransaction();
        depositTransaction.execute();

        TransactionFactory withdrawFactory = new WithdrawFactory();

        Transaction withdrawTransaction = withdrawFactory.createTransaction();
        withdrawTransaction.execute();

        TransactionFactory transferFactory = new TransferFactory();

        Transaction transferTransaction = transferFactory.createTransaction();
        transferTransaction.execute();
    }
}