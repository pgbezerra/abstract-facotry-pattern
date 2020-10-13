package com.pgbezerra;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public ComboBox createComboBox() {
		return new WindowsComboBox();
	}

}
