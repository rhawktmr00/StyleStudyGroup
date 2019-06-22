package com.dh.observerPattern.servlet;

import com.dh.observerPattern.KBS;
import com.dh.observerPattern.MBC;
import com.dh.observerPattern.SBS;
import com.dh.observerPattern.WeatherData;
import com.sp.common.LogicClass;

public class LogicWeatherClass extends LogicClass{

  @Override
  public void run(Object o) {

    
    WeatherData data = (WeatherData) o;
    
    String[] broadCasting = data.getBroadCasting();
    
    for (String bc : broadCasting) {
        if(bc.equals("KBS")) {
          KBS kbs = new KBS();
          kbs.broadCasting(data);
        }else if(bc.equals("MBC")) {
          MBC mbc = new MBC();
          mbc.broadCasting(data);
        }else if(bc.equals("SBS")) {
          SBS sbs = new SBS();
          sbs.broadCasting(data);
        }
    }
    
  }

}
