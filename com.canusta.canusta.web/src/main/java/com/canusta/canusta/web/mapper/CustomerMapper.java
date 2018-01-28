package com.canusta.canusta.web.mapper;

import com.canusta.canusta.service.entity.Customer;
import com.canusta.canusta.web.bean.CustomerBean;

public class CustomerMapper {
	public static Customer controllerBeanToServiceBean(CustomerBean input) {
		Customer out = new Customer();

		if (input != null) {
			out.setCreateUserId(input.getCreateUserId());
			out.setCustomerId(input.getCustomerId());
			out.setCustomerType(input.getCustomerType());
			out.setInstanceId(input.getInstanceId());
			out.setMernisNum(input.getMernisNum());
			out.setReferenceId(input.getReferenceId());
			out.setStatus(input.getStatus());
			out.setTaxNum(input.getTaxNum());
			out.setTitleText(input.getTitleText());
			out.setUpdateUserId(input.getUpdateUserId());
		}

		return out;
	}

	public static CustomerBean serviceBeanToControllerBean(Customer input) {
		CustomerBean out = new CustomerBean();

		out.setCreateUserId(input.getCreateUserId());
		out.setCustomerId(input.getCustomerId());
		out.setCustomerType(input.getCustomerType());
		out.setInstanceId(input.getInstanceId());
		out.setMernisNum(input.getMernisNum());
		out.setReferenceId(input.getReferenceId());
		out.setStatus(input.getStatus());
		out.setTaxNum(input.getTaxNum());
		out.setTitleText(input.getTitleText());
		out.setUpdateUserId(input.getUpdateUserId());

		return out;
	}
}
