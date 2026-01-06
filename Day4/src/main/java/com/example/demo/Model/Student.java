package com.example.demo.Model;

public class Student {
    private int id;
    private String name;
    private float mark;
    
    public Student(int id,String name,float mark) {
        this .id=id;
        this.name=name;
        this.mark=mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return mark;
    }
    public void setPrice(float price) {
        this.mark = price;
    }
}