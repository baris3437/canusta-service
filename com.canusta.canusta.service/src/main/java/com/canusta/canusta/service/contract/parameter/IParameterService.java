package com.canusta.canusta.service.contract.parameter;

import java.util.ArrayList;

import com.canusta.canusta.service.entity.Parameter;

public interface IParameterService {
	
	public ArrayList<Parameter> listParameterByType(String type);

	public Parameter readParameterByTypeCode(String type, String code);

}
