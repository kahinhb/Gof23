package com.hb.prototype.demo01;


import java.util.Date;

//1.实现一个接口 Cloneable
//2.重写一个方法 clone()
public class Video implements Cloneable{

    private String name;
    private Date creatTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Object obj =super.clone();

       Video v= (Video)obj;
       v.creatTime= (Date) this.creatTime.clone();
       return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Video() {
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }

    public Video(String name, Date creatTime) {
        this.name = name;
        this.creatTime = creatTime;
    }
}
