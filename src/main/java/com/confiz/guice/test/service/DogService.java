package com.confiz.guice.test.service;

public class DogService implements AnimalService{

	public boolean speak(String animalName) {
		System.out.println("Dog is barking. with name : "+animalName);
		return true;
	}

}
