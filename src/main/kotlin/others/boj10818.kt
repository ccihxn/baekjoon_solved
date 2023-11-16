import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.min

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine()!!.toInt()
    val arr = r.readLine()!!.split(" ").map { it.toInt() }
    w.write("${arr.minOrNull()} ${arr.maxOrNull()}")
    w.close()
}