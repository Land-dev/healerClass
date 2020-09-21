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
    private int experience;

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

    public void levelUp() {
        level++;
        maxHealth = 20 * level;
        health = maxHealth;
        attack = 10 * level;
        defense = 8 * level;
        magicAttack = 0 * level;
        magicDefense = 4 * level;
        agility = 8 * level;
        wisdom = 2 * level;
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
        String warriorInfo = "";
        warriorInfo += "Name: " + warriorName + "\n";
        warriorInfo += "Level " + level + " Warrior\n";
        warriorInfo += "Current Exp: " + experience + "\n";
        warriorInfo += health + "/" + maxHealth + " Health\n";
        warriorInfo += "Attack: " + attack + "  Defense: " + defense + "\n";
        warriorInfo += "Magic Attack: " + magicAttack + "  Magic Defense: " + magicDefense + "\n";
        warriorInfo += "Agility: " + agility + "  Wisdom: " + wisdom + "\n\n";

        return warriorInfo;
    }
}
