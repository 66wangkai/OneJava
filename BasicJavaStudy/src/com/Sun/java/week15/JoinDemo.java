package com.sun.java.week15;

/**
 * @author: SUN
 * @create: 2020/12/14 16:20
 * @description:
 **/
public class JoinDemo implements Runnable{
    private String name;
    public JoinDemo(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(name + ":" +i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JoinDemo changeThread = new JoinDemo("A");
        Runnable target;
        Thread t1 = new Thread(changeThread);
        t1.start();
        for (int i = 0; i < 30; i++) {
            if (i == 10) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("主线程" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}