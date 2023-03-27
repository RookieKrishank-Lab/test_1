package com.emptynull;

public class NullEmpty1 {
    public static void main(String args[]){
        String str=null;
        if(str==null){
            System.out.println("Null string");
        }
        else if (str.isEmpty()) {
            System.out.println("Empty string");
        }
    }
}
