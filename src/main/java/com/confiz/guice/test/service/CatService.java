package com.confiz.guice.test.service;

public class CatService implements AnimalService{

	public boolean speak(String animalName) {
		System.out.println("Cat is mewing. with name : "+animalName);
		return true;
	}

}