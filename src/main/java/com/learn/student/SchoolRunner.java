package com.learn.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userinput();
        Studentj.pass = 50;
        Studentj stu = new Studentj("raku",60,40);
        Studentj stu2 = new Studentj("eric",55,50);
        Studentj stu3 = new Studentj("ryu ",20,60);
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println(stu.highest());
    }

    private static void userinput() {
        System.out.println("請輸入名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("請輸入英文成績：");
        int english = scanner.nextInt();
        System.out.print("請輸入數學成績：");
        int math = scanner.nextInt();
        Studentj stu = new Studentj(name,english,math);
        stu.print();
        System.out.println(stu.highest());
    }
}
