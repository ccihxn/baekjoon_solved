import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    w.write(factorial(n).toString())
    w.close()
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return factorialTail(n, 1)
}

fun factorialTail(n: Int, acc: Int): Int {
    if (n == 1) return acc
    return factorialTail(n - 1, acc * n)
}