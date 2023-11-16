import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine()!!.toInt()
    for (i in 1 .. (n / 4))
        w.write("long ")
    if(n % 4 != 0) w.write("long ")
    w.write("int")
    w.close()
}