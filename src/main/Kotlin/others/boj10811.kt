import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var (n, m) = r.readLine()!!.split(" ").map { it.toInt() }
    var basket = mutableListOf(0)
    for (i in 1 .. n) basket.add(i)
    repeat(m) {
        var (i, j) = r.readLine()!!.split(" ").map { it.toInt() }
        repeat((j - i)/2 + 1) {
            val tmp = basket[i]
            basket[i++] = basket[j]
            basket[j--] = tmp
        }
    }
    for (i in 1 until basket.size) w.write("${basket[i]} ")
    w.close()
}