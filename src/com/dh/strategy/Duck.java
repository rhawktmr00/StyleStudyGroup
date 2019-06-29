package com.dh.strategy;

public abstract class Duck {
  
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  
  public Duck() {
    // TODO Auto-generated constructor stub
  }  
  //소리
  public void performQuack() {
    quackBehavior.quack();
  };
  
  //수영
  public void swim() {
    System.out.println("Every Duck Can Swim");
  };
  
  //오리 모양
  public abstract void display();
  
  //오리날다
  public void performFly() {
    flyBehavior.fly();
  };
}
