/*
-----> "object keyword" and object declaration
-> There is a feature in kotlin we can make objects directly without creating any class
-> class and its single object is created at once
-> no constructor is allowed (init block is allowed)
-> used to implement singleton pattern concepts(restricting classes to have only single objects)
-> classes and interfaces can be inherited
USES
-> If we want to make single object in our program we can use the object declaration method or we can say if we want
   to implement singleton in our program.
-> If we want to have multiple objects in our  program we can define classes.

------> "object expression"
-> anonymous objects without name, but we use object keyword
-> It is the replacement of Java's Anonymous Inner class
 */

object obj1{
 val num:Int = 10
}

object obj2{
    val num1: Int = 10
    val num2: Int = 20
    fun printSum() = num1+ num2
    fun printAnotherSum( x:Int, y:Int) = x+y
}

object widget {
    private var twitterLikes = 0
    private var facebookLikes = 0

    fun twitterLikesInc() = twitterLikes++
    fun facbookLikesInc() = facebookLikes++
    fun displaylikes() {
        println("Twitter --$twitterLikes")
        println("facebook --$facebookLikes")
    }
}

interface Multiply{
    fun multiply()
}

open class Addition(val x: Int, val y: Int){
    open fun Add(){
        println(" Sum of x + y is "+ (x+y))
    }
}

fun main() {
    println(obj2.num1)
    println(obj2.num2)
    println(obj2.printSum())
    obj2.printAnotherSum(20, 30)
    widget.facbookLikesInc()
    widget.facbookLikesInc()
    widget.facbookLikesInc()
    widget.twitterLikesInc()
    widget.twitterLikesInc()
    widget.displaylikes()
    widget.facbookLikesInc()
    widget.displaylikes()

    // Anonymous Object

    val obj3 = object{
        private var x: Int = 10
        var y:Int = 201212
        fun printSum() = x+y
    }
    println(obj3.y)
   println( obj3.printSum())

    val obj4 = object:Addition(234,567),Multiply{
       private val a:Int = 10
        private val b:Int = 20
        override fun multiply() {
            println(a*b)
        }
        override fun Add(){
            super.Add()
        }
    }

    println(obj4.x)
    println(obj4.y)
    println(obj4.multiply())
    println(obj4.Add())
}

/*
-------------------------------output---------------------------------------
10
20
30
Twitter --2
facebook --3
Twitter --2
facebook --4
201212
201222
234
567
200
kotlin.Unit
 Sum of x + y is 801
kotlin.Unit

 */