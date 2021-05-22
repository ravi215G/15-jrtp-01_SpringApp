package in.ashokit.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) {
		
		
		Resource r=new ClassPathResource("Beans.xml");  
        BeanFactory factory=new XmlBeanFactory(r);
		
		 
		PaymentProcessor bean = factory.getBean("paymentProcessor",PaymentProcessor.class);
		bean.doPayment(120.00);

	System.out.println("added code from local");
		 
		
	}
	
}
