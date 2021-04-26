package com.company;

public class Hero {
    private int health;
    private int damage;
    private String Attack;

    public Hero(int health, int damage, String attack) {
        this.health = health;
        this.damage = damage;
        Attack = attack;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttack() {
        return Attack;
    }
}
