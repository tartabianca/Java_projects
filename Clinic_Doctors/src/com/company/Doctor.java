package com.company;

public class Doctor {

    int id,age;
    String fn,ln;

    Doctor(int id,String fn,String ln,int age){
        this.id=id;
        this.age=age;
        this.fn=fn;
        this.ln=ln;
    }

    public void afisare(){
        System.out.println("ID: "+id+"\nFirst name: "+fn+"\nLast name: "+ln+"\nAge: "+age+"\n");
    }

    public int getAge() {
        return age;
    }

    public String getFn() {
        return fn;
    }

    public String getLn() {
        return ln;
    }

    public int getId() {
        return id;
    }
}
