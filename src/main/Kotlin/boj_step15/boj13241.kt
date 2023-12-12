import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = r.readLine().split(" ").map { it.toLong() }
    w.write(((a * b) / gcd(a, b)).toString())
    w.close()
}

private fun gcd(a: Long, b: Long): Long = if (b != 0L) gcd(b, a % b) else a
