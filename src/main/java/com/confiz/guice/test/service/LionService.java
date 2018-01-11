package com.confiz.guice.test.service;

public class LionService implements AnimalService{

	public boolean speak(String animalName) {
		System.out.println("Lion is roaring. with name : "+animalName);
		return true;
	}

}