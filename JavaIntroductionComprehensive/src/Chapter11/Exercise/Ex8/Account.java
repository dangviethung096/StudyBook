package Chapter11.Exercise.Ex8;

import java.util.ArrayList;

public class Account extends Chapter11.Exercise.Ex3.Account {
	
	public static void main(String[] args) {
		Account consumer = new Account("George", 1122, 1000);
		consumer.setAnnualInterstRate(0.015);
		
		consumer.deposit(30);
		consumer.withdraw(5);
		consumer.deposit(40);
		consumer.withdraw(4);
		consumer.deposit(50);
		consumer.withdraw(2);
		
		System.out.println(consumer.toString());
	}
	
	private String name;
	private ArrayList<Transaction> transactions;
	
	
	public Account(String name, int id, double balance) {
		this.name = name;
		this.setId(id);
		this.setBalance(balance);
		transactions = new ArrayList<Transaction>();
	}
	
	public void addTransactions(Transaction transaction) {
		this.transactions.add(transaction);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the transactions
	 */
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
	@Override
	public double withdraw(double amount) {
		// Change balance
		double balance = this.getBalance() - amount;
		this.setBalance(balance);
		// Add new transaction
		this.transactions.add(new Transaction('W', amount, balance, "Withdraw"));
		// Return value
		return balance;
	}
	
	@Override
	public double deposit(double amount) {
		double balance = this.getBalance() - amount;
		this.setBalance(balance);
		
		this.transactions.add(new Transaction('D', amount, balance, "Deposit"));
		
		return balance;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("name: " + this.name + "\n");
		sb.append("interest rate = " + this.getAnnualInterstRate() + "\n");
		sb.append("balance = " + this.getBalance() + "\n");
		sb.append("Transactions:\n");
		for(int i = 0; i < transactions.size(); i++) {
			sb.append(transactions.get(i) + "\n");
		}
		return sb.toString();
	}
}
