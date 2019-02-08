package Interface;

public class B2_Developing implements B1_BankingClient, B3_DomainClient
// Now this class is responsible for all the methods of the banking client interface
// Interface will have methods but without body
// by default all the methods in the interface are public
{
	public static void main(String[] args) {
		B2_Developing bank = new B2_Developing();
		// Call all the methods of developing class
		bank.paycredtiCard();
		bank.transferbalance();
		bank.checkingbalance();
		bank.loanbalance();

		B1_BankingClient bank1 = new B2_Developing();
		// object of developing class and is responsible of call the methods of banking client interface
		// Means it can use only the methods of banking client only.
		// bank1.loanbalance();
		bank1.paycredtiCard();
		bank1.transferbalance();
		bank1.checkingbalance();

		B3_DomainClient bank3 = new B2_Developing();
		bank3.investment();

	}

	@Override
	public void paycredtiCard() {
		System.out.println("Pay credit card implemented");

	}

	@Override
	public void transferbalance() {

		System.out.println("Transferable balance implemented");
	}

	@Override
	public void checkingbalance() {

		System.out.println("Checking balance implemented");

	}

	public void loanbalance() {
		System.out.println("laon balance implemented");
	}

	@Override
	public void investment() {
		System.out.println("Investing implemented");

	}

}
