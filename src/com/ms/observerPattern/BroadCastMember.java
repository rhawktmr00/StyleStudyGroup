package com.ms.observerPattern;

import java.util.ArrayList;

public class BroadCastMember implements Member {

	private ArrayList<BroadCast> BroadCastList;	

	public BroadCastMember() {
		BroadCastList = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addBroadCast(BroadCast o) {
		//리스트 추가
		BroadCastList.add(o);

	}

	@Override
	public void removeBroadCast(BroadCast o) {
		int index = BroadCastList.indexOf(o);
		BroadCastList.remove(index);
	}

	@Override
	public void notifybroacast(WeatherData wetherData) {
		
		for(BroadCast boradCast : BroadCastList) {
			boradCast.onaAr(wetherData);
			
		}
	}	
}
