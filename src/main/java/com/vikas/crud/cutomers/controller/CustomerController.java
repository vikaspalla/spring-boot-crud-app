package com.vikas.crud.cutomers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vikas.crud.cutomers.entity.Customer;
import com.vikas.crud.cutomers.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping("/customers")
	public List<Customer> getCustomers() {

		List<Customer> customers = service.getCustomers();
		return customers;
	}
	
	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return service.save(customer);
	}
	
	@DeleteMapping("/customers/{id}")
	public String delete(@PathVariable("id") int id) {
		
		service.delete(id);
		return "Deleted Succesfully..";
		
	}
	
	@PutMapping("/customers")
	public Customer update(@RequestBody Customer customer) {
		
		return service.update(customer);
	}
}

