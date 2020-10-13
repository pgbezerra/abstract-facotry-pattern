package com.pgbezerra;

public class Application {

	private Button button;
	private ComboBox comboBox;

	public Application(GUIFactory factory) {
		button = factory.createButton();
		comboBox = factory.createComboBox();
	}

	public void paint() {
		button.paint();
		comboBox.paint();
	}

}
