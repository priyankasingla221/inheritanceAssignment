package productpurchase;

public class Payment {
	String userName;
	double amount;
	String cardNumber;
	int pinNumber;
	String recieptEntry;

	public Payment(String cardNumber, int pinNumber, double amount, String recieptEntry) {
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.amount = amount;
		this.recieptEntry= recieptEntry;

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
	
	String recieptRequested(String userEntry) {
		recieptEntry = userEntry;
		if (recieptEntry.equals("yes")) {
			System.out.println("Here it is. Have a Good Day!");
			return "";
		}
		else {
			System.out.println("Thank you for Shopping");
			return "";
			
		}
	}
}
