package com.sp.observerPattern01;

import com.sp.common.systemOutPrint;

public class MBC implements Broadcast {

  @Override
  public void onAir(WeatherData weatherData) {
    // TODO Auto-generated method stub
    new systemOutPrint("========MBC=========");
    String description = weatherData.getTommorwWeather();
    new systemOutPrint(description);
  }

}
