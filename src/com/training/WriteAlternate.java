package com.training;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

    public class WriteAlternate {
        public void readfile(String Filename1,String Filename2) throws IOException {
            FileInputStream fileStream = new FileInputStream(Filename1);
            FileInputStream fileStream1 = new FileInputStream(Filename2);
            FileOutputStream fileStream2 = new FileOutputStream("/Users/sumitkulhari/IdeaProjects/Java_training/src/com/training/exceptions/input2.txt");
            int data = fileStream.read();
            int data1 = fileStream1.read();
            while (data != -1) {

                data = fileStream.read();
            }
            fileStream.close();
        }
}
