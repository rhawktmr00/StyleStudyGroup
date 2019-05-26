package com.sp.abstractPattern01.servlet;

import com.sp.abstractPattern01.PizzaStore;
import com.sp.common.LogicClass;
import com.sp.common.ReturnType;

public class LogicPizzaClass extends LogicClass implements ReturnType {
  
  public LogicPizzaClass() {
    super();
    settingReturnType();
  }

  @Override
  public void run(Object o) {

      PizzaStore ps = new PizzaStore();
      ps.orderPizza((String) o);

  }

  @Override
  public Object settingReturnType() {
    // TODO Auto-generated method stub
    return new String();
  }
}
