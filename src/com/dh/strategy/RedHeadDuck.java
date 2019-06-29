package com.dh.strategy;

public class RedHeadDuck extends Duck {
  
public RedHeadDuck() {

  quackBehavior = new Malr();
  flyBehavior = new FlyWithWings();
}

  @Override
  public void display() {
    // TODO Auto-generated method stub
    System.out.println("RedHead Duck");
  }


}
