/*
->Type checking is done during run time to check the type of abject and based on that we perform some operations
-> It is done using "is" operator
SmartCasting
It automatically detects the type of object based on the declaration and initialization

 */
fun main() {
    var circle = Circle(40)
    val player = Player("Player 1")

    if(circle is Circle){
        println("circle object is Circle type")
    }
}
class Player(val name:String){

}