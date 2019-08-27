package com.ptest.homework.four;

public class HourlyEmployee extends ColaEmployee{

    private int hsalary;
    private  double hour;

    public HourlyEmployee(String name, int month, int birthday,double hour,int hsalary) {
        super(name, month, birthday);
        this.hsalary=hsalary;
        this.hour=hour;
        if (super.getBirthday()!=super.getMonth()&&super.getMonth()<=160){
            System.out.println("员工 "+name+month+"月的工资为"+(this.hour*this.hsalary+100));
        }
    }




}
