package com.exception;

import java.io.FileNotFoundException;

//abnormal termination if main doesnt handle the exception
public class Throws4 {
        public static void main(String[] args) throws FileNotFoundException {
            readFile("example.txt");
        }

        public static void readFile(String filename) throws FileNotFoundException {
            // Code to read from the file
        }


}
