package productpurchase;

public class Payment {
	String userName;
	double amount;
	String cardNumber;
	int pinNumber;

	public Payment(String cardNumber, int pinNumber, double amount) {
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.amount = amount;

	}

	boolean  validateCard(String cardNo, int pin) {
		cardNumber=cardNo;
		pinNumber=pin;
		if (cardNumber.equals("123456789") && (pinNumber == 1234)) {
			System.out.println("Successfully Verified");
			return true;
			
		}
		System.out.println("Verification Failed");
		return false;
		
	}
}
