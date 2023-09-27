import java.math.BigInteger
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var (a, b) = nextLine().split(" ").map { it.toBigInteger(2) }
    println((a + b).toString(2))
}