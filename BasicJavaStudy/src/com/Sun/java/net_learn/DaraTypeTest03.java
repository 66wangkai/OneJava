package com.Sun.java.net_learn;

public class DaraTypeTest03 {
    public static void main(String[] args){
        //普通的n字符
        char c1 = 'n';
        System.out.println(c1);
        //依照目前所学知识，一下程序无法编译通过，因为显然是一个字符串，不能使用单引号括起来
        //但是经过编译，发现编译通过了，这说明以下并不是一个字符串，而是“一个"字符
        //反斜杠在java语言中具有转义功能
        char c2 = '\n';
        /*
        System.out.print("Hello");
        System.out.println("world!");
        注意两者之间的区别
        println输出之后换行，print表示输出，但是不换行
        */
        //System.out.print("hello");
        //System.out.println("world!");
        System.out.print("a");
        System.out.print(c2);
        System.out.println("b");

        //普通的t字符
        char x = 't';
        System.out.println(x);

        //制表符tab
        //强调： 制表符和空格不同，他们的ASCII不一样，体现在键盘上两个不同的按键。空格键和TAB建
        char y = '\t';
        System.out.println("a");
        System.out.println(y);
        System.out.println("b");

        char k = '\\';
        System.out.println(k);
        System.out.println("”HelloWorld!“");
        System.out.println("\"HelloWorld!\"");
        //转义字符的应用
        char m = '中';
        System.out.println(m);
        //jdk 中自带的native2ascii.exe命令，可以将文字转换成unicode编码形式
        //如何使用这个命令：
        //在命令行输入native2ascii，回车，然后输入文字之后回车即可得到unicode编码
        char n = '\u4e2d';
        //' 中'对应的unicode编码是4e2d
        System.out.println(n);

        //编译错误
        //char g = 'u4e2d'
        //通过： 反斜杠u联合起来后面的一串数字是某个文字的unicode编码
        char g = '\u4e2d';
        System.out.println(g);

    }

}
