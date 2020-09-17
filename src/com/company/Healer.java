package com.company;

public class Healer {
    private String healerName;
    private int level;
    private int maxHealth;
    private int health;
    private int attack;
    private int defense;
    private int magicAttack;
    private int magicDefense;
    private int agility;
    private int wisdom;

    //creating a new Healer
    public Healer(String name) {
        healerName = name;
        level = 1;
        maxHealth = 16;
        health = maxHealth;
        attack = 4;
        defense = 6;
        magicAttack = 5;
        magicDefense = 10;
        agility = 3;
        wisdom = 12;
    }

    //higher level healer
    public Healer(String name, int leveled) {
        healerName = name;
        level = leveled;
        maxHealth = 16 * level;
        health = maxHealth;
        attack = 4 * level;
        defense = 6;
        magicAttack = 5 * level;
        magicDefense = 10 * level;
        agility = 3 * level;
        wisdom = 12 * level;
    }


}
