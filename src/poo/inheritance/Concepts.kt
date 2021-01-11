package poo.inheritance

// This is also a file with several classes

// The context of these classes is a Library

open class Book(val title: String, val author: String, val pageCount: Int, var size: Int = 10) {
//    val pageNumber: Int = 0
    var isRented: Boolean = false
}

class Magazine(title: String, author: String, pageCount: Int) : Book(title, author, pageCount, size = 30)

class Paper(title: String, author: String, pageCount: Int) : Book(title, author, pageCount)

// This is a class with a nested class
class Book2 {

    class Magazine2 {

    }

    class Paper2 {

    }

    class Journal2 {

    }
}

open class Pet
class Dog : Pet()
class Cat : Pet()
class Hamster : Pet()

class Pet2 {

    class Dog2 {

    }

    class Cat2 {

    }

    class Hamster2 {

    }
}

fun main() {

    // Creating a Magazine and checking the number of pages which inherits from Book
    val magazine1 = Magazine("Supersonic", "The Authors", 100)
    println(magazine1.isRented)
    println(magazine1.pageCount)

    val magazine2 = Book2.Magazine2()

    ////////////////////////////
    val dog1 = Dog()
    val dog2 = Dog()
    val cat1 = Cat()
    val hamster1 = Hamster()

    val userPetList: ArrayList<Pet> = arrayListOf(dog1, dog2, cat1, hamster1)
    userPetList.forEach { pet ->
        when (pet) {
            is Dog -> {
                println("woof")
            }
            is Cat -> {
                println("miau")
            }
            is Hamster -> {
                println("nii nii")
            }
        }
    }

    val falseDog = Pet2.Dog2()
    val falseCat = Pet2.Cat2()
    val falseHamster = Pet2.Hamster2()
    val falsePetList = arrayListOf(falseDog, falseCat, falseHamster)

    falsePetList.forEach { falsePet ->
        when (falsePet) {
            is Book -> {
                println("this is a book")
                // This can be whatever thing
            }
        }
    }
}