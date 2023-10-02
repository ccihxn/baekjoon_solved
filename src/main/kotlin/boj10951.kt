import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    try {
        while (true) {
            val s = r.readLine()
            if (s.isNullOrEmpty()) break
            else {
                val (a, b) = s.split(" ").map { it.toInt() }
                w.write((a + b).toString() + "\n")
            }
        }
        w.close()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}