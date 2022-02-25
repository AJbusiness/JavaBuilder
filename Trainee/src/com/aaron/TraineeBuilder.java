package com.aaron;

public class TraineeBuilder {
    private String name; //we do not want a default name.​
    private int age = 0; //default age​
    private String technology = "nothing"; //default technology​

    @Override
    public String toString() {
        return "TraineeBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", technology='" + technology + '\'' +
                '}';
    }

    //Method 1
    public TraineeBuilder(){}

    //Method 2
    public Trainee buildTrainee(){
        return new Trainee(name,age,technology);
    }
    //Method 3
    public TraineeBuilder name(String passedName){
        this.name = passedName;
        return this;
    }

    //Method 4
    public TraineeBuilder age(int passedAge){
        this.age = passedAge;
        return this;
    }

    //Method 5
    public TraineeBuilder technology(String passedTechnology){
        this.technology = passedTechnology;
        return this;
    }

}
