/*
Loops are of four type in Kotlin
1.while 2.Do while 3.for 4.for each

Ranges
 1. a..b
 2. until
 3. down to
 4. step

 String templating
 using the $ sign to access the variables in the string
 */

// Loops Variations

fun main() {
    for(i in 1..5){
        println(i) // 12345
    }
    for(i in 1 until 5)
    {
        println(i) // 1234
    }
    for(i in 5 downTo 1){
        println(i) //54321
    }

    for(i in 1..10 step 2){
        println(i) // 1,2,4,6,8,10
    }

    for(i in 10 downTo 1 step 2){
        println("the number is $i") //10,8,6,4,2,1
    }
}
//-------------------------Output----------------------------
/*
1
2
3
4
5
1
2
3
4
5
4
3
2
1
1
3
5
7
9
the number is 10
the number is 8
the number is 6
the number is 4
the number is 2
 */