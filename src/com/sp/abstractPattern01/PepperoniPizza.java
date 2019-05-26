package com.sp.abstractPattern01;

import com.sp.common.systemOutPrint;

public class PepperoniPizza extends Pizza{

  @Override
  protected void topping() {
    // TODO Auto-generated method stub
    new systemOutPrint("topping pepperoni...");
  }

  @Override
  protected String pizzaName() {
    // TODO Auto-generated method stub
    return "pepperoni";
  }

}
