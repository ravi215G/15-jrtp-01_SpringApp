package in.ashokit.beans;

public class CreditCardPayment implements ICardPayment {
	
	
	
	public CreditCardPayment() {
		System.out.println("credit card constructor:");
	}

	public boolean payBill(Double billAmt) {
		// TODO Auto-generated method stub
		
		System.out.println("Credit Card amount is : "+billAmt);
		return true;
	}

}
