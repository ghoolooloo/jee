package net.yohol.jee.timer;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class MySchedule {
  @Schedule(minute="*", info="Automatic Timer Test")
  public void doPerMinute() {
    System.out.println("*************************************************************************");
  }
}