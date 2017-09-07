package net.yohol.jee.listener;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyService {
  public void doSth() {
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Destroyed");
  }
}