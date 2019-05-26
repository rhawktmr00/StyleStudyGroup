package com.sp.abstractPattern01;

import com.sp.common.systemOutPrint;

public class ChickenPizza extends Pizza {

  @Override
  protected void topping() {
      // TODO Auto-generated method stub
      new systemOutPrint("topping chicken...");
  }
  
  @Override
  protected String pizzaName() {
      // TODO Auto-generated method stub
      return "chicken";
  }
}
