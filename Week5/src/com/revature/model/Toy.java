package com.revature.model;

public class Toy {
	String name;
    //getters and setters
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    } 

    public void play() {
      System.out.println("This is fun!");
      System.out.println("Running the Toy class's play method.");
    }
}
