package extraPractice

fun main() {
    val mArray = arrayOf(4, 12, 89)

    var maxVal = 0
    var i = 0

    for (number in mArray) {
        if (number > mArray[i + 1]) {
            maxVal = number
            i++
        }
        println(maxVal)
    }
}