package com.training.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Filenotdemo {
    public void readfile(String Filename) throws IOException {
        FileInputStream fileStream = new FileInputStream(Filename);
        int data = fileStream.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileStream.read();
        }
        fileStream.close();
    }
}
