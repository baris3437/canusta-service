package com.canusta.canusta.web.controller.customer;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.canusta.canusta.service.contract.customer.ICustomerService;
import com.canusta.canusta.service.contract.parameter.IParameterService;
import com.canusta.canusta.service.entity.Customer;
import com.canusta.canusta.service.entity.ListOptions;
import com.canusta.canusta.web.bean.CustomerBean;
import com.canusta.canusta.web.formBean.customer.CustomerExtendedBean;
import com.canusta.canusta.web.formBean.customer.CustomerListInputBean;
import com.canusta.canusta.web.formBean.customer.CustomerListOutputBean;
import com.canusta.canusta.web.mapper.CustomerMapper;
import com.canusta.canusta.web.mapper.ListOptionsMapper;

@Controller
@RequestMapping("/customer")
public class CustomerListController {

	@Autowired
	ICustomerService customerService;
	
	@Autowired
	IParameterService parameterService;

	@RequestMapping(value = "/customerList", method = RequestMethod.GET)
	public ModelAndView handleCustomerListInit(CustomerListInputBean inputBean) throws Exception {

		CustomerListOutputBean outputBean = new CustomerListOutputBean();

		ListOptions filterListOptions = ListOptionsMapper.controllerBeanToServiceBean(inputBean.getFilterListOption());
		Customer filter = CustomerMapper.controllerBeanToServiceBean(inputBean.getFilter());
		Customer filterStart = CustomerMapper.controllerBeanToServiceBean(inputBean.getFilterStart());
		Customer filterStop = CustomerMapper.controllerBeanToServiceBean(inputBean.getFilterStop());

		ArrayList<Customer> outList = customerService.list(filterListOptions, filter, filterStart, filterStop);

		outputBean.setCustomerList(new ArrayList<CustomerExtendedBean>());
		for (Customer customer : outList) {
			CustomerBean _customerBean = CustomerMapper.serviceBeanToControllerBean(customer);

			CustomerExtendedBean _dummy = new CustomerExtendedBean();
			_dummy.setCreateUserId(_customerBean.getCreateUserId());
			_dummy.setCustomerId(_customerBean.getCustomerId());
			_dummy.setCustomerType(_customerBean.getCustomerType());
			_dummy.setInstanceId(_customerBean.getInstanceId());
			_dummy.setMernisNum(_customerBean.getMernisNum());
			_dummy.setReferenceId(_customerBean.getReferenceId());
			_dummy.setStatus(_customerBean.getStatus());
			_dummy.setTaxNum(_customerBean.getTaxNum());
			_dummy.setTitleText(_customerBean.getTitleText());
			_dummy.setUpdateUserId(_customerBean.getUpdateUserId());
			
			_dummy.setCustomerTypeDescr(parameterService.readParameterByTypeCode("CUST_TYPE", _customerBean.getCustomerType()).getDatavalue());
			_dummy.setStatusDescr(parameterService.readParameterByTypeCode("CUST_STATUS", _customerBean.getStatus()).getDatavalue());
			
			outputBean.getCustomerList().add(_dummy);
		}

		ModelAndView model = new ModelAndView("/customer/customerList", "out", outputBean);

		return model;
	}

	@RequestMapping(value = "/customerList", method = RequestMethod.POST)
	public @ResponseBody CustomerListOutputBean handleCustomerList(CustomerListInputBean inputBean) throws Exception {
		CustomerListOutputBean outputBean = new CustomerListOutputBean();

		ListOptions filterListOptions = ListOptionsMapper.controllerBeanToServiceBean(inputBean.getFilterListOption());
		Customer filter = CustomerMapper.controllerBeanToServiceBean(inputBean.getFilter());
		Customer filterStart = CustomerMapper.controllerBeanToServiceBean(inputBean.getFilterStart());
		Customer filterStop = CustomerMapper.controllerBeanToServiceBean(inputBean.getFilterStop());

		ArrayList<Customer> outList = customerService.list(filterListOptions, filter, filterStart, filterStop);

		outputBean.setCustomerList(new ArrayList<CustomerExtendedBean>());
		for (Customer customer : outList) {
			CustomerBean _customerBean = CustomerMapper.serviceBeanToControllerBean(customer);

			outputBean.getCustomerList().add((CustomerExtendedBean) _customerBean);
		}

		return outputBean;
	}
}
