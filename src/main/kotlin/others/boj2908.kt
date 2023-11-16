import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var (a, b) = r.readLine()!!.split(" ").map { it }
    a = a.reversed()
    b = b.reversed()
    w.write(max(a.toInt(), b.toInt()).toString())
    w.close()
}