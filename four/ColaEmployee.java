package com.ptest.homework.four;


import java.sql.Date;

public  class ColaEmployee {
    protected String name;
    protected int month;
    protected int birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public ColaEmployee(String name, int month, int birthday) {
        this.name = name;
        this.month = month;
        this.birthday = birthday;
    }

    public  void getSalary(){

    }


}
