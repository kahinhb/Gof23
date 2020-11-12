package com.hb.prototype.demo01;

import java.util.Date;

public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video video = new Video("我爱java", date);
        Video video2 =(Video) video.clone();
        System.out.println("v1=>"+video);
        System.out.println("v2=>"+video2);

        System.out.println("==============");
        date.setTime(22222222);

        System.out.println("v1=>"+video);
        System.out.println("v2=>"+video2);
       // System.out.println("v1=>"+video.hashCode());
       // System.out.println("v1=>"+video.hashCode());
    }
}
