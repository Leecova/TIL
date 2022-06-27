package Chapter07Exercise;

import java.text.DecimalFormat;

public class Customer {
	//필드
	
	private String firstName;
	private String lastName;
	private BankAccount account;
	
	//숫자에 세자리마다 ,를 찍어주기 위한 함수, 출력은 String이다.
	DecimalFormat formatter = new DecimalFormat("###,###");
	
	//생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//메소드

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return String.format("이름:%s, %s, 잔고: %s", firstName, lastName, formatter.format(account.getBalance()));
	}

}
