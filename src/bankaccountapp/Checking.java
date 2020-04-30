package bankaccountapp;

public class Checking extends Account {

	private int debitCardNumber;
	private int debitCardPin;

	public Checking(String name, String socialSecurityNumber, double initDeposit) {
		super(name,socialSecurityNumber ,initDeposit);
		System.out.println("New Checking Account");
	}

}
