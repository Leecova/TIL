package Chapter07Exercise;

public class Bank {
	public Customer[] customers;
	public int numberOfCustomers;
	
	public Bank() {
		customers = new Customer[10];
	}
	
	public void addCustomer(Customer customer) {
		
	}

	public Customer[] getCustomers(int index) {
		return customers;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	

}
