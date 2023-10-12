package com.exception;

public class Throw2 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            /*if (someCondition) {
                throw new Exception("An error occurred.");
            }*/
        } catch (Exception e) {
            // Exception handling code
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
