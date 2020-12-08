package com.sun.java.week14;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author: SUN
 * @create: 2020/12/7 19:20
 * @description:
 **/

public class MainClass {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("frame.txt");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is));
            String str = null;
            while (true) {
                str = reader.readLine();
                if (str != null) {
                    System.out.println(str);
                } else {
                    break;
                }
            }

            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

