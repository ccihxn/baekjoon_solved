import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine()!!.toInt()
    for (i in 0 until n) {
        for (j in 0..i) w.write("*")
        w.write("\n")
    }
    w.close()
}