package extraPractice

fun main() {
    println(myNumber(arrayListOf(1, 2, 3, 4)))
}

fun myNumber(myArray: ArrayList<Int>):Int {

    //val myArray = arrayOf(1, 2, 3, 4)

    var sum = 0
    for (number in myArray) {
        sum = number + sum

    }
    return sum


}