package Chapter11.Exercise.Ex3;

public class CheckingAccount extends Account {
	private double overdraftLimit;
	
	public CheckingAccount(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		// TODO Auto-generated constructor stub
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public double withdraw(double amount) {
		if(this.getBalance() - amount > overdraftLimit) {
			this.setBalance(this.getBalance() - amount);
		}
		return this.getBalance();
	}

	@Override
	public String toString() {
		return "CheckingAccount: id = " + this.getId();
	}
	/**
	 * @return the overdraftLimit
	 */
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	/**
	 * @param overdraftLimit the overdraftLimit to set
	 */
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
}
