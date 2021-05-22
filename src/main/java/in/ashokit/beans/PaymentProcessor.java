package in.ashokit.beans;

public class PaymentProcessor {
	
	private ICardPayment cardPayment;
	
	public PaymentProcessor(ICardPayment cardPayment) {
		System.out.println("payment processor constructor :");
		this.cardPayment = cardPayment;
	}

	/*
	 * public void setCardPayment(ICardPayment cardPayment) { this.cardPayment =
	 * cardPayment; }
	 */
	
	public void doPayment(Double billAmt) {
		boolean payBill = cardPayment.payBill(billAmt);
		
		if(payBill) {
			System.out.println("bill paid");
		}else {
			System.out.println("bill failed");
		}
		 
	}

}
