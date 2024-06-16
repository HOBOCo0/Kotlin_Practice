/*
variables are of two type in kotlin
    --> Var (mutable)
    --> Val (immutable / constants)

Data Type in kotlin
    --> Integer(Byte, Short, Int, Long)
    --> Floating Point(Float, Double)
    --> Boolean(True,False)
    -->Character(Char, String)

 if you want to know the type of any variable you can get it by clicking over the variable ctrl+shift+p
*/

fun main() {
    var number = 5 // this is type inference feature of kotlin it assigns the type based on the value of the variable.
    number = 10

    println("number is $number")

    val message ="Hey there"
    // message = "" this declaration is not allowed as message is val type
    println("message is $message")

    // Explicit declaration of the variable

    var number2: Int = 25
    val number3: Float = 2.5f
    val number4: Double = 3.567
    var isTrue: Boolean = false
    var letter: Char = 'A'
    var name: String = "Aman"

    println("-- $number2 -- $number3 -- $number4 -- $isTrue -- $letter -- $name ")
}