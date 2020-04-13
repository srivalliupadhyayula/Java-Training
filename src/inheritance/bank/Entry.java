package inheritance.bank;

public class Entry {

	public static void main(String[] args) {
		
		Account a = new SavingsAccount(1000);
		Account b = new CurrentAccount(2000);
	
		a.deposit(100);
		a.withdraw(129.99);
		System.out.println("------------------------------");
		b.deposit(564.98);
		b.withdraw(500);
		System.out.println("------------------------------");
		
		a.balance();
		b.balance();
		
	}

}
