package com.dh.abstractPattern01.servlet;

import com.dh.abstractPattern01.PizzaStore;
import com.dh.common.LogicClass;

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
