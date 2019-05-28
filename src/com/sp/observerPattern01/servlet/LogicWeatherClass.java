package com.sp.observerPattern01.servlet;

import com.sp.common.LogicClass;
import com.sp.observerPattern01.BroadCastMember;
import com.sp.observerPattern01.Broadcast;
import com.sp.observerPattern01.KBS;
import com.sp.observerPattern01.MBC;
import com.sp.observerPattern01.Member;
import com.sp.observerPattern01.SBS;
import com.sp.observerPattern01.WeatherData;

public class LogicWeatherClass extends LogicClass{

  @Override
  public void run(Object o) {

    Member broadcastMember = new BroadCastMember();
    
    WeatherData data = (WeatherData) o;
    
    String[] broadCasting = data.getBroadCasting();
    
    for (String bc : broadCasting) {
      if(bc.equals("KBS")) {
        broadcastMember.addBroadcast(new KBS());
      }else if(bc.equals("MBC")) {
        broadcastMember.addBroadcast(new MBC());
      }else if(bc.equals("SBS")) {
        Broadcast sbs = new SBS();
        broadcastMember.addBroadcast(sbs);
      }
    }
    
    broadcastMember.notifyBroadcast(data);
  }

}
