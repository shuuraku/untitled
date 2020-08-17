package com.learn

fun main() {
//    println("hello")
    var x:String? = "abcde"
    x = null
    println(x?.length)
//    println(x!!.length) -> 會直接出現NullPointerException的訊息，不會輸出null;
    println(x?.get(3))
    println(x?.substring(2))

    var y = "abcdef"
    println(y.length)
    println(y.get(2))
    println(y.substring(1,3))

    val h = Human(weight = 66.5f,height = 1.7f) //val h = Human(66.5f,1.7f)
    h.hello()
    println(h.bmi())
    val s = 75
    println(s >70 && s< 80)
    val c :Char = 'A'
    println(c.toInt() < 60 || c.toInt() > 60)


    /*val age : Int = 19
    var age2 : Int = 18
    age2 = 19
    var f = 1.1f
    var f2 : Float = 1.1f
    val name = "AA"
    var name2 : String*/

}
class Human(var name:String = "",var weight:Float,var height:Float) {
    // class Human(var weight:Float,var height:Float,var name:String = "")
    init {
        println("test $weight")
    }
//    constructor(name: String,weight: Float,height: Float):this(weight, height)
    fun bmi():Float{
        val bmi = weight/(height*height)
        return bmi
    }

    fun hello(){
        println("hello kotline")
    }
}