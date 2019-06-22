package com.sp.commandPattern01;

import com.sp.common.systemOutPrint;

public class GarageDoor {
  String location;

  public GarageDoor(String location) {
      this.location = location;
  }

  public void up() {
      new systemOutPrint(location + " garage Door is Up");
  }

  public void down() {
      new systemOutPrint(location + " garage Door is Down");
  }

  public void stop() {
      new systemOutPrint(location + " garage Door is Stopped");
  }

  public void lightOn() {
      new systemOutPrint(location + " garage light is on");
  }

  public void lightOff() {
      new systemOutPrint(location + " garage light is off");
  }

}
