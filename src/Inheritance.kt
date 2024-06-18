/*
   Inheritance
   ->In kotlin single inheritance is only supported.
   ->set of characteristics and behaviour which a child gets from its parent and the parent get it from grandparent
   ->Inheritance is also known as IS A Relationship
        example
        car is a Vehicle, truck is a vehicle
        cat is a Animal, dog is a Animal

    Summary
    * code Reusability
    * open Keyword (class A:B())
    * can not inherit from multiple classes
    * Parent class constructor is called before child class constructor
 */

open class Parent{
    init {
        println(" Parent constructor is called ")
    }
    val name: String ="Parent"
    fun myMethod(){
        println("I am $name")
    }
}
class Child : Parent(){
    init {
        println(" Child constructor is called ")
    }
    val name2:String = "Child"
    fun myMethod2(){
        println("I am $name2")
    }
}

fun main() {

    val obj = Child()
    println(obj.name)
    println(obj.name2)
    obj.myMethod()
    obj.myMethod2()
}