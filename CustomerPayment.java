
package java_project;
import java.util.*;

public abstract class CustomerPayment implements Comparable <CustomerPayment>{
	protected String customerName;
	protected int customerId;
	protected double amount;
	
	public CustomerPayment() {
		this ("Khaled", 111, 1000);
	}
	public CustomerPayment(String customerName, int customerId, double amount) {
		setCustomerName(customerName);
		setCustomerId(customerId);
		setAmount(amount);
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "CustomerPayment [customerName=" + customerName + ", customerId=" + customerId + ", amount=" + amount
				+ "]";
	}
	protected abstract double calculatePayment();
	
	void printPaymentInfo() {
		System.out.println(toString());//it prints the toString of the actual type
		System.out.println("Payment = "+ Math.round(100*calculatePayment())/100.0 );
	}
	
	public int compareTo (CustomerPayment c) {
		if (calculatePayment()>c.calculatePayment())
			return -1;//since the order is from high to low
		else if (calculatePayment()>c.calculatePayment())
			return +1;
		else return 0;
	}
	
}
