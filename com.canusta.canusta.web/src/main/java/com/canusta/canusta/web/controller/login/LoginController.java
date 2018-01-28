package com.canusta.canusta.web.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.canusta.canusta.service.contract.ILoginService;
import com.canusta.canusta.service.entity.ApplicationUser;
import com.canusta.canusta.web.bean.ApplicationUserBean;
import com.canusta.canusta.web.mapper.LoginMapper;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView handleRequestLoginLoad(ApplicationUserBean applicationUserBean) throws Exception {

		ModelAndView model = new ModelAndView("/login/login");

		return model;
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public @ResponseBody ApplicationUserBean handleRequestLoginLogin(ApplicationUserBean applicationUserBean)
			throws Exception {
		
		ApplicationUser applicationUser = LoginMapper.controllerBeanToServiceBean(applicationUserBean);
		applicationUser = loginService.login(applicationUser);
		
		applicationUserBean = LoginMapper.serviceBeanToControllerBean(applicationUser);

		return applicationUserBean;
	}
}
