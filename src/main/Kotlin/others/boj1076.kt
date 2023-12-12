import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val color = Array(3) { sc.next() }
    val resist = IntArray(3)
    for (i in 0 until color.size) {
        if (i == 0) {
            when (color[i]) {
                "black" -> resist[i] = 0
                "brown" -> resist[i] = 10
                "red" -> resist[i] = 20
                "orange" -> resist[i] = 30
                "yellow" -> resist[i] = 40
                "green" -> resist[i] = 50
                "blue" -> resist[i] = 60
                "violet" -> resist[i] = 70
                "grey" -> resist[i] = 80
                "white" -> resist[i] = 90
                else -> 0
            }
        } else if (i == 1) {
            when (color[i]) {
                "black" -> resist[i] = 0
                "brown" -> resist[i] = 1
                "red" -> resist[i] = 2
                "orange" -> resist[i] = 3
                "yellow" -> resist[i] = 4
                "green" -> resist[i] = 5
                "blue" -> resist[i] = 6
                "violet" -> resist[i] = 7
                "grey" -> resist[i] = 8
                "white" -> resist[i] = 9
                else -> 0
            }
        } else {
            when (color[i]) {
                "black" -> resist[i] = 1
                "brown" -> resist[i] = 10
                "red" -> resist[i] = 100
                "orange" -> resist[i] = 1000
                "yellow" -> resist[i] = 10000
                "green" -> resist[i] = 100000
                "blue" -> resist[i] = 1000000
                "violet" -> resist[i] = 10000000
                "grey" -> resist[i] = 100000000
                "white" -> resist[i] = 1000000000
                else -> 0
            }
        }
    }
    var result = 0L
    for (i in 0 until resist.size) {
        if (i == resist.size - 1) result *= resist[i]
        else result += resist[i]
    }
    println(result)
}