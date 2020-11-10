package Account;
import java.util.*;

public class Acount {
	
	private String customerId;
	private String customerPw;
	private int balance;
	private String previousTransaction;
	

	private Scanner scan = new Scanner(System.in);
	
	public void userAdd() {
		System.out.println("계정 생성을 시작합니다.");
		System.out.printf("계정: ");
		setCustomerId(scan.nextLine());
		System.out.printf("패스워드: ");
		setCustomerPw(scan.nextLine());
	}

	public int getAddBalance() {
		return balance;
	}

	public void setAddBalance(int balance) {
		this.balance += balance;
	}
	
	public int getSubBalance() {
		return balance;
	}
	
	public void setSubBalance(int balance) {
		this.balance -= balance;
	}
	
	public int balanceSearch() {
		return balance;
	}
		
	public String getPreviousTransaction() {
		return previousTransaction;
	}

	public void setPreviousTransaction(String previousTransaction) {
		this.previousTransaction = previousTransaction;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPw() {
		return customerPw;
	}

	public void setCustomerPw(String customerPw) {
		this.customerPw = customerPw;
	}
}
