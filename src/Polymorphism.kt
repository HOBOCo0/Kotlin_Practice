/*
 Polymorphism
    parent can hold a reference to its child class object means
    reference(Parent Class)-->object(Child Class) and we can call the methods of
       child and parent class which are common.
       it is decided on runtime that based on the object which method need to be executed.
  Advantages

 -> Helps to write Maintainable and extensible code.
 -> Helps in interacting with objects via common interface
*/

open class Shape{
    open fun area():Double = 0.0
}
class Circle(private val radius: Int): Shape(){
    override fun area():Double = Math.PI*radius*radius
}
class Square(private val side: Int): Shape(){
    override fun area():Double = side*side+0.0
}
class Triangle(private val side: Int): Shape(){
    override fun area():Double = 0.5*side*side
}
fun calculateAreaOfShapes(shapes:Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}

fun main() {
    val shape1:Shape = Circle(5)
    println(shape1.area())
    val shape2:Shape = Triangle(5)
    println(shape2.area())

    // Created the array of shape type
    val shape =  arrayOf(Circle(5),Square(10),Triangle(20))
    calculateAreaOfShapes(shape)
}
/*
-----------------Output---------------------------
78.53981633974483
12.5
78.53981633974483
100.0
200.0
 */