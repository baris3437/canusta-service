package com.canusta.canusta.web.formBean.customer;

import java.util.ArrayList;

import com.canusta.canusta.web.bean.ComboOutputData;
import com.canusta.canusta.web.bean.CustomerBean;
import com.canusta.canusta.web.formBean.MaintainOutputBean;

public class CustomerMaintainOutputBean extends MaintainOutputBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CustomerBean customer;
	
	private ArrayList<ComboOutputData> customerTypeList;
	
	private ArrayList<ComboOutputData> customerStatusList;
	
	private String customerTypeDescr;
	
	private String customerStatusDescr;

	public CustomerBean getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}

	public ArrayList<ComboOutputData> getCustomerTypeList() {
		return customerTypeList;
	}

	public void setCustomerTypeList(ArrayList<ComboOutputData> customerTypeList) {
		this.customerTypeList = customerTypeList;
	}

	public ArrayList<ComboOutputData> getCustomerStatusList() {
		return customerStatusList;
	}

	public void setCustomerStatusList(ArrayList<ComboOutputData> customerStatusList) {
		this.customerStatusList = customerStatusList;
	}

	public String getCustomerTypeDescr() {
		return customerTypeDescr;
	}

	public void setCustomerTypeDescr(String customerTypeDescr) {
		this.customerTypeDescr = customerTypeDescr;
	}

	public String getCustomerStatusDescr() {
		return customerStatusDescr;
	}

	public void setCustomerStatusDescr(String customerStatusDescr) {
		this.customerStatusDescr = customerStatusDescr;
	}
}
