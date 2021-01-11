package poo.classes

// This is a kotlin file therefore we can put several classes inside. In java one class is one file.

class SimpleClass {
    /*
    Inside this class we can have:
    - Variables
    - Method
    - And other nested classes
     */
}

// Nested classes
class ClassWithNestedClass {

    class ThisIsNestedClass {

    }

}

// Privacy / Visibility
/*
Attributes, classes, and method can be either
- public -> Access from anywhere
- private -> Access only from the class
- protected -> Access only from the class and subclasses
- internal -> TODO
 */
abstract class ClassWithPrivacy {

    val publicVariable: String = "public"
    private val privateVariable: String = "private"
    abstract val abstractVariable: String

    fun publicMethod() {

    }

    private fun privateMethod() {

    }

    abstract fun abstractMethod()
}

fun main() {
//    val classWithPrivacy = ClassWithPrivacy()
}

/*
Study here final and static
 */