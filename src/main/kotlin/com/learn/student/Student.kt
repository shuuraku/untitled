package com.learn.student

import java.util.*

fun main() {
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

class Student(var name: String,var english:Int,var math:Int){
    fun print(){
        println(name+"\t"+english+"\t"+math+"\t"+(english+math)/2)
    }
}