package com.canusta.canusta.service.implementation.parameter;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canusta.canusta.service.contract.parameter.IParameterService;
import com.canusta.canusta.service.entity.Parameter;
import com.canusta.canusta.service.persist.ParameterRepository;

@Service
public class ParameterService implements IParameterService {
	
	@Autowired
	private ParameterRepository parameterRepository;

	@Override
	public ArrayList<Parameter> listParameterByType(String type) {
		return (ArrayList<Parameter>) parameterRepository.listCParameterByType(type);
	}

	@Override
	public Parameter readParameterByTypeCode(String type, String code) {
		return (Parameter) parameterRepository.readParameterByTypeCode(type, code);
	}
}
