package com.canusta.canusta.service.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICATION_USER")
public class ApplicationUser implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_SURNAME")
	private String userSurname;
	
	@Column(name = "CREATE_USERID")
	private String createUserId;
	
	@Column(name = "UPDATE_USERID")
	private String updateUserId;
	
	@Column(name = "INSTANCE_ID")
	private Timestamp instanceId;
	
	@Column(name = "REFERENCE_ID")
	private Timestamp referenceId;
	
	@Column(name = "LAST_LOGIN_TIMESTAMP")
	private Timestamp lastLoginTimestamp;
	
	@Column(name = "PASSWORD_HASH")
	private String passwordHash;

	protected ApplicationUser() {
	}

	public ApplicationUser(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ApplicationUser [userId=" + userId + ", userName=" + userName + ", userSurname=" + userSurname
				+ ", createUserId=" + createUserId + ", updateUserId=" + updateUserId + ", instanceId=" + instanceId
				+ ", referenceId=" + referenceId + ", lastLoginTimestamp=" + lastLoginTimestamp + ", passwordHash="
				+ passwordHash + "]";
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

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
}

