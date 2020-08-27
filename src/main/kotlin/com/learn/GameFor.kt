package com.learn

import java.util.*
import kotlin.random.Random

fun main() {
    val secret = Random.nextInt(10)+1
    var scanner = Scanner(System.`in`)
    var guess = 0
    println(secret)
    for (i in 1..4){
        print("Please enter number(${i}/4)：")
        guess = scanner.nextInt()
        if (guess>secret){
            println("lower")
        }else if (guess < secret){
            println("higher")
        }else{
            println("The number is $secret")
            break
        }
    }
    println("結束")

    /*for (i in 5 downTo 2){
        print(i)
    }*/
}