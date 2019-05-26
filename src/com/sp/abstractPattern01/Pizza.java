package com.sp.abstractPattern01;

import com.sp.common.systemOutPrint;

public abstract class Pizza {


  protected abstract void topping();
  protected abstract String pizzaName();

  public void prepare() {
      // TODO Auto-generated method stub
      new systemOutPrint("preparing...");
  }
  
  public void bake() {
      // TODO Auto-generated method stub
      new systemOutPrint("baking...");
  }
  
  public void cut() {
      // TODO Auto-generated method stub
      new systemOutPrint("cutting...");
  }
  
  public void box() {
      // TODO Auto-generated method stub
      new systemOutPrint("boxing...");
      new systemOutPrint("Finish " + pizzaName() + "!!");
  }

}
