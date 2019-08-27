package com.ptest.homework.one;

public class testP {
    public static void main(String[] args) {
        while(true){
             player.Players player= com.ptest.homework.one.player.Players.createNewPlayer();
            if(player == null) {
                System.out.println("对不起，已经创建了" + com.ptest.homework.one.player.Players.getNum() + "个球员对象");
                break;
            } else {
                System.out.println("创建了第" + com.ptest.homework.one.player.Players.getCount() + "个球员对象！");

             }
        }
    }
}
