/*
 Class & Object
 -> It is also known as user defined data type.
 -> It is a blueprint or template on the basis of which me create our objects.
 -> Objects are the real things.
 -> you can create objects in your program, and they interact with each other to complete the work.

 Design A Class
 -> Class es contain
    * Properties or Fields
    * Methods
 */

class Car(val name: String, val type:String, val KmRan: Int){

    fun driveCar(){
        println("$name car is driving")
    }
    fun applyBrakes(){
        println("Apply Brakes")
    }
}

fun main(){
    val mustang = Car("mustang", "petrol", 1000)
    val ferrari = Car("Ferrari", "diesel",2000)

    println(mustang.name)
    println(mustang.type)
    println(mustang.KmRan)
    mustang.driveCar()
    mustang.applyBrakes()
}