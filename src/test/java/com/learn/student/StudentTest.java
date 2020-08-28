package com.learn.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void StudentScoreTest(){
        Student student = new Student("Raku",60,90);
        Assertions.assertEquals(90,student.highest());
    }

    @Test
    public void AverageTest(){
        Student student = new Student("Raku",60,80);
        Assertions.assertEquals(70,student.getAverage());
    }
}
