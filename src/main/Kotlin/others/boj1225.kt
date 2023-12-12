import java.math.BigInteger

fun main() = with(java.util.Scanner(System.`in`)) {
    var (a, b) = nextLine().split(" ")
    println(a.toCharArray().sumOf { it.digitToInt() }.toLong() * b.toCharArray().sumOf { it.digitToInt() }.toLong())
}