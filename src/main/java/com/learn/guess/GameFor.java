package com.learn.guess;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int guess;
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1;i<=4;i++){
            System.out.print("Please enter number("+i+"/4)：");
            guess = scanner.nextInt();
            if (guess > secret){
                System.out.println("lower");
            }else if (guess < secret){
                System.out.println("higher");
            }else {
                System.out.println("The number is "+secret);
                break;
            }
        }
        System.out.println("結束");
    }
}
