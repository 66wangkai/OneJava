package com.sun.java.week14;

/**
 * @author: SUN
 * @create: 2020/12/7 15:30
 * @description:
 **/
public class TicketThreadApp {

    public static void main(String[] args) {
        TicketSaleThread t1 = new TicketSaleThread();
        TicketSaleThread t2 = new TicketSaleThread();
        TicketSaleThread t3 = new TicketSaleThread();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
//快捷键ctrl+o进入的页面，印象笔记里面是有的
//
}