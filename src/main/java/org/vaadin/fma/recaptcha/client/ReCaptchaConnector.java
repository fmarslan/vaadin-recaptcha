package org.vaadin.fma.recaptcha.client;

import org.vaadin.fma.recaptcha.ReCaptcha;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.vaadin.client.ComponentConnector;
import com.vaadin.client.ConnectorHierarchyChangeEvent;
import com.vaadin.client.ui.AbstractHasComponentsConnector;
import com.vaadin.shared.ui.Connect;

@SuppressWarnings("serial")
@Connect(value = ReCaptcha.class)
public class ReCaptchaConnector extends AbstractHasComponentsConnector {

	@Override
	public ReCaptchaState getState() {
		return (ReCaptchaState) super.getState();
	}
	
	@Override
    public void onConnectorHierarchyChange(ConnectorHierarchyChangeEvent event) {
        VReCaptcha customComponent = (VReCaptcha) getWidget();
        Element div = DOM.createDiv();
        div.addClassName("g-recaptcha");
        div.setAttribute("data-sitekey", getState().getSiteKey());
        customComponent.getElement().appendChild(div);
    }

	@Override
	public void updateCaption(ComponentConnector connector) {
		// TODO Auto-generated method stub
	}	
}
