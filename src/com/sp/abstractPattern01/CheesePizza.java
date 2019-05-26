package com.sp.abstractPattern01;

import com.sp.common.systemOutPrint;

public class CheesePizza extends Pizza{


  @Override
  protected void topping() {
      // TODO Auto-generated method stub
      new systemOutPrint("topping Cheese...");
  }
  @Override
  public String pizzaName() {
      return "Cheese Pizza";
  }

}
