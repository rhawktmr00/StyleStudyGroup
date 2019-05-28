package com.dh.observerPattern01.servlet;

import com.dh.common.LogicClass;
import com.dh.observerPattern01.WeatherData;

public class LogicWeatherClass extends LogicClass{

  @Override
  public void run(Object o) {

    
    WeatherData data = (WeatherData) o;
    
    String[] broadCasting = data.getBroadCasting();
    
    for (String bc : broadCasting) {
        if(bc.equals("KBS")) {
          
        }else if(bc.equals("MBC")) {
          
        }else if(bc.equals("SBS")) {
          
        }
    }
    
  }

}
