package productpurchase;

public class DebitPayment extends Payment {

	double debitBalance = 500;

	public DebitPayment(String cardNumber, int pinNumber, double amount, String recieptEntry) {
		super(cardNumber, pinNumber, amount, recieptEntry);

	}

	public void purchaseByDebit() {

		if (amount <= debitBalance) {
			System.out.println("The Payment of Amount " + amount + " by the Debit Card is successful");
		} else {
			System.out.println("Payment Declined. Insufficiant Funds");
		}

	}

	double calculatebalance() {
		debitBalance = debitBalance - amount;
		System.out.println("Remaining Debit limit:" + debitBalance);
		return debitBalance;

	}

	public void printDebitReciept() {
		if(debitBalance>0) {
		System.out.println("*******PURCHASE SCCESSFULL FOR " + amount + "$***********" + "\n" + "****Your remaing Balance is: " +debitBalance+"****");
		}
		else
		{
			System.out.println("*******PURCHASE UNSCCESSFULL FOR " + amount + "$***********");
		}
		}

}
