/*
Generics
 -> Generics are the generalised class which can create the object of any type
 -> They are also known as template class

 vararg(keyword)
 -> means variable no of arguments
 -> defining a variable as vararg makes the variable accepts multiple values and stores in an array or collection
 -> this can be used in functions while defining parameters
*/

// this is a normal class which takes Integer type data but what if we want to send data of any type??
// it is not possible with this class

class IntContainer(var data: Int) {
    fun setValues(value: Int) {
        data = value
    }

    fun getValue(): Int {
        return data
    }
}

// this is the generalised class for the above class
class ContainerGeneral<T>(var data:T){
    fun setValues(value:T){
        data = value
    }
    fun getValue(): T {
        return data
    }
}

// vararg example and how to use it in program
fun add(vararg x:Int){
    for (i in x){
        println(i+1)
    }
}

fun main() {
    val cont = IntContainer(20)
    cont.setValues(30)
    println(cont.getValue())

    val contGenString = ContainerGeneral<String>("Abc")
    contGenString.setValues("xyz")
    println(contGenString.getValue())

    val contGenInt = ContainerGeneral<Int>(20)
    contGenInt.setValues(30)
    println(contGenInt.getValue())

    // vararg function call
    add(1,2,3,4,5,6,7)
}
