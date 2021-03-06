package Chapter07Exercise;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
		customers = new Customer[10]; //customer 배열 초기화
	}
	
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer; //customers 배열에 고객정보 저장
		numberOfCustomers++; //고객 수 증가
	
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	

}
