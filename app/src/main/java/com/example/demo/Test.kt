package com.example.demo

fun main() {
    val p = Person("guan", "xilin")
    val numbers = arrayOf(1,2,3,1.2)
    println(numbers.contentToString())

    val daysOfWeek = mapOf(1 to "wen", 2 to "wqa")
    for (key in daysOfWeek.keys){
        println("$key is to ${daysOfWeek[key]}")
    }
    val arr = ArrayList<String>()
    arr.add("one")
    arr.add("two")
    for (i in arr){
        println(i)
    }
    val another = Another()
    println(another.getValue())
    val b = Base()
    b.d
    val obj:Int = 123
    val str = obj as? String
    println(str)
}

fun func1( a: Int){
    var a = a
    println(a)
}
class Person(firstName: String = "jon", lastName:String="xil") {
    var age: Int? = null
    var firstName :String =firstName
    init {
        println("hello $firstName, $lastName")
    }
    fun say(){
        println("$firstName ")
    }
}

open class Vehicle{

}
open class Car: Vehicle(){

}
class ElectricCar: Car(){

}
open class Base{
    private var b = 2
    open protected val i = 5
    internal var d = 4
}
class Another: Base(){
    fun getValue(): Int{
        return d
    }

    override val i=10
}