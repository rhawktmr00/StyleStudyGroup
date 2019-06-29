package com.ms.strategy;

public class RedHeadDuck extends Duck {

	public void quack() {
		new Quack();
	}

	@Override
	public void display() {
		System.out.println("���� ���� ����");
	}

	public void fly() {
		new FlyWing();
	}

}
