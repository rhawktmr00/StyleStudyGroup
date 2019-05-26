package com.sp.observerPattern01;

import java.util.ArrayList;

public class BroadCastMember implements Member {

  private ArrayList<Broadcast> BroadcastList;

  public BroadCastMember() {
    // TODO Auto-generated constructor stub
    BroadcastList = new ArrayList<>();
  }

  @Override
  public void addBroadcast(Broadcast o) {
    // TODO Auto-generated method stub
    BroadcastList.add(o);
  }

  @Override
  public void removeBroadcast(Broadcast o) {
    // TODO Auto-generated method stub
    int index = BroadcastList.indexOf(o);
    BroadcastList.remove(index);
  }

  @Override
  public void notifyBroadcast(WeatherData weatherData) {
    // TODO Auto-generated method stub
    for (Broadcast broadcast : BroadcastList) {
      broadcast.onAir(weatherData);
    }
  }

}
