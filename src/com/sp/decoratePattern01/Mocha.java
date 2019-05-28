package com.sp.decoratePattern01;

public class Mocha extends CondimentDecorator {
  Beverage beverage;
  
  public Mocha(Beverage beverage) {
    // TODO Auto-generated constructor stub
    this.beverage = beverage;
  }
  
  @Override
  public double cost() {
    // TODO Auto-generated method stub
    return 0.2;
  }
  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return beverage.getDescription() + "Mocha ";
  }

}
