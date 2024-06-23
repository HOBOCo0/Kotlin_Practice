 /*
 Function variable
 --> We can store functions in variables
 --> this is mostly used when we want to pass functionality as parameter

 Higher Order Function
  a function which takes function as input or returns function or do both
  */

 fun main() {
     // ways of defining function variables
     val add = ::sum
     val minus: (Int,Int)->Int = ::sub

     println(add(10,5))
     println(minus(100,50))

     // Higher order function call
     calculate(50,50,::sum)
     calculate(50,40,add)
     calculate(50,40,::sub)

     // invoking higerOrderFun() and returning a mul()function and storing in multipply

     val multipply = higherOrderFun()
     println(multipply(10,5))
 }

 fun sum(a:Int, b:Int) = a+b

 fun sub(a:Int, b:Int) = a-b

 fun mul(a:Int, b:Int) = a*b

 // higher order function declaration which takes a function n returns unit
 fun calculate(x:Int, y:Int, z:(Int,Int)->Int){
     println(z(x,y))
 }

 // higher order function declaration which returns a function
 fun higherOrderFun():(Int,Int)->Int{
     return ::mul
 }
