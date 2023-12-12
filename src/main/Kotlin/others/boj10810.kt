import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var (n, m) = r.readLine()!!.split(" ").map { it.toInt() }
    var basket = IntArray(n)
    var ball = 0
    while (m-- > 0) {
        val (i, j, k) = r.readLine()!!.split(" ").map { it.toInt() }
        for(cnt in i..j) basket[cnt - 1] = k
    }
    for (i in 0 until basket.size) {
        w.write("${basket[i]} ")
    }
    w.close()
}