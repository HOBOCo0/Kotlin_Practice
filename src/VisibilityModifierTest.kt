fun main() {
    println(name)
    println(name1)
// println(name3)// it private variable only accessible within the file or class
    val objA = A()
    println(objA.a)
  //  println(objA.b)  // private
    println(objA.c)
  //  println(objA.d)  // protected
    val objB = B()
    println(objB.a)
    // println(objB.b) //private
    println(objB.c)
 //   println(objB.d)    //protected
    objB.test()
}

