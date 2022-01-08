package com.vikas.crud.cutomers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vikas.crud.cutomers.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query(value = "select * from customers", nativeQuery = true)
	List<Customer> giveMeCustomers();
}
