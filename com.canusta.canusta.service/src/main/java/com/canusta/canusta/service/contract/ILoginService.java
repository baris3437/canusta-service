package com.canusta.canusta.service.contract;

import com.canusta.canusta.service.entity.ApplicationUser;

public interface ILoginService {
	public ApplicationUser login(ApplicationUser applicationUser) throws Exception;
}
