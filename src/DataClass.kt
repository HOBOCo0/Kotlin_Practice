/*
* Data Classes
    (make sure when you are defining data class you must define at least one parameter in its primary constructor)
 -> There are some classes in the application that is only used to stores data.
 -> If we want to transfer data from one layer(UI layer,Business Logic Layer, Database layer) to another then we make data classes
 -> These classes only store data and don't have methods in .
* equals(),toString(),hashCode() of Any Class
* These data classes have some utility functions
    -> Copy Function
    -> componentN()
 */

fun main() {
    val t1 = Test(1,"Alex")
    val t2 = Test(1,"Alex")

    println(t1) // whenever we try to print the reference of any object it calls its toString method which is coming from any Class.
    println(t2)
    println(t1.hashCode())
    println(t1 == t2 ) // or p1.equals(p2)
    // gives false because (data is same but the address is diff in this case address is compared,
    // if it will be object of data class then the data will bec compared and it will return true coz data class
    // by default overrides equals(),toString(),hashCode() from Any)
    /*
    -------- output without data Class-------------
    Test@7cc355be
    Test@6e8cf4c6
    2093176254
    false
     -------- output with data Class-------------
    Test(id=1, name=Alex)
    Test(id=1, name=Alex)
    2043485
    true
     */
    val t3 = t1.copy(id = 4)
    println(t3) // Test(id=4, name=Alex)

    // This is also called destructuring or componentN function
    val (id:Int,name:String) = t2
    println(id)
    println(name)

    println(t1.component1())
    println(t1.component2())

}

data class Test(val id:Int, val name:String){

}