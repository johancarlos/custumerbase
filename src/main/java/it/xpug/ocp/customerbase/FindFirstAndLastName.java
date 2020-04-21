package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastName {

	public FindFirstAndLastName() {
		super();
	}

	public 	List<Customer> find(final List<Customer> customers, final Customer customerToSearch){
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.firstName().equals(customerToSearch.firstName()) && customer.lastName().equals(customerToSearch.lastName()) ) {
				result.add(customer);
			}
		}
		return result;
	}

}