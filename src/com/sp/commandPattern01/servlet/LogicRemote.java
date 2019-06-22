package com.sp.commandPattern01.servlet;

import com.sp.commandPattern01.CeilingFan;
import com.sp.commandPattern01.CeilingFanOffCommand;
import com.sp.commandPattern01.CeilingFanOnCommand;
import com.sp.commandPattern01.Command;
import com.sp.commandPattern01.GarageDoor;
import com.sp.commandPattern01.GarageDoorDownCommand;
import com.sp.commandPattern01.GarageDoorUpCommand;
import com.sp.commandPattern01.Light;
import com.sp.commandPattern01.LightOffCommand;
import com.sp.commandPattern01.LightOnCommand;
import com.sp.commandPattern01.RemoteControl;
import com.sp.commandPattern01.Stereo;
import com.sp.commandPattern01.StereoOffCommand;
import com.sp.commandPattern01.StereoOnWithCDCommand;
import com.sp.common.LogicClass;
import com.sp.common.systemOutPrint;

public class LogicRemote extends LogicClass {

  public LogicRemote() {
    // TODO Auto-generated constructor stub
    super();
  }
  
  @Override
  public void run(Object o) {
    RemoteControl remoteControl = new RemoteControl();
    
    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    CeilingFan ceilingFan= new CeilingFan("Living Room");
    GarageDoor garageDoor = new GarageDoor("");
    Stereo stereo = new Stereo("Living Room");

    Command livingRoomLightOn = 
            new LightOnCommand(livingRoomLight);
    Command livingRoomLightOff = 
            new LightOffCommand(livingRoomLight);
    Command kitchenLightOn = 
            new LightOnCommand(kitchenLight);
    Command kitchenLightOff = 
            new LightOffCommand(kitchenLight);

    Command ceilingFanOn = 
            new CeilingFanOnCommand(ceilingFan);
    Command ceilingFanOff = 
            new CeilingFanOffCommand(ceilingFan);

    Command garageDoorUp =
            new GarageDoorUpCommand(garageDoor);
    Command garageDoorDown =
            new GarageDoorDownCommand(garageDoor);

    Command stereoOnWithCD =
            new StereoOnWithCDCommand(stereo);
    Command  stereoOff =
            new StereoOffCommand(stereo);
    
    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
    remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
    remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    remoteControl.onButtonWasPushed(3);
    remoteControl.offButtonWasPushed(3);
  }

}
