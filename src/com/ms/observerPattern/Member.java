package com.ms.observerPattern;

public interface Member {

	public void addBroadCast(BroadCast o);
	
	public void removeBroadCast(BroadCast o);
		
	//정보전달 
	public void notifybroacast(WeatherData wetherData);
}
