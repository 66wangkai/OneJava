package com.Sun.java.day1;

public class Hello {
    public static void main(String[] args){
        System.out.println("这是一个简单的java程序");
        student stu = new student();
        stu.speak("We are students");



    }

}
 class student {
    public void speak(String s){
        System.out.println(s);


    }


 }