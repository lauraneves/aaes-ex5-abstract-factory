package src;

public class TransferTransaction extends Transaction {
    public TransferTransaction() {
        super(0.0);
    }

    @Override
    public void execute() {
        // todo: logic to make a transaction
        System.out.println("Realizando uma transferência de R$" + amount);
    }
}