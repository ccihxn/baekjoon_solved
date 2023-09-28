import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var files = Array(nextInt()) { nextLong() }
    var cluster = nextLong()
    var result = 0L
    for (i in 0 until files.size) {
        if (files[i] == 0L) continue
        else result += (files[i] / cluster) + 1L
    }
    println(result * cluster)
}