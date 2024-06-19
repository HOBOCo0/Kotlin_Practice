/*
Interface
 --> An interface is a collection of abstract methods and properties that defines a common contract for classes that
     implements the interface.
 --> An interface is similar to an abstract class, but it can be implemented by multiple classes
 --> It can not have state ( we can not create an object of it)
 --> Interfaces are custom type provided by kotlin that cannot be instantiated directly. Instead, these define a form
     of behaviour that the implementing type have to follow( with the interface, you can define a set of
     properties and methods, that the contract type must follow and implement)
 --> one interface and class can implement multiple interfaces
 */
interface Properties{
    val length: Int
}

interface Perimeter:Properties{
    fun findPerimeter()
}
