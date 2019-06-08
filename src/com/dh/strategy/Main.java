package com.dh.strategy;

public class Main {
  public static void main(String[] args) {
    
    Duck duck = new RedHeadDuck();
    duck.display();
    duck.performFly();
    duck.performQuack();
    duck.swim();
    
    Duck rubberDuck = new RubberDuck();
    rubberDuck.display();
    rubberDuck.performFly();
    rubberDuck.performQuack();
    rubberDuck.swim();
  }
}
