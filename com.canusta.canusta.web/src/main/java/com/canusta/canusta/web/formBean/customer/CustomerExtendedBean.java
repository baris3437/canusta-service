package com.canusta.canusta.web.formBean.customer;

import com.canusta.canusta.web.bean.CustomerBean;

public class CustomerExtendedBean extends CustomerBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String statusDescr;
	
	private String customerTypeDescr;

	public String getStatusDescr() {
		return statusDescr;
	}

	public void setStatusDescr(String statusDescr) {
		this.statusDescr = statusDescr;
	}

	public String getCustomerTypeDescr() {
		return customerTypeDescr;
	}

	public void setCustomerTypeDescr(String customerTypeDescr) {
		this.customerTypeDescr = customerTypeDescr;
	}
}
