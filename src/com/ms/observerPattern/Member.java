package com.ms.observerPattern;

public interface Member {

	public void addBroadCast(BroadCast o);
	
	public void removeBroadCast(BroadCast o);
		
	//�������� 
	public void notifybroacast(WeatherData wetherData);
}
