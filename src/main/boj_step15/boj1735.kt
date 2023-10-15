import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
        val r = BufferedReader(InputStreamReader(System.`in`))
        val w = BufferedWriter(OutputStreamWriter(System.out))
        val (a, b) = r.readLine().split(" ").map { it.toInt() }
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        val numerator = (a * (lcm(b, y) / b)) + (x * (lcm(b, y) / y))
        val denominator = lcm(b, y)
        w.write(
                        "${numerator / gcd(numerator, denominator)} ${denominator / gcd(numerator, denominator)}"
        )
        w.close()
}

private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

private fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)

