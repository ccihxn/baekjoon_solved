import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val (a, b) = r.readLine()!!.split(" ").map { it.toInt() }
        if (a == 0 && b == 0) break
        w.write((a + b).toString() + "\n")
    }
    w.close()
}