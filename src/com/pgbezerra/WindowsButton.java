package com.pgbezerra;

public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("\n\nThis is a windows button, trust me");
		System.out.println("Look what i will do... ");
		System.out.println("Hacking nasa 0%");
		System.out.println("Hacking nasa 20%");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("I forgot what i am doing... Next\n\n");
	}

}
