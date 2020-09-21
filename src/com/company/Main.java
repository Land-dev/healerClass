package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Healer healer1 = new Healer("Sam");
        Healer healer2 = new Healer("Sarah", 10);
        Warrior warrior1 = new Warrior("Joe");
        Warrior warrior2 = new Warrior("Terence");
        Warrior warrior3 = new Warrior("Frank", 5);
        healer1.levelUp();
        warrior1.giveExperience(2020);
        warrior1.giveExperience(600);
        warrior1.giveExperience(500);
        healer2.giveExperience(1050);

        System.out.println(healer1);
        System.out.println(warrior1);

    }
}
