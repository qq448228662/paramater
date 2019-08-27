package com.ptest.homework.four;

public class Main {
    public static void main(String[] args) {
        ColaEmployee[]y=new ColaEmployee[6];
        y[0]=new SalariedEmployee("tofm", 2, 2, 2000);
        y[1]=new HourlyEmployee("tom", 4, 4, 120, 13);
        y[2]=new SalariedEmployee("to", 6, 6, 2000);
        y[3]=new SalariedEmployee("tm", 3, 3, 2000);
        y[4]=new SalesEmployee("tosm", 7, 7, 20000, 0.13);
        y[5]=new SalesEmployee("tmu",8, 8, 20000, 0.13);

    }
}
