package com.sun.java.net_learn.day2;

/**
 * @author: SUN
 * @create: 2020/12/21 20:53
 * @description:
 **/
public class Test4 {
    //定义类Test4
    //定义main方法
    //定义2个byte类型变量，分别赋byte类型范围内最大值和最小值，并输出在控制台
    //定义2个short类型变量，分别赋short类型范围内的值，并输出在控制台
    //定义两个int类型变量，分别赋int类型范围内的值，并输出在控制台
    //定义两个long类型变量，分别赋超过int类型范围的值，并输出在控制台
    public static void main(String[] args){
        byte num1 = -128;
        byte num2 = 127 ;
        System.out.println(num1);
        System.out.println(num2);

        short num3 = -32768;
        short num4 = 32767;
        System.out.println(num3);
        System.out.println(num4);

        int num5 = -2147483648;
        int num6 = 2147483647;
        System.out.println(num5);
        System.out.println(num6);

        long num7 = -2147483649L;
        long num8 = 2147483649L;
        System.out.println(num7);
        System.out.println(num8);



    }
}
