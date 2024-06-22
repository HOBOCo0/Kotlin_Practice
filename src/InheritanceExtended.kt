/*
-> Overriding
  ->Redefining the properties & methods of parent class in child class is known as Overriding
  -> we use override keyword to override thr functionality

-> Calling Parameterized Constructor
-> Getters Setters Override
-> Any Type
   every class has Any class its super class by default.
 */

open class Mobile(open val name: String){
    open val size:Int = 5
    init {
        println("Parent construct called")
    }
    fun  makeCall()= println("Calling from $name")
    fun  powerOff()= println("Shutting Down")
    open fun  display()= println("$name Display")
}
class Iphone(name:String):Mobile(name){
    override  val size:Int = 7
    init {
        println("Child construct called")
    }
    override fun display(){
        super.display()
        println("$name display")
    }
}

fun main() {
    val iphone = Iphone("Iphone")
    println(iphone.name)
    println(iphone.size)
    iphone.display()

    val mobile = Mobile("Simple Phone")
    println(mobile.name)
    println(mobile.size)
    mobile.display()

    // a little bit of polymorphism
    val mobile2:Mobile = Iphone("Iphone 15")
    mobile2.display()
}
/*
--------------------------------Output---------------------------------------
Parent construct called
Child construct called
Iphone
7
Iphone Display
Iphone display
Parent construct called
Simple Phone
5
Simple Phone Display
Parent construct called
Child construct called
Iphone 15 Display
Iphone 15 display
*/