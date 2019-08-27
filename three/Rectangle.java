package com.ptest.homework.three;

public class Rectangle extends Shape {
    private int Width;
    private int Height;

    public Rectangle( String color, int width, int height) {
       this.color=color;
        this.Width = width;
        this.Height = height;
    }

    @Override
    public void getArea() {
        this.area=this.Height*this.Width;
    }

    @Override
    public void getPer() {
        this.per=2*(this.Height+this.Width);
    }

    @Override
    public void ShowAll() {
        System.out.println("本图形的宽"+this.Height+"本图形的长为"+this.Width+"本图形的面积"+this.area+"本图形的周长"+this.per+"颜色"+this.color);
    }
}
