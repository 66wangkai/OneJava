package com.sun.java.net_learn;

/**
 * @author: SUN
 * @create: 2020/12/18 21:19
 * @description:
 **/
public class DaraTypeTest04 {
    public static void main(String[] args){
    int a = 10 ;
    int b = 010;
    //整数型字面值以0开头的，后面的一串数字就是8进制形式
        int c =0x10;
        //整数型字面值以0x开头的，后面那一串数字就是十六进制形式
        System.out.println(a);
        //10
        System.out.println(b);
        //8
        System.out.println(c);
        //16
        System.out.println(a+b+c);
        //34
        //123这是个整数型字面值是int类型
        /*
        i变量声明的时候是也是int类型
        int类型的123赋值给int类型的变量i，不存在类型转换
         */
        int i = 123 ;
        System.out.println(i);

        /*
        456整数型字面值被当作int类型，占用4个字节
        x变量在声明的时候是long类型，占用8个字节
        int类型的字面值456赋值给long类型的变量x。存在类型转换
        int类型转换成long类型
        int类型是小容量
        long类型是大容量
        小容量可以自动转换成大容量，称为自动类型转换机制

         */
        long x = 456 ;
        System.out.println(x);

        //2147483647
        /*
        上面的这个数字面值是int类型，占用4个字节
        y是long类型，占用8个字节，自动转化类型哦

         */
        long y = 214748347;
        System.out.println(y);
        /*
        编译错误：过大的整数：23344543434
        343434344上面的数被当作int类型4个字节处理。但是这个字面值超过int类型范围
        long z = 214344533

        解决错误
        213饿3243342字面值一上来就当作long类型来处理，在字面值后面添加L
        23432452455L是8个字节的long类型

         */
        long z = 2147483648L;
        System.out.println(z);
    }
}
