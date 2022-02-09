package productpurchase;

public class DebitPayment extends Payment {


	 double debitBalance= 500;
	

	public DebitPayment(String cardNumber, int pinNumber, double amount) {
		super(cardNumber, pinNumber, amount);

	}
	
	
	public void purchaseByDebit() {
		
		if (amount <= debitBalance) {
			System.out.println("The Payment of Amount " + amount + " by the Debit Card is successful");
		} else {
			System.out.println("Payment Declined. Insufficiant Funds");
		}
		
	}
		

}
