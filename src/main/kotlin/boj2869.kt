import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.DatagramSocket
import java.time.temporal.ValueRange

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b, v) = r.readLine().split(" ").map { it.toInt() }
    var tmp = 0
    var days = if((v - a) % (a -b) != 0) (v - a) / (a - b) + 2 else (v - a) / (a - b) + 1
    w.write(days.toString())
    w.close()
}