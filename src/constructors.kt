/*
constructors - Primary and Secondary
-> class has two things properties and methods
-> initialize objects and provide default values to its properties
-> whenever we want to give default value to objects we use constructors
-> they are of three types
    * Default const -- when no parameter is passed default constructor is called
    * primary const -- primary constructor to init the objects
    * secondary const -- secondary const to init the objects 

Initializer Block
 -> block which is executed just after creation of the objects or just after constructor is executed
 */

class Empty{
// constructor less class
}
class Person1(){
    // empty constructor or default constructor
    val name:String= "Abcd"
    val age:Int = 45
}
class Automobile(val name:String, val engineType:String, val maxSeat:Int, val tyres:Int, hasAirbags:Boolean){
    // primary constructors
    val airbags = hasAirbags
    init{
        println("from 1st init block Constructor is created ")
        println("has airbags $airbags")
    }
    init{
        println("from 2nd init block Constructor is created ")
        println("the name of the car is $name")
    }
    // secondary constructor
    constructor(nameParam:String, engineParam:String): this(nameParam,engineParam,5,4,true)
    fun drive() = println("Car is driving")
    fun brakes() = println("Applied Brakes")
}


fun main() {

    // object created using primary constructor
    val mustang = Automobile("mustang","Petrol",5,4,true )
    println(mustang.name)
    println(mustang.engineType)
    println(mustang.maxSeat)
    println(mustang.tyres)
    println(mustang.airbags)
    mustang.drive()
    mustang.brakes()

    // object created using secondary constructor
    val ferrari = Automobile("ferrari","Diesel")
    println(ferrari.name)
    println(ferrari.engineType)
    println(ferrari.airbags)
    ferrari.drive()
    ferrari.brakes()
}
