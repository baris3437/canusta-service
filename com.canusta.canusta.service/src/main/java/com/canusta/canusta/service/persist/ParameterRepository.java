package com.canusta.canusta.service.persist;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.canusta.canusta.service.entity.Parameter;

public interface ParameterRepository extends CrudRepository<Parameter, String> {

	@Query("SELECT C FROM Parameter C WHERE C.type = :type")
	public List<Parameter> listCParameterByType(@Param("type") String type);

	@Query("SELECT C FROM Parameter C WHERE C.type =:type AND C.code = :code")
	public Parameter readParameterByTypeCode(@Param("type") String type, @Param("code") String code);
}
