package com.ms.strategy;

public abstract class Duck {
	
	Flybehavior flybehavior;
	QuackBehavior quackbehavior;
	
	//�Ҹ�
	public void performquack() {
		quackbehavior.Quack();
	}
	
	//����
	void swim() {
		System.out.println("������ ���� ����");
	}
	
	//����
	abstract void display();
	
	//��������
	public void performfly() {
		flybehavior.Fly();
	}
}
