package com.company;

public class Hero {
     private int heroHealth;
     private int heroDamage;
     private String heroPower;

     public Hero(){

     }
    public Hero(int heroHealth,int heroDamage){
    this.heroHealth = heroHealth;
    this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroPower() {
        return heroPower;
    }
}
