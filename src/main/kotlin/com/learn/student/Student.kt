package com.learn.student

import java.util.*

fun main() {
//    userinput()
    Student.pass = 50
    val stu = Student("raku", 66,88)
    val stu2 = Student("Eric", 66,44)
    val stu3 = Student("Jane", 20,50)
    stu.print()
    stu2.print()
    stu3.print()
    println("Highest score: ${stu.highest()}")
}

class Student(var name: String,var english:Int,var math:Int){
    companion object{
        @JvmStatic
        var pass = 60
        fun test(){
            println("testing")
        }
    }

//----------------------
    fun highest() = if (math>english) math else english
       /* fun highest():Int {
       var max = if (math>english) math else english
        var max = if (math>english) {
            println("math　")
            math
        } else {
            println("english　")
            english
        }
        return max
    }*/
//----------------------
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${if (getAverage()>=pass) "PASS" else "FAILED"}\t${grading()}")
        /*print(name+"\t"+english+"\t"+math+"\t"+ getAverage() + if (getAverage()>=60) "\tPASS" else "\tFAILED")
        println("\t"+ grading())*/
    }
//-----------------------
    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
    /*fun grading():Char{
        var grading:Char = when(getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }
        return grading
    }*/
//------------------------

    /*fun getAverage():Int{
        return (english+math)/2
    }*/
    fun getAverage() = (english+math)/2
}
//------------------------
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
