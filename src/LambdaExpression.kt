/*
Kotlin Lambdas
--> lambdas are anonymous functions without name
--> there are different types of lambda
    --> Single Line lambda
    --> Multi Line Lambda
    --> single Parameter Lambda

 */

fun main(){

    val singleLineLambda = {x:Int,y:Int -> x+y}
    val singleLineLambda2:(Int,Int) -> Int = {x,y -> x+y}

    val singleParameterLambda = {x:Int -> x*x}
    val singleParameterLambda2:(Int)-> Int = {x -> x*x}
    // if we have single parameter lambda we can use it like below
    val singleParameterLambda3:(Int)-> Int = {it*it}

    val multiLineLambda = {
        // In multiline line lambda last line is the return type of the lambda
        println("hello multiline lambda")
        2+3
        'x'
    }
    // lambda which does not return anything
    val sayHi = {msg:String -> println("Hello $msg")}

    // lambda function calls
    println(singleLineLambda(10,20))
    println(singleLineLambda2(10,20))
    println(singleParameterLambda(10))
    println(singleParameterLambda2(10))
    println(singleParameterLambda3(10))
    println(multiLineLambda())
    sayHi("kotlin")

    //passing lambda function as parameter
    calculator2(10,20,singleLineLambda)
    calculator2(20,30,{x,y -> x+y})
    // If lambda is the last parameter then we can write it like this during function call
    calculator2(20,30) { x, y -> x + y }
}

fun  calculator2(a:Int, b:Int,c:(Int,Int)->Int):Int{
    return c(a,b)
}