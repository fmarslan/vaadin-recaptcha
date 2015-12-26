package org.vaadin.fma.recaptcha.client;

import com.vaadin.shared.AbstractComponentState;

@SuppressWarnings("serial")
public class ReCaptchaState extends AbstractComponentState {

	private String secretKey;
	private String siteKey;
	private boolean valid;
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public String getSiteKey() {
		return siteKey;
	}
	public void setSiteKey(String siteKey) {
		this.siteKey = siteKey;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
