package src;

public class DepositTransaction extends Transaction {
    public DepositTransaction() {
        super(0.0);
    }

    @Override
    public void execute() {
        // todo: logic to make a deposit
        System.out.println("Realizando um depósito de R$" + amount);
    }
}