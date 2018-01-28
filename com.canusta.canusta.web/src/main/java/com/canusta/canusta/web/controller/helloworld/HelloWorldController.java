package com.canusta.canusta.web.controller.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.canusta.canusta.service.contract.helloworld.IHelloWorldService;
import com.canusta.canusta.web.bean.helloworld.HelloWorldInputBean;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController{
	
	@Autowired
	private IHelloWorldService helloWorldService;

	@RequestMapping("/helloworld")
	public ModelAndView handleRequestHelloWorld(HelloWorldInputBean helloWorldBean) throws Exception {

		ModelAndView model = new ModelAndView("/helloworld/helloworld");
		model.addObject("msg", helloWorldService.getHelloWorldString());

		return model;
	}
}