package com.pgbezerra;

public class Main {
	
	private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            factory = new LinuxFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}

}
