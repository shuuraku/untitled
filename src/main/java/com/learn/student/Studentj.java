package com.learn.student;

public class Studentj {
    String id;
    String name;
    int english;
    int math;

    public Studentj(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){
//        int max = (math>english)? math:english;
        /*if (math>english){
            max = math;
        }else {
            max = english;
        }*/
        return (math>english)? math:english;
    }

    public void print(){
        System.out.print(name + "\t" + english + "\t" + math
                + "\t" + getAverage());
        if (getAverage()>=60){
            System.out.println("\tPASS");
        }else {
            System.out.println("\tFAILED");
        }
    }
    public int getAverage(){
        return (english+math)/2;
    }
}
