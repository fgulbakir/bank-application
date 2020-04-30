package bankaccountapp;

public class Savings extends Account {

	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	public Savings(String name,String socialSecurityNumber, double initDeposit) {
		super(name,socialSecurityNumber,initDeposit);
		System.out.println("New Savings Account");
		
	}

	
	
}
