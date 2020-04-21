package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class FindByCreditGreaterThan extends FindFirstAndLastName {

	public FindByCreditGreaterThan() {
		super();
	}

	public List<Customer> find(final List<Customer> customers, final Customer customerToSearch) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.credit() > customerToSearch.credit()) {
				result.add(customer);
			}
		}
		return result;
	}

}