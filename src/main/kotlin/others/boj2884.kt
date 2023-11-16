import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var (h, m) = r.readLine()!!.split(" ").map { it.toInt() }
    if (m >= 45) m -= 45
    else {
        if (h == 0) h += 23
        else h -= 1
        m += 15
    }
    w.write(h.toString() + " " + m.toString())
    w.close()
}