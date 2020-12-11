package extraPractice

fun main() {
    learningIf()
    learningWithNumbers()
    learningIfWithMethods()
}

fun learningIf() {
    val isPepaGreen = true
    val isRedPandaYellow = false

    if (!isPepaGreen) {
        println("Pepa is not green")
    } else if (isPepaGreen) {
        println("You are right! Pepa is green")
    }

    if (isPepaGreen == true && isRedPandaYellow == true || isPepaGreen == true && isRedPandaYellow == false) {
        println("Pepa is green and Red panda is not yellow")
    }
}

fun learningWithNumbers() {

    val x = 600
    val y = 890323
    val w = 600
    val z = x + y

    if (x >= y) {
        println("x is greater than y")
    } else {
        println("y is greater than x")
    }

    if (x <= y && x == w) {
        println("x is smaller than y and it has the same value as w")
    } else {
        println("This is something wrong")
    }

    if(!learningIfWithMethods()){
        println("")
    }

}

fun learningIfWithMethods(): Boolean {
    return true
}






