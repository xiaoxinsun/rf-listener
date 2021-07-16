package com.bill;

// THIS DIDN"T WORK. JUST USE PYTHON
public class Sniffer {
    public static final int ROBOT_LISTENER_API_VERSION = 2;
    public void startSuite(String name, java.util.Map attributes) {
        System.err.println("STARTING SUITE: " + name);
    }
    public void endSuite(String name, java.util.Map attributes) {
        System.err.println("ENDING SUITE: " + name);
        System.err.println(attributes);
    }

}
