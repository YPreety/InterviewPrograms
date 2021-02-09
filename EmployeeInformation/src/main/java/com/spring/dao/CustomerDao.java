package com.spring.dao;

import com.spring.beans.Customer;

public interface CustomerDao {

	public void saveCustomer(Customer customer);

	public Customer loginCustomer(Customer customer);
}
