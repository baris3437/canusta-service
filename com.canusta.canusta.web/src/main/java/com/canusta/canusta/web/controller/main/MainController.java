package com.canusta.canusta.web.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.canusta.canusta.web.bean.ApplicationUserBean;

@Controller
@RequestMapping("/main")
public class MainController {
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView handleRequestLoginLoad(ApplicationUserBean applicationUserBean) throws Exception {

		ModelAndView model = new ModelAndView("/main/dashboard");

		return model;
	}
}
