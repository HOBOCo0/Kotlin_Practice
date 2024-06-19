/*
Abstract class
 --> If you are defining an Abstract class Its Abstract (Properties and methods) must be overridden
        by child classes.
 --> Can't be instantiated( object of abstract class can not be created )
 --> Abstract class can have both abstract and non-abstract properties and methods
 --> If a class has abstract properties and methods then class must be declared as Abstract

Need of abstract class
 --> when we want our child classes to follow a common protocol we create an abstract class

Abstract Methods
 -->Abstract methods can not have body.
 -->their body is given in child classes
 */

abstract class Student(){
    abstract val studentName:String
    abstract fun studentDress()
    abstract fun studentGender()
    // not compulsory to implement this abstract method in child class
    fun display(){
            println("$studentName is playing")
        }
}

// All the abstract methods and  properties must be overridden in child class
class Boy(name:String):Student(){
    override val studentName: String = name
    override fun studentDress() {
        println("wear shirt pant")
    }

    override fun studentGender() {
        println("Student is male")
    }
}

fun main() {
    val aman = Boy("Aman")
    println(aman.studentName)
    aman.studentDress()
    aman.studentGender()
    aman.display()
}
/*
--------------------------Output-----------------------------
Aman
wear shirt pant
Student is male
Aman is playing
 */