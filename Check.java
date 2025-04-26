
package java_project;
import java.util.*;

public class Check extends CustomerPayment implements Payable {
	final static int  CASHIER=1;
	final static int  CERTIFIED=2;
	final static int  PERSONAL=3;
	private int accountNumber;
	private double accountBalance;
	private int type;
	public Check() {
		this ("Khaled", 111, 1000, 4002, 2000,CASHIER);
	}
	public Check(String customerName, int customerId, double amount, int accountNumber, double accountBalance,
			int type) {
		super(customerName, customerId, amount);
		setAccountNumber(accountNumber);
		setAccountBalance(accountBalance);
		setType(type);
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	//??
	public void deductAmountFromBalance() {
		accountBalance-= amount;
	}
	public  double calculatePayment() {
		return super.amount;
	}
	@Override
	public String toString() {
		return "Check [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", type=" + type
				+ ", customerName=" + customerName + ", customerId=" + customerId + ", amount=" + amount + "]";
	}
	public boolean isAuthorized() {
		if (type==CASHIER || super.amount <= accountBalance) {
			
			if ( type==PERSONAL || type==CERTIFIED){//we must not deduct from CASHEIR 
				deductAmountFromBalance();
			}
			return true;//it is Authorized 
		}
		else 
			return false;
	}
	
	
	

}
