/*
Nested Class
-> If we are making class inside a class then we call it nested class
Inner Class
-> every inner class is nested class
-> If we want to access the properties or methods of outer class then we need to define that nested class as inner.
-> inner class can not exist independently first it has to create object of outer class and then its own class
-> this thing we use in recycler view when we define its adapter
 */

class outer(y:Int){
    val x:Int = y
    class nested{
        fun nestFun(){
            println("nestFun called")
            // this class can not access the property or method of outer class directly it has to be inner
            // println("nestFun called whit outer class property $x") this is not possible
        }
    }
 inner class nestedInner{
        fun nestFun(){
            println("nestFun called")
            // this class can not access the property or method of outer class directly it has to be inner
             println("nestFun called whit outer class property $x") //  this is possible
        }
    }
}

fun main() {
    var newObjectOuter = outer(20)
    println(newObjectOuter.x)

    // In normal nested class it is not required to create the object of outer class because the inner class is
    // independent of the properties or the methods of outer class
    var newObjectNested = outer.nested()
    newObjectNested.nestFun()

    // we have to call the constructor of outer class first or create the object of outer call before creating
    //the object of inner class coz the properties and methods of outer call can be accessed in inner class
    // which has to be initialized before using.
    var newObjectInner = outer(30).nestedInner()
    newObjectInner.nestFun()

}