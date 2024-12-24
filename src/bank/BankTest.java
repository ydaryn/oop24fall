package bank;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount(1001, 2.5); // 2.5% interest
        CheckingAccount checking = new CheckingAccount(1002);

        bank.addAcc(savings);
        bank.addAcc(checking);

        savings.deposit(1000);
        checking.deposit(500);
        checking.deposit(100);
        checking.withdraw(100);
        checking.withdraw(100);

        bank.update();

        bank.printAccounts();
    }
}
