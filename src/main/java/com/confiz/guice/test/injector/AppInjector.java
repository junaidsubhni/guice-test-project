package com.confiz.guice.test.injector;

import com.confiz.guice.test.service.AnimalService;
import com.confiz.guice.test.service.LionService;
import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {
	
	@Override
	protected void configure() {
		
//		bind(AnimalService.class).to(LionService.class);
//		bind(AnimalService.class).to(LionService.class);
		bind(AnimalService.class).to(LionService.class);
	}
}
