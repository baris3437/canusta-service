package com.canusta.canusta.service.persist;

import org.springframework.data.repository.CrudRepository;

import com.canusta.canusta.service.entity.ApplicationUser;

public interface LoginRepository extends CrudRepository<ApplicationUser, String> {

}
