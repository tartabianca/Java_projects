package com.company;

public class Planet {

    String description,name;
    int id,heroAttackModifier,heroHealthModifier,villainAttackModifier,villainHealthModifier;
    Planet(){};

    Planet(String description,String name,int heroAttackModifier,int heroHealthModifier,int villainAttackModifier,int villainHealthModifier,int id)
    {
        this.description=description;
        this.name=name;
        this.heroAttackModifier=heroAttackModifier;
        this.heroHealthModifier=heroHealthModifier;
        this.villainAttackModifier=villainAttackModifier;
        this.villainHealthModifier=villainHealthModifier;
        this.id=id;
    }

    void display()
    {
        System.out.println("Id: "+id+"\nName: "+name+"\nDescription: "+description+"\nHeroAttackModifier: "+heroAttackModifier
                +"\nHeroHealthModifier: "+heroHealthModifier+"\nVillainAttackModifier: "+villainAttackModifier
                +"\nVillainHealthModifier: "+villainHealthModifier+"\n");
    }

}
