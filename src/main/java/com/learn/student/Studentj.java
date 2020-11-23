package com.learn.student;

public class Studentj {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;

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
                + "\t" + getAverage() + ((getAverage()>=pass)? "\tPASS":"\tFAILED"));
        char grading ;
        switch (getAverage()/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading ='B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println("\t"+grading);
        /*if(getAverage()>=90 && getAverage() <=100){
            grading = 'A';
        }else if (getAverage()>=80 && getAverage() <90){
            grading = 'B';
        }else if (getAverage()>=70 && getAverage() <80){
            grading ='C';
        }else if (getAverage()>=60 && getAverage()<70){
            grading ='D';
        }else {
            grading ='F'
        }*/
      /*  if (getAverage()>=60){
            System.out.println("\tPASS");
        }else {
            System.out.println("\tFAILED");
        }*/
    }
    public int getAverage(){
        return (english+math)/2;
    }
}
