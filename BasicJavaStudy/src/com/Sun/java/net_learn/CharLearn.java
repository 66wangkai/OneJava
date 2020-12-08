package com.Sun.java.net_learn;

public class CharLearn {
    public static void main(String[] args){
        char c = 'a';
        //定义一个CHAR类型的变量，起名c，同时赋值字符‘a’
        System.out.println(c);
        //一个中文占用两个字节，char类型正好是2个字节
        //所以java中的char类型变量可以存储一个中文字符
        char x = '国';
        System.out.println(x);

        //编译错误
        //ab是字符串不能使用的单引号括起开
        //char y = ‘ab’；

//“a”是字符型类型
        //k变量是char类型
        //类型不兼容，编译错误
        char k = 'a';
//声明变量
        char e ;
//赋值
        e = 'e';
        System.out.println(e);
         //再次赋值
        e = 'f';
        System.out.println(e);


    }

}
