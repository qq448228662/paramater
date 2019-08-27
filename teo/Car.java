package com.ptest.homework.teo;

public class Car extends Vehicle {
    private int loader;

    Car(){}

    public Car(String brand, String color, double speed, int loader) {
        super(brand, color, speed);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public void run(){
        System.out.println("本汽车的品牌为"+super.brand+"本汽车的颜色为"+super.color+"本汽车目前的速度为"+super.speed+"本汽车荷载人数"+this.loader);
    }


}
