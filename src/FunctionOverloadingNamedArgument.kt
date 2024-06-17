/*
--> Function Overloading
    -> multiple functions with same name
        ->it can be achieved by implementing
            * same fun name but diff no of parameters
            * same name but diff parameter type
--> Named Argument
    -> it is used when we have multiple parameters so that it don't become confusing while passing arguments
--> Function type
    when we want to send functionality as a parameter
 */


fun main() {
    // function overloading and named parameters
    println(addition(10,20))
    println(addition(10,20,30))
    println(addition(num3=10, num2 = 20.00, num1=30))

    // function as a variable
    val into = ::multiply
    println(into(20,40))

    println(arithmetic(12,13,::multiply))
    println(arithmetic(11,12,into))
}

    fun addition(num1:Int, num2:Int) = num1+num2
    fun addition(num1:Int, num2:Int, num3:Int) = num1+num2+num3
    fun addition(num1:Int, num2:Double, num3:Int) = num1+num2+num3
    fun multiply(num1:Int, num2:Int) = num1 * num2

// way of taking function as a parameter
    fun arithmetic(num1:Int, num2:Int, x:(Int, Int)->Int):Int{
        return x(num1,num2)
}
/*
--------------------------- Output-------------------------------
30
60
60.0
800
156
132
 */
