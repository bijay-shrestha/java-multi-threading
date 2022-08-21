package com.example.javamultithreading;

import com.example.javamultithreading.runnable.ApplicationThread;

public class TestThread {
    public static void main(String[] args) {
        ApplicationThread thread1 = new ApplicationThread();
        ApplicationThread thread2 = new ApplicationThread();
        ApplicationThread thread3 = new ApplicationThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
