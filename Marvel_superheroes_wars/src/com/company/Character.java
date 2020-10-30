package com.company;

public class Character {

    int id,attack;
    double health;
    String description,name;
    boolean isVillain;

    Character(){}

    Character(int attack,int health,int id, String description, String name, boolean isVillain)
    {
        this.attack=attack;
        this.health=health;
        this.id=id;
        this.description=description;
        this.name=name;
        this.isVillain=isVillain;
    }

    void display()
    {
        System.out.println("Id: "+id+"\nName: "+name+"\nDescription: "+description+"\nAttack: "+attack
                +"\nHealth: "+health+"\nIsVillan: "+isVillain+"\n");
    }


}
