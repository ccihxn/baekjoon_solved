import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.function.ToIntBiFunction

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var n = r.readLine()!!.toInt()
    for (cnt in 1..n) {
        val (a, b) = r.readLine()!!.split(" ").map { it.toInt() }
        w.write("Case #${cnt}: ${a} + ${b} = ${a + b}\n")
    }
    w.close()
}