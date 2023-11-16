import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine()!!.toInt()
    for (i in 1..n) {
        for (j in n - 1 downTo  i) w.write(" ")
        for (j in 1..i) w.write("*")
        w.write("\n")
    }
    w.close()
}