package com.learn.student

import java.util.*

fun main() {
//    userinput()
    val stu = Student("raku", 66,88)
    stu.print()
    println("Highest score: ${stu.highest()}")
}

class Student(var name: String,var english:Int,var math:Int){
    fun highest():Int{
        var max = if (math>english) math else english
       /* var max = if (math>english) {
            println("math　")
            math
        } else {
            println("english　")
            english
        }*/
        return max
    }

    fun print(){
        println(name+"\t"+english+"\t"+math+"\t"+ getAverage() + if (getAverage()>=60) "\tPASS" else "\tFAILED")
    }

    fun getAverage():Int{
        return (english+math)/2
    }
}

private fun userinput() {
    val scanner = Scanner(System.`in`)
    print("請輸入名字：")
    var name = scanner.next()
    print("請輸入英文成績：")
    var english = scanner.nextInt()
    print("請輸入數學成績：")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
}
