package com.company;

import java.util.Random;

public class Team {
    Character v=new Character();
    Character s=new Character();
    Planet p=new Planet();

    Team(){}

    Team(Planet p,Character v,Character s)
    {
        this.p=p;
        this.s=s;
        this.v=v;
        s.attack+=p.heroAttackModifier;
        s.health+=p.heroHealthModifier;
        v.attack+=p.villainAttackModifier;
        v.health+=p.villainHealthModifier;
    }

    public void display()
    {
        System.out.println("Team: "+v.name+" - "+ s.name+" on "+p.name);
    }

    public void setP(Planet p) {
        this.p = p;
    }

    public void setS(Character s) {
        this.s = s;
    }

    public void setV(Character v) {
        this.v = v;
    }

    public void fight()
    {

        while(v.health>0 && s.health>0)
        {
            Random r = new Random();
            v.health-= s.attack;
            s.health-= v.attack;
            System.out.println(s.name+" -> "+ v.name+" ("+v.name+": "+v.health+")");
            System.out.println(v.name+" -> "+ s.name+" ("+s.name+": "+s.health+")");


            if(v.health<=0)
                System.out.println("Superhero "+ s.name +" won!");
            if(s.health<=0)
                System.out.println("Villain "+ v.name +" won!");

        }
    }
}
