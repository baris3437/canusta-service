package com.canusta.canusta.web.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class CustomerBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer customerId;

	private String titleText;

	private Integer taxNum;

	private Integer mernisNum;

	private String customerType;

	private String status;

	private Timestamp instanceId;

	private Timestamp referenceId;

	private String createUserId;

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
