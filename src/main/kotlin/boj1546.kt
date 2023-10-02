import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine()!!.toInt()
    var scores = r.readLine()!!.split(" ").map { it.toInt() }
    val max = scores.max()
    var avg = .0
    for (i in 0 until scores.size) avg += scores[i] / max.toDouble()
    w.write((avg / n.toDouble() * 100).toString())
    w.close()
}