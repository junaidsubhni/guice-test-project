package com.confiz.guice.test.consumer;

import javax.inject.Inject;

import com.confiz.guice.test.service.AnimalService;

public class MyApplication {

	private AnimalService service;
	
	@Inject
	public void setService(AnimalService srv) {
		this.service = srv;
	}
	
	public boolean speak(String animalName){
		return this.service.speak(animalName);
	}
}
