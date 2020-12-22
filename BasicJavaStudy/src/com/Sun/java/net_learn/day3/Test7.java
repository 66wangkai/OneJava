package com.sun.java.net_learn.day3;

/**
 * @author: SUN
 * @create: 2020/12/22 22:41
 * @description:
 **/
public class Test7 {
    //定义类Test7
    //定义main方法
    //定义两个整数变量a，b并赋值
    //控制台输出变量a，b互换前的值
    //定义一个第三方变量temp，不赋值
    //利用第三方变量Temp使a，b的值互换
    //控制台输出变量a，b互换后的值
    public static void main(String[] args){
        int a = 10 ;
        int b = 20 ;
        System.out.println("互换前：");
        System.out.println(a);
        System.out.println(b);

        int temp;
                temp = a;
                a = b;
                b = temp;
                System.out.println("互换后：");
                System.out.println(a);
                System.out.println(b);
    }
}
