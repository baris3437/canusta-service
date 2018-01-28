package com.canusta.canusta.service.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PARAMETER")
public class Parameter implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TYPE")
	private String type;
	
	@Id
	@Column(name = "CODE")
	private String code;

	@Column(name = "DATAVALUE")
	private String datavalue;

	@Column(name = "DESCR")
	private String descr;

	@Column(name = "INSTANCE_ID")
	private Timestamp instanceId;

	@Column(name = "CREATE_USERID")
	private String createUserId;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDatavalue() {
		return datavalue;
	}

	public void setDatavalue(String datavalue) {
		this.datavalue = datavalue;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Timestamp getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(Timestamp instanceId) {
		this.instanceId = instanceId;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
}
