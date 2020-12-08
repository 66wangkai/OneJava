package com.sun.java.week14;

/**
 * @author: SUN
 * @create: 2020/12/7 15:06
 * @description:
 **/
public class TicketSaleThread extends Thread{

    private  static final int TOTAL_COUNT = 10;
    @Override
    public void run(){
        int count = TOTAL_COUNT;
        for (int i = 0 ; i<90 ; i ++ ){
            if (count > 0 ){
                System.out.println(Thread.currentThread().getName() + "卖出一张票，当前票数：" +  --count);
                try{
                    Thread.sleep(500);

                }catch (InterruptedException e){
                    System.err.println("中断异常");

                }

            }else{
                System.out.println("票数不足，停止售票！");
            }
        }

    }

}
