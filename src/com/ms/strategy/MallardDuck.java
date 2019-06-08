package com.ms.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackbehavior = new Quack();
		flybehavior = new FlyWing();
	}

	@Override
	public void display() {
		System.out.println("MallardDuck");
	}
}
