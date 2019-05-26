package com.sp.observerPattern01;

import com.sp.common.systemOutPrint;

public class KBS implements Broadcast {

  @Override
  public void onAir(WeatherData weatherData) {
    // TODO Auto-generated method stub
    new systemOutPrint("========KBS=========");
    float description = weatherData.getPressure();
    new systemOutPrint(description);
  }

}
