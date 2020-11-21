package com.learn

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter =
            LocalDateTime.of(2020,12,19,9,0,0)
    val leave =
            LocalDateTime.of(2020,12,19,12,13,0)
    var car = Car("A0-0001",enter)
    car.leave = leave
    println(car.duration())
    val hours = Math.ceil((car.duration()/60.0)).toLong()
    println(hours)
    println(hours*30)
}

class Car(val id:String,val enter:LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value)) field = value
        }

    fun duration() = Duration.between(enter,leave).toMinutes()

}