package com.canusta.canusta.service.persist;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.canusta.canusta.service.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	@Query("SELECT C FROM Customer C WHERE C.titleText LIKE :titleText AND C.status LIKE :status AND C.customerType LIKE :customerType ORDER BY C.customerId ASC")
	public List<Customer> listCustomerByTitleText(@Param("titleText") String titleText, @Param("status") String status,
			@Param("customerType") String customerType);

	@Query("SELECT C FROM Customer C WHERE C.taxNum =:taxNum AND C.status LIKE :status AND C.customerType LIKE :customerType ORDER BY C.customerId ASC")
	public List<Customer> listCustomerByTaxNum(@Param("taxNum") Integer taxNum, @Param("status") String status,
			@Param("customerType") String customerType);

	@Query("SELECT C FROM Customer C WHERE C.mernisNum =:mernisNum AND C.status LIKE :status AND C.customerType LIKE :customerType ORDER BY C.customerId ASC")
	public List<Customer> listCustomerByMernisNum(@Param("mernisNum") Integer mernisNum, @Param("status") String status,
			@Param("customerType") String customerType);
	
	@Query("SELECT C FROM Customer C WHERE C.status LIKE :status AND C.customerType LIKE :customerType ORDER BY C.customerId ASC")
	public List<Customer> listCustomerAll(@Param("status") String status, @Param("customerType") String customerType);
	
	@Query("SELECT C FROM Customer C WHERE C.customerId = :customerId")
	public Customer readCustomer(@Param("customerId") Integer customerId);

}
