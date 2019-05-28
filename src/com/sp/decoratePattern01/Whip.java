package com.sp.decoratePattern01;

public class Whip extends CondimentDecorator {
   
  Beverage beverage;
  
  public Whip(Beverage beverage) {
    // TODO Auto-generated constructor stub
    this.beverage = beverage;
  }
  @Override
  public double cost() {
    // TODO Auto-generated method stub
    return 0.1;
  }

  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return beverage.getDescription() + "Whip ";
  }

}
