package com.company;

public class Boss {
    private  int bossHealth;
    private  int bossDamage;
    private  String bossDefense;

    public Boss(){

    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossDefense() {
        return bossDefense;
    }

    public void setBossDefense(String bossDefense) {
        this.bossDefense = bossDefense;
    }
}

