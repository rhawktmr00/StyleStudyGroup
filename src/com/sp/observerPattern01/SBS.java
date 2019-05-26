package com.sp.observerPattern01;

import com.sp.common.systemOutPrint;

public class SBS implements Broadcast {

  @Override
  public void onAir(WeatherData weatherData) {
    // TODO Auto-generated method stub
    new systemOutPrint("========SBS=========");
    float description = weatherData.getHunuduty();
    new systemOutPrint(description);
  }

}
