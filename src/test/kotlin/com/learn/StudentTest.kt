package com.learn

import com.learn.student.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest(){
    @Test
    fun highTest(){
        val stu = Student("Raku",60,80)
        Assertions.assertEquals(80,stu.highest())
    }
    @Test
    fun average(){
        val stu = Student("Raku",60,80)
        Assertions.assertEquals(70,stu.getAverage())
    }
    @Test
    fun gradingTest(){
        val stu = Student("Raku",60,80)
        Assertions.assertEquals('C',stu.grading())
    }
}