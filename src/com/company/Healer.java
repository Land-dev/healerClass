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
    private int experience;

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
        experience = 0;
    }

    //higher level healer
    public Healer(String name, int leveled) {
        healerName = name;
        level = leveled;
        maxHealth = 16 * leveled;
        health = maxHealth;
        attack = 4 * leveled;
        defense = 6 * leveled;
        magicAttack = 5 * leveled;
        magicDefense = 10 * leveled;
        agility = 3 * leveled;
        wisdom = 12 * leveled;
        experience = 0;
    }

    public void levelUp() {
        level++;
        maxHealth = 16 * level;
        health = maxHealth;
        attack = 4 * level;
        defense = 6 * level;
        magicAttack = 5 * level;
        magicDefense = 10 * level;
        agility = 3 * level;
        wisdom = 12 * level;
    }

    public void giveExperience (int exp) {
        if(exp > 1000)
            exp = 1000;
        experience += exp;
        if (experience >= 1000) {
            levelUp();
            experience -= 1000;
        }
    }

    @Override
    public String toString() {
        String healerInfo = "";
        healerInfo += "Name: " + healerName + "\n";
        healerInfo += "Level " + level + " Healer\n";
        healerInfo += "Current Exp: " + experience + "\n";
        healerInfo += health + "/" + maxHealth + " Health\n";
        healerInfo += "Attack: " + attack + "  Defense: " + defense + "\n";
        healerInfo += "Magic Attack: " + magicAttack + "  Magic Defense: " + magicDefense + "\n";
        healerInfo += "Agility: " + agility + "  Wisdom: " + wisdom + "\n\n";

        return healerInfo;
    }
}
