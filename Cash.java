

package java_project;
import java.util.*;
public class  Cash extends CustomerPayment {
	private double discountRate;
	public Cash() {
		this ("Khaled", 111, 1000, 200);
	}
	public Cash(String customerName, int customerId, double amount, double discountRate) {
		super(customerName, customerId, amount);
		setDiscountRate(discountRate);
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public  double calculatePayment() {
		return super.amount - (discountRate/100.0)*amount;
	}
	@Override
	public String toString() {
		return "Cash [discountRate=" + discountRate + ", customerName=" + customerName + ", customerId=" + customerId
				+ ", amount=" + amount + "]";
	}
	
	
}
