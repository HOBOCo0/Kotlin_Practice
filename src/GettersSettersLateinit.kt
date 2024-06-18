/*
-> Default constructor
   ->default constructor is called when you do not define any constructor in your class
   ->default constructor is parameterless constructor
-> Getter and Setters
    -> getter is used to get the value
    -> setter is used to set the value & check if the value is appropriate
    -> if we make properties and do not define getters and setters then kotlin by default adds getters and setters
    -> getter and setters do no work in constructors

-> LateInit
   In kotlin we must initialise variables at time of declaration but to late declare we use LateInit
   These variables can not be of val type
   These variables can not be(Int,Float,Double,Boolean)
 */

class Calculator{

    // In kotlin we must initialise variables at time of declaration but to late declare we use LateInit
    lateinit var message:String

    fun add(a:Int,b:Int) = a+b
    fun multiply(a:Int, b:Int) = a*b
}

class Person2(nameParam:String, ageParam:Int){
    // how getters and setter work
    var age = if(ageParam > 0) ageParam else 0
        set(value){
            if(value > 0){
                field = value
            }
            else{
                println("age Can't be negative")
            }
        }
    var name = nameParam
        get()= field.toUpperCase()
}

fun main() {
    val arithmetic = Calculator() // default constructor is called
    println( arithmetic.add(10,20))
    println(arithmetic.multiply(10,20))

    val person = Person2("aman", -20)
    person.age = -20
    println(person.age)
    println(person.name)
}
/*
-----------------------Output------------------------------------
30
200
age Can't be negative
0
AMAN
 */