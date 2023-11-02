import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var factors = r.readLine().split(" ").map { it.toInt() }
    factors = factors.sorted()
    val gcd = gcd(factors.last(), factors.get(factors.size - 2))
    if (n == 1) w.write(factors.last() * factors.last())
    else if ((factors.last() * factors.get(factors.size - 2) / gcd) == factors.last()) w.write("${factors.last() * 2}")
    else w.write("${factors.last() * factors.get(factors.size - 2) / gcd}")
    w.close()
}

private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a