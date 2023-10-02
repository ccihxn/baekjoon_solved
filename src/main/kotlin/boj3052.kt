import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var modulo42 = IntArray(42)
    var cnt = 10
    var result = 0
    while (cnt-- > 0) {
        val n = r.readLine()!!.toInt()
        modulo42[n % 42]++
    }
    for (i in 0 until modulo42.size)
        if (modulo42[i] != 0) result++
    w.write(result.toString())
    w.close()
}