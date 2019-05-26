package com.sp.observerPattern01;

public interface Member {

  public void addBroadcast(Broadcast o);
  
  public void removeBroadcast(Broadcast o);
  
  public void notifyBroadcast(WeatherData weatherData);  

}
