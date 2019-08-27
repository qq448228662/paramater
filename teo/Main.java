package com.ptest.homework.teo;

public class Main {
    public static void main(String[] args) {
        final Vehicle ve=new Vehicle("五菱荣光","金属银",0);
        ve.run();

        final  Car car=new Car("五菱荣光","金属银",0,8);
        car.run();
    }
}
