package com.learn

import java.io.File

fun main() {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }

//    p_writer()
//    b_writer()
}


//    File("output.txt").writeText("abc");
private fun b_writer() {
    File("output.txt").bufferedWriter().use {
        it.write("abc\n")
        it.write("123\n")
        it.write("def\n")
    }
}

private fun p_writer() {
    File("output.txt").printWriter().use {
        it.println("abc")
        it.println("123")
        it.println("456")
    }
}