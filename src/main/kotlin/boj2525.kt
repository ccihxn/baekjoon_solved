import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var (h, m) = r.readLine()!!.split(" ").map { it.toInt() }
    val time = r.readLine()!!.toInt()
    h += (time / 60)
    m += (time % 60)
    if (m >= 60) {
        m %= 60
        h += 1
    }
    h %= 24
    w.write(h.toString() + " " + m.toString())
    w.close()
}