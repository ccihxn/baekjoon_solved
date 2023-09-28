import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var files = Array(nextInt()) { nextLong() }
    var cluster = nextInt()
    var result = 0L
    for (i in 0 until files.size) {
        if (files[i] == 0L) continue
        else if (files[i] > cluster) result += cluster * ((files[i] / cluster).toInt() + 1)
        else result += cluster
    }
    println(result)
}