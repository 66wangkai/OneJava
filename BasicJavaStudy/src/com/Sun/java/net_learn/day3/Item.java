package com.sun.java.net_learn.day3;

/**
 * @author: SUN
 * @create: 2020/12/22 16:03
 * @description:
 **/
public class Item {
    String name;
    int price;
    public static void main(String[] args){
        Item potion = new Item();
        potion.name = "血瓶";
        potion.price = 50;

        Item shoe = new Item();
        shoe.name = "草鞋";
        shoe.price = 300;

        Item sword = new Item();
        sword.name = "长剑";
        sword.price = 350;



    }
}
