package inheritance.bank;

public class SavingsAccount implements Account {
	
	double balance;
	
	
	public SavingsAccount(int bal) {
		this.balance = bal;
	}
	
	public double deposit(double money) {
		System.out.println("Before SavingsAccount deposit balance:" + balance);
		balance += money;
		System.out.println("After SavingsAccount deposit balance:" + balance);
		return balance;
	}
	
	public double withdraw(double money) {
		System.out.println("Before SavingsAccount withdrawal balance:" + balance);
		balance -= money;
		
		System.out.println("Withdrawing from SavingsAccount: "+ money);
		System.out.println("After SavingsAccount withdrawal balance: "+balance);
		return balance;
	}
	
	public double balance(){
		System.out.println("Current Balance in SavingsAccount : " + balance);
		
		return balance;
	
	}

}
