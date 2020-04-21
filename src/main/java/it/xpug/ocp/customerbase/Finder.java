package it.xpug.ocp.customerbase;

import java.util.List;

public interface Finder {
	List<Customer> find(final List<Customer> customers, final Customer customerToSearch);
}
