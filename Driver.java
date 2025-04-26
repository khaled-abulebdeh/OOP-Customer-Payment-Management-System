
package java_project;
import java.util.*;
import java.math.*;
public class Driver {

	public static void main(String[] args) {
		ArrayList<CustomerPayment> list= new ArrayList<> ();
		CustomerPayment c1 =new Check("Rana",7777,400,1111,350,Check.PERSONAL); 
		CustomerPayment c2 =new Cash("Ahmad",4444,150,5.0);
		CustomerPayment c3 =new Check("Suha",5555,100,1111,200,Check.CASHIER); 
		CustomerPayment c4 =new Check("Rania",7777,600.0,1111,750,Check.CERTIFIED); 
		CustomerPayment c5 =new CreditCard("Randa",9999,170,20, new Date(124,05,03)); 
		CustomerPayment c6 =new CreditCard("Hani",6666,150,10, new Date(120,06,07));
		
		CustomerPayment [] swapList= {c1,c2,c3,c4,c5,c6};
		
		for (int i=0; i<swapList.length; i++) {
			
			if (swapList[i] instanceof Check) {
				if ( ((Check) swapList[i]).isAuthorized()) 
					list.add(swapList[i]);
			}
			
			else if (swapList[i] instanceof CreditCard) {
				if ( ((CreditCard) swapList[i]).isAuthorized())
					list.add(swapList[i]);
			}
			
			else 
				list.add(swapList[i]);
		}
		
		Collections.sort(list);
		for (int i=0; i<list.size(); i++)
			list.get(i).printPaymentInfo();
	}

}
