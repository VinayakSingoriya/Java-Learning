import java.io.*;
class InsufficientFundException extends Exception{
	public double amount;;
	public InsufficientFundException(double amount){
		this.amount = amount;
	}
	public double getAmount(){
		return this.amount;
	}
}

class checkingAccount{
	
	private double balance;
	private int number;
	public checkingAccount(int n){
		this.number = n;
	}
	public void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double amount) throws InsufficientFundException{
		if (amount<=balance){
			balance -= amount;
		}
		else{
			double needs = amount - balance;
			throw new InsufficientFundException(needs);
		}
	}
	public double getBalance(){
		return balance;
	}
	public double getNumber(){
		return number;
	}
	
}

//Main class
public class BankDemo{
	public static void main(String args[]){
		checkingAccount c = new checkingAccount(100);
		System.out.println("Depositing $500...");
		c.deposit(500.00);
		try{
			System.out.print("\nWithdrawing $100...");
			c.withdraw(100.00);
			System.out.println("\nwithdrawing $200");
			c.withdraw(200.00);
			System.out.println("\n Withdrawing $400");
			c.withdraw(400.00);
		}
		catch(InsufficientFundException e){
			System.out.println("\nSorry but you are shortage of $"+e.getAmount());
			e.printStackTrace();
		}
	}
}