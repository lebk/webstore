package com.lebk.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lebk.webstore.domain.Customer;
import com.lebk.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	private List<Customer> listOfCustomer = new ArrayList<Customer>();

	public InMemoryCustomerRepository() {
		Customer customer1 = new Customer("1", "terry lei 1", "chengdu 1", "12");
		Customer customer2 = new Customer("2", "terry lei 2", "chengdu 2", "13");
		Customer customer3 = new Customer("3", "terry lei 3", "chengdu 3", "14");

		listOfCustomer.add(customer1);
		listOfCustomer.add(customer2);
		listOfCustomer.add(customer3);

	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return listOfCustomer;
	}

}
