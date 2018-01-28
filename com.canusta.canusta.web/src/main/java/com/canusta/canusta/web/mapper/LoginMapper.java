package com.canusta.canusta.web.mapper;

import com.canusta.canusta.service.entity.ApplicationUser;
import com.canusta.canusta.web.bean.ApplicationUserBean;

public class LoginMapper {
	public static ApplicationUser controllerBeanToServiceBean(ApplicationUserBean input) {
		ApplicationUser out = new ApplicationUser(input.getUserId());

		out.setCreateUserId(input.getCreateUserId());
		out.setInstanceId(input.getInstanceId());
		out.setLastLoginTimestamp(input.getLastLoginTimestamp());
		out.setPasswordHash(input.getPassword());
		out.setReferenceId(input.getReferenceId());
		out.setUpdateUserId(input.getUpdateUserId());
		out.setUserName(input.getUserName());
		out.setUserSurname(input.getUserSurname());
		
		return out;
	}

	public static ApplicationUserBean serviceBeanToControllerBean(ApplicationUser input) {
		ApplicationUserBean out = new ApplicationUserBean();
		
		out.setCreateUserId(input.getCreateUserId());
		out.setInstanceId(input.getInstanceId());
		out.setLastLoginTimestamp(input.getLastLoginTimestamp());
		out.setPassword(input.getPasswordHash());
		out.setReferenceId(input.getReferenceId());
		out.setUpdateUserId(input.getUpdateUserId());
		out.setUserId(input.getUserId());
		out.setUserName(input.getUserName());
		out.setUserSurname(input.getUserSurname());
		
		return out;
	}
}
