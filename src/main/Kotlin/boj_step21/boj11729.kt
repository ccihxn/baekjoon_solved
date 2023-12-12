
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val k = Math.pow(2.0, n.toDouble()).toInt() - 1
    val b = StringBuilder().appendLine(k)
    hanoi(n, 1, 3, b)
    w.append(b).close()
}

private fun hanoi(n: Int, from: Int, to: Int, b: StringBuilder) {
    if (n == 0) return
    val spare = 6 - from - to
    hanoi(n - 1, from, spare, b)
    b.append(from).append(" ").append(to).appendLine()
    hanoi(n - 1, spare, to, b)
}