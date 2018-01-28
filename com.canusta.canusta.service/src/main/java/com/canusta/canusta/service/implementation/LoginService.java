package com.canusta.canusta.service.implementation;

import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.canusta.canusta.service.contract.ILoginService;
import com.canusta.canusta.service.entity.ApplicationUser;
import com.canusta.canusta.service.persist.LoginRepository;

@Service
@Transactional
public class LoginService implements ILoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public ApplicationUser login(ApplicationUser applicationUser) throws Exception {
		
		ApplicationUser out = loginRepository.findOne(applicationUser.getUserId());
		if(out == null)
			throw new Exception("Invalid User or Password!");
		
		out.setLastLoginTimestamp(new Timestamp(System.currentTimeMillis()));
		em.persist(out);
	
		return out;
	}

}
