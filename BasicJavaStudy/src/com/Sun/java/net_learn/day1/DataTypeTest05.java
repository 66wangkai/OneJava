package com.sun.java.net_learn.day1;

/**
 * @author: SUN
 * @create: 2020/12/19 18:02
 * @description:
 **/

public class DataTypeTest05 {

    public static void  main(String[] args){
    //100l是long类型的字面值
        //x是long类型变量
        //不存在类型转换，直接赋值
        long x = 100L;
        //x变量是long类型，8个字节
        //y变量是int类型，4个字节
        //以下程序可以编译通过吗？
        //int y = x ;
        //编译出错，大容量不能赋值给小容量
        //大容量转换成小容量，需要进行强制类型转换
        //强制类型转换需要加“强制类型转换符”
        //加上强制类型转换符之后编译通过了，但是运行阶段可能导致损失精度
        //所以强制类型转换谨慎使用，因为损失精度之后可能损失很严重


        //强制转换原理
        //00000000 00000000 00000000 00000000 00000000 00000000 00000000 01100100
        //强转之后的数据： 00000000 00000000 00000000 01100100
        //将左边的二进制砍掉【所有的数据强转的时候都是这样完成的】
        int y = (int)x;
        System.out.println(y);

        //原始数据：00000000 00000000 00000000 00000000 10000000 00000000 00000000 00000000
        //强转之后的数据： 10000000 00000000 00000000 00000000
        //10000000 00000000 00000000 00000000目前存储在计算机内部，计算机存储数据采用补码的形式
        //所以 10000000 00000000 00000000 00000000 现在是一个补码形式
        //将以上的补码转到原码就是最终的结果
        long k = 2147483648L;
        int e = (int)k;
        System.out.println(e);
        //损失精度严重，结果是负数【-2147483648】

        //分析以下程序是否可以编译通过？
        //依据目前所学内容，以下程序是无法编译通过的
        //理由; 50 是 int类型的字面值， b是byte类型的变量，显然是大容量int转换成小容量byte。
        //大容量转换成小容量是需要添加强制类型转换符的，以下程序没有添加强转符号，所以编译报错。
        //但是，在实际编译的时候，以下代码编译通过了，这说明： 在java语言当中，当一个整数型字面值
        //没有超出byte类型取值范围的话，该字面值可以直接赋值给byte类型的变量。
        byte b = 50 ;
        byte c = 127 ;
        //byte b1 = 128 ;
        //byte 超出范围了， 所出错了，byte是sun公司的宠儿



    }


}
