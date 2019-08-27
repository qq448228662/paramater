package com.ptest.homework.teo;

import java.sql.SQLOutput;

public class Vehicle {

    protected    String brand;
    protected   String color;
    protected  double speed;

    public void run(){
        System.out.println("本汽车的品牌为"+this.brand+"本汽车的颜色为"+this.color+"本汽车目前的速度为"+this.speed);
    }
    Vehicle (){}

    public Vehicle(String brand, String color, double speed) {
        this.brand = brand;
        this.color = color;
        if (speed!=0){
            System.out.println("sorry您的初速度必须为0！");
        }else {
            this.speed = speed;
        }
        }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
