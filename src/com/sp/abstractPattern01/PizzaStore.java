package com.sp.abstractPattern01;

public class PizzaStore {

  
  Pizza pizza;
  PizzaMenuFactory factory;
  
  public PizzaStore() {
      this.factory = new PizzaMenuFactory();
  }
  
  public Pizza orderPizza(String type){
      //menu펙토리에서 주문한 피자를 만듬
      pizza = factory.createPizza(type);
      
      makePizza();
      
      return pizza;
  }
  
  private void makePizza(){
      //준비하기
      pizza.prepare();
      //토핑하기
      pizza.topping(); // 메뉴팩토리를 통해 관리
      //굽기
      pizza.bake();
      //자르기
      pizza.cut();
      //박스에 넣기
      pizza.box();
  }
  
}
