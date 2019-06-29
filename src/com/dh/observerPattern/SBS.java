package com.dh.observerPattern;

import com.sp.common.systemOutPrint;

public class SBS  {

  public void broadCasting(WeatherData data) {
    new systemOutPrint("=======SBS=========");
    new systemOutPrint(data.getHunuduty());
  };
}
