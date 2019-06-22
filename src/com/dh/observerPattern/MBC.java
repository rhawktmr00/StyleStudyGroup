package com.dh.observerPattern;

import com.sp.common.systemOutPrint;

public class MBC {

  public void broadCasting(WeatherData data) {
    new systemOutPrint("=======MBS=========");
    new systemOutPrint(data.getTommorwWeather());
    
  };
}
