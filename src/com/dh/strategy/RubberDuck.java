package com.dh.strategy;

public class RubberDuck extends Duck{
  public RubberDuck() {
    quackBehavior = new NoSound();
    flyBehavior = new FlyNoWay();
  }

  @Override
  public void display() {
    // TODO Auto-generated method stub
    System.out.println("Rubber Duck");
  }

}
