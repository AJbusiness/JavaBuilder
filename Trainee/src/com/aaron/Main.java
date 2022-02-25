package com.aaron;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	 Trainee t1 = new TraineeBuilder()
    .name("connor")
    .buildTrainee();// Trainee with values connor, o, nothing

        Trainee t2 = new TraineeBuilder()
    .name("jeff")
    .age(19)
    .technology("devops")
    .buildTrainee(); // Trainee with values jeff, 19, devops
        System.out.println(t1);
        System.out.println(t2);
    }

}
