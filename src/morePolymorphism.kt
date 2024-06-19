/*
Polymorphism
 * Poly means many & Morph means Form
 * In comp science it is defined as method name is same but is will behave differently
   based upon object(which means it has many forms)
 * Polymorphism and Inheritance goes hand in hand coz without inheritance we can not achieve polymorphism
 */

fun main() {
    val shape = Shape()
    println(shape.area())
    val circle: Circle = Circle(7)
    println(circle.area())//153.93804002589985

    // we can create reference of parent class (Shape) and object of child class (circle) and we can get same functionality
    // but cant do vice versa

    var circle2:Shape = Circle(7)
    println(circle2.area()) //153.93804002589985

   // val circle3:Circle = Shape() XXX not possible
    val demo = DemoAny()
    println(demo.toString())

}

class DemoAny{
    override fun toString(): String {
        return "override by to string"
    }
}
/*
--------------------------------Output-------------------------------------
0.0
153.93804002589985
153.93804002589985
override by to string
 */