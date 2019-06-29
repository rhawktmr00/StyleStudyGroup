package com.sp.commandPattern01;

public class StereoOffCommand implements Command {
  Stereo stereo;
  
  public StereoOffCommand(Stereo stereo) {
      this.stereo = stereo;
  }

  public void execute() {
      stereo.off();
  }

}
