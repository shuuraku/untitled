package com.learn

import java.util.*
import kotlin.random.Random

fun main() {
//    val scanner = Scanner(System.`in`)
    val secret = Random.nextInt(10)+1
    println(secret)
    var number : Int = 0
    while (number != secret){
        print("Please enter number：")
        number = readLine()!!.toInt()
//        number = scanner.nextInt()
        if (number > secret){
            println("lower")
        }else if (number < secret){
            println("higher")
        }else{
            println("Great! Number is $secret")
        }
    }

}