package com.confiz.guice.test.main;

import com.confiz.guice.test.consumer.MyApplication;
import com.confiz.guice.test.injector.AppInjector;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new AppInjector());
		
		MyApplication app = injector.getInstance(MyApplication.class);
		
		app.speak("Tiger");
		
		app.sendMessage("hello logger");
		
		
	}

}
