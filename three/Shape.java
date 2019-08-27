package com.ptest.homework.three;

public abstract class Shape {
    protected int area;
    protected int per;
    protected  String color;


    public abstract void getArea();
    public abstract void getPer();
    public abstract void ShowAll();

    public Shape(){}
    public Shape(int area, int per, String color) {
        this.area = area;
        this.per = per;
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
