package com.sp.observerPattern01;

import com.sp.common.LogicClass;

public class LogicWeatherClass extends LogicClass {

  @Override
  public void run(Object o) {

    Member broadcastMember = new BroadCastMember();
    broadcastMember.addBroadcast(new MBC());
    broadcastMember.addBroadcast(new KBS());
    Broadcast sbs = new SBS();
    broadcastMember.addBroadcast(sbs);
    
    WeatherData data = (WeatherData) o;
    
    broadcastMember.notifyBroadcast(data);
  }

}
