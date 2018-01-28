package com.canusta.canusta.service.contract.customer;

import java.util.ArrayList;

import com.canusta.canusta.service.entity.Customer;
import com.canusta.canusta.service.entity.ListOptions;

public interface ICustomerService {

	public ArrayList<Customer> list(ListOptions filterListOptions, Customer filter, Customer filterStart,
			Customer filterStop);
	
	public Customer read(Customer customer);
}
