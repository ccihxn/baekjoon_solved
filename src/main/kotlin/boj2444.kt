import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine()!!.toInt()
    for (i in 1..n) {
        for (j in n downTo i + 1) w.write(" ")
        for (j in 1..i) w.write("*")
        for (j in 2..i) w.write("*")
        w.write("\n")
    }
    for (i in n downTo 1) {
        for (j in n downTo i) w.write(" ")
        for (j in 1..i - 1) w.write("*")
        for (j in 2..i - 1) w.write("*")
        w.write("\n")
    }
    w.close()
}