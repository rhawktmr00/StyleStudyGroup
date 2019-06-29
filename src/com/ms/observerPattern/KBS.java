package com.ms.observerPattern;

import com.sp.common.systemOutPrint;

public class KBS implements BroadCast {

	@Override
	public void onaAr(WeatherData wetherData) {
		new systemOutPrint("======== KBS ======");
		new systemOutPrint(wetherData.getPressure());
		
	}
	
}
