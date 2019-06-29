package com.sp.commandPattern01;

import com.sp.common.systemOutPrint;

public class Stereo {
  String location;

  public Stereo(String location) {
      this.location = location;
  }

  public void on() {
      new systemOutPrint(location + " stereo is on");
  }

  public void off() {
      new systemOutPrint(location + " stereo is off");
  }

  public void setCD() {
      new systemOutPrint(location + " stereo is set for CD input");
  }

  public void setDVD() {
      new systemOutPrint(location + " stereo is set for DVD input");
  }

  public void setRadio() {
      new systemOutPrint(location + " stereo is set for Radio");
  }

  public void setVolume(int volume) {
      // code to set the volume
      // valid range: 1-11 (after all 11 is better than 10, right?)
      new systemOutPrint(location + " Stereo volume set to " + volume);
  }

}
