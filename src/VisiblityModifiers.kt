/*
Visibility Modifiers
-> It means we are increasing or decreasing the accessibility of code.
-> There are four types of Visibility Modifiers in kotlin

 * public  --accessible everywhere at top level declaration as well as class member
 * Internal-- accessible within module at top level declaration as well as class member. It behaves like public
                but within module
 * Private -- accessible within the file and within the class not in subclasses
 * Protected -- accessible only in subclass. This cannot be used for top level declaration
 */

// top Level Declaration

public var name = "Aman Public"

internal var name1 = "Aman Internal"

private var name2 = "Aman Private"

// protected var name3 = "Aman Protected"  can't be a top level declaration

open class A{
    public var a = 10
    private var b = 11
    internal var c = 12
    protected var d = 13
}

class B:A(){
    fun test(){
        println(a)
       // println(b)// not possible because it is private
        println(c)
        println(d)
    }
}
