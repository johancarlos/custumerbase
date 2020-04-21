package it.xpug.ocp.customerbase;
import java.util.*;


public class CustomerBase extends FindByCreditGreaterThan {
	

	List<Customer> customers = new ArrayList<Customer>();

	public void add(Customer customer) {
		customers.add(customer);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

}
