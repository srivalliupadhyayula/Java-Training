package inheritance.bank;

public class CurrentAccount implements Account {
	
	double balance;
	
//	double extraCharges;
	
	public CurrentAccount(int bal) {
		this.balance = bal;
	}

	public double deposit(double money) {
		System.out.println("Before CurrentAccount deposit balance:" + balance);
		balance += money;
		System.out.println("After CurrentAccount deposit balance:" + balance);
		return balance;
	}
	
	public double withdraw(double money) {
		System.out.println("Before CurrentAccount withdrawal balance:" + balance);
		double extraCharges = 10 * money / 100;
		balance -= (money + extraCharges);
		
		System.out.println("Withdrawing from CurrentAccount: "+ money);
		System.out.println("Extra charges (10%): "+ extraCharges);
		System.out.println("After CurrentAccount withdrawal balance: "+balance);
		return balance;
	}
	
	public double balance(){
		System.out.println("Current Balance in CurrentAccount : " + balance);
		
		return balance;
	
	}
}
