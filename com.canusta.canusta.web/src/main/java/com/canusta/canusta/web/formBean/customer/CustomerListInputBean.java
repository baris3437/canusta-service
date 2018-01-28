package com.canusta.canusta.web.formBean.customer;

import java.io.Serializable;

import com.canusta.canusta.web.bean.CustomerBean;
import com.canusta.canusta.web.bean.ListOptionsBean;

public class CustomerListInputBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ListOptionsBean filterListOption;
	
	private CustomerBean filter;
	
	private CustomerBean from;
	
	private CustomerBean filterStart;
	
	private CustomerBean filterStop;

	public ListOptionsBean getFilterListOption() {
		return filterListOption;
	}

	public void setFilterListOption(ListOptionsBean filterListOption) {
		this.filterListOption = filterListOption;
	}

	public CustomerBean getFilter() {
		return filter;
	}

	public void setFilter(CustomerBean filter) {
		this.filter = filter;
	}

	public CustomerBean getFrom() {
		return from;
	}

	public void setFrom(CustomerBean from) {
		this.from = from;
	}

	public CustomerBean getFilterStart() {
		return filterStart;
	}

	public void setFilterStart(CustomerBean filterStart) {
		this.filterStart = filterStart;
	}

	public CustomerBean getFilterStop() {
		return filterStop;
	}

	public void setFilterStop(CustomerBean filterStop) {
		this.filterStop = filterStop;
	}
}
