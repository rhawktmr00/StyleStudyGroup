package com.ms.strategy;

public class RedHeadDuck extends Duck {

	public void quack() {
		new Quack();
	}

	@Override
	public void display() {
		System.out.println("레드 레드 레드");
	}

	public void fly() {
		new FlyWing();
	}

}
