package com.canusta.canusta.web.controller.customer;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.canusta.canusta.service.contract.customer.ICustomerService;
import com.canusta.canusta.service.contract.parameter.IParameterService;
import com.canusta.canusta.service.entity.Customer;
import com.canusta.canusta.service.entity.Parameter;
import com.canusta.canusta.web.bean.ComboOutputData;
import com.canusta.canusta.web.bean.CustomerBean;
import com.canusta.canusta.web.formBean.customer.CustomerMaintainInputBean;
import com.canusta.canusta.web.formBean.customer.CustomerMaintainOutputBean;
import com.canusta.canusta.web.mapper.CustomerMapper;

@Controller
@RequestMapping("/customer")
public class CustomerMaintainController {

	@Autowired
	ICustomerService customerService;

	@Autowired
	IParameterService parameterService;

	@RequestMapping(value = "/customerMaintain", method = RequestMethod.GET)
	public ModelAndView handleCustomerMaintainListInit(CustomerMaintainInputBean inputBean) throws Exception {

		CustomerMaintainOutputBean outputBean = new CustomerMaintainOutputBean();
		
		if(inputBean != null && inputBean.getCustomer() != null && inputBean.getCustomer().getCustomerId() > 0) {
			Customer customer = CustomerMapper.controllerBeanToServiceBean(inputBean.getCustomer());
			customer = customerService.read(customer);
			outputBean.setCustomer(CustomerMapper.serviceBeanToControllerBean(customer));
			
			outputBean.setProtectKeyFlag(true);
		}else {
			outputBean.setCustomer(new CustomerBean());
			
			outputBean.setProtectKeyFlag(false);
		}		

		ArrayList<Parameter> params = parameterService.listParameterByType("CUST_TYPE");

		outputBean.setCustomerTypeList(new ArrayList<ComboOutputData>());
		for (Parameter parameter : params) {
			ComboOutputData _combo = new ComboOutputData();
			_combo.setDisplayValue(parameter.getCode());
			_combo.setDisplayName(parameter.getDatavalue());
			
			if(outputBean.getCustomer().getCustomerType() != null && outputBean.getCustomer().getCustomerType().equals(parameter.getCode())) {
				outputBean.setCustomerTypeDescr(parameter.getDatavalue());
			}

			outputBean.getCustomerTypeList().add(_combo);
		}

		params = parameterService.listParameterByType("CUST_STATUS");

		outputBean.setCustomerStatusList(new ArrayList<ComboOutputData>());
		for (Parameter parameter : params) {
			ComboOutputData _combo = new ComboOutputData();
			_combo.setDisplayValue(parameter.getCode());
			_combo.setDisplayName(parameter.getDatavalue());
			
			if(outputBean.getCustomer().getStatus() != null && outputBean.getCustomer().getStatus().equals(parameter.getCode())) {
				outputBean.setCustomerStatusDescr(parameter.getDatavalue());
			}

			outputBean.getCustomerStatusList().add(_combo);
		}
		
		if(inputBean.getClientCommand() != null && inputBean.getClientCommand().equals("DETAIL"))
			outputBean.setProtectAllFlag(true);
		else
			outputBean.setProtectAllFlag(false);

		ModelAndView model = new ModelAndView("/customer/customerMaintain", "out", outputBean);
		model.addObject("input", inputBean);
				
		return model;
	}
}
