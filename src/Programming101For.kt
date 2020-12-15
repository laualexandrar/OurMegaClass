fun main() {

    // "For/while/for-each" are cyclic structures
    normalFor()
}

fun normalFor() {

    // This is hardcoded
    forQuemado()
    forQuemado()
    forQuemado()
    forQuemado()

    for (i: Int in 1..4) {
        forQuemado()

        print(i)
    }

    val arreglito = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    // This is a for-each
    // To iterate the whole list
    for (item in arreglito) {
        print("$item ")
    }

    println()
    // To iterate the list partially
    for (i: Int in 0..4) {
        print("${arreglito[i]} ")
    }

    println()
    var i = 4
    while (i > 0) {
        println(i)
        i--
    }
    println()
    var j = 4
    do {
        println(j)
        j--
    } while (j > 0)
        println()



    var w = 0
    while (w <= 5) {
        print("${++w} ")
    }

    var r = 0
    while (r <= 5) {
        print("${r++} ")
    }
}

fun forQuemado() {
    println("Re-writing this!")
}


/*
Tips:
- Select the desired text and apply a change like adding comillas marks
 */