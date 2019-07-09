package Chapter11.Exercise.Ex3;

public class Main {
	public static void main(String[] args) {
		Account account = new Account(0, 10000);
		CheckingAccount cAccount = new CheckingAccount(1, 20000, -30000);
		SavingsAccount sAccount = new SavingsAccount();
	}
}
