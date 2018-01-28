package com.canusta.canusta.web.bean;

import java.io.Serializable;

public class ListOptionsBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String scrollType;
	
	private String sortOption;
	
	private Integer orderByFieldNum;
	
	private Integer scrollAmount;

	public String getScrollType() {
		return scrollType;
	}

	public void setScrollType(String scrollType) {
		this.scrollType = scrollType;
	}

	public String getSortOption() {
		return sortOption;
	}

	public void setSortOption(String sortOption) {
		this.sortOption = sortOption;
	}

	public Integer getOrderByFieldNum() {
		return orderByFieldNum;
	}

	public void setOrderByFieldNum(Integer orderByFieldNum) {
		this.orderByFieldNum = orderByFieldNum;
	}

	public Integer getScrollAmount() {
		return scrollAmount;
	}

	public void setScrollAmount(Integer scrollAmount) {
		this.scrollAmount = scrollAmount;
	}
}
