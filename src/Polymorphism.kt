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

open class Shape:Perimeter{
    override val length: Int
        get() = TODO("Not yet implemented")
    open fun area():Double = 0.0
    override fun findPerimeter(){}

}
class Circle(private val radius: Int): Shape(){
    override val length: Int
        get() = TODO("Not yet implemented")
    override fun area():Double = Math.PI*radius*radius
    override fun findPerimeter() {
        println("The perimeter of Circle is "+2*Math.PI*radius)
    }
}
class Square(private val side: Int): Shape(){
    override val length: Int
        get() = TODO("Not yet implemented")
    override fun area():Double = side*side+0.0
    override fun toString(): String {
        return "override by to string"
    }

    override fun findPerimeter() {
        println("The perimeter of Square is "+4*side)
    }
}
class Triangle(private val side: Int): Shape(){
    override val length: Int
        get() = TODO("Not yet implemented")
    override fun area():Double = 0.5*side*side
    override fun findPerimeter() {
        println("The perimeter of Triangle is " + 3*side )
    }
}
class Cylinder(val radius: Int, val hight: Int):Perimeter{
    override val length: Int
        get() = TODO("Not yet implemented")
    override fun findPerimeter() {
        println("The perimeter of cylinder is " + 4*radius+2*hight)
    }
}
fun calculateAreaOfShapes(shapes:Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}
fun calculatePerimeter(obj:Array<Perimeter>){
    for(objects in obj){
        objects.findPerimeter()
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

    // Creating the objects of classes which are implementing Interfaces
    val  obj = arrayOf(Circle(10),Square(5),Triangle(10),Cylinder(5,10))
    calculatePerimeter(obj)
}
/*
-----------------Output---------------------------
78.53981633974483
12.5
78.53981633974483
100.0
200.0
The perimeter of Circle is 62.83185307179586
The perimeter of Square is 20
The perimeter of Triangle is 30
The perimeter of cylinder is 2020
 */