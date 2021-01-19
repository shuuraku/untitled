package com.learn;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix1：");
        double a[][] = new double[2][2];
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ; j<2 ; j++){
                a[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Enter matrix2：");
        double b[][] = new double[2][2];
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ; j<2 ; j++){
                b[i][j] = scanner.nextDouble();
            }
        }
        double[][] m = addMatrix(a,b);

        System.out.printf("%.1f %-5.1f%6.1f %-5.1f%6.1f %.1f\n",a[0][0],a[0][1],b[0][0],b[0][1],m[0][0],m[0][1]);
        System.out.printf("%.1f %-5.1f+%5.1f %-5.1f+%5.1f %.1f\n",a[1][0],a[1][1],b[1][0],b[1][1],m[1][0],m[1][1]);
    }

    public static double[][] addMatrix(double[][] a , double[][] b){
        double[][] m = new double[2][2];
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                m[i][j] = a[i][j] + b[i][j] ;
            }
        }
        return m;
    }
}
