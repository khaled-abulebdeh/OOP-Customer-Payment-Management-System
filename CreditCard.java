

package java_project;
import java.util.*;
public class CreditCard extends CustomerPayment implements Payable{
	private double chargingFee;
	private Date expiryDate;
	public CreditCard() {
		this ("Khaled", 111, 1000, 200, new Date ());
	}
	public CreditCard(String customerName, int customerId, double amount, double chargingFee, Date expiryDate) {
		super(customerName, customerId, amount);
		setChargingFee(chargingFee);
		setExpiryDate(expiryDate);
	}
	public double getChargingFee() {
		return chargingFee;
	}
	public void setChargingFee(double chargingFee) {
		this.chargingFee = chargingFee;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "CreditCard [chargingFee=" + chargingFee + ", expiryDate=" + expiryDate + ", customerName="
				+ customerName + ", customerId=" + customerId + ", amount=" + amount + "]";
	}
	public  double calculatePayment() {
		return super.amount+chargingFee;
	}
	public boolean isAuthorized() {
		if (new Date ().before(expiryDate) ||expiryDate.equals(new Date ()))
			return true;
		else return false;
	}
	

}
