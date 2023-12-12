import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val T = r.readLine()!!.toInt()
    repeat(T) {
        val (n, s) = r.readLine()!!.split(" ").map { it }
        val r = n.toInt()
        for (i in 0 until s.length) w.write(s.get(i).toString().repeat(r))
        w.write("\n")
    }
    w.close()
}