package it.xpug.ocp.customerbase;
import java.util.*;


public class CustomerBase extends FindFirstAndLastName {
	

	List<Customer> customers = new ArrayList<Customer>();

	public void add(Customer customer) {
		customers.add(customer);
	}

	public List<Customer> findByCreditGreaterThan(int credit) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.credit() > credit) {
				result.add(customer);
			}
		}
		return result;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

}
