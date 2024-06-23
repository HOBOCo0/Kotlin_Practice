/*
These collection provides dynamic behaviour
    List
    data str used to store data of same type
    Mutable List (can be changed i.e. elements can be added/removed/replaced )
    Immutable List (can't be changed) mostly used in multithreaded applications

    Maps
    data Str used to store data in (key,Value) pairs
    Mutable Map (can be changed i.e. elements can be added/removed/replaced )
    Immutable Map (can't be changed)
 */
fun main() {
    val num = mutableListOf(1,2,3)
    println(num[2])
    num.add(5)
    for(i in num){
        println(i)
    }
    println(num.contains(4))
    num.remove(1)
    for(i in num){
        println(i)
    }
    val num2 = listOf(1,2,3,4)
    num.addAll(num2)
    for(i in num){
        println(i)
    }

    val map1 =  mutableMapOf<Int,String>()
    map1.put(1,"a")
    map1.put(2,"b")
    map1.put(3,"c")
    map1.put(4,"d")

    for ((i,j) in map1){
        println("Key = $i and value = $j")
    }
}