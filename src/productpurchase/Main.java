package productpurchase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Payment payment = new Payment(null, 0, 0,null);

		System.out.println("Apple watch : 529$" + "\n" + "Apple Airpod : 209$ " + "\n" + "Apple ipad : 1000$");
		System.out.println("Please Enter amount for Product:");
		payment.amount = sc.nextDouble();
		if (payment.amount == 529 || payment.amount == 209 || payment.amount == 1000) {

			System.out.println("Please Select Payment Method" + "\n " + "Debit or Visa");
			String userSelection = sc.next();
			System.out.println("Enter Card Number");
			payment.cardNumber = sc.next();
			System.out.println("Enter 4 Digit PIN ");
			payment.pinNumber = sc.nextInt();

			if(payment.validateCard(payment.cardNumber, payment.pinNumber)){
				if (userSelection.equals("Debit") || userSelection.equals("debit")) {
					DebitPayment debitpayment = new DebitPayment(payment.cardNumber, payment.pinNumber, payment.amount,payment.recieptEntry);
					debitpayment.purchaseByDebit();
					debitpayment.calculatebalance();
					System.out.println("Would you like Paper Reciept for your Debit Purchase?");
					debitpayment.recieptEntry = sc.next();
					debitpayment.recieptRequested(debitpayment.recieptEntry);
					debitpayment.printDebitReciept();
				} else if (userSelection.equals("Visa")|| userSelection.equals("visa")) {
					CreditPayment creditpayment = new CreditPayment(payment.cardNumber, payment.pinNumber, payment.amount, payment.recieptEntry);
					creditpayment.purchaseByCredit();
					creditpayment.calculatelimit();
					System.out.println("Would you like Paper Reciept for your Credit Purchase?");
					creditpayment.recieptEntry = sc.next();
					creditpayment.recieptRequested(creditpayment.recieptEntry);
					creditpayment.printCreditReciept();
				}
				else {
					System.out.println("Invalid payment method selected");
				}
				
				//System.out.println("Would you like reciept?");
				//payment.recieptEntry = sc.next();
				//payment.recieptRequested(payment.recieptEntry);
				
			}

		} else {
			System.out.println("oops! Please Select Valid Product Price");
		}
	}

}
