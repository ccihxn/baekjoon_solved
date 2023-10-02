import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.temporal.ValueRange
import java.util.*
import java.util.stream.BaseStream

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var (n, m) = r.readLine()!!.split(" ").map { it.toInt() }
    var basket = mutableListOf(0)
    for (i in 1..n) basket.add(i)
    while (m-- > 0) {
        val (i, j) = r.readLine()!!.split(" ").map { it.toInt() }
        Collections.swap(basket, i, j)
    }
    for(i in 1 until basket.size) w.write("${basket[i]} ")
    w.close()
}