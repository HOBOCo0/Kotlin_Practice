/*
Null Safety - Nullable & Nullable Types
Safe call operator (?.) with let
Not Null Asserted(!!) & Elvis Operator(?:)
 */

fun main() {
    var gender = "male"
    var gender2: String? = null // This is nullable type declaration, this variable can accept null values as well
    var isAdult: Boolean? = true

    // Null check is value is null block will not execute
    if(gender2 != null){
        println(gender2.toUpperCase())
    }
    // we can use safe call operator if value will be null it will return null
    println(gender2?.toUpperCase())

    // If we want to execute multiple statement while checking null we can use let lambda
    gender2?.let{
        println("The gender is $gender2")
        println("The gender is $it")
    }

    /* use of elvis operator
        if not null
            statement
        if null
            statement
     */

    var selectedValue:String = gender2 ?: "NA"
    var selectedValue2:String? = gender2 ?: "NA"

    println(selectedValue)
    println(selectedValue2)

    // null assertion operator is used when we want out progam to throw null pointer exception intentionally
    var Value2:String = gender2!!.toUpperCase()
}