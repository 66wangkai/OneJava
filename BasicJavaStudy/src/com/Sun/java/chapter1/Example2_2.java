package com.sun.java.chapter1;

/**
 * @author: SUN
 * @create: 2020/12/17 22:09
 * @description:
 **/
public class Example2_2 {
    public static void main(String[] args){
        byte b = 22 ;
        int n = 129 ;
        float f = 123456.123456789f;
        double d = 123456789.123456789;
        System.out.println("b= " + b);
        System.out.println("n = " + n);
        System.out.println("f = " + f);
        System.out.println(" d = " + d );
        b = (byte) n;
        //导致精度的损失
        f = (float) d ;
        //导致精度的损失
        System.out.println(" b =" +b);
        System.out.println("F =" +f);


    }
}
