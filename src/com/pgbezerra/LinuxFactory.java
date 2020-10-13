package com.pgbezerra;

public class LinuxFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public ComboBox createComboBox() {
		return new LinuxComboBox();
	}

}
