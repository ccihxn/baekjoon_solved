import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val chess = r.readLine()!!.split(" ").map { it.toInt() }
    val goodChess = intArrayOf(1, 1, 2, 2, 2, 8)
    for (i in 0 until goodChess.size) w.write((goodChess[i] - chess[i]).toString() + " ")
    w.close()
}