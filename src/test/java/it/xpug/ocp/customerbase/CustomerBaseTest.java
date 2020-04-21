package it.xpug.ocp.customerbase;

import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;


public class CustomerBaseTest {

	private Customer alice = new Customer("Alice", "Rossi", 10000);
	private Customer bob = new Customer("Bob", "Rossi", 20000);
	private Customer charlie = new Customer("Charlie", "Bianchi", 30000);

	private List<Customer> customers = new ArrayList<Customer>();
	private CustomerBase customerBase = new CustomerBase();
	private final FindByLastName findByLastName = new FindByLastName();
	private final FindFirstAndLastName findByFirstAndLastName = new FindFirstAndLastName();
	private final FindByCreditGreaterThan findByCreditGreaterThan = new FindByCreditGreaterThan();

	@Before
	public void setUp() throws Exception {
		customerBase.add(alice);
		customerBase.add(bob);
		customerBase.add(charlie);
		customers = customerBase.getCustomers();
	}

	@Test
	public void findByLastName() throws Exception {
		List<Customer> found = findByLastName.find(customers,alice);
		assertThat(found, is(asList(alice, bob)));
	}

	@Test
	public void findByFirstAndLastName() throws Exception {
		List<Customer> found = findByFirstAndLastName.find(customers, alice);
		assertThat(found, is(asList(alice)));
	}

	@Test
	public void findWithCreditGreaterThan() throws Exception {
		List<Customer> found = findByCreditGreaterThan.find(customers, bob);
		assertThat(found, is(asList(charlie)));
	}

/*	@Test
	public void findWithCreditLessThan() throws Exception {
		fail("open-closed violation");
		// ...
		// We're sick and tired of adding new methods to CustomerBase.
		// CHALLENGE: can you refactor CustomerBase and its tests
		// so that new kinds of queries can be implemented WITHOUT CHANGING CUSTOMERBASE ???

	}*/


}
