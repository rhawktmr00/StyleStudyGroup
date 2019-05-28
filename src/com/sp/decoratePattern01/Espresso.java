package com.sp.decoratePattern01;

public class Espresso extends Beverage{

  @Override
  public String getDescription() {
    // TODO Auto-generated method stub
    return "Espresso ";
  }
  
  @Override
  public double cost() {
    // TODO Auto-generated method stub
    return 0.9;
  }

}
