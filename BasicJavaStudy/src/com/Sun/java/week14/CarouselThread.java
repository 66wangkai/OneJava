package com.sun.java.week14;
import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * @author: SUN
 * @create: 2020/12/7 18:57
 * @description:
 **/

public class CarouselThread implements Runnable{
    private String[] imgs = {
            "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2703743286,994884331&fm=26&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1344801497,3054664199&fm=26&gp=0.jpg",
            "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=219731096,1531025784&fm=26&gp=0.jpg",
            "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1003059189,3750231644&fm=26&gp=0.jpg"
    };
    private  JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel){
        this.bgLabel = bgLabel;
    }


    @Override
    public void run(){
        int index = 0;
        int len = imgs.length;

        while (true){
            try{
                URL url = new URL(imgs[index]);
                //创建了连接
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(5000);
                //得到连接目标的字节输入流
                InputStream is = conn.getInputStream();
                //字节缓冲输出流
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                //缓冲区
                byte[] buffer = new byte[1024];
                int length = 0;
                //通过缓冲区读取文件
                while((length = is.read(buffer))!= -1){
                    baos.write(buffer,0,length);
                }
                byte[] bytes = baos.toByteArray();
                //将字节数组通过字节输入流读入
                is.read(bytes);
                //通过bytes构建图标icon
                Icon icon = new ImageIcon(bytes);
                //将icon设置为背景标签的图标
                this.bgLabel.setIcon(icon);
                Thread.sleep(2000);
                is.close();
                baos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            index++;
            //处理数组最后一个元素
            if (index == len){
                index = 0;
            }
        }


    }
}
