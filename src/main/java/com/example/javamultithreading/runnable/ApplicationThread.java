package com.example.javamultithreading.runnable;

import java.io.*;

public class ApplicationThread extends Thread{

    @Override
    public void run() {
        try(BufferedReader reader = new BufferedReader(
                new FileReader(
                        new File("/Users/bijayshrestha/GitHub/Backend/Ex_Files_Java_EE_Concurrency/Exercise Files/Chapter2/02_03/begin/sample.txt")
                )
        )){
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(Thread.currentThread().getName() + " reading the line: " + line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
