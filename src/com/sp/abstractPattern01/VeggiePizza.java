package com.sp.abstractPattern01;

import com.sp.common.systemOutPrint;

public class VeggiePizza extends Pizza {

  @Override
  protected void topping() {
    // TODO Auto-generated method stub
    new systemOutPrint("topping veggie...");
  }

  @Override
  protected String pizzaName() {
    // TODO Auto-generated method stub
    return "veggie";
  }

}
