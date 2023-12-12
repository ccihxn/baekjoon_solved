
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var fibonacci = IntArray(n + 1)
    fibonacciFun(fibonacci, n, 0)
    w.write(fibonacci[n].toString())
    w.close()
}

private fun fibonacciFun(fibonacci: IntArray, n: Int, acc: Int): IntArray {
    if (acc == n + 1) return fibonacci
    if (acc < 2) fibonacci[acc] = acc
    else fibonacci[acc] = fibonacci[acc - 1] + fibonacci[acc - 2]
    return fibonacciFun(fibonacci, n, acc + 1)
}