package com.sun.java.week14;


import javax.swing.*;
import java.io.*;


public class TextThread implements Runnable {
    private JLabel textLabel;

    public void setTextLabel(JLabel textLabel) {
        this.textLabel = textLabel;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            File filePath = new File("E:\\test.txt");
            BufferedReader br;
            String s = null;
            try {
                //符输入流中读取文本并缓冲字符
                br = new BufferedReader(new FileReader(filePath));
                while (true) {
                    try {
                        if (!((s = br.readLine()) != null)) {
                            break;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    textLabel.setText(s + "\r\n");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}

