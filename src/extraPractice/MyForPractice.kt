package extraPractice

fun main() {
    println(myBeautifulList(arrayListOf(1,2,3,4)))
}

fun myBeautifulList(myCreativeList: ArrayList<Int>): Int {
    var sum = 0

    for (number in myCreativeList) {
        if (number >= 0) {
            sum = number + sum
        }
    } // val sum =0  sum = number + sum ---> THIS IS WRONG I cannot reassign the val number it has to be var
    return sum
}

//fun main() {
//    println(myNumber(arrayListOf(1, 2, 3, 4)))
//}
//
//fun myNumber(myArray: ArrayList<Int>):Int {
//
//    //val myArray = arrayOf(1, 2, 3, 4)
//
//    var sum = 0
//    for (number in myArray) {
//        sum = number + sum
//
//    }
//    return sum
//
//
//}