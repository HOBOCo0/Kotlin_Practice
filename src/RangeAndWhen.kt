/*
Ranges
--> 1..5 = 1,2,3,4,5   (end included)
--> 1 until 5 = 1,2,3,4(end not included)

--------------------------------------------------------------
When Statement
--> similar to switch in java
--> use when you have lots of option to check
--> better than if else block saves from nesting and improves readability
 */

// check whether no lies b/w 1 to 5.

fun main(){
    // Ranges
    var number = 5
    var result = number in 1..5
    println(result)

    var result2 = number in 1 until 5
    println(result2)
 //---------------------------------------------------------------------------//
    // When(variation 1)
    var animal = "Dog"
    when(animal){
        "Horse" ->  println("Animal is horse")
        "Cat"   ->  println("Animal is cat")
        "Dog"   ->  println("Animal is Dog")
        else    ->  println(" Not an Animal")
    }
    // When as expression
    // example 1
    var result3 = when(animal){
        "Horse" -> "Animal is horse"
        "Cat" -> " Animal is cat"
        "Dog" -> "Animal is Dog"
        else -> "Not an animal"
    }
    println(result3)
    //Example 2
    var result4 = when(number){
        1 -> "one"
        2 -> "two"
        in 1..5 ->"number $number"
        in 1 until 5 ->"number $number"
        else ->" number not found"
    }
    println(result4)
}
/*
-------Output--------
true
false
Animal is Dog
Animal is Dog
number 5
*/