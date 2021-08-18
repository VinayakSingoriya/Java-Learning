class Account{
	public int balance;
	public int accountNo;
	void displayBalance(){
		System.out.println("Account NO : "+accountNo+", Balance : "+balance);
	}
	synchronized void deposit(int amount){
		balance = balance+amount;
		System.out.println(amount + " is deposited.");
		displayBalance();
	}
	synchronized void withdraw(int amount){
		balance = balance-amount;
		System.out.println(amount+" is withdrawn.");
		displayBalance();
	}
}
//Implement a thread for deposit
class TransactionDeposit implements Runnable{
	Account accountX;
	int amount;
	TransactionDeposit(Account x, int amount){
		accountX = x;
		this.amount = amount;
		new Thread(this).start();
	}
	public void run(){
		accountX.deposit(amount);
	}
}
//Implement a thread for Withdrawl
class TransactionWithdraw implements Runnable{
	Account accountY;
	int amount;
	TransactionWithdraw(Account y, int amount){
		accountY = y;
		this.amount = amount;
		new Thread(this).start();
	}
	public void run(){
		accountY.withdraw(amount);
	}
}
//Main class
class BankTransaction{
	public static void main(String args []){
		Account ABC  = new Account();
		ABC.balance = 1000;
		TransactionDeposit t1;
		TransactionWithdraw t2;
		t1 = new TransactionDeposit(ABC, 500);
		t2 = new TransactionWithdraw(ABC, 900);
	}
}