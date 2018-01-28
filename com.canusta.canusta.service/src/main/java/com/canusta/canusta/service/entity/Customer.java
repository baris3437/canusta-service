package com.canusta.canusta.service.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUSTOMER_ID")
	private Integer customerId;

	@Column(name = "TITLE_TEXT")
	private String titleText;

	@Column(name = "TAX_NUM")
	private Integer taxNum;

	@Column(name = "MERNIS_NUM")
	private Integer mernisNum;

	@Column(name = "CUSTOMER_TYPE")
	private String customerType;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "INSTANCE_ID")
	private Timestamp instanceId;

	@Column(name = "REFERENCE_ID")
	private Timestamp referenceId;

	@Column(name = "CREATE_USERID")
	private String createUserId;

	@Column(name = "UPDATE_USERID")
	private String updateUserId;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getTitleText() {
		return titleText;
	}

	public void setTitleText(String titleText) {
		this.titleText = titleText;
	}

	public Integer getTaxNum() {
		return taxNum;
	}

	public void setTaxNum(Integer taxNum) {
		this.taxNum = taxNum;
	}

	public Integer getMernisNum() {
		return mernisNum;
	}

	public void setMernisNum(Integer mernisNum) {
		this.mernisNum = mernisNum;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
}
