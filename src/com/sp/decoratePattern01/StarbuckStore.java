package com.sp.decoratePattern01;

import java.util.List;
import com.sp.common.systemOutPrint;

public class StarbuckStore {

  public void orderCoffee(OrderDatas orderData) {
        Beverage beverage = null;
        String coffee = orderData.getCoffee();
        
        if (coffee.equals("Espresso")) {
            beverage = new Espresso();
        } else if (coffee.equals("HouseBlend")) {
            beverage = new HouseBlend();
        }
        if(orderData.getToppings() != null) {
          List<String> toppings = orderData.getToppings();
          for (String topping : toppings) {
            if (topping.equals("Soy")) {
              beverage = new Soy(beverage);
            } else if (topping.equals("Whip")) {
              beverage = new Whip(beverage);
            } else if (topping.equals("Mocha")) {
              beverage = new Mocha(beverage);
            }
          }
        }
        new systemOutPrint("Coffee!!: " + beverage.getDescription());
        new systemOutPrint("TotalCost: " + beverage.cost());
        
      }
}
