package com.ms.observerPattern.servlet;

import com.ms.observerPattern.BroadCast;
import com.ms.observerPattern.BroadCastMember;
import com.ms.observerPattern.KBS;
import com.ms.observerPattern.MBC;
import com.ms.observerPattern.Member;
import com.ms.observerPattern.SBS;
import com.ms.observerPattern.WeatherData;
import com.sp.common.LogicClass;

public class LogicWeatherClass extends LogicClass{

  @Override
  public void run(Object o) {

    Member BroadCastMember = new BroadCastMember();
	  
    WeatherData data = (WeatherData) o;
    
    String[] broadCasting = data.getBroadCasting();
    
    for (String bc : broadCasting) {
        if(bc.equals("KBS"))
        {
          BroadCast kbs = new KBS();
          //kbs.broadCasting(data);
          BroadCastMember.addBroadCast(kbs);
        }        
        else if(bc.equals("MBC"))        
        {
        	BroadCast mbc = new MBC();
         //mbc.broadCasting(data);
         BroadCastMember.addBroadCast(mbc);

        }
        else if(bc.equals("SBS")) {
        	BroadCast sbs = new SBS();
         //sbs.broadCasting(data);
         BroadCastMember.addBroadCast(sbs);
        }
    }
    	BroadCastMember.notifybroacast(data);
  }

}
