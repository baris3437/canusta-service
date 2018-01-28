package com.canusta.canusta.web.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class ApplicationUserBean implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userId;

	private String userName;

	private String userSurname;

	private String createUserId;
	
	private String updateUserId;
	
	private Timestamp instanceId;
	
	private Timestamp referenceId;
	
	private Timestamp lastLoginTimestamp;
	
	private String password;

	@Override
	public String toString() {
		return "ApplicationUserBean [userId=" + userId + ", userName=" + userName + ", userSurname=" + userSurname
				+ ", createUserId=" + createUserId + ", updateUserId=" + updateUserId + ", instanceId=" + instanceId
				+ ", referenceId=" + referenceId + ", lastLoginTimestamp=" + lastLoginTimestamp + ", password="
				+ password + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Timestamp getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(Timestamp instanceId) {
		this.instanceId = instanceId;
	}

	public Timestamp getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(Timestamp referenceId) {
		this.referenceId = referenceId;
	}

	public Timestamp getLastLoginTimestamp() {
		return lastLoginTimestamp;
	}

	public void setLastLoginTimestamp(Timestamp lastLoginTimestamp) {
		this.lastLoginTimestamp = lastLoginTimestamp;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

