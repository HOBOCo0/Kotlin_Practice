/*
Enum Class
 ->  suppose we want to assign a value to a variable and that value is from set of data
        for example
        var day --> Set(Mon....Sun)
        var gender --> Set(Male,Female,other)
 ->  we can only assign the values to variables from pre defined set of constant values
     and these values are objects of that class also)
 ->  Since they are object then we can define constructor for that class too

 Sealed Class
 -> It is similar to Enums the ony is difference is here we are defining set of Types/class means the objects
    can only be created for set of predefined types.
 -> In enum state remains same of the object once created means only one object can be created,
    but the state can be different in sealed types and multiple objects can be created.
 */

enum class Day(val x:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    // since it's a class then we can also define methods to it
    fun printFormattedDay(){
        println("day is $this")
    }

}

// Sealed Class
// make sure when you are defining sealed class its types must be defined in the same file otherwise it will not work.
sealed class Tile // object of this class can't be made as it's abstract type
class Red(val typee: String, val points:Int):Tile()
class Blue(val points:Int):Tile()



fun main() {
    val day = Day.SUNDAY
    println(day) // SUNDAY
    println(day.x) // 1
    println(day.name) // SUNDAY
    println(day.ordinal) // 0
    println(day.declaringJavaClass) // class Day

    // we can loop on enums
    for(i in Day.values()){
        println("$i value is ${i.x}")
    }
    day.printFormattedDay()

    // Sealed Class
    // as we can see the state ob the object can be different
    val tile1 = Red("mushroom",25)
    val tile2:Tile = Red("Fire", 30)
    val points = when(tile2){
        is Blue -> tile2.points*2
        is Red -> tile2.points*5
    }
    println(points)
}
