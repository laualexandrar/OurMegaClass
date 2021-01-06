package extraPractice

fun main() {
    println(sumDigitNumbers(1234))
}

fun sumDigitNumbers(input: Int):Int{

    var sum = 0
    var number = input

    while(number >= 1) {
        val quotient = number / 10
        val reminder = number % 10
        sum = sum + reminder
        number = quotient
    }
    return sum

}

//fun main() {
//   println( myCrazyCode(1234))
//}
//
//fun myCrazyCode(input: Int): Int {
//    var sum = 0
//    var num = input
//
//    while (num >= 1) {
//
//        val reminder = num % 10
//        var quotient = num / 10
//        num = quotient
//        sum += reminder
//
//    }
////    println(sum)
//    return sum
//}
