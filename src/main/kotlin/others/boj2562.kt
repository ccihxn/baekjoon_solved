import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var arr = mutableListOf(0)
    var cnt = 9
    while (cnt-- > 0) arr.add(r.readLine()!!.toInt())
    w.write(arr.maxOrNull().toString() + "\n")
    w.write(arr.indexOf(arr.maxOrNull()).toString())
    w.close()
}