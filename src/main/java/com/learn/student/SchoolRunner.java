package com.learn.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        System.out.println("請輸入名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("請輸入英文成績：");
        int english = scanner.nextInt();
        System.out.print("請輸入數學成績");
        int math = scanner.nextInt();
        Studentj stu = new Studentj(name,english,math);
        stu.print();
    }
}
