package com.dh.practice01;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import com.sp.common.systemOutPrint;

public class Lotto {

  
  
  public void makeNum() {
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; 12 > set.size(); i++) {
      int num = (int)(Math.random()*50)+1;
      set.add(new Integer(num));
    }
    LinkedList<Integer> list = new LinkedList<Integer>(set);
    Collections.sort(list);
    for (int s = 0; s < list.size()-2; s++) {
      new systemOutPrint(list.get(s));
    }
    for(int i=list.size()-1; i > list.size()-3; i--) {
      new systemOutPrint("Bounus:"+list.get(i));
    }
    
  }

  
}
