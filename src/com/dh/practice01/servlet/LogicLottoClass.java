package com.dh.practice01.servlet;

import com.dh.practice01.Lotto;
import com.sp.common.LogicClass;
import com.sp.common.systemOutPrint;

public class LogicLottoClass extends LogicClass {

  public LogicLottoClass() {
    super();
  }
  
  @Override
  public void run(Object o) {
    Lotto lotto = new Lotto();
    lotto.makeNum();
  }

}
