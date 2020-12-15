package extraPractice

fun main() {
    val mArray = arrayOf(40, 120, 89)

//    val maxVal = mArray.max()
//    print(maxVal)

    var maxVal = -1

    for (number in mArray) {
        if (number > maxVal) {
            maxVal = number
        }
    }

    println(maxVal)

}



