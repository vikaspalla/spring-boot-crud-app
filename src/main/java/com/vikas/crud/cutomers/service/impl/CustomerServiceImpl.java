package com.vikas.crud.cutomers.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikas.crud.cutomers.entity.Customer;
import com.vikas.crud.cutomers.repository.CustomerRepository;
import com.vikas.crud.cutomers.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;

	@Override
	public List<Customer> getCustomers() {

//		List<Customer> customers = repo.findAll();
		List<Customer> customers = repo.giveMeCustomers();

		return customers;
	}

	@Override
	public Customer save(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public void delete(int id) {

		 repo.deleteById(id);
	}

	@Override
	public Customer update(Customer customer) {
		int id = customer.getId();
		Optional<Customer> optCustomer = repo.findById(id);
		Customer customer2 = null;
		if(optCustomer.get() != null) {
			customer2 = optCustomer.get();
			customer2.setEmail(customer.getEmail());
			customer2.setName(customer.getName());
		}
		
		return repo.save(customer2);
	}

}
