package com.sun.java.week14;

import java.time.LocalDateTime;

/**
 * @author: SUN
 * @create: 2020/12/7 14:59
 * @description:
 **/
public class TestThread extends Thread {
    private String name;

    public TestThread(String name) {
        this.name = name;

    }
@Override
    public void run() {
        System.out.println(LocalDateTime.now());
        try{
            Thread.sleep(1000);

        }catch (InterruptedException e){
            e.printStackTrace();

        }


}
}
