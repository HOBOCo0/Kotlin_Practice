/*
Factory Pattern
it is simple method which takes parameter and returns objects
*/

class Pizza private constructor(val pizzaType:String, val pizzaTopping:String){
    companion object Factory{
        // this is the factory object
        fun create(pizzatype:String):Pizza{
            return when(pizzatype){
                "tomato" -> Pizza("TOMATO","TOMATO,TOMATO CHEESE")
                "peppy paneer" -> Pizza("PEPPY PANEER","TOMATO,TOMATO CHEESE,MUSHROOM,PANEER,")
                else -> Pizza("NORMAL PIZZA","PLAIN MARGREETA")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type = $pizzaType, Toppings = $pizzaTopping)"
    }
}

fun main() {
    // since we can pass the value to the constructor we can create objects directly
    //val pizza = Pizza("Medium","Chicken Tikka")
    //println(pizza)
    // make the costructor private so that create function is must to create objects
    println(Pizza.create("tomato"))
}