package com.ms.strategy;

public class MainDuck {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		
		duck.performquack();
		duck.performfly();
		duck.display();
		duck.swim();
		RubberDuck RuDuck = new RubberDuck();
		
		RuDuck.performquack();
		RuDuck.performfly();
		RuDuck.display();
		RuDuck.swim();
	}
}
