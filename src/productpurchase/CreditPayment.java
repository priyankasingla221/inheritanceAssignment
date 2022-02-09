package productpurchase;

public class CreditPayment extends Payment {

	
	double creditLimit=2000;
	

	public CreditPayment(String cardNumber, int pinNumber, double amount) {
		super(cardNumber, pinNumber, amount);

	}
	
	
	
	public void purchaseByCredit() {
		
		if (amount <= creditLimit) {
			System.out.println("The Payment of Amount " + amount + " by the Credit Card is successful");
		} else {
			System.out.println("Payment Declined. Insufficent balance");
		}
		
	}

}
