package com.epam.jwd.model;

public class Person {
    private int id;
    private int age;
    private String name;
    private String secondName;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public String getSecondName(){
        return this.secondName;
    }
}
