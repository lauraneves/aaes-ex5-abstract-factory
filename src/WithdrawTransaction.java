package src;

public class WithdrawTransaction extends Transaction {
    public WithdrawTransaction() {
        super(0.0);
    }

    @Override
    public void execute() {
        // todo: logic to make a withdraw
        System.out.println("Realizando um saque de R$" + amount);
    }
}