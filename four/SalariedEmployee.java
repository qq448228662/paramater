package com.ptest.homework.four;

public class SalariedEmployee extends ColaEmployee{

    private double Msalary;

    public SalariedEmployee(String name, int month, int birthday,int Msalary) {
        super(name, month, birthday);

        if (super.getMonth()==super.getBirthday()){
            System.out.println("员工 "+name+month+"月的工资为"+(Msalary+100));
        }else{
            System.out.println("员工 "+name+month+"月的工资为"+(Msalary));
        }
    }



}
