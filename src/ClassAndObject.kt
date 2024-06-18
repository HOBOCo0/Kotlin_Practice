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
class Person(val name:String, var age:Int){

    fun canVote():String{
        return if(age > 18)"$name can vote" else "$ name can not vote"
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

    // Let's see in a different way

    val i: Int = 30
    println(i.plus(50))
    println(i.div(2))

    val person1 = Person("Aman", 19)
    val person2 = Person("Apoorva", 17)

    println(person1.canVote())
    println(person2.canVote())
    person2.age = 20
    println(person2.canVote())
}