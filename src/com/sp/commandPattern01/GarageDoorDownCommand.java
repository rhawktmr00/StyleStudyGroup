package com.sp.commandPattern01;

public class GarageDoorDownCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorDownCommand(GarageDoor garageDoor) {
      this.garageDoor = garageDoor;
  }

  public void execute() {
      garageDoor.up();
  }

}
