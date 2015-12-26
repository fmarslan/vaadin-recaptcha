package org.vaadin.fma.recaptcha;

import org.vaadin.fma.recaptcha.client.ReCaptchaState;

import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractComponent;

@JavaScript("https://www.google.com/recaptcha/api.js")
@SuppressWarnings("serial")
public class ReCaptcha extends AbstractComponent {

	@Override
	public ReCaptchaState getState() {
		return (ReCaptchaState) super.getState();
	}

	public ReCaptcha(String secretKey, String siteKey) {
		getState().setSecretKey(secretKey);
		getState().setSiteKey(siteKey);
	}

	public String getSecretKey() {
		return getState().getSecretKey();
	}

	public void setSecretKey(String secretKey) {
		getState().setSecretKey(secretKey);
	}

	public String getSiteKey() {
		return getState().getSiteKey();
	}

	public void setSiteKey(String siteKey) {
		getState().setSiteKey(siteKey);
	}

	public boolean isValid() {
		return getState().isValid();
	}
}
