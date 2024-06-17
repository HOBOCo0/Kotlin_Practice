/*
Arrays in Kotlin
--> Object that stores multiple values of same type
--> Fixed size
 */

fun main() {
    val arr = arrayOf("one","two","three","four")
    println(arr.size)
    arr[0] = "king"

    for((i,e) in arr.withIndex()){
      println("$i ---> $e")
    }
    for(i in 0..arr.size-1){
        println(arr[i])
    }
    for(i in arr){
        println(i)
    }
}