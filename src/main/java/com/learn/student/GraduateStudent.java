package com.learn.student;

public class GraduateStudent extends Studentj {
    int thesis;
    static int pass = 70;
    public GraduateStudent(String name,int english, int math , int thesis){
        super(name, english, math );
        this.thesis = thesis;
    }

    @Override
    public void print() {
        System.out.print(name + "\t" + english + "\t" + math + "\t" + thesis
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
    }

    @Override
    public int getAverage() {
        return (english+math+thesis)/3;
    }
}
