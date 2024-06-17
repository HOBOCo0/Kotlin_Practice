/*
-->Functions and its different flavours
    ->functions are block of code to perform certain functionality
    ->Helps to reuse code

--> Single Line functions
    ->single line functions are used when we have single statement or single expression
    in a function to improve readability.

--> Default Arguments
    -> default arguments are given in a function to run functions with default values if values are not provided.

--> Unit Functions
    ->functions with no return type
*/

fun main() {
    println(add(10,20))
    println(evenOdd(23))
    println(singleLineAddVariation1(24,56))
    println(singleLineAddVariation2(246,564))
    println(printSomething("Aman"))
    println(multiplyGame(5,4))
    println(multiplyGame(5))
}

// Functions to perform addition of two numbers
fun add( num1:Int, num2:Int):Int{
    val sum = num1 + num2
    return  sum
}
// function to find even or odd
fun evenOdd(num:Int):String{
     return if(num%2 == 0) "even" else "odd"
}
// single line functions for add
fun singleLineAddVariation1(num1:Int, num2:Int):Int = num1 + num2

fun singleLineAddVariation2(num1:Int, num2:Int) = num1 + num2

// Unit Functions
fun printSomething(name:String):Unit = println("hey $name")

//Default Argument
fun multiplyGame(num1:Int, num2:Int = 0 ):Int {
    return num1*num2
}
/*
---------------------output----------------------
30
odd
80
810
hey Aman
kotlin.Unit
20
0
 */
