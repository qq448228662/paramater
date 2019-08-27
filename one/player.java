package com.ptest.homework.one;

public class player {
    public static class Players {
        private static int count = 0; //每 创建一个对象，count会加1
        private static int num = 11; //最多创建11个对象
        private String name;

        private Players() {
            count++;
        }

        private Players(String name) {
            this.name = name;

            count++;
        }

        public static Players createNewPlayer() {
            //count<num时，可以创建新的对象
            if (count < num) {
                return new Players();
            } else {
                return null;
            }
        }

        public static Players createNewPlayer(String name) {
            //count<num时，可以创建新的对象
            if(count < num) {
                return new Players(name);
            } else {
                return null;
            }
        }

        public static int getCount() {
            return count;
        }

        public static void setCount(int count) {
            Players.count = count;
        }

        public static int getNum() {
            return num;
        }

        public static void setNum(int num) {
            Players.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }


}
