package com.canusta.canusta.web.formBean.customer;

import java.io.Serializable;

import com.canusta.canusta.web.bean.CustomerBean;

public class CustomerMaintainInputBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CustomerBean customer;
	
	private String clientCommand;
	
	private String serverCommand;

	public CustomerBean getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}

	public String getClientCommand() {
		return clientCommand;
	}

	public void setClientCommand(String clientCommand) {
		this.clientCommand = clientCommand;
	}

	public String getServerCommand() {
		return serverCommand;
	}

	public void setServerCommand(String serverCommand) {
		this.serverCommand = serverCommand;
	}
}
