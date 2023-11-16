import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val trees = IntArray(n) { r.readLine().toInt() }
    val distances = IntArray(n - 1) { trees[it + 1] - trees[it] }
    val gcd = distances.reduce { acc, i -> gcd(acc, i) }
    var result = 0
    for (d in distances) result += (d / gcd) - 1
    w.write("$result")
    w.close()
}

private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a