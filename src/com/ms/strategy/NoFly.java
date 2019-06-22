package com.ms.strategy;

public class NoFly implements Flybehavior {

	@Override
	public void Fly() {
		System.out.println("나는 날 수 없는 오리닭");
	}

	
}
