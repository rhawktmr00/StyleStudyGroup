package com.dh.strategy;

public class MallardDuck extends Duck{

  public MallardDuck() {
    // TODO Auto-generated constructor stub
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    // TODO Auto-generated method stub
    System.out.println("Mallard Duck");
  }

}
