package com.sp.common;

import java.util.ArrayList;

public abstract class LogicClass {

  public ArrayList<String> printValueList;
  public SystemOut systemOut;

  public LogicClass() {
    // TODO Auto-generated constructor stub
    printValueList = new ArrayList<>();
    new SystemOut().addClass(this);
  }

  public void systemOutPrint(String value) {
    printValueList.add(value);
  }

  public String excute(Object o) {
    readyToRun(o);
    StringBuilder sb = new StringBuilder();
    for (String printValue : printValueList) {
      sb.append(printValue);
      sb.append("\n");
    }
    return new String(sb);
  }

  public void readyToRun(Object o) {
    if (o instanceof ReturnType) {
      run((ReturnType) o);
    }
  };

  public abstract void run(Object o);

}
