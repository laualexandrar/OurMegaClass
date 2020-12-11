import java.lang.management.PlatformLoggingMXBean

/**
THE SUMMARY FOR THIS FILE

- if
- if else
- for
- for each
- while
- do while
- when
 **/

fun main() {
    // Here is where the magic happens

    codingWithIf()
    codingWithIfElse()
    codingWithIfElseIf()
}

// This method is to study IFs
fun codingWithIf() {

    val spyroColor = "Purple"
    if (spyroColor == "Purple") {
        println("That is correct, Spyro is purple")
    }

    val isSpyroYellow = false
    if (isSpyroYellow != true) {
        println("No, Spyro is purple")
    }

    if (!isSpyroYellow) {
        println("No, Spyro is purple")
    }

    // Boolean Algebra.
    /*
    true AND true = true
    true AND false = false
    false AND true = false
    false AND false = false

    true OR true = true
    true OR false = true
    false OR true = true
    false OR false = false
     */

    val isSpyroRed = false
    val hasSpyroWings = true

    // Condition 1
    if (isSpyroRed && hasSpyroWings) {
        println("condition 1 is true")
    }

    // Condition 2
    if (isSpyroRed || hasSpyroWings) {
        println("condition 2 is true")
    }

    // Condition 3
    if (!isSpyroRed && hasSpyroWings) {
        println("condition 3 is true")
    }

    // Condition 4
    if (dummyMethodWithTrueReturn()) {
        println("contidion 4 is true")
    }

    val num1 = 9000
    val num2 = 5000

    if (num1 > num2) {
        println("Yes num1 is greater than num2")
    }

    val hasSpyroADiamond = true
    if (hasSpyroADiamond) {
        println("Yes, spyro has a diamond")
    }

    val isSpyroADragon = true

    if (hasSpyroADiamond) {
        if (isSpyroADragon) {
            println("Yes, and yes")
        }
        println("Yes")
    }

    if (7 >= 7) {

    }

    if (7 <= 7) {

    }
}

fun dummyMethodWithTrueReturn(): Boolean {
    return true
}

// This method is to study IF-ELSE
fun codingWithIfElse() {

    val isSpyroPurple = true

    if (isSpyroPurple) {
        println("Yes, you're right! Spyro is purple!")
    } else {
        println("Spyro is not purple")
    }

    if (!isSpyroPurple) {
        println("Yes, you're right! Spyro is purple!")
    } else {
        println("Spyro is not purple")
    }

    if (true) println("It is true") else println("It is false")

    // This does not have braces because it has single lines
    if (!isSpyroPurple)
        println("Yes, you're right! Spyro is purple!")
    else
        println("Spyro is not purple")

}

// This is to study if-else-if
fun codingWithIfElseIf() {

    val hasCrashShoes = true
    val isCrashOrange = true

    if (!hasCrashShoes) {
        println("Yes! He has shoes")
    } else if (isCrashOrange) {
        println("Yes Crash is orange!")
    } else if (!hasCrashShoes && !isCrashOrange) {
        println("Cash doesn't have neither shoes nor he is orange")
    } else if (hasCrashShoes && isCrashOrange) {
        println("You are a genius! ")
    }

    if (!hasCrashShoes) {
        println("Yes! He has shoes")
    } else if (isCrashOrange) {
        println("Yes Crash is orange!")
    } else {
        // This makes sure something happens within the if statement
    }
}