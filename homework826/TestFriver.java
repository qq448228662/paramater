package com.ptest.homework.homework826;

import org.junit.Test;

public class TestFriver {
    //finally 语句在return之前执行 。

    @Test
    public void test01(){
        System.out.println(""+doSth());
    }

    /**
     * finally 语句在return之前执行 。
     * @return
     */
    public int doSth(){
        int i=0;
        int j=1;

        try{
            return getSum(i++,++j);
        }catch (Exception e){
            return getSum(i++,++j);
        }finally {
            return getSum(i++,++j);

        }


    }
    public  int getSum(int i,int j){
        int k=j+i;
        return k;
    }


}
