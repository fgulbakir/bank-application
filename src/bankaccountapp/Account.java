package bankaccountapp;

public abstract class Account {

	private String accountName;
	private String accountNumber;
	private String socialSecurityNumber;
	private double balance;
	private double rate;
	private static int index = 1000;

	public Account(String name, String socialSecurityNumber, double initDeposit) {

		this.accountName = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.balance = initDeposit;
		System.out.println("AccountName :" + this.accountName + " " + "SSNumber:" + this.socialSecurityNumber + " "
				+ "Balance:€" + this.balance);

		index++;
		this.accountNumber = setAccountNumber();
		System.out.println("Account Number :" + this.accountNumber);
	}

	private String setAccountNumber() {

		String firstTwoOfssn = socialSecurityNumber.substring(0, 2);
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));

		return firstTwoOfssn + index + randomNumber;
	}

}
