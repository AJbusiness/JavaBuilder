package com.aaron;

public class Trainee {
     //100 different variables
    private String name;
    private int age;
    private String technology;
    // etc.

    public Trainee(){

    }

    public Trainee(String name, int age, String technology){
        this.name = name;
        this.age = age;
        this.technology = technology;
        // etc.
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", technology='" + technology + '\'' +
                '}';
    }


    // etc., this gets unwieldy very quickly!
}
