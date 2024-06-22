/*
Companion Keyword and need of companion objects
-> In kotlin we use companion object for to achieve factory pattern( it is simple method in which we pass parameter,
    and it will return objects  )
-> It is also used to achieve the static function concept from java
Need of Companion Object
@jvm keyword
*/

class MyClass(val x:Int, val y:Int){
    // This is singleton object in this case it is class level member
    // There will be single instance of the object, but it will be associated with the class
    // we can make multiple object
    object MyObject{
        @JvmStatic
        fun f(x:Int, y:Int){
            val sum = x+y
            println("sum from normal object = " + (x+y))
        }
    }
    // There can be only one companion object in the class
   companion object My2ndObject{
    // Internally it will behave as static method
       @JvmStatic
        fun f(x:Int, y:Int){
            val sum = x+y
            println("sum from Companion Object = " + (x+y))
        }
    }
}


fun main() {
    // accessing the normal object from class
    MyClass.MyObject.f(10,20)
    // accessing companion object from class
    // The methods and properties can be accessed without object name declaration
    MyClass.f(20,30)
}