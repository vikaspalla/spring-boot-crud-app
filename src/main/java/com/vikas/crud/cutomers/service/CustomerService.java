package com.vikas.crud.cutomers.service;

import java.util.List;

import com.vikas.crud.cutomers.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public Customer save(Customer customer);

	public void delete(int id);

	public Customer update(Customer customer);
}
