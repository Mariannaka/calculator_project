package com.marianna.gwt.calculatorProject.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class UiCalculatortest extends Composite {

	private static UiCalculatortestUiBinder uiBinder = GWT.create(UiCalculatortestUiBinder.class);

	interface UiCalculatortestUiBinder extends UiBinder<Widget, UiCalculatortest> {
	}

	public UiCalculatortest() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setText (String text) {
	
	}
}
