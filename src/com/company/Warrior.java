package com.company;

public class Warrior {
    private String warriorName;
    private int level;
    private int maxHealth;
    private int health;
    private int attack;
    private int defense;
    private int magicAttack;
    private int magicDefense;
    private int agility;
    private int wisdom;

    //creating a new warrior
    public Warrior(String name) {
        warriorName = name;
        level = 1;
        maxHealth = 20;
        health = maxHealth;
        attack = 10;
        defense = 8;
        magicAttack = 0;
        magicDefense = 4;
        agility = 8;
        wisdom = 2;
    }

    public Warrior(String name, int leveled) {
        warriorName = name;
        level = leveled;
        maxHealth = 20 * leveled;
        health = maxHealth;
        attack = 10 * leveled;
        defense = 8 * leveled;
        magicAttack = 0 * leveled;
        magicDefense = 4 * leveled;
        agility = 8 * leveled;
        wisdom = 2 * leveled;
    }
}
