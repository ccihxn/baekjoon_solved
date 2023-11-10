
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    try {
        while (true) {
            val s = "-"
            val n = r.readLine().toInt()
            if (n == 0) w.appendLine(s)
            else {
                w.appendLine(hyphens(s, n))
                w.flush()
            }
        }
    } catch (e: Exception) { e.message }
}

private fun hyphens(s:String, n: Int): String {
    if (n == 0) return s
    var temp = ""
    repeat(3) {
        when (it) {
            1 -> s.forEach { temp += " " }
            else -> temp += s
        }
    }
    return hyphens(temp, n - 1)
}