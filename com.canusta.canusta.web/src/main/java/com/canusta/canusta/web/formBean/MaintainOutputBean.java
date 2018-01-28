package com.canusta.canusta.web.formBean;

import java.io.Serializable;

public class MaintainOutputBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean protectKeyFlag;
	
	private boolean protectAllFlag;

	public boolean isProtectKeyFlag() {
		return protectKeyFlag;
	}

	public void setProtectKeyFlag(boolean protectKeyFlag) {
		this.protectKeyFlag = protectKeyFlag;
	}

	public boolean isProtectAllFlag() {
		return protectAllFlag;
	}

	public void setProtectAllFlag(boolean protectAllFlag) {
		this.protectAllFlag = protectAllFlag;
	}
}
