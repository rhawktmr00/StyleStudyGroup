package com.dh.observerPattern;

import com.sp.common.systemOutPrint;

public class KBS {

    public void broadCasting(WeatherData data) {
      new systemOutPrint("=======KBS=========");
      new systemOutPrint(data.getPressure());
    };
    
   
}
