package com.ms.strategy;

public abstract class Duck {
	
	Flybehavior flybehavior;
	QuackBehavior quackbehavior;
	
	//소리
	public void performquack() {
		quackbehavior.Quack();
	}
	
	//수영
	void swim() {
		System.out.println("수영은 수영 수영");
	}
	
	//형태
	abstract void display();
	
	//오리날다
	public void performfly() {
		flybehavior.Fly();
	}
}
