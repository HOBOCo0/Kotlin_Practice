/*
Extension Function
   -> if we want to add methods to any class externally we can use extension functions
   -> use -> if we want to add new methods to any library we can use extension functions
Inline Function
   -> this keyword copies the whole function(body) at the function call instead of calling the function
   -> It improves the performance of the program in some cases ( while using anonymous functions because behind the
   their class is created)
   ->
*/

fun main() {
    println("hello there".formattedString())

    calculateTimeAndRun {
        loop(1000000)
    }
}

// this is how we define extension functions
fun String.formattedString():String{
    return "===================\n$this\n==================="
}

inline fun calculateTimeAndRun(fn:()->Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time Taken ${end-start} ms")
}
fun loop(n: Long){
    for (i in 1..n){

    }
}
