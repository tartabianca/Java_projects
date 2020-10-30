package com.company;

public class Patient {

    int age;
    String fn,ln,reason;
    Patient(String fn,String ln,int age,String reason){
        this.fn=fn;
        this.ln=ln;
        this.age=age;
        this.reason=reason;
    }

    public void afisare(){
        System.out.println("First name: "+fn+"\nLast name: "+ln+"\nAge: "+age+"\nReason: "+reason+"\n");
    }

    public String getLn() {
        return ln;
    }

    public String getFn() {
        return fn;
    }

    public int getAge() {
        return age;
    }

    public String getReason() {
        return reason;
    }

}
