/*
Utility Functions
-> All are lambdas
    apply
    let
    with
    run
 */

fun main() {
  val emp = Employee()
  // this is how we set the values normally
    emp.name = "xyz"
    emp.age = 19
    emp.id = 12345

  // but we can also use utility function to set or access the values or perform some operations
  val x = emp.apply {
      // we get "this" reference in this block which points to the object on which this apply block is associated with
      name = "abc"
      this.age = 20
      id = 4321
      // the return value of this function is the object itself
  }
    println(emp)// Employee(name=abc, age=20, id=4321)
    println(x)  // Employee(name=abc, age=20, id=4321)

  val y = emp.let {
      // it is a single parameter lambda
      // we have already seen the use of let in null safety object calling, but we can use it normally as well
      // we get "it" reference in this block which points to the object on which this let block is associated with
      println(it.name)
      println(it.age)
      println(it.id)
      "i am the last line of let block"
      // last line is the return type of the let function
  }
    println(y)

  val z = with(emp){
     // this is similar to let, the only diff is here we get "this" as reference variable/object, and it behaves like let
     // the return type of this function is the last line of the function
        name = "xyz"
        println(this.name)
        100
    }
    println(z)

   val u =  emp.run {
        // it is the combination of let and with
        // here we get "this" as the reference variable which points to the object to which this block is associated
        // last line is the return type

        age = 25
        println(this.name)
        println(emp.id)
        "i am the last line of the the run block"
    }
    println(u)

}
data class Employee(var name: String ="", var age:Int = 18 , var id:Int = 983986)