package com.ms.strategy;

public class NoSound implements QuackBehavior{

	@Override
	public void Quack() {
		new NoSound();
	}
	
	public void fly() {
		new NoFly();
	}

	public void display() {
		System.out.println("¿À¸®¹è");
	}
}
