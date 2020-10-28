package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(500);
        boss.setBossDamage(50);
        boss.setBossDefense("mental");
        System.out.println("информация о боссе: " + boss.getBossHealth()+ " " + boss.getBossDamage()+
                " "+ boss.getBossDefense());
    }
}