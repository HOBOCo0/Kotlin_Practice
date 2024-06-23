import java.lang.IllegalArgumentException

/*
when it comes to exception handling in kotlin
 we have four things
    try -> this block is what we have our logic which needs to  be executed and checked if
            exception found then catch block executes
    catch -> If exception found catch block executes
          -> we can have multiple catch blocks based on type of exception
    finally -> This block is optional but if we have something which need to be executed
                no matter what we write in finally
    Throw Exceptions
     when we want to throw exception intentionally as a programmer, and we want our user to handle the exception
 */

fun main() {
    val arr = arrayOf(1,2,3)
    try {
        println(arr[6])
    }
    catch (e:NullPointerException){
        println("accessing wrong index")
    }
    catch (e:Exception){
        println("problem with array accessing")
    }
    finally {
        println("I will run no matter what")
    }
    println(" i will run")
    /*
    ----------------------------output--------------------------------
    problem with array accessing
    I will run no matter what
    i will run
     */

    createUserList(-1)
    /*
    ------------------------output------------------------------------
    Exception in thread "main" java.lang.IllegalArgumentException: input can't be negative
	at ExceptionHandellingKt.createUserList(ExceptionHandelling.kt:39)
	at ExceptionHandellingKt.main(ExceptionHandelling.kt:32)
	at ExceptionHandellingKt.main(ExceptionHandelling.kt)
     */

}

fun createUserList(count:Int){
    if(count < 0){
        // Exception Raise
        throw IllegalArgumentException("input can't be negative")
    }
    else{
        print(" User list created containing $count users")
    }
}