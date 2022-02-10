package productpurchase;

public class CreditPayment extends Payment {

	double creditLimit = 2000;

	public CreditPayment(String cardNumber, int pinNumber, double amount, String recieptEntry) {
		super(cardNumber, pinNumber, amount, recieptEntry);

	}

	public void purchaseByCredit() {

		if (amount <= creditLimit) {
			System.out.println("The Payment of Amount " + amount + " by the Credit Card is successful");
		} else {
			System.out.println("Payment Declined. Insufficent balance");
		}
	}

	double calculatelimit() {
		creditLimit = creditLimit - amount;
		System.out.println("Remaining Credit limit:" + creditLimit);
		return creditLimit;

	}
	public void printCreditReciept() {
		if(creditLimit>0) {
		System.out.println("*********PURCHASE SCCESSFUL FOR " +amount+"$************" +"\n"+ "****Your remaing Limit is: " +creditLimit+"****");
		}
		else {
			System.out.println("*******PURCHASE UNSCCESSFULL FOR " + amount + "$***********");
		}
			
		}

}
