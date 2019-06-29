package com.ms.observerPattern;

import com.sp.common.systemOutPrint;

public class MBC implements BroadCast {

	@Override
	public void onaAr(WeatherData wetherData) {
		new systemOutPrint("======== MBC ======");
		new systemOutPrint(wetherData.getTommorwWeather());
		
	}
}
