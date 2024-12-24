package bank;

public class CheckingAccount extends Account {
	private int transactionCount=0;
	private static final int freeTransaction=3;
	private static final double transactionFee=0.02; //$
	
	public CheckingAccount(int accNumber) {
        super(accNumber);
        transactionCount = 0;
    }
	
	@Override 
	public void deposit(double sum) {
		super.deposit(sum);
		transactionCount++;
	}
	
	@Override
	public void withdraw(double sum) {
		super.withdraw(sum);
		transactionCount++;
	}
	
	public void deductFee() {
		if(transactionCount>freeTransaction) {
			super.withdraw(transactionFee);
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+", Transactions "+transactionCount;
	}
}
