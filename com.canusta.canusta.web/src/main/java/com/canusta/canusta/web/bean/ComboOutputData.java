package com.canusta.canusta.web.bean;

import java.io.Serializable;

public class ComboOutputData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String displayName;
	
	private String displayValue;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayValue() {
		return displayValue;
	}

	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}	
}
