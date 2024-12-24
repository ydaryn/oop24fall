package bank;
import java.util.Vector;

public class Bank {
	public Vector<Account> accounts;
    //Vector<Account> accounts = new Vector<>();  better to initialize in constructor

	public Bank() {
		accounts=new Vector<>();
	}
	
	public void addAcc(Account a) {
		accounts.add(a);
	}
	
	public void removeAcc(int accNumber) {
	    for (int i = 0; i < accounts.size(); i++) {
	        if (accounts.get(i).getAccountNumber() == accNumber) {
	            accounts.remove(i); 
	            break; 
	        }
	    }
	}

    
	public void update() {
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
    }
	
	public void printAccounts() {
        for (Account acc : accounts) {
            acc.print();
        }
    }
}
