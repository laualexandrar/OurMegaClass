package extraPractice

fun main() {
   println( myCrazyCode(1))
}

fun myCrazyCode(input: Int): Int {
    var sum = 0
    var num = input


    while (num >= 1) {

        val reminder = num % 10
        var quotient = num / 10
        num = quotient
        sum += reminder

    }

//    println(sum)

    return sum
}
