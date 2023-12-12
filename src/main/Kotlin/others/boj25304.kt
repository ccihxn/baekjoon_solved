import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val x = r.readLine()!!.toInt()
    val n = r.readLine()!!.toInt()
    var sum = 0
    for (i in 0 until n) {
        val (price, cnt) = r.readLine()!!.split(" ").map { it.toInt() }
        sum += (price * cnt)
    }
    val result = if(x == sum) "Yes" else "No"
    w.write(result)
    w.close()
}