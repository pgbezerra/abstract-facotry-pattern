package com.pgbezerra;

public class WindowsComboBox implements ComboBox{

	public WindowsComboBox() {
	}

	@Override
	public void paint() {
		System.out.println("\n\nThis is a windows combo box, trust me... Look my items");
		System.out.println("- Brazil");
		System.out.println("- Pizza");
		System.out.println("- Osasco");
		System.out.println("- etc\n\n");
	}

}
