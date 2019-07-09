package Chapter11.Exercise.Ex3;

public class SavingsAccount extends Account {
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public double withdraw(double amount) {
		if(this.getBalance() - amount >= 0) {
			this.setBalance(this.getBalance() + amount);
		}
		
		return this.getBalance();
	}
	
	@Override
	public String toString() {
		return "SavingAccount: id = " + this.getId();
	}
}
