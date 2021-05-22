package in.ashokit.beans;

public class DebitCreditPayment implements ICardPayment {
	
	public DebitCreditPayment() {
		System.out.println("debit card constructor:");
	}

	public boolean payBill(Double billAmt) {
		// TODO Auto-generated method stub
		
		System.out.println("Debit Card amount is : "+billAmt);
		
		return true;
	}

}
