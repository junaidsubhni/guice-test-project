package com.confiz.guice.test.consumer;

import javax.inject.Inject;

import com.confiz.guice.test.service.AnimalService;
import com.confiz.guice.test.service.LoggerService;

public class MyApplication {

	private AnimalService animalService;
	
	private LoggerService loggerService;
	
	@Inject
	public void setAnimalService(AnimalService srv) {
		this.animalService = srv;
	}
	
	@Inject
	public void setLoggerService(LoggerService srv) {
		this.loggerService = srv;
	}
	
	public boolean speak(String animalName){
		return this.animalService.speak(animalName);
	}
	
	public boolean sendMessage(String message) {
        return loggerService.sendMessage(message);
    }
}
