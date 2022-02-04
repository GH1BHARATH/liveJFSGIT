package com.ezshop;

import org.springframework.boot.CommandLineRunner;

public class AppRunner implements CommandLineRunner{
	@Override
	public void run(String... args) throws Exception {
		EzShopDesktopApp ezShopDesktopApp = new EzShopDesktopApp();
		ezShopDesktopApp.displayMenu();
	}
}
