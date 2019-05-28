package com.sp.abstractPattern01.servlet;

import com.sp.abstractPattern01.PizzaStore;
import com.sp.common.LogicClass;

public class LogicPizzaClass extends LogicClass{
  
  public LogicPizzaClass() {
    super();
  }

  @Override
  public void run(Object o) {

      PizzaStore ps = new PizzaStore();
      ps.orderPizza((String) o);

  }
  
}
