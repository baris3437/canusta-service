package com.canusta.canusta.web.formBean.customer;

import java.io.Serializable;
import java.util.ArrayList;

public class CustomerListOutputBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<CustomerExtendedBean> customerList;

	public ArrayList<CustomerExtendedBean> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<CustomerExtendedBean> customerList) {
		this.customerList = customerList;
	}

}
