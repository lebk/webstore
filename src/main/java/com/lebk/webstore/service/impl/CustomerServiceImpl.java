package com.lebk.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lebk.webstore.domain.Customer;
import com.lebk.webstore.domain.repository.CustomerRepository;
import com.lebk.webstore.domain.repository.ProductRepository;
import com.lebk.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}

}
