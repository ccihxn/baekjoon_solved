import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    w.write(factorial(n).toString())
    w.close()
}

private fun factorial(n: Int): BigInteger {
    if (n <= 1) return BigInteger.valueOf(1)
    return n.toBigInteger() * factorial(n - 1)
}