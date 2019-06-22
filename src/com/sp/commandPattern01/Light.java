package com.sp.commandPattern01;

import com.sp.common.systemOutPrint;

public class Light {
  String location = "";

  public Light(String location) {
      this.location = location;
  }

  public void on() {
      new systemOutPrint(location + " light is on");
  }

  public void off() {
    new systemOutPrint(location + " light is off");
  }
}
