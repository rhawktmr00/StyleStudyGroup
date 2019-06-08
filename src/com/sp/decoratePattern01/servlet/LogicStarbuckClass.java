package com.sp.decoratePattern01.servlet;

import com.sp.common.LogicClass;
import com.sp.decoratePattern01.OrderDatas;
import com.sp.decoratePattern01.StarbuckStore;

public class LogicStarbuckClass extends LogicClass {
  
  public LogicStarbuckClass() {
    // TODO Auto-generated constructor stub
    super();
  }

  @Override
  public void run(Object o) {
    // TODO Auto-generated method stub
    new StarbuckStore().orderCoffee((OrderDatas) o);
    
  }

}
