package Chapter11.Exercise.Ex3;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterstRate = 0.08;
	private Date  dateCreated;
	
	public Account() {
		
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public double getMonthlyInterest() {
		return balance * annualInterstRate/12;
	}
	
	/**
	 * Subtract amount money to account
	 * @param amount
	 * @return
	 */
	public double withdraw(double amount) {
		return (balance -= amount);
	}
	
	/**
	 * Add amount money to account
	 * @param amount
	 * @return
	 */
	public double deposit(double amount) { 
		return (balance += amount);
	}
	
	public String toString() {
		return "Account: id = " + this.id;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the annualInterstRate
	 */
	public double getAnnualInterstRate() {
		return annualInterstRate;
	}

	/**
	 * @param annualInterstRate the annualInterstRate to set
	 */
	public void setAnnualInterstRate(double annualInterstRate) {
		this.annualInterstRate = annualInterstRate;
	}

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	
}
