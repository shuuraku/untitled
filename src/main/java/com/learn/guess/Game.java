package com.learn.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        int number =0;
        while (number != secret){
            System.out.print("Please enter a number： ");
            number = scanner.nextInt();
            if (number > secret){
                System.out.println("lower");
            }else if (number < secret){
                System.out.println("higher");
            }else {
                System.out.println("Great! Number is " + secret);
            }
        }
        /*int i = 0;
        do {
            System.out.println(i);
            i++; -> i = i + 1;
        }while (i<3);*/
    }
}
