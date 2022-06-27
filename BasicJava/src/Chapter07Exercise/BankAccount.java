package Chapter07Exercise;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance; //벨런스 초기화
	}

	public int getBalance() { //현재 계좌 잔액
		return balance;
	}
	
	public void deposit(int amount) { //입금 메소드
		balance +=amount; // 잔고에 금액을 입금
	}
	
	public boolean withdraw(int amount) { //출금 메소드
		if(balance >= amount) {
			balance -= amount; // 잔고에서 출금액 만큼 출금
			return true;
		} else {
			return false;
		}
	
	}

	public boolean transfer(int amount, BankAccount otherAccount) { 
		//현재 계좌에서 amount 만큼 다른 계좌로 송금하는 메소드
		if (withdraw(amount) == true) {
			otherAccount.deposit(amount);
			return true;
			
		}else {
			return false;
		}
		
	}

}
