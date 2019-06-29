package com.sp.commandPattern01;

public class GarageDoorUpCommand implements Command {

  GarageDoor garageDoor;

  public GarageDoorUpCommand(GarageDoor garageDoor) {
      this.garageDoor = garageDoor;
  }

  public void execute() {
      garageDoor.up();
  }

}
