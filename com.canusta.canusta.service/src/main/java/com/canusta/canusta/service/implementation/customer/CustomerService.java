package com.canusta.canusta.service.implementation.customer;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.canusta.canusta.service.contract.customer.ICustomerService;
import com.canusta.canusta.service.entity.Customer;
import com.canusta.canusta.service.entity.ListOptions;
import com.canusta.canusta.service.persist.CustomerRepository;

@Service
@Transactional
public class CustomerService implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@PersistenceContext
	private EntityManager em;

	@Override
	public ArrayList<Customer> list(ListOptions filterListOptions, Customer filter, Customer filterStart,
			Customer filterStop) {

		filter.setStatus(filter.getStatus() == null || filter.getStatus().isEmpty() ? "%" : filter.getStatus());
		filter.setCustomerType(filter.getCustomerType() == null || filter.getCustomerType().isEmpty() ? "%"
				: filter.getCustomerType());
		filterListOptions.setSortOption(
				filterListOptions.getSortOption() == null || filterListOptions.getSortOption().isEmpty() ? "ASC"
						: filterListOptions.getSortOption());

		ArrayList<Customer> outList = new ArrayList<>();

		if (filter.getTitleText() != null && !filter.getTitleText().isEmpty())
			outList = (ArrayList<Customer>) customerRepository.listCustomerByTitleText(filter.getTitleText(),
					filter.getStatus(), filter.getCustomerType());
		else if (filter.getTaxNum() != null && filter.getTaxNum() > 0)
			outList = (ArrayList<Customer>) customerRepository.listCustomerByTaxNum(filter.getTaxNum(),
					filter.getStatus(), filter.getCustomerType());
		else if (filter.getMernisNum() != null && filter.getMernisNum() > 0)
			outList = (ArrayList<Customer>) customerRepository.listCustomerByMernisNum(filter.getMernisNum(),
					filter.getStatus(), filter.getCustomerType());
		else
			outList = (ArrayList<Customer>) customerRepository.listCustomerAll(filter.getStatus(),
					filter.getCustomerType());

		return outList;
	}

	@Override
	public Customer read(Customer customer) {	
		return customerRepository.readCustomer(customer.getCustomerId());
	}	

}
