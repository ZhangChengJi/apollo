package com.ctrip.framework.apollo.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class XmlApplication {
  public static void main(String[] args) {
    new ClassPathXmlApplicationContext("spring.xml");
    onKeyExit();
  }

  private static void onKeyExit() {
    System.out.println("Press any key to exit...");
    try {
      System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
