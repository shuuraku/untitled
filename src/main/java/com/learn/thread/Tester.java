package com.learn.thread;

public class Tester {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("main：" + i);
        }
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread：" + i);
                }
            }
        };
        thread.start();

        //Mythread
        Mythread mythread = new Mythread();
        mythread.start();

        //Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runnable："+ i);
                }
            }
        };

        System.out.println("main end");
    }
}

class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() +"："+i);
        }
    }
}
