package com.ms.strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackbehavior = new NoSound();
		flybehavior = new NoFly();
	}

	public void display() {
		System.out.println("RubberDuck");
	}
}
