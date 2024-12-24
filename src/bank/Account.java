package bank;

public class Account{
	private double balance; // The current balance
	private int accNumber; // The account number
	public Account(int a){
		balance = 0.0;
		accNumber = a;
	}
	public void deposit(double sum) { 
		if(sum>0) {
			balance+=sum;
		}
	}
	
	public void withdraw(double sum) {
		if(sum>0 && balance>=sum) {
			balance-=sum;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAccountNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		if(amount<=balance && amount>0) {
			balance-=amount;
			other.deposit(amount);	
		}
	}
	
	public String toString() { 
		return "Account num is: "+getAccountNumber()+", Balance: "+ getBalance();
	} 
	
	public final void print() {
		System.out.println(toString());
	}
}