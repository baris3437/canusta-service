package com.canusta.canusta.service.implementation.helloworld;

import org.springframework.stereotype.Service;

import com.canusta.canusta.service.contract.helloworld.IHelloWorldService;

@Service
public class HelloWorldService implements IHelloWorldService {

	@Override
	public String getHelloWorldString() {
		return "Hello World";
	}

}
