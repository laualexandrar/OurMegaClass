package extraPractice

fun main() {

    for(number in 1..10 step 2) {
        println(number)
    } // this way I print the odd numbers using kotlin

    for(number1 in 1..10){
        if (number1%2 == 0){
            if (number1 < 10) {
                print("$number1, ")
            } else{
                println(number1)
            }
        }
    } // here I'm printing even numbers

}