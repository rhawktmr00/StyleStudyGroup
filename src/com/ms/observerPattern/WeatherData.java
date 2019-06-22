package com.ms.observerPattern;

import com.sp.common.ReturnType;

public class WeatherData implements ReturnType{


  // ê¸°ì˜¨
  private float tempature;
  // ?Šµ?„
  private float hunuduty;
  // ê¸°ì••
  private float pressure;
  // ?‚´?¼ ?˜ˆ? •?‚ ?”¨
  private String tommorwWeather;
  
  private String[] broadCasting; 
  
  public String[] getBroadCasting() {
    return broadCasting;
  }
  
  public void setBroadCasting(String[] broadCasting) {
    this.broadCasting = broadCasting;
  }
  
  public void setAllDatas(float tempature, float hunuduty, float pressure, String tommorwWeather) {
      this.tempature = tempature;
      this.hunuduty = hunuduty;
      this.pressure = pressure;
      this.tommorwWeather = tommorwWeather;
  }
  public float getTempature() {
      return tempature;
  }
  public void setTempature(float tempature) {
      this.tempature = tempature;
  }
  public float getHunuduty() {
      return hunuduty;
  }
  public void setHunuduty(float hunuduty) {
      this.hunuduty = hunuduty;
  }
  public float getPressure() {
      return pressure;
  }
  public void setPressure(float pressure) {
      this.pressure = pressure;
  }
  public String getTommorwWeather() {
      return tommorwWeather;
  }
  public void setTommorwWeather(String tommorwWeather) {
      this.tommorwWeather = tommorwWeather;
  }
}
